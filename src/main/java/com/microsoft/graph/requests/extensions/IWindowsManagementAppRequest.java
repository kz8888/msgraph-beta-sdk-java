// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsManagementApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Management App Request.
 */
public interface IWindowsManagementAppRequest extends IHttpRequest {

    /**
     * Gets the WindowsManagementApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WindowsManagementApp> callback);

    /**
     * Gets the WindowsManagementApp from the service
     *
     * @return the WindowsManagementApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsManagementApp get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<WindowsManagementApp> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsManagementApp with a source
     *
     * @param sourceWindowsManagementApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsManagementApp sourceWindowsManagementApp, final ICallback<WindowsManagementApp> callback);

    /**
     * Patches this WindowsManagementApp with a source
     *
     * @param sourceWindowsManagementApp the source object with updates
     * @return the updated WindowsManagementApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsManagementApp patch(final WindowsManagementApp sourceWindowsManagementApp) throws ClientException;

    /**
     * Posts a WindowsManagementApp with a new object
     *
     * @param newWindowsManagementApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsManagementApp newWindowsManagementApp, final ICallback<WindowsManagementApp> callback);

    /**
     * Posts a WindowsManagementApp with a new object
     *
     * @param newWindowsManagementApp the new object to create
     * @return the created WindowsManagementApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsManagementApp post(final WindowsManagementApp newWindowsManagementApp) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsManagementAppRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsManagementAppRequest expand(final String value);

}
