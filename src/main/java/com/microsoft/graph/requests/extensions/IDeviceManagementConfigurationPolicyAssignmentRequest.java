// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationPolicyAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Configuration Policy Assignment Request.
 */
public interface IDeviceManagementConfigurationPolicyAssignmentRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementConfigurationPolicyAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceManagementConfigurationPolicyAssignment> callback);

    /**
     * Gets the DeviceManagementConfigurationPolicyAssignment from the service
     *
     * @return the DeviceManagementConfigurationPolicyAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementConfigurationPolicyAssignment get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceManagementConfigurationPolicyAssignment> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementConfigurationPolicyAssignment with a source
     *
     * @param sourceDeviceManagementConfigurationPolicyAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementConfigurationPolicyAssignment sourceDeviceManagementConfigurationPolicyAssignment, final ICallback<? super DeviceManagementConfigurationPolicyAssignment> callback);

    /**
     * Patches this DeviceManagementConfigurationPolicyAssignment with a source
     *
     * @param sourceDeviceManagementConfigurationPolicyAssignment the source object with updates
     * @return the updated DeviceManagementConfigurationPolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementConfigurationPolicyAssignment patch(final DeviceManagementConfigurationPolicyAssignment sourceDeviceManagementConfigurationPolicyAssignment) throws ClientException;

    /**
     * Posts a DeviceManagementConfigurationPolicyAssignment with a new object
     *
     * @param newDeviceManagementConfigurationPolicyAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementConfigurationPolicyAssignment newDeviceManagementConfigurationPolicyAssignment, final ICallback<? super DeviceManagementConfigurationPolicyAssignment> callback);

    /**
     * Posts a DeviceManagementConfigurationPolicyAssignment with a new object
     *
     * @param newDeviceManagementConfigurationPolicyAssignment the new object to create
     * @return the created DeviceManagementConfigurationPolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementConfigurationPolicyAssignment post(final DeviceManagementConfigurationPolicyAssignment newDeviceManagementConfigurationPolicyAssignment) throws ClientException;

    /**
     * Posts a DeviceManagementConfigurationPolicyAssignment with a new object
     *
     * @param newDeviceManagementConfigurationPolicyAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceManagementConfigurationPolicyAssignment newDeviceManagementConfigurationPolicyAssignment, final ICallback<? super DeviceManagementConfigurationPolicyAssignment> callback);

    /**
     * Posts a DeviceManagementConfigurationPolicyAssignment with a new object
     *
     * @param newDeviceManagementConfigurationPolicyAssignment the object to create/update
     * @return the created DeviceManagementConfigurationPolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementConfigurationPolicyAssignment put(final DeviceManagementConfigurationPolicyAssignment newDeviceManagementConfigurationPolicyAssignment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementConfigurationPolicyAssignmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementConfigurationPolicyAssignmentRequest expand(final String value);

}

