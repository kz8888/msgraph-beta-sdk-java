// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceSetupConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Setup Configuration Request.
 */
public class DeviceSetupConfigurationRequest extends BaseRequest implements IDeviceSetupConfigurationRequest {
	
    /**
     * The request for the DeviceSetupConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceSetupConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceSetupConfiguration.class);
    }

    /**
     * Gets the DeviceSetupConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceSetupConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceSetupConfiguration from the service
     *
     * @return the DeviceSetupConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceSetupConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceSetupConfiguration> callback) {
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
     * Patches this DeviceSetupConfiguration with a source
     *
     * @param sourceDeviceSetupConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceSetupConfiguration sourceDeviceSetupConfiguration, final ICallback<DeviceSetupConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceSetupConfiguration);
    }

    /**
     * Patches this DeviceSetupConfiguration with a source
     *
     * @param sourceDeviceSetupConfiguration the source object with updates
     * @return the updated DeviceSetupConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceSetupConfiguration patch(final DeviceSetupConfiguration sourceDeviceSetupConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceSetupConfiguration);
    }

    /**
     * Creates a DeviceSetupConfiguration with a new object
     *
     * @param newDeviceSetupConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceSetupConfiguration newDeviceSetupConfiguration, final ICallback<DeviceSetupConfiguration> callback) {
        send(HttpMethod.POST, callback, newDeviceSetupConfiguration);
    }

    /**
     * Creates a DeviceSetupConfiguration with a new object
     *
     * @param newDeviceSetupConfiguration the new object to create
     * @return the created DeviceSetupConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceSetupConfiguration post(final DeviceSetupConfiguration newDeviceSetupConfiguration) throws ClientException {
        return send(HttpMethod.POST, newDeviceSetupConfiguration);
    }

    /**
     * Creates a DeviceSetupConfiguration with a new object
     *
     * @param newDeviceSetupConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceSetupConfiguration newDeviceSetupConfiguration, final ICallback<DeviceSetupConfiguration> callback) {
        send(HttpMethod.PUT, callback, newDeviceSetupConfiguration);
    }

    /**
     * Creates a DeviceSetupConfiguration with a new object
     *
     * @param newDeviceSetupConfiguration the object to create/update
     * @return the created DeviceSetupConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceSetupConfiguration put(final DeviceSetupConfiguration newDeviceSetupConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newDeviceSetupConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceSetupConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceSetupConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceSetupConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceSetupConfigurationRequest)this;
     }

}

