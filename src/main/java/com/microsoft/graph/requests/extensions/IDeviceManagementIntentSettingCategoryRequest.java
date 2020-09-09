// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementIntentSettingCategory;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Intent Setting Category Request.
 */
public interface IDeviceManagementIntentSettingCategoryRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementIntentSettingCategory from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceManagementIntentSettingCategory> callback);

    /**
     * Gets the DeviceManagementIntentSettingCategory from the service
     *
     * @return the DeviceManagementIntentSettingCategory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementIntentSettingCategory get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DeviceManagementIntentSettingCategory> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementIntentSettingCategory with a source
     *
     * @param sourceDeviceManagementIntentSettingCategory the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementIntentSettingCategory sourceDeviceManagementIntentSettingCategory, final ICallback<DeviceManagementIntentSettingCategory> callback);

    /**
     * Patches this DeviceManagementIntentSettingCategory with a source
     *
     * @param sourceDeviceManagementIntentSettingCategory the source object with updates
     * @return the updated DeviceManagementIntentSettingCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementIntentSettingCategory patch(final DeviceManagementIntentSettingCategory sourceDeviceManagementIntentSettingCategory) throws ClientException;

    /**
     * Posts a DeviceManagementIntentSettingCategory with a new object
     *
     * @param newDeviceManagementIntentSettingCategory the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementIntentSettingCategory newDeviceManagementIntentSettingCategory, final ICallback<DeviceManagementIntentSettingCategory> callback);

    /**
     * Posts a DeviceManagementIntentSettingCategory with a new object
     *
     * @param newDeviceManagementIntentSettingCategory the new object to create
     * @return the created DeviceManagementIntentSettingCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementIntentSettingCategory post(final DeviceManagementIntentSettingCategory newDeviceManagementIntentSettingCategory) throws ClientException;

    /**
     * Posts a DeviceManagementIntentSettingCategory with a new object
     *
     * @param newDeviceManagementIntentSettingCategory the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceManagementIntentSettingCategory newDeviceManagementIntentSettingCategory, final ICallback<DeviceManagementIntentSettingCategory> callback);

    /**
     * Posts a DeviceManagementIntentSettingCategory with a new object
     *
     * @param newDeviceManagementIntentSettingCategory the object to create/update
     * @return the created DeviceManagementIntentSettingCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementIntentSettingCategory put(final DeviceManagementIntentSettingCategory newDeviceManagementIntentSettingCategory) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementIntentSettingCategoryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementIntentSettingCategoryRequest expand(final String value);

}

