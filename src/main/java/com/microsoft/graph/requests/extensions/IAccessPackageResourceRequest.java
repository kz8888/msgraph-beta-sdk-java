// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AccessPackageResource;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Package Resource Request.
 */
public interface IAccessPackageResourceRequest extends IHttpRequest {

    /**
     * Gets the AccessPackageResource from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AccessPackageResource> callback);

    /**
     * Gets the AccessPackageResource from the service
     *
     * @return the AccessPackageResource from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageResource get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AccessPackageResource> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AccessPackageResource with a source
     *
     * @param sourceAccessPackageResource the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AccessPackageResource sourceAccessPackageResource, final ICallback<? super AccessPackageResource> callback);

    /**
     * Patches this AccessPackageResource with a source
     *
     * @param sourceAccessPackageResource the source object with updates
     * @return the updated AccessPackageResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageResource patch(final AccessPackageResource sourceAccessPackageResource) throws ClientException;

    /**
     * Posts a AccessPackageResource with a new object
     *
     * @param newAccessPackageResource the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AccessPackageResource newAccessPackageResource, final ICallback<? super AccessPackageResource> callback);

    /**
     * Posts a AccessPackageResource with a new object
     *
     * @param newAccessPackageResource the new object to create
     * @return the created AccessPackageResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageResource post(final AccessPackageResource newAccessPackageResource) throws ClientException;

    /**
     * Posts a AccessPackageResource with a new object
     *
     * @param newAccessPackageResource the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AccessPackageResource newAccessPackageResource, final ICallback<? super AccessPackageResource> callback);

    /**
     * Posts a AccessPackageResource with a new object
     *
     * @param newAccessPackageResource the object to create/update
     * @return the created AccessPackageResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageResource put(final AccessPackageResource newAccessPackageResource) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAccessPackageResourceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAccessPackageResourceRequest expand(final String value);

}

