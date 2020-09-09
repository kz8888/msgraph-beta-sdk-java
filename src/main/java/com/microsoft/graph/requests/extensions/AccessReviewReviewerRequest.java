// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessReviewReviewer;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Reviewer Request.
 */
public class AccessReviewReviewerRequest extends BaseRequest implements IAccessReviewReviewerRequest {
	
    /**
     * The request for the AccessReviewReviewer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewReviewerRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessReviewReviewer.class);
    }

    /**
     * Gets the AccessReviewReviewer from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AccessReviewReviewer> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AccessReviewReviewer from the service
     *
     * @return the AccessReviewReviewer from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessReviewReviewer get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AccessReviewReviewer> callback) {
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
     * Patches this AccessReviewReviewer with a source
     *
     * @param sourceAccessReviewReviewer the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AccessReviewReviewer sourceAccessReviewReviewer, final ICallback<AccessReviewReviewer> callback) {
        send(HttpMethod.PATCH, callback, sourceAccessReviewReviewer);
    }

    /**
     * Patches this AccessReviewReviewer with a source
     *
     * @param sourceAccessReviewReviewer the source object with updates
     * @return the updated AccessReviewReviewer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessReviewReviewer patch(final AccessReviewReviewer sourceAccessReviewReviewer) throws ClientException {
        return send(HttpMethod.PATCH, sourceAccessReviewReviewer);
    }

    /**
     * Creates a AccessReviewReviewer with a new object
     *
     * @param newAccessReviewReviewer the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AccessReviewReviewer newAccessReviewReviewer, final ICallback<AccessReviewReviewer> callback) {
        send(HttpMethod.POST, callback, newAccessReviewReviewer);
    }

    /**
     * Creates a AccessReviewReviewer with a new object
     *
     * @param newAccessReviewReviewer the new object to create
     * @return the created AccessReviewReviewer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessReviewReviewer post(final AccessReviewReviewer newAccessReviewReviewer) throws ClientException {
        return send(HttpMethod.POST, newAccessReviewReviewer);
    }

    /**
     * Creates a AccessReviewReviewer with a new object
     *
     * @param newAccessReviewReviewer the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AccessReviewReviewer newAccessReviewReviewer, final ICallback<AccessReviewReviewer> callback) {
        send(HttpMethod.PUT, callback, newAccessReviewReviewer);
    }

    /**
     * Creates a AccessReviewReviewer with a new object
     *
     * @param newAccessReviewReviewer the object to create/update
     * @return the created AccessReviewReviewer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessReviewReviewer put(final AccessReviewReviewer newAccessReviewReviewer) throws ClientException {
        return send(HttpMethod.PUT, newAccessReviewReviewer);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAccessReviewReviewerRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AccessReviewReviewerRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAccessReviewReviewerRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AccessReviewReviewerRequest)this;
     }

}

