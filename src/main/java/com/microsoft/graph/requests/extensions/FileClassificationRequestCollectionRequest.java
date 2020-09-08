// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DataClassificationService;
import com.microsoft.graph.models.extensions.FileClassificationRequest;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IFileClassificationRequestCollectionPage;
import com.microsoft.graph.requests.extensions.FileClassificationRequestCollectionResponse;
import com.microsoft.graph.requests.extensions.IFileClassificationRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IFileClassificationRequestCollectionRequest;
import com.microsoft.graph.requests.extensions.FileClassificationRequestCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the File Classification Request Collection Request.
 */
public class FileClassificationRequestCollectionRequest extends BaseCollectionRequest<FileClassificationRequestCollectionResponse, IFileClassificationRequestCollectionPage> implements IFileClassificationRequestCollectionRequest {

    /**
     * The request builder for this collection of FileClassificationRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public FileClassificationRequestCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, FileClassificationRequestCollectionResponse.class, IFileClassificationRequestCollectionPage.class);
    }

    public void get(final ICallback<IFileClassificationRequestCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IFileClassificationRequestCollectionPage get() throws ClientException {
        final FileClassificationRequestCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final FileClassificationRequest newFileClassificationRequest, final ICallback<FileClassificationRequest> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new FileClassificationRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newFileClassificationRequest, callback);
    }

    public FileClassificationRequest post(final FileClassificationRequest newFileClassificationRequest) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new FileClassificationRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newFileClassificationRequest);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IFileClassificationRequestCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (FileClassificationRequestCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IFileClassificationRequestCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (FileClassificationRequestCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IFileClassificationRequestCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (FileClassificationRequestCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IFileClassificationRequestCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (FileClassificationRequestCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IFileClassificationRequestCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IFileClassificationRequestCollectionRequest)this;
    }
    public IFileClassificationRequestCollectionPage buildFromResponse(final FileClassificationRequestCollectionResponse response) {
        final IFileClassificationRequestCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new FileClassificationRequestCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final FileClassificationRequestCollectionPage page = new FileClassificationRequestCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
