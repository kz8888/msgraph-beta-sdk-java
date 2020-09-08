// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceComplianceScriptDeviceState;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Compliance Script Device State Request.
 */
public interface IDeviceComplianceScriptDeviceStateRequest extends IHttpRequest {

    /**
     * Gets the DeviceComplianceScriptDeviceState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceComplianceScriptDeviceState> callback);

    /**
     * Gets the DeviceComplianceScriptDeviceState from the service
     *
     * @return the DeviceComplianceScriptDeviceState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceScriptDeviceState get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DeviceComplianceScriptDeviceState> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceComplianceScriptDeviceState with a source
     *
     * @param sourceDeviceComplianceScriptDeviceState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceComplianceScriptDeviceState sourceDeviceComplianceScriptDeviceState, final ICallback<DeviceComplianceScriptDeviceState> callback);

    /**
     * Patches this DeviceComplianceScriptDeviceState with a source
     *
     * @param sourceDeviceComplianceScriptDeviceState the source object with updates
     * @return the updated DeviceComplianceScriptDeviceState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceScriptDeviceState patch(final DeviceComplianceScriptDeviceState sourceDeviceComplianceScriptDeviceState) throws ClientException;

    /**
     * Posts a DeviceComplianceScriptDeviceState with a new object
     *
     * @param newDeviceComplianceScriptDeviceState the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceComplianceScriptDeviceState newDeviceComplianceScriptDeviceState, final ICallback<DeviceComplianceScriptDeviceState> callback);

    /**
     * Posts a DeviceComplianceScriptDeviceState with a new object
     *
     * @param newDeviceComplianceScriptDeviceState the new object to create
     * @return the created DeviceComplianceScriptDeviceState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceScriptDeviceState post(final DeviceComplianceScriptDeviceState newDeviceComplianceScriptDeviceState) throws ClientException;

    /**
     * Posts a DeviceComplianceScriptDeviceState with a new object
     *
     * @param newDeviceComplianceScriptDeviceState the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceComplianceScriptDeviceState newDeviceComplianceScriptDeviceState, final ICallback<DeviceComplianceScriptDeviceState> callback);

    /**
     * Posts a DeviceComplianceScriptDeviceState with a new object
     *
     * @param newDeviceComplianceScriptDeviceState the object to create/update
     * @return the created DeviceComplianceScriptDeviceState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceScriptDeviceState put(final DeviceComplianceScriptDeviceState newDeviceComplianceScriptDeviceState) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceComplianceScriptDeviceStateRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceComplianceScriptDeviceStateRequest expand(final String value);

}

