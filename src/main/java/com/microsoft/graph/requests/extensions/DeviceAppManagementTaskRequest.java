// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagementTask;
import com.microsoft.graph.models.generated.DeviceAppManagementTaskStatus;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device App Management Task Request.
 */
public class DeviceAppManagementTaskRequest extends BaseRequest implements IDeviceAppManagementTaskRequest {
	
    /**
     * The request for the DeviceAppManagementTask
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public DeviceAppManagementTaskRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends DeviceAppManagementTask> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the DeviceAppManagementTask
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAppManagementTaskRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceAppManagementTask.class);
    }

    /**
     * Gets the DeviceAppManagementTask from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceAppManagementTask> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceAppManagementTask from the service
     *
     * @return the DeviceAppManagementTask from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceAppManagementTask get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceAppManagementTask> callback) {
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
     * Patches this DeviceAppManagementTask with a source
     *
     * @param sourceDeviceAppManagementTask the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceAppManagementTask sourceDeviceAppManagementTask, final ICallback<? super DeviceAppManagementTask> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceAppManagementTask);
    }

    /**
     * Patches this DeviceAppManagementTask with a source
     *
     * @param sourceDeviceAppManagementTask the source object with updates
     * @return the updated DeviceAppManagementTask
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceAppManagementTask patch(final DeviceAppManagementTask sourceDeviceAppManagementTask) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceAppManagementTask);
    }

    /**
     * Creates a DeviceAppManagementTask with a new object
     *
     * @param newDeviceAppManagementTask the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceAppManagementTask newDeviceAppManagementTask, final ICallback<? super DeviceAppManagementTask> callback) {
        send(HttpMethod.POST, callback, newDeviceAppManagementTask);
    }

    /**
     * Creates a DeviceAppManagementTask with a new object
     *
     * @param newDeviceAppManagementTask the new object to create
     * @return the created DeviceAppManagementTask
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceAppManagementTask post(final DeviceAppManagementTask newDeviceAppManagementTask) throws ClientException {
        return send(HttpMethod.POST, newDeviceAppManagementTask);
    }

    /**
     * Creates a DeviceAppManagementTask with a new object
     *
     * @param newDeviceAppManagementTask the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceAppManagementTask newDeviceAppManagementTask, final ICallback<? super DeviceAppManagementTask> callback) {
        send(HttpMethod.PUT, callback, newDeviceAppManagementTask);
    }

    /**
     * Creates a DeviceAppManagementTask with a new object
     *
     * @param newDeviceAppManagementTask the object to create/update
     * @return the created DeviceAppManagementTask
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceAppManagementTask put(final DeviceAppManagementTask newDeviceAppManagementTask) throws ClientException {
        return send(HttpMethod.PUT, newDeviceAppManagementTask);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceAppManagementTaskRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceAppManagementTaskRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceAppManagementTaskRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceAppManagementTaskRequest)this;
     }

}

