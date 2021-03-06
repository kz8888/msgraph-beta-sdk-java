// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsPhone81StoreApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Phone81Store App Request.
 */
public interface IWindowsPhone81StoreAppRequest extends IHttpRequest {

    /**
     * Gets the WindowsPhone81StoreApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WindowsPhone81StoreApp> callback);

    /**
     * Gets the WindowsPhone81StoreApp from the service
     *
     * @return the WindowsPhone81StoreApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhone81StoreApp get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WindowsPhone81StoreApp> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsPhone81StoreApp with a source
     *
     * @param sourceWindowsPhone81StoreApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsPhone81StoreApp sourceWindowsPhone81StoreApp, final ICallback<? super WindowsPhone81StoreApp> callback);

    /**
     * Patches this WindowsPhone81StoreApp with a source
     *
     * @param sourceWindowsPhone81StoreApp the source object with updates
     * @return the updated WindowsPhone81StoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhone81StoreApp patch(final WindowsPhone81StoreApp sourceWindowsPhone81StoreApp) throws ClientException;

    /**
     * Posts a WindowsPhone81StoreApp with a new object
     *
     * @param newWindowsPhone81StoreApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsPhone81StoreApp newWindowsPhone81StoreApp, final ICallback<? super WindowsPhone81StoreApp> callback);

    /**
     * Posts a WindowsPhone81StoreApp with a new object
     *
     * @param newWindowsPhone81StoreApp the new object to create
     * @return the created WindowsPhone81StoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhone81StoreApp post(final WindowsPhone81StoreApp newWindowsPhone81StoreApp) throws ClientException;

    /**
     * Posts a WindowsPhone81StoreApp with a new object
     *
     * @param newWindowsPhone81StoreApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WindowsPhone81StoreApp newWindowsPhone81StoreApp, final ICallback<? super WindowsPhone81StoreApp> callback);

    /**
     * Posts a WindowsPhone81StoreApp with a new object
     *
     * @param newWindowsPhone81StoreApp the object to create/update
     * @return the created WindowsPhone81StoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhone81StoreApp put(final WindowsPhone81StoreApp newWindowsPhone81StoreApp) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsPhone81StoreAppRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsPhone81StoreAppRequest expand(final String value);

}

