// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.SalesQuoteSendRequest;
import com.microsoft.graph.models.extensions.SalesQuote;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sales Quote Send Request Builder.
 */
public class SalesQuoteSendRequestBuilder extends BaseActionRequestBuilder<SalesQuote> {

    /**
     * The request builder for this SalesQuoteSend
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SalesQuoteSendRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the SalesQuoteSendRequest
     *
     * @param requestOptions the options for the request
     * @return the SalesQuoteSendRequest instance
     */
    @Nonnull
    public SalesQuoteSendRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the SalesQuoteSendRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the SalesQuoteSendRequest instance
     */
    @Nonnull
    public SalesQuoteSendRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        SalesQuoteSendRequest request = new SalesQuoteSendRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
