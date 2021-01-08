// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationPolicyAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Policy Assignment Request.
 */
public class DeviceManagementConfigurationPolicyAssignmentRequest extends BaseRequest<DeviceManagementConfigurationPolicyAssignment> {
	
    /**
     * The request for the DeviceManagementConfigurationPolicyAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementConfigurationPolicyAssignmentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementConfigurationPolicyAssignment.class);
    }

    /**
     * Gets the DeviceManagementConfigurationPolicyAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super DeviceManagementConfigurationPolicyAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementConfigurationPolicyAssignment from the service
     *
     * @return the DeviceManagementConfigurationPolicyAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementConfigurationPolicyAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super DeviceManagementConfigurationPolicyAssignment> callback) {
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
     * Patches this DeviceManagementConfigurationPolicyAssignment with a source
     *
     * @param sourceDeviceManagementConfigurationPolicyAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final DeviceManagementConfigurationPolicyAssignment sourceDeviceManagementConfigurationPolicyAssignment, @Nonnull final ICallback<? super DeviceManagementConfigurationPolicyAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementConfigurationPolicyAssignment);
    }

    /**
     * Patches this DeviceManagementConfigurationPolicyAssignment with a source
     *
     * @param sourceDeviceManagementConfigurationPolicyAssignment the source object with updates
     * @return the updated DeviceManagementConfigurationPolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementConfigurationPolicyAssignment patch(@Nonnull final DeviceManagementConfigurationPolicyAssignment sourceDeviceManagementConfigurationPolicyAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementConfigurationPolicyAssignment);
    }

    /**
     * Creates a DeviceManagementConfigurationPolicyAssignment with a new object
     *
     * @param newDeviceManagementConfigurationPolicyAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final DeviceManagementConfigurationPolicyAssignment newDeviceManagementConfigurationPolicyAssignment, @Nonnull final ICallback<? super DeviceManagementConfigurationPolicyAssignment> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementConfigurationPolicyAssignment);
    }

    /**
     * Creates a DeviceManagementConfigurationPolicyAssignment with a new object
     *
     * @param newDeviceManagementConfigurationPolicyAssignment the new object to create
     * @return the created DeviceManagementConfigurationPolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementConfigurationPolicyAssignment post(@Nonnull final DeviceManagementConfigurationPolicyAssignment newDeviceManagementConfigurationPolicyAssignment) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementConfigurationPolicyAssignment);
    }

    /**
     * Creates a DeviceManagementConfigurationPolicyAssignment with a new object
     *
     * @param newDeviceManagementConfigurationPolicyAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final DeviceManagementConfigurationPolicyAssignment newDeviceManagementConfigurationPolicyAssignment, @Nonnull final ICallback<? super DeviceManagementConfigurationPolicyAssignment> callback) {
        send(HttpMethod.PUT, callback, newDeviceManagementConfigurationPolicyAssignment);
    }

    /**
     * Creates a DeviceManagementConfigurationPolicyAssignment with a new object
     *
     * @param newDeviceManagementConfigurationPolicyAssignment the object to create/update
     * @return the created DeviceManagementConfigurationPolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementConfigurationPolicyAssignment put(@Nonnull final DeviceManagementConfigurationPolicyAssignment newDeviceManagementConfigurationPolicyAssignment) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementConfigurationPolicyAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementConfigurationPolicyAssignmentRequest select(@Nonnull final String value) {
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
     public DeviceManagementConfigurationPolicyAssignmentRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

