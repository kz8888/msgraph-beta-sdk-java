// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.InformationProtection;
import com.microsoft.graph.models.extensions.DataLossPreventionPolicy;
import com.microsoft.graph.models.extensions.DlpEvaluationInput;
import com.microsoft.graph.models.extensions.DlpNotification;
import com.microsoft.graph.models.extensions.DlpEvaluatePoliciesJobResponse;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.DataLossPreventionPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.DataLossPreventionPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DataLossPreventionPolicyCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Loss Prevention Policy Collection Request.
 */
public class DataLossPreventionPolicyCollectionRequest extends BaseEntityCollectionRequest<DataLossPreventionPolicy, DataLossPreventionPolicyCollectionResponse, DataLossPreventionPolicyCollectionPage> {

    /**
     * The request builder for this collection of DataLossPreventionPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DataLossPreventionPolicyCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DataLossPreventionPolicyCollectionResponse.class, DataLossPreventionPolicyCollectionPage.class, DataLossPreventionPolicyCollectionRequestBuilder.class);
    }

    /**
     * Creates a new DataLossPreventionPolicy
     * @param newDataLossPreventionPolicy the DataLossPreventionPolicy to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(@Nonnull final DataLossPreventionPolicy newDataLossPreventionPolicy, @Nonnull final ICallback<? super DataLossPreventionPolicy> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DataLossPreventionPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDataLossPreventionPolicy, callback);
    }

    /**
     * Creates a new DataLossPreventionPolicy
     * @param newDataLossPreventionPolicy the DataLossPreventionPolicy to create
     * @return the newly created object
     */
    @Nonnull
    public DataLossPreventionPolicy post(@Nonnull final DataLossPreventionPolicy newDataLossPreventionPolicy) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DataLossPreventionPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDataLossPreventionPolicy);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public DataLossPreventionPolicyCollectionRequest expand(@Nonnull final String value) {
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
    public DataLossPreventionPolicyCollectionRequest filter(@Nonnull final String value) {
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
    public DataLossPreventionPolicyCollectionRequest orderBy(@Nonnull final String value) {
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
    public DataLossPreventionPolicyCollectionRequest select(@Nonnull final String value) {
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
    public DataLossPreventionPolicyCollectionRequest top(final int value) {
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
    public DataLossPreventionPolicyCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public DataLossPreventionPolicyCollectionRequest count() {
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
    public DataLossPreventionPolicyCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public DataLossPreventionPolicyCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

