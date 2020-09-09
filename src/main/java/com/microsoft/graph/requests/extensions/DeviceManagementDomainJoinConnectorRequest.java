// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementDomainJoinConnector;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Domain Join Connector Request.
 */
public class DeviceManagementDomainJoinConnectorRequest extends BaseRequest implements IDeviceManagementDomainJoinConnectorRequest {
	
    /**
     * The request for the DeviceManagementDomainJoinConnector
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementDomainJoinConnectorRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementDomainJoinConnector.class);
    }

    /**
     * Gets the DeviceManagementDomainJoinConnector from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceManagementDomainJoinConnector> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementDomainJoinConnector from the service
     *
     * @return the DeviceManagementDomainJoinConnector from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementDomainJoinConnector get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceManagementDomainJoinConnector> callback) {
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
     * Patches this DeviceManagementDomainJoinConnector with a source
     *
     * @param sourceDeviceManagementDomainJoinConnector the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementDomainJoinConnector sourceDeviceManagementDomainJoinConnector, final ICallback<DeviceManagementDomainJoinConnector> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementDomainJoinConnector);
    }

    /**
     * Patches this DeviceManagementDomainJoinConnector with a source
     *
     * @param sourceDeviceManagementDomainJoinConnector the source object with updates
     * @return the updated DeviceManagementDomainJoinConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementDomainJoinConnector patch(final DeviceManagementDomainJoinConnector sourceDeviceManagementDomainJoinConnector) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementDomainJoinConnector);
    }

    /**
     * Creates a DeviceManagementDomainJoinConnector with a new object
     *
     * @param newDeviceManagementDomainJoinConnector the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementDomainJoinConnector newDeviceManagementDomainJoinConnector, final ICallback<DeviceManagementDomainJoinConnector> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementDomainJoinConnector);
    }

    /**
     * Creates a DeviceManagementDomainJoinConnector with a new object
     *
     * @param newDeviceManagementDomainJoinConnector the new object to create
     * @return the created DeviceManagementDomainJoinConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementDomainJoinConnector post(final DeviceManagementDomainJoinConnector newDeviceManagementDomainJoinConnector) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementDomainJoinConnector);
    }

    /**
     * Creates a DeviceManagementDomainJoinConnector with a new object
     *
     * @param newDeviceManagementDomainJoinConnector the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceManagementDomainJoinConnector newDeviceManagementDomainJoinConnector, final ICallback<DeviceManagementDomainJoinConnector> callback) {
        send(HttpMethod.PUT, callback, newDeviceManagementDomainJoinConnector);
    }

    /**
     * Creates a DeviceManagementDomainJoinConnector with a new object
     *
     * @param newDeviceManagementDomainJoinConnector the object to create/update
     * @return the created DeviceManagementDomainJoinConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementDomainJoinConnector put(final DeviceManagementDomainJoinConnector newDeviceManagementDomainJoinConnector) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementDomainJoinConnector);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementDomainJoinConnectorRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceManagementDomainJoinConnectorRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementDomainJoinConnectorRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceManagementDomainJoinConnectorRequest)this;
     }

}

