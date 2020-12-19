// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.BookingBusiness;
import com.microsoft.graph.models.extensions.BookingCustomer;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IBookingCustomerCollectionPage;
import com.microsoft.graph.requests.extensions.BookingCustomerCollectionResponse;
import com.microsoft.graph.requests.extensions.IBookingCustomerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingCustomerCollectionRequest;
import com.microsoft.graph.requests.extensions.BookingCustomerCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Customer Collection Request.
 */
public class BookingCustomerCollectionRequest extends BaseCollectionRequest<BookingCustomerCollectionResponse, IBookingCustomerCollectionPage> implements IBookingCustomerCollectionRequest {

    /**
     * The request builder for this collection of BookingCustomer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BookingCustomerCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, BookingCustomerCollectionResponse.class, IBookingCustomerCollectionPage.class);
    }

    public void get(final ICallback<? super IBookingCustomerCollectionPage> callback) {
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

    public IBookingCustomerCollectionPage get() throws ClientException {
        final BookingCustomerCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final BookingCustomer newBookingCustomer, final ICallback<? super BookingCustomer> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new BookingCustomerRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newBookingCustomer, callback);
    }

    public BookingCustomer post(final BookingCustomer newBookingCustomer) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new BookingCustomerRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newBookingCustomer);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IBookingCustomerCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (BookingCustomerCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IBookingCustomerCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (BookingCustomerCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IBookingCustomerCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (BookingCustomerCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IBookingCustomerCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (BookingCustomerCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IBookingCustomerCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (BookingCustomerCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IBookingCustomerCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (BookingCustomerCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IBookingCustomerCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IBookingCustomerCollectionRequest)this;
    }
    public IBookingCustomerCollectionPage buildFromResponse(final BookingCustomerCollectionResponse response) {
        final IBookingCustomerCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new BookingCustomerCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final BookingCustomerCollectionPage page = new BookingCustomerCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
