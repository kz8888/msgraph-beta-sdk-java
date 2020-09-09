// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SynchronizationSchema;
import com.microsoft.graph.models.extensions.DirectoryDefinition;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDirectoryDefinitionCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryDefinitionCollectionResponse;
import com.microsoft.graph.requests.extensions.IDirectoryDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryDefinitionCollectionRequest;
import com.microsoft.graph.requests.extensions.DirectoryDefinitionCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Definition Collection Request.
 */
public class DirectoryDefinitionCollectionRequest extends BaseCollectionRequest<DirectoryDefinitionCollectionResponse, IDirectoryDefinitionCollectionPage> implements IDirectoryDefinitionCollectionRequest {

    /**
     * The request builder for this collection of DirectoryDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryDefinitionCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectoryDefinitionCollectionResponse.class, IDirectoryDefinitionCollectionPage.class);
    }

    public void get(final ICallback<IDirectoryDefinitionCollectionPage> callback) {
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

    public IDirectoryDefinitionCollectionPage get() throws ClientException {
        final DirectoryDefinitionCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DirectoryDefinition newDirectoryDefinition, final ICallback<DirectoryDefinition> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DirectoryDefinitionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDirectoryDefinition, callback);
    }

    public DirectoryDefinition post(final DirectoryDefinition newDirectoryDefinition) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DirectoryDefinitionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDirectoryDefinition);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDirectoryDefinitionCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DirectoryDefinitionCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDirectoryDefinitionCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DirectoryDefinitionCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDirectoryDefinitionCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DirectoryDefinitionCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDirectoryDefinitionCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DirectoryDefinitionCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDirectoryDefinitionCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDirectoryDefinitionCollectionRequest)this;
    }
    public IDirectoryDefinitionCollectionPage buildFromResponse(final DirectoryDefinitionCollectionResponse response) {
        final IDirectoryDefinitionCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DirectoryDefinitionCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DirectoryDefinitionCollectionPage page = new DirectoryDefinitionCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
