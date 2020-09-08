// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AppCatalogs;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the App Catalogs Request.
 */
public interface IAppCatalogsRequest extends IHttpRequest {

    /**
     * Gets the AppCatalogs from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AppCatalogs> callback);

    /**
     * Gets the AppCatalogs from the service
     *
     * @return the AppCatalogs from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppCatalogs get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AppCatalogs> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AppCatalogs with a source
     *
     * @param sourceAppCatalogs the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AppCatalogs sourceAppCatalogs, final ICallback<AppCatalogs> callback);

    /**
     * Patches this AppCatalogs with a source
     *
     * @param sourceAppCatalogs the source object with updates
     * @return the updated AppCatalogs
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppCatalogs patch(final AppCatalogs sourceAppCatalogs) throws ClientException;

    /**
     * Posts a AppCatalogs with a new object
     *
     * @param newAppCatalogs the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AppCatalogs newAppCatalogs, final ICallback<AppCatalogs> callback);

    /**
     * Posts a AppCatalogs with a new object
     *
     * @param newAppCatalogs the new object to create
     * @return the created AppCatalogs
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppCatalogs post(final AppCatalogs newAppCatalogs) throws ClientException;

    /**
     * Posts a AppCatalogs with a new object
     *
     * @param newAppCatalogs the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AppCatalogs newAppCatalogs, final ICallback<AppCatalogs> callback);

    /**
     * Posts a AppCatalogs with a new object
     *
     * @param newAppCatalogs the object to create/update
     * @return the created AppCatalogs
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppCatalogs put(final AppCatalogs newAppCatalogs) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAppCatalogsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAppCatalogsRequest expand(final String value);

}

