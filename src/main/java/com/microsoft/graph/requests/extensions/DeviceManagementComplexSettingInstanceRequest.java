// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementComplexSettingInstance;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingInstanceRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingInstanceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Complex Setting Instance Request.
 */
public class DeviceManagementComplexSettingInstanceRequest extends BaseRequest implements IDeviceManagementComplexSettingInstanceRequest {
	
    /**
     * The request for the DeviceManagementComplexSettingInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementComplexSettingInstanceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementComplexSettingInstance.class);
    }

    /**
     * Gets the DeviceManagementComplexSettingInstance from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceManagementComplexSettingInstance> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementComplexSettingInstance from the service
     *
     * @return the DeviceManagementComplexSettingInstance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementComplexSettingInstance get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceManagementComplexSettingInstance> callback) {
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
     * Patches this DeviceManagementComplexSettingInstance with a source
     *
     * @param sourceDeviceManagementComplexSettingInstance the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementComplexSettingInstance sourceDeviceManagementComplexSettingInstance, final ICallback<DeviceManagementComplexSettingInstance> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementComplexSettingInstance);
    }

    /**
     * Patches this DeviceManagementComplexSettingInstance with a source
     *
     * @param sourceDeviceManagementComplexSettingInstance the source object with updates
     * @return the updated DeviceManagementComplexSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementComplexSettingInstance patch(final DeviceManagementComplexSettingInstance sourceDeviceManagementComplexSettingInstance) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementComplexSettingInstance);
    }

    /**
     * Creates a DeviceManagementComplexSettingInstance with a new object
     *
     * @param newDeviceManagementComplexSettingInstance the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementComplexSettingInstance newDeviceManagementComplexSettingInstance, final ICallback<DeviceManagementComplexSettingInstance> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementComplexSettingInstance);
    }

    /**
     * Creates a DeviceManagementComplexSettingInstance with a new object
     *
     * @param newDeviceManagementComplexSettingInstance the new object to create
     * @return the created DeviceManagementComplexSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementComplexSettingInstance post(final DeviceManagementComplexSettingInstance newDeviceManagementComplexSettingInstance) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementComplexSettingInstance);
    }

    /**
     * Creates a DeviceManagementComplexSettingInstance with a new object
     *
     * @param newDeviceManagementComplexSettingInstance the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceManagementComplexSettingInstance newDeviceManagementComplexSettingInstance, final ICallback<DeviceManagementComplexSettingInstance> callback) {
        send(HttpMethod.PUT, callback, newDeviceManagementComplexSettingInstance);
    }

    /**
     * Creates a DeviceManagementComplexSettingInstance with a new object
     *
     * @param newDeviceManagementComplexSettingInstance the object to create/update
     * @return the created DeviceManagementComplexSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementComplexSettingInstance put(final DeviceManagementComplexSettingInstance newDeviceManagementComplexSettingInstance) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementComplexSettingInstance);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementComplexSettingInstanceRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceManagementComplexSettingInstanceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementComplexSettingInstanceRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceManagementComplexSettingInstanceRequest)this;
     }

}

