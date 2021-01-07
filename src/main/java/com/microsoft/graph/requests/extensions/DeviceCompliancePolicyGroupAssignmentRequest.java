// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyGroupAssignment;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Group Assignment Request.
 */
public class DeviceCompliancePolicyGroupAssignmentRequest extends BaseRequest<DeviceCompliancePolicyGroupAssignment> {
	
    /**
     * The request for the DeviceCompliancePolicyGroupAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicyGroupAssignmentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCompliancePolicyGroupAssignment.class);
    }

    /**
     * Gets the DeviceCompliancePolicyGroupAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super DeviceCompliancePolicyGroupAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceCompliancePolicyGroupAssignment from the service
     *
     * @return the DeviceCompliancePolicyGroupAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCompliancePolicyGroupAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super DeviceCompliancePolicyGroupAssignment> callback) {
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
     * Patches this DeviceCompliancePolicyGroupAssignment with a source
     *
     * @param sourceDeviceCompliancePolicyGroupAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final DeviceCompliancePolicyGroupAssignment sourceDeviceCompliancePolicyGroupAssignment, @Nonnull final ICallback<? super DeviceCompliancePolicyGroupAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceCompliancePolicyGroupAssignment);
    }

    /**
     * Patches this DeviceCompliancePolicyGroupAssignment with a source
     *
     * @param sourceDeviceCompliancePolicyGroupAssignment the source object with updates
     * @return the updated DeviceCompliancePolicyGroupAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCompliancePolicyGroupAssignment patch(@Nonnull final DeviceCompliancePolicyGroupAssignment sourceDeviceCompliancePolicyGroupAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceCompliancePolicyGroupAssignment);
    }

    /**
     * Creates a DeviceCompliancePolicyGroupAssignment with a new object
     *
     * @param newDeviceCompliancePolicyGroupAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final DeviceCompliancePolicyGroupAssignment newDeviceCompliancePolicyGroupAssignment, @Nonnull final ICallback<? super DeviceCompliancePolicyGroupAssignment> callback) {
        send(HttpMethod.POST, callback, newDeviceCompliancePolicyGroupAssignment);
    }

    /**
     * Creates a DeviceCompliancePolicyGroupAssignment with a new object
     *
     * @param newDeviceCompliancePolicyGroupAssignment the new object to create
     * @return the created DeviceCompliancePolicyGroupAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCompliancePolicyGroupAssignment post(@Nonnull final DeviceCompliancePolicyGroupAssignment newDeviceCompliancePolicyGroupAssignment) throws ClientException {
        return send(HttpMethod.POST, newDeviceCompliancePolicyGroupAssignment);
    }

    /**
     * Creates a DeviceCompliancePolicyGroupAssignment with a new object
     *
     * @param newDeviceCompliancePolicyGroupAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final DeviceCompliancePolicyGroupAssignment newDeviceCompliancePolicyGroupAssignment, @Nonnull final ICallback<? super DeviceCompliancePolicyGroupAssignment> callback) {
        send(HttpMethod.PUT, callback, newDeviceCompliancePolicyGroupAssignment);
    }

    /**
     * Creates a DeviceCompliancePolicyGroupAssignment with a new object
     *
     * @param newDeviceCompliancePolicyGroupAssignment the object to create/update
     * @return the created DeviceCompliancePolicyGroupAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCompliancePolicyGroupAssignment put(@Nonnull final DeviceCompliancePolicyGroupAssignment newDeviceCompliancePolicyGroupAssignment) throws ClientException {
        return send(HttpMethod.PUT, newDeviceCompliancePolicyGroupAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceCompliancePolicyGroupAssignmentRequest select(@Nonnull final String value) {
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
     public DeviceCompliancePolicyGroupAssignmentRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

