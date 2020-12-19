// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceHealthScriptDeviceState;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Health Script Device State Request.
 */
public interface IDeviceHealthScriptDeviceStateRequest extends IHttpRequest {

    /**
     * Gets the DeviceHealthScriptDeviceState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceHealthScriptDeviceState> callback);

    /**
     * Gets the DeviceHealthScriptDeviceState from the service
     *
     * @return the DeviceHealthScriptDeviceState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceHealthScriptDeviceState get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceHealthScriptDeviceState> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceHealthScriptDeviceState with a source
     *
     * @param sourceDeviceHealthScriptDeviceState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceHealthScriptDeviceState sourceDeviceHealthScriptDeviceState, final ICallback<? super DeviceHealthScriptDeviceState> callback);

    /**
     * Patches this DeviceHealthScriptDeviceState with a source
     *
     * @param sourceDeviceHealthScriptDeviceState the source object with updates
     * @return the updated DeviceHealthScriptDeviceState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceHealthScriptDeviceState patch(final DeviceHealthScriptDeviceState sourceDeviceHealthScriptDeviceState) throws ClientException;

    /**
     * Posts a DeviceHealthScriptDeviceState with a new object
     *
     * @param newDeviceHealthScriptDeviceState the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceHealthScriptDeviceState newDeviceHealthScriptDeviceState, final ICallback<? super DeviceHealthScriptDeviceState> callback);

    /**
     * Posts a DeviceHealthScriptDeviceState with a new object
     *
     * @param newDeviceHealthScriptDeviceState the new object to create
     * @return the created DeviceHealthScriptDeviceState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceHealthScriptDeviceState post(final DeviceHealthScriptDeviceState newDeviceHealthScriptDeviceState) throws ClientException;

    /**
     * Posts a DeviceHealthScriptDeviceState with a new object
     *
     * @param newDeviceHealthScriptDeviceState the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceHealthScriptDeviceState newDeviceHealthScriptDeviceState, final ICallback<? super DeviceHealthScriptDeviceState> callback);

    /**
     * Posts a DeviceHealthScriptDeviceState with a new object
     *
     * @param newDeviceHealthScriptDeviceState the object to create/update
     * @return the created DeviceHealthScriptDeviceState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceHealthScriptDeviceState put(final DeviceHealthScriptDeviceState newDeviceHealthScriptDeviceState) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceHealthScriptDeviceStateRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceHealthScriptDeviceStateRequest expand(final String value);

}

