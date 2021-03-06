// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementAutopilotPolicyStatusDetail;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Autopilot Policy Status Detail Request.
 */
public class DeviceManagementAutopilotPolicyStatusDetailRequest extends BaseRequest implements IDeviceManagementAutopilotPolicyStatusDetailRequest {
	
    /**
     * The request for the DeviceManagementAutopilotPolicyStatusDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementAutopilotPolicyStatusDetailRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementAutopilotPolicyStatusDetail.class);
    }

    /**
     * Gets the DeviceManagementAutopilotPolicyStatusDetail from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceManagementAutopilotPolicyStatusDetail> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementAutopilotPolicyStatusDetail from the service
     *
     * @return the DeviceManagementAutopilotPolicyStatusDetail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementAutopilotPolicyStatusDetail get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceManagementAutopilotPolicyStatusDetail> callback) {
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
     * Patches this DeviceManagementAutopilotPolicyStatusDetail with a source
     *
     * @param sourceDeviceManagementAutopilotPolicyStatusDetail the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementAutopilotPolicyStatusDetail sourceDeviceManagementAutopilotPolicyStatusDetail, final ICallback<? super DeviceManagementAutopilotPolicyStatusDetail> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementAutopilotPolicyStatusDetail);
    }

    /**
     * Patches this DeviceManagementAutopilotPolicyStatusDetail with a source
     *
     * @param sourceDeviceManagementAutopilotPolicyStatusDetail the source object with updates
     * @return the updated DeviceManagementAutopilotPolicyStatusDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementAutopilotPolicyStatusDetail patch(final DeviceManagementAutopilotPolicyStatusDetail sourceDeviceManagementAutopilotPolicyStatusDetail) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementAutopilotPolicyStatusDetail);
    }

    /**
     * Creates a DeviceManagementAutopilotPolicyStatusDetail with a new object
     *
     * @param newDeviceManagementAutopilotPolicyStatusDetail the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementAutopilotPolicyStatusDetail newDeviceManagementAutopilotPolicyStatusDetail, final ICallback<? super DeviceManagementAutopilotPolicyStatusDetail> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementAutopilotPolicyStatusDetail);
    }

    /**
     * Creates a DeviceManagementAutopilotPolicyStatusDetail with a new object
     *
     * @param newDeviceManagementAutopilotPolicyStatusDetail the new object to create
     * @return the created DeviceManagementAutopilotPolicyStatusDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementAutopilotPolicyStatusDetail post(final DeviceManagementAutopilotPolicyStatusDetail newDeviceManagementAutopilotPolicyStatusDetail) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementAutopilotPolicyStatusDetail);
    }

    /**
     * Creates a DeviceManagementAutopilotPolicyStatusDetail with a new object
     *
     * @param newDeviceManagementAutopilotPolicyStatusDetail the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceManagementAutopilotPolicyStatusDetail newDeviceManagementAutopilotPolicyStatusDetail, final ICallback<? super DeviceManagementAutopilotPolicyStatusDetail> callback) {
        send(HttpMethod.PUT, callback, newDeviceManagementAutopilotPolicyStatusDetail);
    }

    /**
     * Creates a DeviceManagementAutopilotPolicyStatusDetail with a new object
     *
     * @param newDeviceManagementAutopilotPolicyStatusDetail the object to create/update
     * @return the created DeviceManagementAutopilotPolicyStatusDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementAutopilotPolicyStatusDetail put(final DeviceManagementAutopilotPolicyStatusDetail newDeviceManagementAutopilotPolicyStatusDetail) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementAutopilotPolicyStatusDetail);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementAutopilotPolicyStatusDetailRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceManagementAutopilotPolicyStatusDetailRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementAutopilotPolicyStatusDetailRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceManagementAutopilotPolicyStatusDetailRequest)this;
     }

}

