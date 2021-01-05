// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementIntegerSettingInstance;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Integer Setting Instance Request.
 */
public class DeviceManagementIntegerSettingInstanceRequest extends BaseRequest implements IDeviceManagementIntegerSettingInstanceRequest {
	
    /**
     * The request for the DeviceManagementIntegerSettingInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementIntegerSettingInstanceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementIntegerSettingInstance.class);
    }

    /**
     * Gets the DeviceManagementIntegerSettingInstance from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceManagementIntegerSettingInstance> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementIntegerSettingInstance from the service
     *
     * @return the DeviceManagementIntegerSettingInstance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementIntegerSettingInstance get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceManagementIntegerSettingInstance> callback) {
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
     * Patches this DeviceManagementIntegerSettingInstance with a source
     *
     * @param sourceDeviceManagementIntegerSettingInstance the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementIntegerSettingInstance sourceDeviceManagementIntegerSettingInstance, final ICallback<? super DeviceManagementIntegerSettingInstance> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementIntegerSettingInstance);
    }

    /**
     * Patches this DeviceManagementIntegerSettingInstance with a source
     *
     * @param sourceDeviceManagementIntegerSettingInstance the source object with updates
     * @return the updated DeviceManagementIntegerSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementIntegerSettingInstance patch(final DeviceManagementIntegerSettingInstance sourceDeviceManagementIntegerSettingInstance) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementIntegerSettingInstance);
    }

    /**
     * Creates a DeviceManagementIntegerSettingInstance with a new object
     *
     * @param newDeviceManagementIntegerSettingInstance the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementIntegerSettingInstance newDeviceManagementIntegerSettingInstance, final ICallback<? super DeviceManagementIntegerSettingInstance> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementIntegerSettingInstance);
    }

    /**
     * Creates a DeviceManagementIntegerSettingInstance with a new object
     *
     * @param newDeviceManagementIntegerSettingInstance the new object to create
     * @return the created DeviceManagementIntegerSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementIntegerSettingInstance post(final DeviceManagementIntegerSettingInstance newDeviceManagementIntegerSettingInstance) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementIntegerSettingInstance);
    }

    /**
     * Creates a DeviceManagementIntegerSettingInstance with a new object
     *
     * @param newDeviceManagementIntegerSettingInstance the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceManagementIntegerSettingInstance newDeviceManagementIntegerSettingInstance, final ICallback<? super DeviceManagementIntegerSettingInstance> callback) {
        send(HttpMethod.PUT, callback, newDeviceManagementIntegerSettingInstance);
    }

    /**
     * Creates a DeviceManagementIntegerSettingInstance with a new object
     *
     * @param newDeviceManagementIntegerSettingInstance the object to create/update
     * @return the created DeviceManagementIntegerSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementIntegerSettingInstance put(final DeviceManagementIntegerSettingInstance newDeviceManagementIntegerSettingInstance) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementIntegerSettingInstance);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementIntegerSettingInstanceRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceManagementIntegerSettingInstanceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementIntegerSettingInstanceRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceManagementIntegerSettingInstanceRequest)this;
     }

}

