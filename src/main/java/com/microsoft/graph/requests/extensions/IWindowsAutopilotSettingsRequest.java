// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsAutopilotSettings;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Autopilot Settings Request.
 */
public interface IWindowsAutopilotSettingsRequest extends IHttpRequest {

    /**
     * Gets the WindowsAutopilotSettings from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WindowsAutopilotSettings> callback);

    /**
     * Gets the WindowsAutopilotSettings from the service
     *
     * @return the WindowsAutopilotSettings from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsAutopilotSettings get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WindowsAutopilotSettings> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsAutopilotSettings with a source
     *
     * @param sourceWindowsAutopilotSettings the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsAutopilotSettings sourceWindowsAutopilotSettings, final ICallback<? super WindowsAutopilotSettings> callback);

    /**
     * Patches this WindowsAutopilotSettings with a source
     *
     * @param sourceWindowsAutopilotSettings the source object with updates
     * @return the updated WindowsAutopilotSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsAutopilotSettings patch(final WindowsAutopilotSettings sourceWindowsAutopilotSettings) throws ClientException;

    /**
     * Posts a WindowsAutopilotSettings with a new object
     *
     * @param newWindowsAutopilotSettings the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsAutopilotSettings newWindowsAutopilotSettings, final ICallback<? super WindowsAutopilotSettings> callback);

    /**
     * Posts a WindowsAutopilotSettings with a new object
     *
     * @param newWindowsAutopilotSettings the new object to create
     * @return the created WindowsAutopilotSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsAutopilotSettings post(final WindowsAutopilotSettings newWindowsAutopilotSettings) throws ClientException;

    /**
     * Posts a WindowsAutopilotSettings with a new object
     *
     * @param newWindowsAutopilotSettings the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WindowsAutopilotSettings newWindowsAutopilotSettings, final ICallback<? super WindowsAutopilotSettings> callback);

    /**
     * Posts a WindowsAutopilotSettings with a new object
     *
     * @param newWindowsAutopilotSettings the object to create/update
     * @return the created WindowsAutopilotSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsAutopilotSettings put(final WindowsAutopilotSettings newWindowsAutopilotSettings) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsAutopilotSettingsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsAutopilotSettingsRequest expand(final String value);

}

