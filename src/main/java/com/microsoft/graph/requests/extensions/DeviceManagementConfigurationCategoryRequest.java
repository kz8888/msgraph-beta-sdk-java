// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationCategory;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Category Request.
 */
public class DeviceManagementConfigurationCategoryRequest extends BaseRequest implements IDeviceManagementConfigurationCategoryRequest {
	
    /**
     * The request for the DeviceManagementConfigurationCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementConfigurationCategoryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementConfigurationCategory.class);
    }

    /**
     * Gets the DeviceManagementConfigurationCategory from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceManagementConfigurationCategory> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementConfigurationCategory from the service
     *
     * @return the DeviceManagementConfigurationCategory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementConfigurationCategory get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceManagementConfigurationCategory> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceManagementConfigurationCategory with a source
     *
     * @param sourceDeviceManagementConfigurationCategory the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementConfigurationCategory sourceDeviceManagementConfigurationCategory, final ICallback<? super DeviceManagementConfigurationCategory> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementConfigurationCategory);
    }

    /**
     * Patches this DeviceManagementConfigurationCategory with a source
     *
     * @param sourceDeviceManagementConfigurationCategory the source object with updates
     * @return the updated DeviceManagementConfigurationCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementConfigurationCategory patch(final DeviceManagementConfigurationCategory sourceDeviceManagementConfigurationCategory) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementConfigurationCategory);
    }

    /**
     * Creates a DeviceManagementConfigurationCategory with a new object
     *
     * @param newDeviceManagementConfigurationCategory the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementConfigurationCategory newDeviceManagementConfigurationCategory, final ICallback<? super DeviceManagementConfigurationCategory> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementConfigurationCategory);
    }

    /**
     * Creates a DeviceManagementConfigurationCategory with a new object
     *
     * @param newDeviceManagementConfigurationCategory the new object to create
     * @return the created DeviceManagementConfigurationCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementConfigurationCategory post(final DeviceManagementConfigurationCategory newDeviceManagementConfigurationCategory) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementConfigurationCategory);
    }

    /**
     * Creates a DeviceManagementConfigurationCategory with a new object
     *
     * @param newDeviceManagementConfigurationCategory the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceManagementConfigurationCategory newDeviceManagementConfigurationCategory, final ICallback<? super DeviceManagementConfigurationCategory> callback) {
        send(HttpMethod.PUT, callback, newDeviceManagementConfigurationCategory);
    }

    /**
     * Creates a DeviceManagementConfigurationCategory with a new object
     *
     * @param newDeviceManagementConfigurationCategory the object to create/update
     * @return the created DeviceManagementConfigurationCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementConfigurationCategory put(final DeviceManagementConfigurationCategory newDeviceManagementConfigurationCategory) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementConfigurationCategory);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementConfigurationCategoryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceManagementConfigurationCategoryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementConfigurationCategoryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceManagementConfigurationCategoryRequest)this;
     }

}

