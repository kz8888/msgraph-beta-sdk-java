// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RbacApplicationMultiple;
import com.microsoft.graph.models.extensions.UnifiedRoleAssignmentMultiple;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.UnifiedRoleAssignmentMultipleCollectionResponse;
import com.microsoft.graph.requests.extensions.UnifiedRoleAssignmentMultipleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRoleAssignmentMultipleCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Multiple Collection Request.
 */
public class UnifiedRoleAssignmentMultipleCollectionRequest extends BaseEntityCollectionRequest<UnifiedRoleAssignmentMultiple, UnifiedRoleAssignmentMultipleCollectionResponse, UnifiedRoleAssignmentMultipleCollectionPage> {

    /**
     * The request builder for this collection of UnifiedRoleAssignmentMultiple
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleAssignmentMultipleCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleAssignmentMultipleCollectionResponse.class, UnifiedRoleAssignmentMultipleCollectionPage.class, UnifiedRoleAssignmentMultipleCollectionRequestBuilder.class);
    }

    /**
     * Creates a new UnifiedRoleAssignmentMultiple
     * @param newUnifiedRoleAssignmentMultiple the UnifiedRoleAssignmentMultiple to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(@Nonnull final UnifiedRoleAssignmentMultiple newUnifiedRoleAssignmentMultiple, @Nonnull final ICallback<? super UnifiedRoleAssignmentMultiple> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new UnifiedRoleAssignmentMultipleRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUnifiedRoleAssignmentMultiple, callback);
    }

    /**
     * Creates a new UnifiedRoleAssignmentMultiple
     * @param newUnifiedRoleAssignmentMultiple the UnifiedRoleAssignmentMultiple to create
     * @return the newly created object
     */
    @Nonnull
    public UnifiedRoleAssignmentMultiple post(@Nonnull final UnifiedRoleAssignmentMultiple newUnifiedRoleAssignmentMultiple) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UnifiedRoleAssignmentMultipleRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUnifiedRoleAssignmentMultiple);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public UnifiedRoleAssignmentMultipleCollectionRequest expand(@Nonnull final String value) {
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
    public UnifiedRoleAssignmentMultipleCollectionRequest filter(@Nonnull final String value) {
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
    public UnifiedRoleAssignmentMultipleCollectionRequest orderBy(@Nonnull final String value) {
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
    public UnifiedRoleAssignmentMultipleCollectionRequest select(@Nonnull final String value) {
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
    public UnifiedRoleAssignmentMultipleCollectionRequest top(final int value) {
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
    public UnifiedRoleAssignmentMultipleCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public UnifiedRoleAssignmentMultipleCollectionRequest count() {
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
    public UnifiedRoleAssignmentMultipleCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public UnifiedRoleAssignmentMultipleCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

