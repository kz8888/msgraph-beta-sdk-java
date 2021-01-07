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

package com.microsoft.graph.concurrency;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.CoreHttpProvider;
import com.microsoft.graph.core.Constants;
import com.microsoft.graph.http.GraphServiceException;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.HttpResponseCode;
import com.microsoft.graph.http.HttpResponseHeadersHelper;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.http.IStatefulResponseHandler;
import com.microsoft.graph.logger.ILogger;
import com.microsoft.graph.models.extensions.UploadSession;
import com.microsoft.graph.concurrency.ChunkedUploadResult;
import com.microsoft.graph.serializer.ISerializer;

import okhttp3.Response;

/**
 * Handles the stateful response from the OneDrive upload session
 *
 * @param <UploadType> the expected uploaded item
 */
public class ChunkedUploadResponseHandler<UploadType>
		implements IStatefulResponseHandler<ChunkedUploadResult<UploadType>, UploadType> {

	private final static HttpResponseHeadersHelper  responseHeadersHelper = new HttpResponseHeadersHelper();
	/**
	 * The expected deserialized upload type
	 */
	private final Class<UploadType> deserializeTypeClass;

	/**
	 * Creates a chunked upload response handler
	 *
	 * @param uploadType the expected upload item type
	 */
	public ChunkedUploadResponseHandler(@Nonnull final Class<UploadType> uploadType) {
		this.deserializeTypeClass = uploadType;
	}

	/**
	 * Do nothing before getting the response
	 *
	 * @param response The response
	 */
	@Override
	public void configConnection(@Nonnull final Response response) {
		return;
	}
	
	/**
	 * Generate the chunked upload response result
	 *
	 * @param request	the HTTP request
	 * @param response the HTTP response
	 * @param serializer the serializer
	 * @param logger	 the system logger
	 * @return the chunked upload result, which could be either an uploaded item or error
	 * @throws Exception an exception occurs if the request was unable to complete for any reason
	 */
	@Override
	@Nullable
	public ChunkedUploadResult<UploadType> generateResult(
			@Nonnull final IHttpRequest request,
			@Nonnull final Response response,
			@Nonnull final ISerializer serializer,
			@Nonnull final ILogger logger) throws Exception {
		if (response.code() >= HttpResponseCode.HTTP_CLIENT_ERROR) {
			logger.logDebug("Receiving error during upload, see detail on result error");

			return new ChunkedUploadResult<UploadType>(
					GraphServiceException.createFromResponse(request, null, serializer,
						response, logger));
		} else if (response.code() >= HttpResponseCode.HTTP_OK
				&& response.code() < HttpResponseCode.HTTP_MULTIPLE_CHOICES) {
			final Map<String, String> headers = responseHeadersHelper.getResponseHeadersAsMapStringString(response);
			final String contentType = headers.get(Constants.CONTENT_TYPE_HEADER_NAME);
			final String location = headers.get("Location");
			if(contentType != null
				&& contentType.contains(Constants.JSON_CONTENT_TYPE)) {
				try (final InputStream in = new BufferedInputStream(response.body().byteStream())) {
					final String rawJson = CoreHttpProvider.streamToString(in);
					final UploadSession session = serializer.deserializeObject(rawJson, UploadSession.class);
					if(session == null || session.nextExpectedRanges == null) {
						logger.logDebug("Upload session is completed (ODSP), uploaded item returned.");
						final UploadType uploadedItem = serializer.deserializeObject(rawJson, this.deserializeTypeClass);
						return new ChunkedUploadResult<UploadType>(uploadedItem);
					} else {
						logger.logDebug("Chunk bytes has been accepted by the server.");
						return new ChunkedUploadResult<UploadType>(session);
					}
				}
			} else if(location != null) {
				logger.logDebug("Upload session is completed (Outlook), uploaded item returned.");
				return new ChunkedUploadResult<UploadType>(this.deserializeTypeClass.getDeclaredConstructor().newInstance());
			} else {
				logger.logDebug("Upload session returned an unexpected response");
			}
		}
		return new ChunkedUploadResult<UploadType>(new ClientException("Received an unexpected response from the service, response code: " + response.code(), null));
	}
}
