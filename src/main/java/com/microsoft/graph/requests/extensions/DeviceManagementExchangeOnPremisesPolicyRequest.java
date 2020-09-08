// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementExchangeOnPremisesPolicy;
import com.microsoft.graph.requests.extensions.IOnPremisesConditionalAccessSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.OnPremisesConditionalAccessSettingsRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Exchange On Premises Policy Request.
 */
public class DeviceManagementExchangeOnPremisesPolicyRequest extends BaseRequest implements IDeviceManagementExchangeOnPremisesPolicyRequest {
	
    /**
     * The request for the DeviceManagementExchangeOnPremisesPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementExchangeOnPremisesPolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementExchangeOnPremisesPolicy.class);
    }

    /**
     * Gets the DeviceManagementExchangeOnPremisesPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceManagementExchangeOnPremisesPolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementExchangeOnPremisesPolicy from the service
     *
     * @return the DeviceManagementExchangeOnPremisesPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementExchangeOnPremisesPolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceManagementExchangeOnPremisesPolicy> callback) {
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
     * Patches this DeviceManagementExchangeOnPremisesPolicy with a source
     *
     * @param sourceDeviceManagementExchangeOnPremisesPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementExchangeOnPremisesPolicy sourceDeviceManagementExchangeOnPremisesPolicy, final ICallback<DeviceManagementExchangeOnPremisesPolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementExchangeOnPremisesPolicy);
    }

    /**
     * Patches this DeviceManagementExchangeOnPremisesPolicy with a source
     *
     * @param sourceDeviceManagementExchangeOnPremisesPolicy the source object with updates
     * @return the updated DeviceManagementExchangeOnPremisesPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementExchangeOnPremisesPolicy patch(final DeviceManagementExchangeOnPremisesPolicy sourceDeviceManagementExchangeOnPremisesPolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementExchangeOnPremisesPolicy);
    }

    /**
     * Creates a DeviceManagementExchangeOnPremisesPolicy with a new object
     *
     * @param newDeviceManagementExchangeOnPremisesPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementExchangeOnPremisesPolicy newDeviceManagementExchangeOnPremisesPolicy, final ICallback<DeviceManagementExchangeOnPremisesPolicy> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementExchangeOnPremisesPolicy);
    }

    /**
     * Creates a DeviceManagementExchangeOnPremisesPolicy with a new object
     *
     * @param newDeviceManagementExchangeOnPremisesPolicy the new object to create
     * @return the created DeviceManagementExchangeOnPremisesPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementExchangeOnPremisesPolicy post(final DeviceManagementExchangeOnPremisesPolicy newDeviceManagementExchangeOnPremisesPolicy) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementExchangeOnPremisesPolicy);
    }

    /**
     * Creates a DeviceManagementExchangeOnPremisesPolicy with a new object
     *
     * @param newDeviceManagementExchangeOnPremisesPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceManagementExchangeOnPremisesPolicy newDeviceManagementExchangeOnPremisesPolicy, final ICallback<DeviceManagementExchangeOnPremisesPolicy> callback) {
        send(HttpMethod.PUT, callback, newDeviceManagementExchangeOnPremisesPolicy);
    }

    /**
     * Creates a DeviceManagementExchangeOnPremisesPolicy with a new object
     *
     * @param newDeviceManagementExchangeOnPremisesPolicy the object to create/update
     * @return the created DeviceManagementExchangeOnPremisesPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementExchangeOnPremisesPolicy put(final DeviceManagementExchangeOnPremisesPolicy newDeviceManagementExchangeOnPremisesPolicy) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementExchangeOnPremisesPolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementExchangeOnPremisesPolicyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceManagementExchangeOnPremisesPolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementExchangeOnPremisesPolicyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceManagementExchangeOnPremisesPolicyRequest)this;
     }

}

