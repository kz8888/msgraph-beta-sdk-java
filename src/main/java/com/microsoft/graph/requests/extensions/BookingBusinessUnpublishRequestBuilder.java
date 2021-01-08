// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.BookingBusinessUnpublishRequest;
import com.microsoft.graph.models.extensions.BookingBusiness;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Business Unpublish Request Builder.
 */
public class BookingBusinessUnpublishRequestBuilder extends BaseActionRequestBuilder<BookingBusiness> {

    /**
     * The request builder for this BookingBusinessUnpublish
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BookingBusinessUnpublishRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the BookingBusinessUnpublishRequest
     *
     * @param requestOptions the options for the request
     * @return the BookingBusinessUnpublishRequest instance
     */
    @Nonnull
    public BookingBusinessUnpublishRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the BookingBusinessUnpublishRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the BookingBusinessUnpublishRequest instance
     */
    @Nonnull
    public BookingBusinessUnpublishRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        BookingBusinessUnpublishRequest request = new BookingBusinessUnpublishRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
