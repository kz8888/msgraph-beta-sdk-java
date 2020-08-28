// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsVpnConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Vpn Configuration Request.
 */
public interface IWindowsVpnConfigurationRequest extends IHttpRequest {

    /**
     * Gets the WindowsVpnConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WindowsVpnConfiguration> callback);

    /**
     * Gets the WindowsVpnConfiguration from the service
     *
     * @return the WindowsVpnConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsVpnConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<WindowsVpnConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsVpnConfiguration with a source
     *
     * @param sourceWindowsVpnConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsVpnConfiguration sourceWindowsVpnConfiguration, final ICallback<WindowsVpnConfiguration> callback);

    /**
     * Patches this WindowsVpnConfiguration with a source
     *
     * @param sourceWindowsVpnConfiguration the source object with updates
     * @return the updated WindowsVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsVpnConfiguration patch(final WindowsVpnConfiguration sourceWindowsVpnConfiguration) throws ClientException;

    /**
     * Posts a WindowsVpnConfiguration with a new object
     *
     * @param newWindowsVpnConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsVpnConfiguration newWindowsVpnConfiguration, final ICallback<WindowsVpnConfiguration> callback);

    /**
     * Posts a WindowsVpnConfiguration with a new object
     *
     * @param newWindowsVpnConfiguration the new object to create
     * @return the created WindowsVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsVpnConfiguration post(final WindowsVpnConfiguration newWindowsVpnConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsVpnConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsVpnConfigurationRequest expand(final String value);

}
