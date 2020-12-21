// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.BookingCurrency;
import com.microsoft.graph.requests.extensions.IBookingCurrencyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.BookingCurrencyCollectionPage;
import com.microsoft.graph.requests.extensions.BookingCurrencyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Currency Collection Page.
 */
public class BookingCurrencyCollectionPage extends BaseCollectionPage<BookingCurrency, IBookingCurrencyCollectionRequestBuilder> implements IBookingCurrencyCollectionPage {

    /**
     * A collection page for BookingCurrency
     *
     * @param response the serialized BookingCurrencyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BookingCurrencyCollectionPage(final BookingCurrencyCollectionResponse response, final IBookingCurrencyCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
