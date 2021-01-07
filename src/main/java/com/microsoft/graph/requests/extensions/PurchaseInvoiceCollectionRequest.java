// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Company;
import com.microsoft.graph.models.extensions.PurchaseInvoice;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceCollectionResponse;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Purchase Invoice Collection Request.
 */
public class PurchaseInvoiceCollectionRequest extends BaseEntityCollectionRequest<PurchaseInvoice, PurchaseInvoiceCollectionResponse, PurchaseInvoiceCollectionPage> {

    /**
     * The request builder for this collection of PurchaseInvoice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PurchaseInvoiceCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PurchaseInvoiceCollectionResponse.class, PurchaseInvoiceCollectionPage.class, PurchaseInvoiceCollectionRequestBuilder.class);
    }

    /**
     * Creates a new PurchaseInvoice
     * @param newPurchaseInvoice the PurchaseInvoice to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(@Nonnull final PurchaseInvoice newPurchaseInvoice, @Nonnull final ICallback<? super PurchaseInvoice> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PurchaseInvoiceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPurchaseInvoice, callback);
    }

    /**
     * Creates a new PurchaseInvoice
     * @param newPurchaseInvoice the PurchaseInvoice to create
     * @return the newly created object
     */
    @Nonnull
    public PurchaseInvoice post(@Nonnull final PurchaseInvoice newPurchaseInvoice) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PurchaseInvoiceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPurchaseInvoice);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public PurchaseInvoiceCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public PurchaseInvoiceCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public PurchaseInvoiceCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public PurchaseInvoiceCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public PurchaseInvoiceCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public PurchaseInvoiceCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public PurchaseInvoiceCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public PurchaseInvoiceCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public PurchaseInvoiceCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

