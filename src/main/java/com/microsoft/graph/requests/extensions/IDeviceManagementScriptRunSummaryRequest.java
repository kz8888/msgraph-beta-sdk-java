// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementScriptRunSummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Script Run Summary Request.
 */
public interface IDeviceManagementScriptRunSummaryRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementScriptRunSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceManagementScriptRunSummary> callback);

    /**
     * Gets the DeviceManagementScriptRunSummary from the service
     *
     * @return the DeviceManagementScriptRunSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementScriptRunSummary get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DeviceManagementScriptRunSummary> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementScriptRunSummary with a source
     *
     * @param sourceDeviceManagementScriptRunSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementScriptRunSummary sourceDeviceManagementScriptRunSummary, final ICallback<DeviceManagementScriptRunSummary> callback);

    /**
     * Patches this DeviceManagementScriptRunSummary with a source
     *
     * @param sourceDeviceManagementScriptRunSummary the source object with updates
     * @return the updated DeviceManagementScriptRunSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementScriptRunSummary patch(final DeviceManagementScriptRunSummary sourceDeviceManagementScriptRunSummary) throws ClientException;

    /**
     * Posts a DeviceManagementScriptRunSummary with a new object
     *
     * @param newDeviceManagementScriptRunSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementScriptRunSummary newDeviceManagementScriptRunSummary, final ICallback<DeviceManagementScriptRunSummary> callback);

    /**
     * Posts a DeviceManagementScriptRunSummary with a new object
     *
     * @param newDeviceManagementScriptRunSummary the new object to create
     * @return the created DeviceManagementScriptRunSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementScriptRunSummary post(final DeviceManagementScriptRunSummary newDeviceManagementScriptRunSummary) throws ClientException;

    /**
     * Posts a DeviceManagementScriptRunSummary with a new object
     *
     * @param newDeviceManagementScriptRunSummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceManagementScriptRunSummary newDeviceManagementScriptRunSummary, final ICallback<DeviceManagementScriptRunSummary> callback);

    /**
     * Posts a DeviceManagementScriptRunSummary with a new object
     *
     * @param newDeviceManagementScriptRunSummary the object to create/update
     * @return the created DeviceManagementScriptRunSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementScriptRunSummary put(final DeviceManagementScriptRunSummary newDeviceManagementScriptRunSummary) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementScriptRunSummaryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementScriptRunSummaryRequest expand(final String value);

}

