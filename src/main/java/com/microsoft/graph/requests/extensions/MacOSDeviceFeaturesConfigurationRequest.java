// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSDeviceFeaturesConfiguration;
import com.microsoft.graph.requests.extensions.IMacOSCertificateProfileBaseRequestBuilder;
import com.microsoft.graph.requests.extensions.MacOSCertificateProfileBaseRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSDevice Features Configuration Request.
 */
public class MacOSDeviceFeaturesConfigurationRequest extends BaseRequest implements IMacOSDeviceFeaturesConfigurationRequest {
	
    /**
     * The request for the MacOSDeviceFeaturesConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSDeviceFeaturesConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSDeviceFeaturesConfiguration.class);
    }

    /**
     * Gets the MacOSDeviceFeaturesConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<MacOSDeviceFeaturesConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MacOSDeviceFeaturesConfiguration from the service
     *
     * @return the MacOSDeviceFeaturesConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSDeviceFeaturesConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<MacOSDeviceFeaturesConfiguration> callback) {
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
     * Patches this MacOSDeviceFeaturesConfiguration with a source
     *
     * @param sourceMacOSDeviceFeaturesConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MacOSDeviceFeaturesConfiguration sourceMacOSDeviceFeaturesConfiguration, final ICallback<MacOSDeviceFeaturesConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceMacOSDeviceFeaturesConfiguration);
    }

    /**
     * Patches this MacOSDeviceFeaturesConfiguration with a source
     *
     * @param sourceMacOSDeviceFeaturesConfiguration the source object with updates
     * @return the updated MacOSDeviceFeaturesConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSDeviceFeaturesConfiguration patch(final MacOSDeviceFeaturesConfiguration sourceMacOSDeviceFeaturesConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceMacOSDeviceFeaturesConfiguration);
    }

    /**
     * Creates a MacOSDeviceFeaturesConfiguration with a new object
     *
     * @param newMacOSDeviceFeaturesConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MacOSDeviceFeaturesConfiguration newMacOSDeviceFeaturesConfiguration, final ICallback<MacOSDeviceFeaturesConfiguration> callback) {
        send(HttpMethod.POST, callback, newMacOSDeviceFeaturesConfiguration);
    }

    /**
     * Creates a MacOSDeviceFeaturesConfiguration with a new object
     *
     * @param newMacOSDeviceFeaturesConfiguration the new object to create
     * @return the created MacOSDeviceFeaturesConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSDeviceFeaturesConfiguration post(final MacOSDeviceFeaturesConfiguration newMacOSDeviceFeaturesConfiguration) throws ClientException {
        return send(HttpMethod.POST, newMacOSDeviceFeaturesConfiguration);
    }

    /**
     * Creates a MacOSDeviceFeaturesConfiguration with a new object
     *
     * @param newMacOSDeviceFeaturesConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final MacOSDeviceFeaturesConfiguration newMacOSDeviceFeaturesConfiguration, final ICallback<MacOSDeviceFeaturesConfiguration> callback) {
        send(HttpMethod.PUT, callback, newMacOSDeviceFeaturesConfiguration);
    }

    /**
     * Creates a MacOSDeviceFeaturesConfiguration with a new object
     *
     * @param newMacOSDeviceFeaturesConfiguration the object to create/update
     * @return the created MacOSDeviceFeaturesConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSDeviceFeaturesConfiguration put(final MacOSDeviceFeaturesConfiguration newMacOSDeviceFeaturesConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newMacOSDeviceFeaturesConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMacOSDeviceFeaturesConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MacOSDeviceFeaturesConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMacOSDeviceFeaturesConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MacOSDeviceFeaturesConfigurationRequest)this;
     }

}

