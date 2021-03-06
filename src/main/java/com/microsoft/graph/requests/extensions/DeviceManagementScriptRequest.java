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
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptDeviceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptDeviceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptGroupAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptGroupAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptUserStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptUserStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptUserStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptUserStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptRunSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptRunSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Script Request.
 */
public class DeviceManagementScriptRequest extends BaseRequest implements IDeviceManagementScriptRequest {
	
    /**
     * The request for the DeviceManagementScript
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementScriptRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementScript.class);
    }

    /**
     * Gets the DeviceManagementScript from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceManagementScript> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementScript from the service
     *
     * @return the DeviceManagementScript from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementScript get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceManagementScript> callback) {
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
    public void patch(final DeviceManagementScript sourceDeviceManagementScript, final ICallback<? super DeviceManagementScript> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementScript);
    }

    /**
     * Patches this DeviceManagementScript with a source
     *
     * @param sourceDeviceManagementScript the source object with updates
     * @return the updated DeviceManagementScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementScript patch(final DeviceManagementScript sourceDeviceManagementScript) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementScript);
    }

    /**
     * Creates a DeviceManagementScript with a new object
     *
     * @param newDeviceManagementScript the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementScript newDeviceManagementScript, final ICallback<? super DeviceManagementScript> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementScript);
    }

    /**
     * Creates a DeviceManagementScript with a new object
     *
     * @param newDeviceManagementScript the new object to create
     * @return the created DeviceManagementScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementScript post(final DeviceManagementScript newDeviceManagementScript) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementScript);
    }

    /**
     * Creates a DeviceManagementScript with a new object
     *
     * @param newDeviceManagementScript the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceManagementScript newDeviceManagementScript, final ICallback<? super DeviceManagementScript> callback) {
        send(HttpMethod.PUT, callback, newDeviceManagementScript);
    }

    /**
     * Creates a DeviceManagementScript with a new object
     *
     * @param newDeviceManagementScript the object to create/update
     * @return the created DeviceManagementScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementScript put(final DeviceManagementScript newDeviceManagementScript) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementScript);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementScriptRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceManagementScriptRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementScriptRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceManagementScriptRequest)this;
     }

}

