// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementScript;
import com.microsoft.graph.models.extensions.DeviceManagementScriptGroupAssignment;
import com.microsoft.graph.models.extensions.DeviceManagementScriptAssignment;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptDeviceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptGroupAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptUserStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptUserStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptRunSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Script Request.
 */
public class DeviceManagementScriptRequest extends BaseRequest<DeviceManagementScript> {
	
    /**
     * The request for the DeviceManagementScript
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementScriptRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementScript.class);
    }

    /**
     * Gets the DeviceManagementScript from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super DeviceManagementScript> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementScript from the service
     *
     * @return the DeviceManagementScript from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementScript get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super DeviceManagementScript> callback) {
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
     * Patches this DeviceManagementScript with a source
     *
     * @param sourceDeviceManagementScript the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final DeviceManagementScript sourceDeviceManagementScript, @Nonnull final ICallback<? super DeviceManagementScript> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementScript);
    }

    /**
     * Patches this DeviceManagementScript with a source
     *
     * @param sourceDeviceManagementScript the source object with updates
     * @return the updated DeviceManagementScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementScript patch(@Nonnull final DeviceManagementScript sourceDeviceManagementScript) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementScript);
    }

    /**
     * Creates a DeviceManagementScript with a new object
     *
     * @param newDeviceManagementScript the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final DeviceManagementScript newDeviceManagementScript, @Nonnull final ICallback<? super DeviceManagementScript> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementScript);
    }

    /**
     * Creates a DeviceManagementScript with a new object
     *
     * @param newDeviceManagementScript the new object to create
     * @return the created DeviceManagementScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementScript post(@Nonnull final DeviceManagementScript newDeviceManagementScript) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementScript);
    }

    /**
     * Creates a DeviceManagementScript with a new object
     *
     * @param newDeviceManagementScript the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final DeviceManagementScript newDeviceManagementScript, @Nonnull final ICallback<? super DeviceManagementScript> callback) {
        send(HttpMethod.PUT, callback, newDeviceManagementScript);
    }

    /**
     * Creates a DeviceManagementScript with a new object
     *
     * @param newDeviceManagementScript the object to create/update
     * @return the created DeviceManagementScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementScript put(@Nonnull final DeviceManagementScript newDeviceManagementScript) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementScript);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementScriptRequest select(@Nonnull final String value) {
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
     public DeviceManagementScriptRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

