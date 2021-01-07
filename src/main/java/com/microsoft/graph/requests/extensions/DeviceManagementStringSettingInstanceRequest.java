// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementStringSettingInstance;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management String Setting Instance Request.
 */
public class DeviceManagementStringSettingInstanceRequest extends BaseRequest<DeviceManagementStringSettingInstance> {
	
    /**
     * The request for the DeviceManagementStringSettingInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementStringSettingInstanceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementStringSettingInstance.class);
    }

    /**
     * Gets the DeviceManagementStringSettingInstance from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super DeviceManagementStringSettingInstance> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementStringSettingInstance from the service
     *
     * @return the DeviceManagementStringSettingInstance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementStringSettingInstance get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super DeviceManagementStringSettingInstance> callback) {
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
     * Patches this DeviceManagementStringSettingInstance with a source
     *
     * @param sourceDeviceManagementStringSettingInstance the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final DeviceManagementStringSettingInstance sourceDeviceManagementStringSettingInstance, @Nonnull final ICallback<? super DeviceManagementStringSettingInstance> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementStringSettingInstance);
    }

    /**
     * Patches this DeviceManagementStringSettingInstance with a source
     *
     * @param sourceDeviceManagementStringSettingInstance the source object with updates
     * @return the updated DeviceManagementStringSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementStringSettingInstance patch(@Nonnull final DeviceManagementStringSettingInstance sourceDeviceManagementStringSettingInstance) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementStringSettingInstance);
    }

    /**
     * Creates a DeviceManagementStringSettingInstance with a new object
     *
     * @param newDeviceManagementStringSettingInstance the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final DeviceManagementStringSettingInstance newDeviceManagementStringSettingInstance, @Nonnull final ICallback<? super DeviceManagementStringSettingInstance> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementStringSettingInstance);
    }

    /**
     * Creates a DeviceManagementStringSettingInstance with a new object
     *
     * @param newDeviceManagementStringSettingInstance the new object to create
     * @return the created DeviceManagementStringSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementStringSettingInstance post(@Nonnull final DeviceManagementStringSettingInstance newDeviceManagementStringSettingInstance) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementStringSettingInstance);
    }

    /**
     * Creates a DeviceManagementStringSettingInstance with a new object
     *
     * @param newDeviceManagementStringSettingInstance the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final DeviceManagementStringSettingInstance newDeviceManagementStringSettingInstance, @Nonnull final ICallback<? super DeviceManagementStringSettingInstance> callback) {
        send(HttpMethod.PUT, callback, newDeviceManagementStringSettingInstance);
    }

    /**
     * Creates a DeviceManagementStringSettingInstance with a new object
     *
     * @param newDeviceManagementStringSettingInstance the object to create/update
     * @return the created DeviceManagementStringSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementStringSettingInstance put(@Nonnull final DeviceManagementStringSettingInstance newDeviceManagementStringSettingInstance) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementStringSettingInstance);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementStringSettingInstanceRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementStringSettingInstanceRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

