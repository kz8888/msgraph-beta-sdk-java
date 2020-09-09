// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AccessPackage;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Package Request.
 */
public interface IAccessPackageRequest extends IHttpRequest {

    /**
     * Gets the AccessPackage from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AccessPackage> callback);

    /**
     * Gets the AccessPackage from the service
     *
     * @return the AccessPackage from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackage get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AccessPackage> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AccessPackage with a source
     *
     * @param sourceAccessPackage the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AccessPackage sourceAccessPackage, final ICallback<AccessPackage> callback);

    /**
     * Patches this AccessPackage with a source
     *
     * @param sourceAccessPackage the source object with updates
     * @return the updated AccessPackage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackage patch(final AccessPackage sourceAccessPackage) throws ClientException;

    /**
     * Posts a AccessPackage with a new object
     *
     * @param newAccessPackage the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AccessPackage newAccessPackage, final ICallback<AccessPackage> callback);

    /**
     * Posts a AccessPackage with a new object
     *
     * @param newAccessPackage the new object to create
     * @return the created AccessPackage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackage post(final AccessPackage newAccessPackage) throws ClientException;

    /**
     * Posts a AccessPackage with a new object
     *
     * @param newAccessPackage the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AccessPackage newAccessPackage, final ICallback<AccessPackage> callback);

    /**
     * Posts a AccessPackage with a new object
     *
     * @param newAccessPackage the object to create/update
     * @return the created AccessPackage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackage put(final AccessPackage newAccessPackage) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAccessPackageRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAccessPackageRequest expand(final String value);

}

