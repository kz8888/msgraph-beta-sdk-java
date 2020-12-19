// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementSettingDefinition;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Setting Definition Request.
 */
public class DeviceManagementSettingDefinitionRequest extends BaseRequest implements IDeviceManagementSettingDefinitionRequest {
	
    /**
     * The request for the DeviceManagementSettingDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public DeviceManagementSettingDefinitionRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends DeviceManagementSettingDefinition> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the DeviceManagementSettingDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementSettingDefinitionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementSettingDefinition.class);
    }

    /**
     * Gets the DeviceManagementSettingDefinition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceManagementSettingDefinition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementSettingDefinition from the service
     *
     * @return the DeviceManagementSettingDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementSettingDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceManagementSettingDefinition> callback) {
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
     * Patches this DeviceManagementSettingDefinition with a source
     *
     * @param sourceDeviceManagementSettingDefinition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementSettingDefinition sourceDeviceManagementSettingDefinition, final ICallback<? super DeviceManagementSettingDefinition> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementSettingDefinition);
    }

    /**
     * Patches this DeviceManagementSettingDefinition with a source
     *
     * @param sourceDeviceManagementSettingDefinition the source object with updates
     * @return the updated DeviceManagementSettingDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementSettingDefinition patch(final DeviceManagementSettingDefinition sourceDeviceManagementSettingDefinition) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementSettingDefinition);
    }

    /**
     * Creates a DeviceManagementSettingDefinition with a new object
     *
     * @param newDeviceManagementSettingDefinition the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementSettingDefinition newDeviceManagementSettingDefinition, final ICallback<? super DeviceManagementSettingDefinition> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementSettingDefinition);
    }

    /**
     * Creates a DeviceManagementSettingDefinition with a new object
     *
     * @param newDeviceManagementSettingDefinition the new object to create
     * @return the created DeviceManagementSettingDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementSettingDefinition post(final DeviceManagementSettingDefinition newDeviceManagementSettingDefinition) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementSettingDefinition);
    }

    /**
     * Creates a DeviceManagementSettingDefinition with a new object
     *
     * @param newDeviceManagementSettingDefinition the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceManagementSettingDefinition newDeviceManagementSettingDefinition, final ICallback<? super DeviceManagementSettingDefinition> callback) {
        send(HttpMethod.PUT, callback, newDeviceManagementSettingDefinition);
    }

    /**
     * Creates a DeviceManagementSettingDefinition with a new object
     *
     * @param newDeviceManagementSettingDefinition the object to create/update
     * @return the created DeviceManagementSettingDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementSettingDefinition put(final DeviceManagementSettingDefinition newDeviceManagementSettingDefinition) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementSettingDefinition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementSettingDefinitionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceManagementSettingDefinitionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementSettingDefinitionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceManagementSettingDefinitionRequest)this;
     }

}

