// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AccessReviewInstance;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Review Instance Request.
 */
public interface IAccessReviewInstanceRequest extends IHttpRequest {

    /**
     * Gets the AccessReviewInstance from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AccessReviewInstance> callback);

    /**
     * Gets the AccessReviewInstance from the service
     *
     * @return the AccessReviewInstance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessReviewInstance get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AccessReviewInstance> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AccessReviewInstance with a source
     *
     * @param sourceAccessReviewInstance the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AccessReviewInstance sourceAccessReviewInstance, final ICallback<? super AccessReviewInstance> callback);

    /**
     * Patches this AccessReviewInstance with a source
     *
     * @param sourceAccessReviewInstance the source object with updates
     * @return the updated AccessReviewInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessReviewInstance patch(final AccessReviewInstance sourceAccessReviewInstance) throws ClientException;

    /**
     * Posts a AccessReviewInstance with a new object
     *
     * @param newAccessReviewInstance the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AccessReviewInstance newAccessReviewInstance, final ICallback<? super AccessReviewInstance> callback);

    /**
     * Posts a AccessReviewInstance with a new object
     *
     * @param newAccessReviewInstance the new object to create
     * @return the created AccessReviewInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessReviewInstance post(final AccessReviewInstance newAccessReviewInstance) throws ClientException;

    /**
     * Posts a AccessReviewInstance with a new object
     *
     * @param newAccessReviewInstance the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AccessReviewInstance newAccessReviewInstance, final ICallback<? super AccessReviewInstance> callback);

    /**
     * Posts a AccessReviewInstance with a new object
     *
     * @param newAccessReviewInstance the object to create/update
     * @return the created AccessReviewInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessReviewInstance put(final AccessReviewInstance newAccessReviewInstance) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAccessReviewInstanceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAccessReviewInstanceRequest expand(final String value);

}

