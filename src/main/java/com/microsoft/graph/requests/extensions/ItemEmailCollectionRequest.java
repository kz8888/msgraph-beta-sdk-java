// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Profile;
import com.microsoft.graph.models.extensions.ItemEmail;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IItemEmailCollectionPage;
import com.microsoft.graph.requests.extensions.ItemEmailCollectionResponse;
import com.microsoft.graph.requests.extensions.IItemEmailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemEmailCollectionRequest;
import com.microsoft.graph.requests.extensions.ItemEmailCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Email Collection Request.
 */
public class ItemEmailCollectionRequest extends BaseCollectionRequest<ItemEmailCollectionResponse, IItemEmailCollectionPage> implements IItemEmailCollectionRequest {

    /**
     * The request builder for this collection of ItemEmail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemEmailCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemEmailCollectionResponse.class, IItemEmailCollectionPage.class);
    }

    public void get(final ICallback<IItemEmailCollectionPage> callback) {
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

    public IItemEmailCollectionPage get() throws ClientException {
        final ItemEmailCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ItemEmail newItemEmail, final ICallback<ItemEmail> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ItemEmailRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newItemEmail, callback);
    }

    public ItemEmail post(final ItemEmail newItemEmail) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ItemEmailRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newItemEmail);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IItemEmailCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ItemEmailCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IItemEmailCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ItemEmailCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IItemEmailCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ItemEmailCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IItemEmailCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (ItemEmailCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IItemEmailCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IItemEmailCollectionRequest)this;
    }
    public IItemEmailCollectionPage buildFromResponse(final ItemEmailCollectionResponse response) {
        final IItemEmailCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ItemEmailCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ItemEmailCollectionPage page = new ItemEmailCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
