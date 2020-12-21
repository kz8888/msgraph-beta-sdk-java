// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.EmbeddedSIMActivationCodePool;
import com.microsoft.graph.models.extensions.EmbeddedSIMActivationCodePoolAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IEmbeddedSIMActivationCodePoolCollectionPage;
import com.microsoft.graph.requests.extensions.EmbeddedSIMActivationCodePoolCollectionResponse;
import com.microsoft.graph.requests.extensions.IEmbeddedSIMActivationCodePoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEmbeddedSIMActivationCodePoolCollectionRequest;
import com.microsoft.graph.requests.extensions.EmbeddedSIMActivationCodePoolCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Embedded SIMActivation Code Pool Collection Request.
 */
public class EmbeddedSIMActivationCodePoolCollectionRequest extends BaseCollectionRequest<EmbeddedSIMActivationCodePoolCollectionResponse, IEmbeddedSIMActivationCodePoolCollectionPage> implements IEmbeddedSIMActivationCodePoolCollectionRequest {

    /**
     * The request builder for this collection of EmbeddedSIMActivationCodePool
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EmbeddedSIMActivationCodePoolCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EmbeddedSIMActivationCodePoolCollectionResponse.class, IEmbeddedSIMActivationCodePoolCollectionPage.class);
    }

    public void get(final ICallback<? super IEmbeddedSIMActivationCodePoolCollectionPage> callback) {
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

    public IEmbeddedSIMActivationCodePoolCollectionPage get() throws ClientException {
        final EmbeddedSIMActivationCodePoolCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final EmbeddedSIMActivationCodePool newEmbeddedSIMActivationCodePool, final ICallback<? super EmbeddedSIMActivationCodePool> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new EmbeddedSIMActivationCodePoolRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newEmbeddedSIMActivationCodePool, callback);
    }

    public EmbeddedSIMActivationCodePool post(final EmbeddedSIMActivationCodePool newEmbeddedSIMActivationCodePool) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new EmbeddedSIMActivationCodePoolRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newEmbeddedSIMActivationCodePool);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IEmbeddedSIMActivationCodePoolCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (EmbeddedSIMActivationCodePoolCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IEmbeddedSIMActivationCodePoolCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (EmbeddedSIMActivationCodePoolCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IEmbeddedSIMActivationCodePoolCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (EmbeddedSIMActivationCodePoolCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IEmbeddedSIMActivationCodePoolCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (EmbeddedSIMActivationCodePoolCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IEmbeddedSIMActivationCodePoolCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (EmbeddedSIMActivationCodePoolCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IEmbeddedSIMActivationCodePoolCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (EmbeddedSIMActivationCodePoolCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IEmbeddedSIMActivationCodePoolCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IEmbeddedSIMActivationCodePoolCollectionRequest)this;
    }
    public IEmbeddedSIMActivationCodePoolCollectionPage buildFromResponse(final EmbeddedSIMActivationCodePoolCollectionResponse response) {
        final IEmbeddedSIMActivationCodePoolCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new EmbeddedSIMActivationCodePoolCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final EmbeddedSIMActivationCodePoolCollectionPage page = new EmbeddedSIMActivationCodePoolCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
