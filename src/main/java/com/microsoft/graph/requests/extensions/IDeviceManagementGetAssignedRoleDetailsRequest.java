// Template Source: IBaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementAssignedRoleDetails;
import com.microsoft.graph.requests.extensions.IDeviceManagementGetAssignedRoleDetailsRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Get Assigned Role Details Request.
 */
public interface IDeviceManagementGetAssignedRoleDetailsRequest extends IHttpRequest {

    /**
     * Gets the DeviceAndAppManagementAssignedRoleDetails
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceAndAppManagementAssignedRoleDetails> callback);

    /**
     * Gets the DeviceAndAppManagementAssignedRoleDetails
     *
     * @return the DeviceAndAppManagementAssignedRoleDetails
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    DeviceAndAppManagementAssignedRoleDetails get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementGetAssignedRoleDetailsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementGetAssignedRoleDetailsRequest expand(final String value);

}
