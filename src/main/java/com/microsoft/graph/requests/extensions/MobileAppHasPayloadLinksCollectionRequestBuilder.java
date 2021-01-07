// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.MobileAppHasPayloadLinksCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppHasPayloadLinksCollectionRequest;
import com.microsoft.graph.requests.extensions.MobileAppHasPayloadLinksCollectionResponse;
import com.microsoft.graph.models.extensions.MobileAppHasPayloadLinksParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Has Payload Links Collection Request Builder.
 */
public class MobileAppHasPayloadLinksCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<HasPayloadLinkResultItem, MobileAppHasPayloadLinksCollectionRequestBuilder, MobileAppHasPayloadLinksCollectionResponse, MobileAppHasPayloadLinksCollectionPage, MobileAppHasPayloadLinksCollectionRequest> {

    private MobileAppHasPayloadLinksParameterSet body;
    /**
     * The request builder for this collection of MobileApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public MobileAppHasPayloadLinksCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final MobileAppHasPayloadLinksParameterSet parameters) {
        super(requestUrl, client, requestOptions, MobileAppHasPayloadLinksCollectionRequestBuilder.class, MobileAppHasPayloadLinksCollectionRequest.class);
        this.body = parameters;
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the MobileAppHasPayloadLinksCollectionRequest instance
     */
    @Override
    @Nonnull
    public MobileAppHasPayloadLinksCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final MobileAppHasPayloadLinksCollectionRequest request = super.buildRequest(requestOptions);
            request.body = this.body;
            return request;
    }
}
