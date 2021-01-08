// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ConversationMember;
import com.microsoft.graph.models.extensions.ActionResultPart;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.ConversationMemberAddCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationMemberAddCollectionRequest;
import com.microsoft.graph.requests.extensions.ConversationMemberAddCollectionResponse;
import com.microsoft.graph.models.extensions.ConversationMemberAddParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conversation Member Add Collection Request Builder.
 */
public class ConversationMemberAddCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<ActionResultPart, ConversationMemberAddCollectionRequestBuilder, ConversationMemberAddCollectionResponse, ConversationMemberAddCollectionPage, ConversationMemberAddCollectionRequest> {

    private ConversationMemberAddParameterSet body;
    /**
     * The request builder for this collection of ConversationMember
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ConversationMemberAddCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ConversationMemberAddParameterSet parameters) {
        super(requestUrl, client, requestOptions, ConversationMemberAddCollectionRequestBuilder.class, ConversationMemberAddCollectionRequest.class);
        this.body = parameters;
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ConversationMemberAddCollectionRequest instance
     */
    @Override
    @Nonnull
    public ConversationMemberAddCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ConversationMemberAddCollectionRequest request = super.buildRequest(requestOptions);
            request.body = this.body;
            return request;
    }
}
