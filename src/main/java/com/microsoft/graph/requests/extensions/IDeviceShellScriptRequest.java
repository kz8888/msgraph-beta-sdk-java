// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceShellScript;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Shell Script Request.
 */
public interface IDeviceShellScriptRequest extends IHttpRequest {

    /**
     * Gets the DeviceShellScript from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceShellScript> callback);

    /**
     * Gets the DeviceShellScript from the service
     *
     * @return the DeviceShellScript from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceShellScript get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DeviceShellScript> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceShellScript with a source
     *
     * @param sourceDeviceShellScript the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceShellScript sourceDeviceShellScript, final ICallback<DeviceShellScript> callback);

    /**
     * Patches this DeviceShellScript with a source
     *
     * @param sourceDeviceShellScript the source object with updates
     * @return the updated DeviceShellScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceShellScript patch(final DeviceShellScript sourceDeviceShellScript) throws ClientException;

    /**
     * Posts a DeviceShellScript with a new object
     *
     * @param newDeviceShellScript the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceShellScript newDeviceShellScript, final ICallback<DeviceShellScript> callback);

    /**
     * Posts a DeviceShellScript with a new object
     *
     * @param newDeviceShellScript the new object to create
     * @return the created DeviceShellScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceShellScript post(final DeviceShellScript newDeviceShellScript) throws ClientException;

    /**
     * Posts a DeviceShellScript with a new object
     *
     * @param newDeviceShellScript the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceShellScript newDeviceShellScript, final ICallback<DeviceShellScript> callback);

    /**
     * Posts a DeviceShellScript with a new object
     *
     * @param newDeviceShellScript the object to create/update
     * @return the created DeviceShellScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceShellScript put(final DeviceShellScript newDeviceShellScript) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceShellScriptRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceShellScriptRequest expand(final String value);

}

