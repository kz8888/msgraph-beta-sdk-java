// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosDerivedCredentialAuthenticationConfiguration;
import com.microsoft.graph.requests.extensions.IDeviceManagementDerivedCredentialSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementDerivedCredentialSettingsRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Derived Credential Authentication Configuration Request.
 */
public class IosDerivedCredentialAuthenticationConfigurationRequest extends BaseRequest implements IIosDerivedCredentialAuthenticationConfigurationRequest {
	
    /**
     * The request for the IosDerivedCredentialAuthenticationConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosDerivedCredentialAuthenticationConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosDerivedCredentialAuthenticationConfiguration.class);
    }

    /**
     * Gets the IosDerivedCredentialAuthenticationConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<IosDerivedCredentialAuthenticationConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosDerivedCredentialAuthenticationConfiguration from the service
     *
     * @return the IosDerivedCredentialAuthenticationConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosDerivedCredentialAuthenticationConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<IosDerivedCredentialAuthenticationConfiguration> callback) {
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
     * Patches this IosDerivedCredentialAuthenticationConfiguration with a source
     *
     * @param sourceIosDerivedCredentialAuthenticationConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IosDerivedCredentialAuthenticationConfiguration sourceIosDerivedCredentialAuthenticationConfiguration, final ICallback<IosDerivedCredentialAuthenticationConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceIosDerivedCredentialAuthenticationConfiguration);
    }

    /**
     * Patches this IosDerivedCredentialAuthenticationConfiguration with a source
     *
     * @param sourceIosDerivedCredentialAuthenticationConfiguration the source object with updates
     * @return the updated IosDerivedCredentialAuthenticationConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosDerivedCredentialAuthenticationConfiguration patch(final IosDerivedCredentialAuthenticationConfiguration sourceIosDerivedCredentialAuthenticationConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosDerivedCredentialAuthenticationConfiguration);
    }

    /**
     * Creates a IosDerivedCredentialAuthenticationConfiguration with a new object
     *
     * @param newIosDerivedCredentialAuthenticationConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IosDerivedCredentialAuthenticationConfiguration newIosDerivedCredentialAuthenticationConfiguration, final ICallback<IosDerivedCredentialAuthenticationConfiguration> callback) {
        send(HttpMethod.POST, callback, newIosDerivedCredentialAuthenticationConfiguration);
    }

    /**
     * Creates a IosDerivedCredentialAuthenticationConfiguration with a new object
     *
     * @param newIosDerivedCredentialAuthenticationConfiguration the new object to create
     * @return the created IosDerivedCredentialAuthenticationConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosDerivedCredentialAuthenticationConfiguration post(final IosDerivedCredentialAuthenticationConfiguration newIosDerivedCredentialAuthenticationConfiguration) throws ClientException {
        return send(HttpMethod.POST, newIosDerivedCredentialAuthenticationConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIosDerivedCredentialAuthenticationConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (IosDerivedCredentialAuthenticationConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIosDerivedCredentialAuthenticationConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (IosDerivedCredentialAuthenticationConfigurationRequest)this;
     }

}
