// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Company;
import com.microsoft.graph.models.extensions.UnitOfMeasure;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.UnitOfMeasureCollectionResponse;
import com.microsoft.graph.requests.extensions.UnitOfMeasureCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UnitOfMeasureCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unit Of Measure Collection Request.
 */
public class UnitOfMeasureCollectionRequest extends BaseEntityCollectionRequest<UnitOfMeasure, UnitOfMeasureCollectionResponse, UnitOfMeasureCollectionPage> {

    /**
     * The request builder for this collection of UnitOfMeasure
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnitOfMeasureCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnitOfMeasureCollectionResponse.class, UnitOfMeasureCollectionPage.class, UnitOfMeasureCollectionRequestBuilder.class);
    }

    /**
     * Creates a new UnitOfMeasure
     * @param newUnitOfMeasure the UnitOfMeasure to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(@Nonnull final UnitOfMeasure newUnitOfMeasure, @Nonnull final ICallback<? super UnitOfMeasure> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new UnitOfMeasureRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUnitOfMeasure, callback);
    }

    /**
     * Creates a new UnitOfMeasure
     * @param newUnitOfMeasure the UnitOfMeasure to create
     * @return the newly created object
     */
    @Nonnull
    public UnitOfMeasure post(@Nonnull final UnitOfMeasure newUnitOfMeasure) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UnitOfMeasureRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUnitOfMeasure);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public UnitOfMeasureCollectionRequest expand(@Nonnull final String value) {
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
    public UnitOfMeasureCollectionRequest filter(@Nonnull final String value) {
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
    public UnitOfMeasureCollectionRequest orderBy(@Nonnull final String value) {
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
    public UnitOfMeasureCollectionRequest select(@Nonnull final String value) {
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
    public UnitOfMeasureCollectionRequest top(final int value) {
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
    public UnitOfMeasureCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public UnitOfMeasureCollectionRequest count() {
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
    public UnitOfMeasureCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public UnitOfMeasureCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

