// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosikEv2VpnConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Iosik Ev2Vpn Configuration Request.
 */
public class IosikEv2VpnConfigurationRequest extends BaseRequest implements IIosikEv2VpnConfigurationRequest {
	
    /**
     * The request for the IosikEv2VpnConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosikEv2VpnConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosikEv2VpnConfiguration.class);
    }

    /**
     * Gets the IosikEv2VpnConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<IosikEv2VpnConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosikEv2VpnConfiguration from the service
     *
     * @return the IosikEv2VpnConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosikEv2VpnConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<IosikEv2VpnConfiguration> callback) {
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
     * Patches this IosikEv2VpnConfiguration with a source
     *
     * @param sourceIosikEv2VpnConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IosikEv2VpnConfiguration sourceIosikEv2VpnConfiguration, final ICallback<IosikEv2VpnConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceIosikEv2VpnConfiguration);
    }

    /**
     * Patches this IosikEv2VpnConfiguration with a source
     *
     * @param sourceIosikEv2VpnConfiguration the source object with updates
     * @return the updated IosikEv2VpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosikEv2VpnConfiguration patch(final IosikEv2VpnConfiguration sourceIosikEv2VpnConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosikEv2VpnConfiguration);
    }

    /**
     * Creates a IosikEv2VpnConfiguration with a new object
     *
     * @param newIosikEv2VpnConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IosikEv2VpnConfiguration newIosikEv2VpnConfiguration, final ICallback<IosikEv2VpnConfiguration> callback) {
        send(HttpMethod.POST, callback, newIosikEv2VpnConfiguration);
    }

    /**
     * Creates a IosikEv2VpnConfiguration with a new object
     *
     * @param newIosikEv2VpnConfiguration the new object to create
     * @return the created IosikEv2VpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosikEv2VpnConfiguration post(final IosikEv2VpnConfiguration newIosikEv2VpnConfiguration) throws ClientException {
        return send(HttpMethod.POST, newIosikEv2VpnConfiguration);
    }

    /**
     * Creates a IosikEv2VpnConfiguration with a new object
     *
     * @param newIosikEv2VpnConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final IosikEv2VpnConfiguration newIosikEv2VpnConfiguration, final ICallback<IosikEv2VpnConfiguration> callback) {
        send(HttpMethod.PUT, callback, newIosikEv2VpnConfiguration);
    }

    /**
     * Creates a IosikEv2VpnConfiguration with a new object
     *
     * @param newIosikEv2VpnConfiguration the object to create/update
     * @return the created IosikEv2VpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosikEv2VpnConfiguration put(final IosikEv2VpnConfiguration newIosikEv2VpnConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newIosikEv2VpnConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIosikEv2VpnConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (IosikEv2VpnConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIosikEv2VpnConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (IosikEv2VpnConfigurationRequest)this;
     }

}

