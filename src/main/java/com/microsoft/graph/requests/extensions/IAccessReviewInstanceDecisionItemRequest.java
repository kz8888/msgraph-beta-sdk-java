// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AccessReviewInstanceDecisionItem;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Review Instance Decision Item Request.
 */
public interface IAccessReviewInstanceDecisionItemRequest extends IHttpRequest {

    /**
     * Gets the AccessReviewInstanceDecisionItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AccessReviewInstanceDecisionItem> callback);

    /**
     * Gets the AccessReviewInstanceDecisionItem from the service
     *
     * @return the AccessReviewInstanceDecisionItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessReviewInstanceDecisionItem get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AccessReviewInstanceDecisionItem> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AccessReviewInstanceDecisionItem with a source
     *
     * @param sourceAccessReviewInstanceDecisionItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AccessReviewInstanceDecisionItem sourceAccessReviewInstanceDecisionItem, final ICallback<AccessReviewInstanceDecisionItem> callback);

    /**
     * Patches this AccessReviewInstanceDecisionItem with a source
     *
     * @param sourceAccessReviewInstanceDecisionItem the source object with updates
     * @return the updated AccessReviewInstanceDecisionItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessReviewInstanceDecisionItem patch(final AccessReviewInstanceDecisionItem sourceAccessReviewInstanceDecisionItem) throws ClientException;

    /**
     * Posts a AccessReviewInstanceDecisionItem with a new object
     *
     * @param newAccessReviewInstanceDecisionItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AccessReviewInstanceDecisionItem newAccessReviewInstanceDecisionItem, final ICallback<AccessReviewInstanceDecisionItem> callback);

    /**
     * Posts a AccessReviewInstanceDecisionItem with a new object
     *
     * @param newAccessReviewInstanceDecisionItem the new object to create
     * @return the created AccessReviewInstanceDecisionItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessReviewInstanceDecisionItem post(final AccessReviewInstanceDecisionItem newAccessReviewInstanceDecisionItem) throws ClientException;

    /**
     * Posts a AccessReviewInstanceDecisionItem with a new object
     *
     * @param newAccessReviewInstanceDecisionItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AccessReviewInstanceDecisionItem newAccessReviewInstanceDecisionItem, final ICallback<AccessReviewInstanceDecisionItem> callback);

    /**
     * Posts a AccessReviewInstanceDecisionItem with a new object
     *
     * @param newAccessReviewInstanceDecisionItem the object to create/update
     * @return the created AccessReviewInstanceDecisionItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessReviewInstanceDecisionItem put(final AccessReviewInstanceDecisionItem newAccessReviewInstanceDecisionItem) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAccessReviewInstanceDecisionItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAccessReviewInstanceDecisionItemRequest expand(final String value);

}

