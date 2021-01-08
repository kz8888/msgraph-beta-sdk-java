// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceEnrollmentConfiguration;
import com.microsoft.graph.models.extensions.EnrollmentConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.EnrollmentConfigurationAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.EnrollmentConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EnrollmentConfigurationAssignmentCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Enrollment Configuration Assignment Collection Request.
 */
public class EnrollmentConfigurationAssignmentCollectionRequest extends BaseEntityCollectionRequest<EnrollmentConfigurationAssignment, EnrollmentConfigurationAssignmentCollectionResponse, EnrollmentConfigurationAssignmentCollectionPage> {

    /**
     * The request builder for this collection of EnrollmentConfigurationAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EnrollmentConfigurationAssignmentCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EnrollmentConfigurationAssignmentCollectionResponse.class, EnrollmentConfigurationAssignmentCollectionPage.class, EnrollmentConfigurationAssignmentCollectionRequestBuilder.class);
    }

    /**
     * Creates a new EnrollmentConfigurationAssignment
     * @param newEnrollmentConfigurationAssignment the EnrollmentConfigurationAssignment to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(@Nonnull final EnrollmentConfigurationAssignment newEnrollmentConfigurationAssignment, @Nonnull final ICallback<? super EnrollmentConfigurationAssignment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new EnrollmentConfigurationAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newEnrollmentConfigurationAssignment, callback);
    }

    /**
     * Creates a new EnrollmentConfigurationAssignment
     * @param newEnrollmentConfigurationAssignment the EnrollmentConfigurationAssignment to create
     * @return the newly created object
     */
    @Nonnull
    public EnrollmentConfigurationAssignment post(@Nonnull final EnrollmentConfigurationAssignment newEnrollmentConfigurationAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new EnrollmentConfigurationAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newEnrollmentConfigurationAssignment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public EnrollmentConfigurationAssignmentCollectionRequest expand(@Nonnull final String value) {
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
    public EnrollmentConfigurationAssignmentCollectionRequest filter(@Nonnull final String value) {
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
    public EnrollmentConfigurationAssignmentCollectionRequest orderBy(@Nonnull final String value) {
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
    public EnrollmentConfigurationAssignmentCollectionRequest select(@Nonnull final String value) {
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
    public EnrollmentConfigurationAssignmentCollectionRequest top(final int value) {
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
    public EnrollmentConfigurationAssignmentCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public EnrollmentConfigurationAssignmentCollectionRequest count() {
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
    public EnrollmentConfigurationAssignmentCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public EnrollmentConfigurationAssignmentCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

