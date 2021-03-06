// Template Source: BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementData;
import com.microsoft.graph.requests.extensions.IUserExportDeviceAndAppManagementDataRequest;
import com.microsoft.graph.requests.extensions.UserExportDeviceAndAppManagementDataRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Export Device And App Management Data Request.
 */
public class UserExportDeviceAndAppManagementDataRequest extends BaseRequest implements IUserExportDeviceAndAppManagementDataRequest {

    /**
     * The request for this UserExportDeviceAndAppManagementData
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExportDeviceAndAppManagementDataRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceAndAppManagementData.class);
    }

    /**
     * Patches the UserExportDeviceAndAppManagementData
     * @param srcDeviceAndAppManagementData the DeviceAndAppManagementData with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    public void patch(DeviceAndAppManagementData srcDeviceAndAppManagementData, final ICallback<? super DeviceAndAppManagementData> callback) {
        send(HttpMethod.PATCH, callback, srcDeviceAndAppManagementData);
    }

    /**
     * Patches the UserExportDeviceAndAppManagementData
     *
     * @param srcDeviceAndAppManagementData the DeviceAndAppManagementData with which to PATCH
     * @return the DeviceAndAppManagementData
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public DeviceAndAppManagementData patch(DeviceAndAppManagementData srcDeviceAndAppManagementData) throws ClientException {
        return this.send(HttpMethod.PATCH, srcDeviceAndAppManagementData);
    }

    /**
     * Puts the UserExportDeviceAndAppManagementData
     *
     * @param srcDeviceAndAppManagementData the DeviceAndAppManagementData to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(DeviceAndAppManagementData srcDeviceAndAppManagementData, final ICallback<? super DeviceAndAppManagementData> callback) {
        send(HttpMethod.PUT, callback, srcDeviceAndAppManagementData);
    }

    /**
     * Puts the UserExportDeviceAndAppManagementData
     *
     * @param srcDeviceAndAppManagementData the DeviceAndAppManagementData to PUT
     * @return the DeviceAndAppManagementData
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public DeviceAndAppManagementData put(DeviceAndAppManagementData srcDeviceAndAppManagementData) throws ClientException {
        return this.send(HttpMethod.PUT, srcDeviceAndAppManagementData);
    }
    /**
     * Gets the DeviceAndAppManagementData
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceAndAppManagementData> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceAndAppManagementData
     *
     * @return the DeviceAndAppManagementData
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public DeviceAndAppManagementData get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUserExportDeviceAndAppManagementDataRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (UserExportDeviceAndAppManagementDataRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUserExportDeviceAndAppManagementDataRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UserExportDeviceAndAppManagementDataRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IUserExportDeviceAndAppManagementDataRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (UserExportDeviceAndAppManagementDataRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IUserExportDeviceAndAppManagementDataRequest orderBy(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (UserExportDeviceAndAppManagementDataRequest)this;
    }

}
