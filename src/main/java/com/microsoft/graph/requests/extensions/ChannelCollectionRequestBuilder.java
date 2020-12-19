// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Team;
import com.microsoft.graph.models.extensions.Channel;
import com.microsoft.graph.models.extensions.ChatMessage;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IChannelCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChannelRequestBuilder;
import com.microsoft.graph.requests.extensions.IChannelCollectionRequest;
import com.microsoft.graph.requests.extensions.IChannelAllMessagesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChannelGetAllMessagesCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Channel Collection Request Builder.
 */
public class ChannelCollectionRequestBuilder extends BaseRequestBuilder implements IChannelCollectionRequestBuilder {

    /**
     * The request builder for this collection of Team
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChannelCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IChannelCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IChannelCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ChannelCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IChannelRequestBuilder byId(final String id) {
        return new ChannelRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IChannelAllMessagesCollectionRequestBuilder allMessages() {
        return new ChannelAllMessagesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.allMessages"), getClient(), null);
    }

    public IChannelGetAllMessagesCollectionRequestBuilder getAllMessages() {
        return new ChannelGetAllMessagesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAllMessages"), getClient(), null);
    }
}
