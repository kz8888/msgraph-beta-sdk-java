// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AccessPackageAssignmentResourceRole;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Package Assignment Resource Role Request.
 */
public interface IAccessPackageAssignmentResourceRoleRequest extends IHttpRequest {

    /**
     * Gets the AccessPackageAssignmentResourceRole from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AccessPackageAssignmentResourceRole> callback);

    /**
     * Gets the AccessPackageAssignmentResourceRole from the service
     *
     * @return the AccessPackageAssignmentResourceRole from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageAssignmentResourceRole get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AccessPackageAssignmentResourceRole> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AccessPackageAssignmentResourceRole with a source
     *
     * @param sourceAccessPackageAssignmentResourceRole the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AccessPackageAssignmentResourceRole sourceAccessPackageAssignmentResourceRole, final ICallback<? super AccessPackageAssignmentResourceRole> callback);

    /**
     * Patches this AccessPackageAssignmentResourceRole with a source
     *
     * @param sourceAccessPackageAssignmentResourceRole the source object with updates
     * @return the updated AccessPackageAssignmentResourceRole
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageAssignmentResourceRole patch(final AccessPackageAssignmentResourceRole sourceAccessPackageAssignmentResourceRole) throws ClientException;

    /**
     * Posts a AccessPackageAssignmentResourceRole with a new object
     *
     * @param newAccessPackageAssignmentResourceRole the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AccessPackageAssignmentResourceRole newAccessPackageAssignmentResourceRole, final ICallback<? super AccessPackageAssignmentResourceRole> callback);

    /**
     * Posts a AccessPackageAssignmentResourceRole with a new object
     *
     * @param newAccessPackageAssignmentResourceRole the new object to create
     * @return the created AccessPackageAssignmentResourceRole
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageAssignmentResourceRole post(final AccessPackageAssignmentResourceRole newAccessPackageAssignmentResourceRole) throws ClientException;

    /**
     * Posts a AccessPackageAssignmentResourceRole with a new object
     *
     * @param newAccessPackageAssignmentResourceRole the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AccessPackageAssignmentResourceRole newAccessPackageAssignmentResourceRole, final ICallback<? super AccessPackageAssignmentResourceRole> callback);

    /**
     * Posts a AccessPackageAssignmentResourceRole with a new object
     *
     * @param newAccessPackageAssignmentResourceRole the object to create/update
     * @return the created AccessPackageAssignmentResourceRole
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageAssignmentResourceRole put(final AccessPackageAssignmentResourceRole newAccessPackageAssignmentResourceRole) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAccessPackageAssignmentResourceRoleRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAccessPackageAssignmentResourceRoleRequest expand(final String value);

}

