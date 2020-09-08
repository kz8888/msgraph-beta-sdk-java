// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.BookingCurrency;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Currency Request.
 */
public class BookingCurrencyRequest extends BaseRequest implements IBookingCurrencyRequest {
	
    /**
     * The request for the BookingCurrency
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BookingCurrencyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, BookingCurrency.class);
    }

    /**
     * Gets the BookingCurrency from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<BookingCurrency> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the BookingCurrency from the service
     *
     * @return the BookingCurrency from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingCurrency get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<BookingCurrency> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this BookingCurrency with a source
     *
     * @param sourceBookingCurrency the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final BookingCurrency sourceBookingCurrency, final ICallback<BookingCurrency> callback) {
        send(HttpMethod.PATCH, callback, sourceBookingCurrency);
    }

    /**
     * Patches this BookingCurrency with a source
     *
     * @param sourceBookingCurrency the source object with updates
     * @return the updated BookingCurrency
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingCurrency patch(final BookingCurrency sourceBookingCurrency) throws ClientException {
        return send(HttpMethod.PATCH, sourceBookingCurrency);
    }

    /**
     * Creates a BookingCurrency with a new object
     *
     * @param newBookingCurrency the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final BookingCurrency newBookingCurrency, final ICallback<BookingCurrency> callback) {
        send(HttpMethod.POST, callback, newBookingCurrency);
    }

    /**
     * Creates a BookingCurrency with a new object
     *
     * @param newBookingCurrency the new object to create
     * @return the created BookingCurrency
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingCurrency post(final BookingCurrency newBookingCurrency) throws ClientException {
        return send(HttpMethod.POST, newBookingCurrency);
    }

    /**
     * Creates a BookingCurrency with a new object
     *
     * @param newBookingCurrency the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final BookingCurrency newBookingCurrency, final ICallback<BookingCurrency> callback) {
        send(HttpMethod.PUT, callback, newBookingCurrency);
    }

    /**
     * Creates a BookingCurrency with a new object
     *
     * @param newBookingCurrency the object to create/update
     * @return the created BookingCurrency
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingCurrency put(final BookingCurrency newBookingCurrency) throws ClientException {
        return send(HttpMethod.PUT, newBookingCurrency);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IBookingCurrencyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (BookingCurrencyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IBookingCurrencyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (BookingCurrencyRequest)this;
     }

}

