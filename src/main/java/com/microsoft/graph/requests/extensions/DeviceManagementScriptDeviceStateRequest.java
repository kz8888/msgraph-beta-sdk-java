// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementScriptDeviceState;
import com.microsoft.graph.requests.extensions.IManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Script Device State Request.
 */
public class DeviceManagementScriptDeviceStateRequest extends BaseRequest implements IDeviceManagementScriptDeviceStateRequest {
	
    /**
     * The request for the DeviceManagementScriptDeviceState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementScriptDeviceStateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementScriptDeviceState.class);
    }

    /**
     * Gets the DeviceManagementScriptDeviceState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceManagementScriptDeviceState> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementScriptDeviceState from the service
     *
     * @return the DeviceManagementScriptDeviceState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementScriptDeviceState get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceManagementScriptDeviceState> callback) {
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
     * Patches this DeviceManagementScriptDeviceState with a source
     *
     * @param sourceDeviceManagementScriptDeviceState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementScriptDeviceState sourceDeviceManagementScriptDeviceState, final ICallback<DeviceManagementScriptDeviceState> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementScriptDeviceState);
    }

    /**
     * Patches this DeviceManagementScriptDeviceState with a source
     *
     * @param sourceDeviceManagementScriptDeviceState the source object with updates
     * @return the updated DeviceManagementScriptDeviceState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementScriptDeviceState patch(final DeviceManagementScriptDeviceState sourceDeviceManagementScriptDeviceState) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementScriptDeviceState);
    }

    /**
     * Creates a DeviceManagementScriptDeviceState with a new object
     *
     * @param newDeviceManagementScriptDeviceState the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementScriptDeviceState newDeviceManagementScriptDeviceState, final ICallback<DeviceManagementScriptDeviceState> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementScriptDeviceState);
    }

    /**
     * Creates a DeviceManagementScriptDeviceState with a new object
     *
     * @param newDeviceManagementScriptDeviceState the new object to create
     * @return the created DeviceManagementScriptDeviceState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementScriptDeviceState post(final DeviceManagementScriptDeviceState newDeviceManagementScriptDeviceState) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementScriptDeviceState);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementScriptDeviceStateRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceManagementScriptDeviceStateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementScriptDeviceStateRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceManagementScriptDeviceStateRequest)this;
     }

}
