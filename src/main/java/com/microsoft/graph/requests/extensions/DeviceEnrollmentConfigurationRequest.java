// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceEnrollmentConfiguration;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import com.microsoft.graph.models.extensions.EnrollmentConfigurationAssignment;
import com.microsoft.graph.requests.extensions.IEnrollmentConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEnrollmentConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.EnrollmentConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EnrollmentConfigurationAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Configuration Request.
 */
public class DeviceEnrollmentConfigurationRequest extends BaseRequest implements IDeviceEnrollmentConfigurationRequest {
	
    /**
     * The request for the DeviceEnrollmentConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public DeviceEnrollmentConfigurationRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends DeviceEnrollmentConfiguration> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the DeviceEnrollmentConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceEnrollmentConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceEnrollmentConfiguration.class);
    }

    /**
     * Gets the DeviceEnrollmentConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceEnrollmentConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceEnrollmentConfiguration from the service
     *
     * @return the DeviceEnrollmentConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceEnrollmentConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceEnrollmentConfiguration> callback) {
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
     * Patches this DeviceEnrollmentConfiguration with a source
     *
     * @param sourceDeviceEnrollmentConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceEnrollmentConfiguration sourceDeviceEnrollmentConfiguration, final ICallback<DeviceEnrollmentConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceEnrollmentConfiguration);
    }

    /**
     * Patches this DeviceEnrollmentConfiguration with a source
     *
     * @param sourceDeviceEnrollmentConfiguration the source object with updates
     * @return the updated DeviceEnrollmentConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceEnrollmentConfiguration patch(final DeviceEnrollmentConfiguration sourceDeviceEnrollmentConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceEnrollmentConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentConfiguration with a new object
     *
     * @param newDeviceEnrollmentConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceEnrollmentConfiguration newDeviceEnrollmentConfiguration, final ICallback<DeviceEnrollmentConfiguration> callback) {
        send(HttpMethod.POST, callback, newDeviceEnrollmentConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentConfiguration with a new object
     *
     * @param newDeviceEnrollmentConfiguration the new object to create
     * @return the created DeviceEnrollmentConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceEnrollmentConfiguration post(final DeviceEnrollmentConfiguration newDeviceEnrollmentConfiguration) throws ClientException {
        return send(HttpMethod.POST, newDeviceEnrollmentConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentConfiguration with a new object
     *
     * @param newDeviceEnrollmentConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceEnrollmentConfiguration newDeviceEnrollmentConfiguration, final ICallback<DeviceEnrollmentConfiguration> callback) {
        send(HttpMethod.PUT, callback, newDeviceEnrollmentConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentConfiguration with a new object
     *
     * @param newDeviceEnrollmentConfiguration the object to create/update
     * @return the created DeviceEnrollmentConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceEnrollmentConfiguration put(final DeviceEnrollmentConfiguration newDeviceEnrollmentConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newDeviceEnrollmentConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceEnrollmentConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceEnrollmentConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceEnrollmentConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceEnrollmentConfigurationRequest)this;
     }

}

