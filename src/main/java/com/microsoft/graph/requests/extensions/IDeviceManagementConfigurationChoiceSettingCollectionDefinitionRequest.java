// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationChoiceSettingCollectionDefinition;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Configuration Choice Setting Collection Definition Request.
 */
public interface IDeviceManagementConfigurationChoiceSettingCollectionDefinitionRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementConfigurationChoiceSettingCollectionDefinition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceManagementConfigurationChoiceSettingCollectionDefinition> callback);

    /**
     * Gets the DeviceManagementConfigurationChoiceSettingCollectionDefinition from the service
     *
     * @return the DeviceManagementConfigurationChoiceSettingCollectionDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementConfigurationChoiceSettingCollectionDefinition get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceManagementConfigurationChoiceSettingCollectionDefinition> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementConfigurationChoiceSettingCollectionDefinition with a source
     *
     * @param sourceDeviceManagementConfigurationChoiceSettingCollectionDefinition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementConfigurationChoiceSettingCollectionDefinition sourceDeviceManagementConfigurationChoiceSettingCollectionDefinition, final ICallback<? super DeviceManagementConfigurationChoiceSettingCollectionDefinition> callback);

    /**
     * Patches this DeviceManagementConfigurationChoiceSettingCollectionDefinition with a source
     *
     * @param sourceDeviceManagementConfigurationChoiceSettingCollectionDefinition the source object with updates
     * @return the updated DeviceManagementConfigurationChoiceSettingCollectionDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementConfigurationChoiceSettingCollectionDefinition patch(final DeviceManagementConfigurationChoiceSettingCollectionDefinition sourceDeviceManagementConfigurationChoiceSettingCollectionDefinition) throws ClientException;

    /**
     * Posts a DeviceManagementConfigurationChoiceSettingCollectionDefinition with a new object
     *
     * @param newDeviceManagementConfigurationChoiceSettingCollectionDefinition the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementConfigurationChoiceSettingCollectionDefinition newDeviceManagementConfigurationChoiceSettingCollectionDefinition, final ICallback<? super DeviceManagementConfigurationChoiceSettingCollectionDefinition> callback);

    /**
     * Posts a DeviceManagementConfigurationChoiceSettingCollectionDefinition with a new object
     *
     * @param newDeviceManagementConfigurationChoiceSettingCollectionDefinition the new object to create
     * @return the created DeviceManagementConfigurationChoiceSettingCollectionDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementConfigurationChoiceSettingCollectionDefinition post(final DeviceManagementConfigurationChoiceSettingCollectionDefinition newDeviceManagementConfigurationChoiceSettingCollectionDefinition) throws ClientException;

    /**
     * Posts a DeviceManagementConfigurationChoiceSettingCollectionDefinition with a new object
     *
     * @param newDeviceManagementConfigurationChoiceSettingCollectionDefinition the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceManagementConfigurationChoiceSettingCollectionDefinition newDeviceManagementConfigurationChoiceSettingCollectionDefinition, final ICallback<? super DeviceManagementConfigurationChoiceSettingCollectionDefinition> callback);

    /**
     * Posts a DeviceManagementConfigurationChoiceSettingCollectionDefinition with a new object
     *
     * @param newDeviceManagementConfigurationChoiceSettingCollectionDefinition the object to create/update
     * @return the created DeviceManagementConfigurationChoiceSettingCollectionDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementConfigurationChoiceSettingCollectionDefinition put(final DeviceManagementConfigurationChoiceSettingCollectionDefinition newDeviceManagementConfigurationChoiceSettingCollectionDefinition) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementConfigurationChoiceSettingCollectionDefinitionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementConfigurationChoiceSettingCollectionDefinitionRequest expand(final String value);

}

