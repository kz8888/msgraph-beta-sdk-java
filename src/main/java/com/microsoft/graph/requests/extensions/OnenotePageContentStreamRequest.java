// Template Source: BaseStreamRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OnenotePage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseStreamRequest;

import java.io.InputStream;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Page Content Stream Request.
 */
public class OnenotePageContentStreamRequest extends BaseStreamRequest<OnenotePage> {

    /**
     * The request for the OnenotePageContentStream
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenotePageContentStreamRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OnenotePage.class);
    }

    /**
     * Gets the contents of this stream
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<InputStream> callback) {
        send(callback);
    }

    /**
     * Gets the contents of this stream
     *
     * @return the stream that the caller needs to close
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public InputStream get() throws ClientException {
       return send();
    }

    /**
     * Uploads to the stream
     *
     * @param fileContents the contents of the stream to upload
          * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final byte[] fileContents, @Nonnull final ICallback<? super OnenotePage> callback) {
        send(fileContents, callback);
    }

    /**
     * Uploads to the stream
     *
     * @param fileContents the contents of the stream to upload
     * @return the result of the upload
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public OnenotePage put(@Nonnull final byte[] fileContents) throws ClientException {
        return send(fileContents);
    }
}
