// Template Source: BaseMethodCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ChatMessage;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IChannelGetAllMessagesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ChannelGetAllMessagesCollectionPage;
import com.microsoft.graph.requests.extensions.ChannelGetAllMessagesCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Channel Get All Messages Collection Request.
 */
public class ChannelGetAllMessagesCollectionRequest extends BaseCollectionRequest<ChannelGetAllMessagesCollectionResponse, IChannelGetAllMessagesCollectionPage> implements IChannelGetAllMessagesCollectionRequest {


    /**
     * The request for this ChannelGetAllMessages
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChannelGetAllMessagesCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ChannelGetAllMessagesCollectionResponse.class, IChannelGetAllMessagesCollectionPage.class);
    }


    public void get(final ICallback<? super IChannelGetAllMessagesCollectionPage> callback) {
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

    public IChannelGetAllMessagesCollectionPage get() throws ClientException {
        final ChannelGetAllMessagesCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IChannelGetAllMessagesCollectionPage buildFromResponse(final ChannelGetAllMessagesCollectionResponse response) {
        final IChannelGetAllMessagesCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ChannelGetAllMessagesCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final IChannelGetAllMessagesCollectionPage page = new ChannelGetAllMessagesCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IChannelGetAllMessagesCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IChannelGetAllMessagesCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IChannelGetAllMessagesCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IChannelGetAllMessagesCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IChannelGetAllMessagesCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IChannelGetAllMessagesCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IChannelGetAllMessagesCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IChannelGetAllMessagesCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IChannelGetAllMessagesCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IChannelGetAllMessagesCollectionRequest)this;
    }

}
