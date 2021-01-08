// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessReviewDecision;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Decision Request.
 */
public class AccessReviewDecisionRequest extends BaseRequest<AccessReviewDecision> {
	
    /**
     * The request for the AccessReviewDecision
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewDecisionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessReviewDecision.class);
    }

    /**
     * Gets the AccessReviewDecision from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super AccessReviewDecision> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AccessReviewDecision from the service
     *
     * @return the AccessReviewDecision from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessReviewDecision get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super AccessReviewDecision> callback) {
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
     * Patches this AccessReviewDecision with a source
     *
     * @param sourceAccessReviewDecision the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final AccessReviewDecision sourceAccessReviewDecision, @Nonnull final ICallback<? super AccessReviewDecision> callback) {
        send(HttpMethod.PATCH, callback, sourceAccessReviewDecision);
    }

    /**
     * Patches this AccessReviewDecision with a source
     *
     * @param sourceAccessReviewDecision the source object with updates
     * @return the updated AccessReviewDecision
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessReviewDecision patch(@Nonnull final AccessReviewDecision sourceAccessReviewDecision) throws ClientException {
        return send(HttpMethod.PATCH, sourceAccessReviewDecision);
    }

    /**
     * Creates a AccessReviewDecision with a new object
     *
     * @param newAccessReviewDecision the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final AccessReviewDecision newAccessReviewDecision, @Nonnull final ICallback<? super AccessReviewDecision> callback) {
        send(HttpMethod.POST, callback, newAccessReviewDecision);
    }

    /**
     * Creates a AccessReviewDecision with a new object
     *
     * @param newAccessReviewDecision the new object to create
     * @return the created AccessReviewDecision
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessReviewDecision post(@Nonnull final AccessReviewDecision newAccessReviewDecision) throws ClientException {
        return send(HttpMethod.POST, newAccessReviewDecision);
    }

    /**
     * Creates a AccessReviewDecision with a new object
     *
     * @param newAccessReviewDecision the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final AccessReviewDecision newAccessReviewDecision, @Nonnull final ICallback<? super AccessReviewDecision> callback) {
        send(HttpMethod.PUT, callback, newAccessReviewDecision);
    }

    /**
     * Creates a AccessReviewDecision with a new object
     *
     * @param newAccessReviewDecision the object to create/update
     * @return the created AccessReviewDecision
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessReviewDecision put(@Nonnull final AccessReviewDecision newAccessReviewDecision) throws ClientException {
        return send(HttpMethod.PUT, newAccessReviewDecision);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AccessReviewDecisionRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public AccessReviewDecisionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

