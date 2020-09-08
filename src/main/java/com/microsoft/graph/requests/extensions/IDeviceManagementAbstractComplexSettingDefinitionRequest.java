// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementAbstractComplexSettingDefinition;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Abstract Complex Setting Definition Request.
 */
public interface IDeviceManagementAbstractComplexSettingDefinitionRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementAbstractComplexSettingDefinition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceManagementAbstractComplexSettingDefinition> callback);

    /**
     * Gets the DeviceManagementAbstractComplexSettingDefinition from the service
     *
     * @return the DeviceManagementAbstractComplexSettingDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementAbstractComplexSettingDefinition get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DeviceManagementAbstractComplexSettingDefinition> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementAbstractComplexSettingDefinition with a source
     *
     * @param sourceDeviceManagementAbstractComplexSettingDefinition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementAbstractComplexSettingDefinition sourceDeviceManagementAbstractComplexSettingDefinition, final ICallback<DeviceManagementAbstractComplexSettingDefinition> callback);

    /**
     * Patches this DeviceManagementAbstractComplexSettingDefinition with a source
     *
     * @param sourceDeviceManagementAbstractComplexSettingDefinition the source object with updates
     * @return the updated DeviceManagementAbstractComplexSettingDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementAbstractComplexSettingDefinition patch(final DeviceManagementAbstractComplexSettingDefinition sourceDeviceManagementAbstractComplexSettingDefinition) throws ClientException;

    /**
     * Posts a DeviceManagementAbstractComplexSettingDefinition with a new object
     *
     * @param newDeviceManagementAbstractComplexSettingDefinition the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementAbstractComplexSettingDefinition newDeviceManagementAbstractComplexSettingDefinition, final ICallback<DeviceManagementAbstractComplexSettingDefinition> callback);

    /**
     * Posts a DeviceManagementAbstractComplexSettingDefinition with a new object
     *
     * @param newDeviceManagementAbstractComplexSettingDefinition the new object to create
     * @return the created DeviceManagementAbstractComplexSettingDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementAbstractComplexSettingDefinition post(final DeviceManagementAbstractComplexSettingDefinition newDeviceManagementAbstractComplexSettingDefinition) throws ClientException;

    /**
     * Posts a DeviceManagementAbstractComplexSettingDefinition with a new object
     *
     * @param newDeviceManagementAbstractComplexSettingDefinition the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceManagementAbstractComplexSettingDefinition newDeviceManagementAbstractComplexSettingDefinition, final ICallback<DeviceManagementAbstractComplexSettingDefinition> callback);

    /**
     * Posts a DeviceManagementAbstractComplexSettingDefinition with a new object
     *
     * @param newDeviceManagementAbstractComplexSettingDefinition the object to create/update
     * @return the created DeviceManagementAbstractComplexSettingDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementAbstractComplexSettingDefinition put(final DeviceManagementAbstractComplexSettingDefinition newDeviceManagementAbstractComplexSettingDefinition) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementAbstractComplexSettingDefinitionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementAbstractComplexSettingDefinitionRequest expand(final String value);

}

