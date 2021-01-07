// ------------------------------------------------------------------------------
// Copyright (c) 2017 Microsoft Corporation
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.microsoft.graph.http;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.google.common.annotations.VisibleForTesting;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.concurrency.IProgressCallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.Constants;
import com.microsoft.graph.httpcore.HttpClients;
import com.microsoft.graph.httpcore.middlewareoption.RedirectOptions;
import com.microsoft.graph.httpcore.middlewareoption.RetryOptions;
import com.microsoft.graph.logger.ILogger;
import com.microsoft.graph.logger.LoggerLevel;
import com.microsoft.graph.options.HeaderOption;
import com.microsoft.graph.serializer.ISerializer;

import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSink;

/**
 * HTTP provider based off of OkHttp and msgraph-sdk-java-core library
 */
public class CoreHttpProvider implements IHttpProvider {
	private final HttpResponseHeadersHelper responseHeadersHelper = new HttpResponseHeadersHelper();

	/**
	 * The serializer
	 */
	private final ISerializer serializer;

	/**
	 * The executors
	 */
	protected final IExecutors executors;

	/**
	 * The logger
	 */
	private final ILogger logger;

	/**
	 * The OkHttpClient that handles all requests
	 */
	private OkHttpClient corehttpClient;

	/**
	 * Creates the CoreHttpProvider
	 *
	 * @param serializer             the serializer
	 * @param executors              the executors
	 * @param logger                 the logger for diagnostic information
	 * @param httpClient             the client to send http requests with
	 */
	public CoreHttpProvider(@Nonnull final ISerializer serializer,
			@Nonnull final IExecutors executors,
			@Nonnull final ILogger logger,
			@Nullable final OkHttpClient httpClient) {
		if (httpClient == null) {
			throw new NullPointerException("httpClient");
		} else if(serializer == null) {
			throw new NullPointerException("serializer");
		} else if(executors == null) {
			throw new NullPointerException("executors");
		} else if(logger == null) {
			throw new NullPointerException("logger");
		} else {
			this.serializer = serializer;
			this.executors = executors;
			this.logger = logger;
			this.corehttpClient = httpClient;
		}
	}

	/**
	 * Gets the serializer for this HTTP provider
	 *
	 * @return the serializer for this provider
	 */
	@Override
	@Nullable
	public ISerializer getSerializer() {
		return serializer;
	}

	/**
	 * Sends the HTTP request asynchronously
	 *
	 * @param request      the request description
	 * @param callback     the callback to be called after success or failure
	 * @param resultClass  the class of the response from the service
	 * @param serializable the object to send to the service in the body of the request
	 * @param <Result>     the type of the response object
	 * @param <Body>       the type of the object to send to the service in the body of the request
	 */
	@Override
	@Nullable
	public <Result, Body> void send(@Nonnull final IHttpRequest request,
			@Nonnull final ICallback<? super Result> callback,
			@Nonnull final Class<Result> resultClass,
			@Nullable final Body serializable) {
		final IProgressCallback<? super Result> progressCallback;
		if (callback instanceof IProgressCallback) {
			progressCallback = (IProgressCallback<? super Result>) callback;
		} else {
			progressCallback = null;
		}

		executors.performOnBackground(new Runnable() {
			@Override
			public void run() {
				try {
					executors.performOnForeground(sendRequestInternal(request,
							resultClass,
							serializable,
							progressCallback,
							null),
							callback);
				} catch (final ClientException e) {
					executors.performOnForeground(e, callback);
				}
			}
		});
	}

	/**
	 * Sends the HTTP request
	 *
	 * @param request      the request description
	 * @param resultClass  the class of the response from the service
	 * @param serializable the object to send to the service in the body of the request
	 * @param <Result>     the type of the response object
	 * @param <Body>       the type of the object to send to the service in the body of the request
	 * @return             the result from the request
	 * @throws ClientException an exception occurs if the request was unable to complete for any reason
	 */
	@Override
	@Nullable
	public <Result, Body> Result send(@Nonnull final IHttpRequest request,
			@Nonnull final Class<Result> resultClass,
			@Nullable final Body serializable)
					throws ClientException {
		return send(request, resultClass, serializable, null);
	}

	/**
	 * Sends the HTTP request
	 *
	 * @param request           the request description
	 * @param resultClass       the class of the response from the service
	 * @param serializable      the object to send to the service in the body of the request
	 * @param handler           the handler for stateful response
	 * @param <Result>          the type of the response object
	 * @param <Body>            the type of the object to send to the service in the body of the request
	 * @param <DeserializeType> the response handler for stateful response
	 * @return                  the result from the request
	 * @throws ClientException this exception occurs if the request was unable to complete for any reason
	 */
	@Nullable
	public <Result, Body, DeserializeType> Result send(@Nonnull final IHttpRequest request,
			@Nonnull final Class<Result> resultClass,
			@Nullable final Body serializable,
			@Nonnull final IStatefulResponseHandler<Result, DeserializeType> handler) throws ClientException {
		return sendRequestInternal(request, resultClass, serializable, null, handler);
	}
	/**
	 * Sends the HTTP request
	 *
	 * @param request           the request description
	 * @param resultClass       the class of the response from the service
	 * @param serializable      the object to send to the service in the body of the request
	 * @param progress          the progress callback for the request
	 * @param <Result>          the type of the response object
	 * @param <Body>            the type of the object to send to the service in the body of the request
	 * @return                  the result from the request
	 * @throws ClientException an exception occurs if the request was unable to complete for any reason
	 */
	@Nullable
	public <Result, Body> Request getHttpRequest(@Nonnull final IHttpRequest request,
			@Nonnull final Class<Result> resultClass,
			@Nullable final Body serializable,
			@Nullable final IProgressCallback<? super Result> progress) throws ClientException {
		final int defaultBufferSize = 4096;

		final URL requestUrl = request.getRequestUrl();
		logger.logDebug("Starting to send request, URL " + requestUrl.toString());

		// Request level middleware options
		final RedirectOptions redirectOptions = request.getMaxRedirects() <= 0 ? null : new RedirectOptions(request.getMaxRedirects(), request.getShouldRedirect());
		final RetryOptions retryOptions = request.getShouldRetry() == null ? null : new RetryOptions(request.getShouldRetry(), request.getMaxRetries(), request.getDelay());

		final Request coreHttpRequest = convertIHttpRequestToOkHttpRequest(request);
		Request.Builder corehttpRequestBuilder = coreHttpRequest
				.newBuilder();
		if(redirectOptions != null) {
			corehttpRequestBuilder = corehttpRequestBuilder.tag(RedirectOptions.class, redirectOptions);
		}
		if(retryOptions != null) {
			corehttpRequestBuilder = corehttpRequestBuilder.tag(RetryOptions.class, retryOptions);
		}

		String contenttype = null;

		logger.logDebug("Request Method " + request.getHttpMethod().toString());
		final List<HeaderOption> requestHeaders = request.getHeaders();

		for(HeaderOption headerOption : requestHeaders) {
			if(headerOption.getName().equalsIgnoreCase(Constants.CONTENT_TYPE_HEADER_NAME)) {
				contenttype = headerOption.getValue().toString();
				break;
			}
		}

		final byte[] bytesToWrite;
		corehttpRequestBuilder.addHeader("Accept", "*/*");
		if (serializable == null) {
			// Send an empty body through with a POST request
			// This ensures that the Content-Length header is properly set
			if (request.getHttpMethod() == HttpMethod.POST) {
				bytesToWrite = new byte[0];
				if(contenttype == null) {
					contenttype = Constants.BINARY_CONTENT_TYPE;
				}
			}
			else {
				bytesToWrite = null;
			}
		} else if (serializable instanceof byte[]) {
			logger.logDebug("Sending byte[] as request body");
			bytesToWrite = (byte[]) serializable;

			// If the user hasn't specified a Content-Type for the request
			if (!hasHeader(requestHeaders, Constants.CONTENT_TYPE_HEADER_NAME)) {
				corehttpRequestBuilder.addHeader(Constants.CONTENT_TYPE_HEADER_NAME, Constants.BINARY_CONTENT_TYPE);
				contenttype = Constants.BINARY_CONTENT_TYPE;
			}
		} else {
			logger.logDebug("Sending " + serializable.getClass().getName() + " as request body");
			final String serializeObject = serializer.serializeObject(serializable);
			try {
				bytesToWrite = serializeObject.getBytes(Constants.JSON_ENCODING);
			} catch (final UnsupportedEncodingException ex) {
				final ClientException clientException = new ClientException("Unsupported encoding problem: ",
						ex);
				logger.logError("Unsupported encoding problem: " + ex.getMessage(), ex);
				throw clientException;
			}

			// If the user hasn't specified a Content-Type for the request
			if (!hasHeader(requestHeaders, Constants.CONTENT_TYPE_HEADER_NAME)) {
				corehttpRequestBuilder.addHeader(Constants.CONTENT_TYPE_HEADER_NAME, Constants.JSON_CONTENT_TYPE);
				contenttype = Constants.JSON_CONTENT_TYPE;
			}
		}

		RequestBody requestBody = null;
		// Handle cases where we've got a body to process.
		if (bytesToWrite != null) {
			final String mediaContentType = contenttype;
			requestBody = new RequestBody() {
				@Override
				public long contentLength() throws IOException {
					return bytesToWrite.length;
				}
				@Override
				public void writeTo(BufferedSink sink) throws IOException {
					int writtenSoFar = 0;
					try (final OutputStream out = sink.outputStream()) {
						try (final BufferedOutputStream bos = new BufferedOutputStream(out)){
							int toWrite;
							do {
								toWrite = Math.min(defaultBufferSize, bytesToWrite.length - writtenSoFar);
								bos.write(bytesToWrite, writtenSoFar, toWrite);
								writtenSoFar = writtenSoFar + toWrite;
								if (progress != null) {
									executors.performOnForeground(writtenSoFar, bytesToWrite.length,
											progress);
								}
							} while (toWrite > 0);
						}
					}
				}

				@Override
				public MediaType contentType() {
					return MediaType.parse(mediaContentType);
				}
			};
		}

		corehttpRequestBuilder.method(request.getHttpMethod().toString(), requestBody);
		return corehttpRequestBuilder.build();
	}
	/**
	 * Sends the HTTP request
	 *
	 * @param request           the request description
	 * @param resultClass       the class of the response from the service
	 * @param serializable      the object to send to the service in the body of the request
	 * @param progress          the progress callback for the request
	 * @param handler           the handler for stateful response
	 * @param <Result>          the type of the response object
	 * @param <Body>            the type of the object to send to the service in the body of the request
	 * @param <DeserializeType> the response handler for stateful response
	 * @return                  the result from the request
	 * @throws ClientException an exception occurs if the request was unable to complete for any reason
	 */
	@SuppressWarnings({"unchecked", "LambdaLast"})
	@Nullable
	protected <Result, Body, DeserializeType> Result sendRequestInternal(@Nonnull final IHttpRequest request,
			@Nonnull final Class<Result> resultClass,
			@Nullable final Body serializable,
			@Nullable final IProgressCallback<? super Result> progress,
			@Nullable final IStatefulResponseHandler<Result, DeserializeType> handler)
					throws ClientException {

		try {
			final Request coreHttpRequest = getHttpRequest(request, resultClass, serializable, progress);
			final Response response = corehttpClient.newCall(coreHttpRequest).execute();
			InputStream in = null;
			boolean isBinaryStreamInput = false;
			try {

				// Call being executed


				if (handler != null) {
					handler.configConnection(response);
				}

				logger.logDebug(String.format(Locale.ROOT, "Response code %d, %s",
						response.code(),
						response.message()));

				if (handler != null) {
					logger.logDebug("StatefulResponse is handling the HTTP response.");
					return handler.generateResult(
							request, response, this.getSerializer(), this.logger);
				}

				if (response.code() >= HttpResponseCode.HTTP_CLIENT_ERROR) {
					logger.logDebug("Handling error response");
					in = response.body().byteStream();
					handleErrorResponse(request, serializable, response);
				}

				if (response.code() == HttpResponseCode.HTTP_NOBODY
						|| response.code() == HttpResponseCode.HTTP_NOT_MODIFIED) {
					logger.logDebug("Handling response with no body");
					return handleEmptyResponse(responseHeadersHelper.getResponseHeadersAsMapOfStringList(response), resultClass);
				}

				if (response.code() == HttpResponseCode.HTTP_ACCEPTED) {
					logger.logDebug("Handling accepted response");
					return handleEmptyResponse(responseHeadersHelper.getResponseHeadersAsMapOfStringList(response), resultClass);
				}

				in = new BufferedInputStream(response.body().byteStream());

				final Map<String, String> headers = responseHeadersHelper.getResponseHeadersAsMapStringString(response);

				if(response.body() == null || response.body().contentLength() == 0)
					return (Result) null;

				final String contentType = headers.get(Constants.CONTENT_TYPE_HEADER_NAME);
				if (contentType != null && resultClass != InputStream.class &&
							contentType.contains(Constants.JSON_CONTENT_TYPE)) {
					logger.logDebug("Response json");
					return handleJsonResponse(in, responseHeadersHelper.getResponseHeadersAsMapOfStringList(response), resultClass);
				} else if (resultClass == InputStream.class) {
					logger.logDebug("Response binary");
					isBinaryStreamInput = true;
					return (Result) handleBinaryStream(in);
				} else if (contentType != null && resultClass != InputStream.class &&
                            contentType.contains(Constants.TEXT_CONTENT_TYPE)) {
                    return handleRawResponse(in, resultClass);
				} else {
					return (Result) null;
				}
			} finally {
				if (!isBinaryStreamInput) {
					try{
						if (in != null) in.close();
					}catch(IOException e) {
						logger.logError(e.getMessage(), e);
					}
					if (response != null) response.close();
				}
			}
		} catch (final GraphServiceException ex) {
			final boolean shouldLogVerbosely = logger.getLoggingLevel() == LoggerLevel.DEBUG;
			logger.logError("Graph service exception " + ex.getMessage(shouldLogVerbosely), ex);
			throw ex;
		} catch (final Exception ex) {
			final ClientException clientException = new ClientException("Error during http request",
					ex);
			logger.logError("Error during http request", clientException);
			throw clientException;
		}
	}

	private Request convertIHttpRequestToOkHttpRequest(IHttpRequest request) {
		if(request != null) {
			Request.Builder requestBuilder = new Request.Builder();
			requestBuilder.url(request.getRequestUrl());
			for (final HeaderOption header : request.getHeaders()) {
				requestBuilder.addHeader(header.getName(), header.getValue().toString());
			}
			return requestBuilder.build();
		}
		return null;
	}

	/**
	 * Handles the event of an error response
	 *
	 * @param request      the request that caused the failed response
	 * @param serializable the body of the request
	 * @param connection   the URL connection
	 * @param <Body>       the type of the request body
	 * @throws IOException an exception occurs if there were any problems interacting with the connection object
	 */
	private <Body> void handleErrorResponse(final IHttpRequest request,
			final Body serializable,
			final Response response)
					throws IOException {
		throw GraphServiceException.createFromResponse(request, serializable, serializer,
				response, logger);
	}

	/**
	 * Handles the cause where the response is a binary stream
	 *
	 * @param in the input stream from the response
	 * @return   the input stream to return to the caller
	 */
	private InputStream handleBinaryStream(final InputStream in) {
		return in;
	}

	/**
	 * Handles the cause where the response is a JSON object
	 *
	 * @param in              the input stream from the response
	 * @param responseHeaders the response header
	 * @param clazz           the class of the response object
	 * @param <Result>        the type of the response object
	 * @return                the JSON object
	 */
	private <Result> Result handleJsonResponse(final InputStream in, Map<String, List<String>> responseHeaders, final Class<Result> clazz) {
		if (clazz == null) {
			return null;
		}

		final String rawJson = streamToString(in);
		return getSerializer().deserializeObject(rawJson, clazz, responseHeaders);
    }

    /**
	 * Handles the cause where the response is a Text object
	 *
	 * @param in              the input stream from the response
	 * @param clazz           the class of the response object
	 * @param <Result>        the type of the response object
	 * @return                the Text object
	 */
    private <Result> Result handleRawResponse(final InputStream in, final Class<Result> clazz) {
		if (clazz == null) {
			return null;
		}

        final String rawText = streamToString(in);
        if(clazz == Long.class) {
            try {
                return (Result) Long.valueOf(rawText);
            } catch (NumberFormatException ex) {
                return null;
            }
        } else {
            return null;
        }
	}

	/**
	 * Handles the case where the response body is empty
	 *
	 * @param responseHeaders the response headers
	 * @param clazz           the type of the response object
	 * @return                the JSON object
	 */
	private <Result> Result handleEmptyResponse(Map<String, List<String>> responseHeaders, final Class<Result> clazz)
			throws UnsupportedEncodingException{
		//Create an empty object to attach the response headers to
		InputStream in = new ByteArrayInputStream("{}".getBytes(Constants.JSON_ENCODING));
		return handleJsonResponse(in, responseHeaders, clazz);
	}

	/**
	 * Reads in a stream and converts it into a string
	 *
	 * @param input the response body stream
	 * @return      the string result
	 */
	@Nullable
	public static String streamToString(@Nonnull final InputStream input) {
		final String httpStreamEncoding = "UTF-8";
		final String endOfFile = "\\A";
		try (final Scanner scanner = new Scanner(input, httpStreamEncoding)) {
			scanner.useDelimiter(endOfFile);
			if (scanner.hasNext()) {
				return scanner.next();
			}
			return "";
		}
	}

	/**
	 * Searches for the given header in a list of HeaderOptions
	 *
	 * @param headers the list of headers to search through
	 * @param header  the header name to search for (case insensitive)
	 * @return        true if the header has already been set
	 */
	@VisibleForTesting
	static boolean hasHeader(List<HeaderOption> headers, String header) {
		for (HeaderOption option : headers) {
			if (option.getName().equalsIgnoreCase(header)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Gets the logger in use
	 *
	 * @return the logger
	 */
	@VisibleForTesting
	@Nullable
	public ILogger getLogger() {
		return logger;
	}

	/**
	 * Gets the executors in use
	 * @return the executors
	 */
	@VisibleForTesting
	@Nullable
	public IExecutors getExecutors() {
		return executors;
	}
}
