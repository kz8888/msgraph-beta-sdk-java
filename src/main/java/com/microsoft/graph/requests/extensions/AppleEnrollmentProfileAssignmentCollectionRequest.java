// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AppleUserInitiatedEnrollmentProfile;
import com.microsoft.graph.models.extensions.AppleEnrollmentProfileAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.AppleEnrollmentProfileAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.AppleEnrollmentProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppleEnrollmentProfileAssignmentCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Apple Enrollment Profile Assignment Collection Request.
 */
public class AppleEnrollmentProfileAssignmentCollectionRequest extends BaseEntityCollectionRequest<AppleEnrollmentProfileAssignment, AppleEnrollmentProfileAssignmentCollectionResponse, AppleEnrollmentProfileAssignmentCollectionPage> {

    /**
     * The request builder for this collection of AppleEnrollmentProfileAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppleEnrollmentProfileAssignmentCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AppleEnrollmentProfileAssignmentCollectionResponse.class, AppleEnrollmentProfileAssignmentCollectionPage.class, AppleEnrollmentProfileAssignmentCollectionRequestBuilder.class);
    }

    /**
     * Creates a new AppleEnrollmentProfileAssignment
     * @param newAppleEnrollmentProfileAssignment the AppleEnrollmentProfileAssignment to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(@Nonnull final AppleEnrollmentProfileAssignment newAppleEnrollmentProfileAssignment, @Nonnull final ICallback<? super AppleEnrollmentProfileAssignment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AppleEnrollmentProfileAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAppleEnrollmentProfileAssignment, callback);
    }

    /**
     * Creates a new AppleEnrollmentProfileAssignment
     * @param newAppleEnrollmentProfileAssignment the AppleEnrollmentProfileAssignment to create
     * @return the newly created object
     */
    @Nonnull
    public AppleEnrollmentProfileAssignment post(@Nonnull final AppleEnrollmentProfileAssignment newAppleEnrollmentProfileAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AppleEnrollmentProfileAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAppleEnrollmentProfileAssignment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public AppleEnrollmentProfileAssignmentCollectionRequest expand(@Nonnull final String value) {
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
    public AppleEnrollmentProfileAssignmentCollectionRequest filter(@Nonnull final String value) {
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
    public AppleEnrollmentProfileAssignmentCollectionRequest orderBy(@Nonnull final String value) {
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
    public AppleEnrollmentProfileAssignmentCollectionRequest select(@Nonnull final String value) {
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
    public AppleEnrollmentProfileAssignmentCollectionRequest top(final int value) {
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
    public AppleEnrollmentProfileAssignmentCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public AppleEnrollmentProfileAssignmentCollectionRequest count() {
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
    public AppleEnrollmentProfileAssignmentCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public AppleEnrollmentProfileAssignmentCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

