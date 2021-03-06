// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceComanagementAuthorityConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Comanagement Authority Configuration Request.
 */
public class DeviceComanagementAuthorityConfigurationRequest extends BaseRequest implements IDeviceComanagementAuthorityConfigurationRequest {
	
    /**
     * The request for the DeviceComanagementAuthorityConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceComanagementAuthorityConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceComanagementAuthorityConfiguration.class);
    }

    /**
     * Gets the DeviceComanagementAuthorityConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceComanagementAuthorityConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceComanagementAuthorityConfiguration from the service
     *
     * @return the DeviceComanagementAuthorityConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceComanagementAuthorityConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceComanagementAuthorityConfiguration> callback) {
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
     * Patches this DeviceComanagementAuthorityConfiguration with a source
     *
     * @param sourceDeviceComanagementAuthorityConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceComanagementAuthorityConfiguration sourceDeviceComanagementAuthorityConfiguration, final ICallback<? super DeviceComanagementAuthorityConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceComanagementAuthorityConfiguration);
    }

    /**
     * Patches this DeviceComanagementAuthorityConfiguration with a source
     *
     * @param sourceDeviceComanagementAuthorityConfiguration the source object with updates
     * @return the updated DeviceComanagementAuthorityConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceComanagementAuthorityConfiguration patch(final DeviceComanagementAuthorityConfiguration sourceDeviceComanagementAuthorityConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceComanagementAuthorityConfiguration);
    }

    /**
     * Creates a DeviceComanagementAuthorityConfiguration with a new object
     *
     * @param newDeviceComanagementAuthorityConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceComanagementAuthorityConfiguration newDeviceComanagementAuthorityConfiguration, final ICallback<? super DeviceComanagementAuthorityConfiguration> callback) {
        send(HttpMethod.POST, callback, newDeviceComanagementAuthorityConfiguration);
    }

    /**
     * Creates a DeviceComanagementAuthorityConfiguration with a new object
     *
     * @param newDeviceComanagementAuthorityConfiguration the new object to create
     * @return the created DeviceComanagementAuthorityConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceComanagementAuthorityConfiguration post(final DeviceComanagementAuthorityConfiguration newDeviceComanagementAuthorityConfiguration) throws ClientException {
        return send(HttpMethod.POST, newDeviceComanagementAuthorityConfiguration);
    }

    /**
     * Creates a DeviceComanagementAuthorityConfiguration with a new object
     *
     * @param newDeviceComanagementAuthorityConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceComanagementAuthorityConfiguration newDeviceComanagementAuthorityConfiguration, final ICallback<? super DeviceComanagementAuthorityConfiguration> callback) {
        send(HttpMethod.PUT, callback, newDeviceComanagementAuthorityConfiguration);
    }

    /**
     * Creates a DeviceComanagementAuthorityConfiguration with a new object
     *
     * @param newDeviceComanagementAuthorityConfiguration the object to create/update
     * @return the created DeviceComanagementAuthorityConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceComanagementAuthorityConfiguration put(final DeviceComanagementAuthorityConfiguration newDeviceComanagementAuthorityConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newDeviceComanagementAuthorityConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceComanagementAuthorityConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceComanagementAuthorityConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceComanagementAuthorityConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceComanagementAuthorityConfigurationRequest)this;
     }

}

