// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessReviewInstanceDecisionItem;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Instance Decision Item Request.
 */
public class AccessReviewInstanceDecisionItemRequest extends BaseRequest implements IAccessReviewInstanceDecisionItemRequest {
	
    /**
     * The request for the AccessReviewInstanceDecisionItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewInstanceDecisionItemRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessReviewInstanceDecisionItem.class);
    }

    /**
     * Gets the AccessReviewInstanceDecisionItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AccessReviewInstanceDecisionItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AccessReviewInstanceDecisionItem from the service
     *
     * @return the AccessReviewInstanceDecisionItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessReviewInstanceDecisionItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AccessReviewInstanceDecisionItem> callback) {
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
     * Patches this AccessReviewInstanceDecisionItem with a source
     *
     * @param sourceAccessReviewInstanceDecisionItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AccessReviewInstanceDecisionItem sourceAccessReviewInstanceDecisionItem, final ICallback<AccessReviewInstanceDecisionItem> callback) {
        send(HttpMethod.PATCH, callback, sourceAccessReviewInstanceDecisionItem);
    }

    /**
     * Patches this AccessReviewInstanceDecisionItem with a source
     *
     * @param sourceAccessReviewInstanceDecisionItem the source object with updates
     * @return the updated AccessReviewInstanceDecisionItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessReviewInstanceDecisionItem patch(final AccessReviewInstanceDecisionItem sourceAccessReviewInstanceDecisionItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceAccessReviewInstanceDecisionItem);
    }

    /**
     * Creates a AccessReviewInstanceDecisionItem with a new object
     *
     * @param newAccessReviewInstanceDecisionItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AccessReviewInstanceDecisionItem newAccessReviewInstanceDecisionItem, final ICallback<AccessReviewInstanceDecisionItem> callback) {
        send(HttpMethod.POST, callback, newAccessReviewInstanceDecisionItem);
    }

    /**
     * Creates a AccessReviewInstanceDecisionItem with a new object
     *
     * @param newAccessReviewInstanceDecisionItem the new object to create
     * @return the created AccessReviewInstanceDecisionItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessReviewInstanceDecisionItem post(final AccessReviewInstanceDecisionItem newAccessReviewInstanceDecisionItem) throws ClientException {
        return send(HttpMethod.POST, newAccessReviewInstanceDecisionItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAccessReviewInstanceDecisionItemRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AccessReviewInstanceDecisionItemRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAccessReviewInstanceDecisionItemRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AccessReviewInstanceDecisionItemRequest)this;
     }

}
