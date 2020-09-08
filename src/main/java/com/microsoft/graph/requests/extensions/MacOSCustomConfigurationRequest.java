// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSCustomConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSCustom Configuration Request.
 */
public class MacOSCustomConfigurationRequest extends BaseRequest implements IMacOSCustomConfigurationRequest {
	
    /**
     * The request for the MacOSCustomConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSCustomConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSCustomConfiguration.class);
    }

    /**
     * Gets the MacOSCustomConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<MacOSCustomConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MacOSCustomConfiguration from the service
     *
     * @return the MacOSCustomConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSCustomConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<MacOSCustomConfiguration> callback) {
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
     * Patches this MacOSCustomConfiguration with a source
     *
     * @param sourceMacOSCustomConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MacOSCustomConfiguration sourceMacOSCustomConfiguration, final ICallback<MacOSCustomConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceMacOSCustomConfiguration);
    }

    /**
     * Patches this MacOSCustomConfiguration with a source
     *
     * @param sourceMacOSCustomConfiguration the source object with updates
     * @return the updated MacOSCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSCustomConfiguration patch(final MacOSCustomConfiguration sourceMacOSCustomConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceMacOSCustomConfiguration);
    }

    /**
     * Creates a MacOSCustomConfiguration with a new object
     *
     * @param newMacOSCustomConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MacOSCustomConfiguration newMacOSCustomConfiguration, final ICallback<MacOSCustomConfiguration> callback) {
        send(HttpMethod.POST, callback, newMacOSCustomConfiguration);
    }

    /**
     * Creates a MacOSCustomConfiguration with a new object
     *
     * @param newMacOSCustomConfiguration the new object to create
     * @return the created MacOSCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSCustomConfiguration post(final MacOSCustomConfiguration newMacOSCustomConfiguration) throws ClientException {
        return send(HttpMethod.POST, newMacOSCustomConfiguration);
    }

    /**
     * Creates a MacOSCustomConfiguration with a new object
     *
     * @param newMacOSCustomConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final MacOSCustomConfiguration newMacOSCustomConfiguration, final ICallback<MacOSCustomConfiguration> callback) {
        send(HttpMethod.PUT, callback, newMacOSCustomConfiguration);
    }

    /**
     * Creates a MacOSCustomConfiguration with a new object
     *
     * @param newMacOSCustomConfiguration the object to create/update
     * @return the created MacOSCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSCustomConfiguration put(final MacOSCustomConfiguration newMacOSCustomConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newMacOSCustomConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMacOSCustomConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MacOSCustomConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMacOSCustomConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MacOSCustomConfigurationRequest)this;
     }

}

