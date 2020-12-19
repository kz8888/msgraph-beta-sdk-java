// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AccessPackageResourceRole;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Package Resource Role Request.
 */
public interface IAccessPackageResourceRoleRequest extends IHttpRequest {

    /**
     * Gets the AccessPackageResourceRole from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AccessPackageResourceRole> callback);

    /**
     * Gets the AccessPackageResourceRole from the service
     *
     * @return the AccessPackageResourceRole from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageResourceRole get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AccessPackageResourceRole> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AccessPackageResourceRole with a source
     *
     * @param sourceAccessPackageResourceRole the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AccessPackageResourceRole sourceAccessPackageResourceRole, final ICallback<? super AccessPackageResourceRole> callback);

    /**
     * Patches this AccessPackageResourceRole with a source
     *
     * @param sourceAccessPackageResourceRole the source object with updates
     * @return the updated AccessPackageResourceRole
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageResourceRole patch(final AccessPackageResourceRole sourceAccessPackageResourceRole) throws ClientException;

    /**
     * Posts a AccessPackageResourceRole with a new object
     *
     * @param newAccessPackageResourceRole the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AccessPackageResourceRole newAccessPackageResourceRole, final ICallback<? super AccessPackageResourceRole> callback);

    /**
     * Posts a AccessPackageResourceRole with a new object
     *
     * @param newAccessPackageResourceRole the new object to create
     * @return the created AccessPackageResourceRole
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageResourceRole post(final AccessPackageResourceRole newAccessPackageResourceRole) throws ClientException;

    /**
     * Posts a AccessPackageResourceRole with a new object
     *
     * @param newAccessPackageResourceRole the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AccessPackageResourceRole newAccessPackageResourceRole, final ICallback<? super AccessPackageResourceRole> callback);

    /**
     * Posts a AccessPackageResourceRole with a new object
     *
     * @param newAccessPackageResourceRole the object to create/update
     * @return the created AccessPackageResourceRole
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageResourceRole put(final AccessPackageResourceRole newAccessPackageResourceRole) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAccessPackageResourceRoleRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAccessPackageResourceRoleRequest expand(final String value);

}

