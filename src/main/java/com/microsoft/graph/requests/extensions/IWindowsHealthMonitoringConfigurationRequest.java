// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsHealthMonitoringConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Health Monitoring Configuration Request.
 */
public interface IWindowsHealthMonitoringConfigurationRequest extends IHttpRequest {

    /**
     * Gets the WindowsHealthMonitoringConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WindowsHealthMonitoringConfiguration> callback);

    /**
     * Gets the WindowsHealthMonitoringConfiguration from the service
     *
     * @return the WindowsHealthMonitoringConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsHealthMonitoringConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<WindowsHealthMonitoringConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsHealthMonitoringConfiguration with a source
     *
     * @param sourceWindowsHealthMonitoringConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsHealthMonitoringConfiguration sourceWindowsHealthMonitoringConfiguration, final ICallback<WindowsHealthMonitoringConfiguration> callback);

    /**
     * Patches this WindowsHealthMonitoringConfiguration with a source
     *
     * @param sourceWindowsHealthMonitoringConfiguration the source object with updates
     * @return the updated WindowsHealthMonitoringConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsHealthMonitoringConfiguration patch(final WindowsHealthMonitoringConfiguration sourceWindowsHealthMonitoringConfiguration) throws ClientException;

    /**
     * Posts a WindowsHealthMonitoringConfiguration with a new object
     *
     * @param newWindowsHealthMonitoringConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsHealthMonitoringConfiguration newWindowsHealthMonitoringConfiguration, final ICallback<WindowsHealthMonitoringConfiguration> callback);

    /**
     * Posts a WindowsHealthMonitoringConfiguration with a new object
     *
     * @param newWindowsHealthMonitoringConfiguration the new object to create
     * @return the created WindowsHealthMonitoringConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsHealthMonitoringConfiguration post(final WindowsHealthMonitoringConfiguration newWindowsHealthMonitoringConfiguration) throws ClientException;

    /**
     * Posts a WindowsHealthMonitoringConfiguration with a new object
     *
     * @param newWindowsHealthMonitoringConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WindowsHealthMonitoringConfiguration newWindowsHealthMonitoringConfiguration, final ICallback<WindowsHealthMonitoringConfiguration> callback);

    /**
     * Posts a WindowsHealthMonitoringConfiguration with a new object
     *
     * @param newWindowsHealthMonitoringConfiguration the object to create/update
     * @return the created WindowsHealthMonitoringConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsHealthMonitoringConfiguration put(final WindowsHealthMonitoringConfiguration newWindowsHealthMonitoringConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsHealthMonitoringConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsHealthMonitoringConfigurationRequest expand(final String value);

}

