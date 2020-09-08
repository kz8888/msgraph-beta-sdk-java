// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsPhoneEASEmailProfileConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Phone EASEmail Profile Configuration Request.
 */
public class WindowsPhoneEASEmailProfileConfigurationRequest extends BaseRequest implements IWindowsPhoneEASEmailProfileConfigurationRequest {
	
    /**
     * The request for the WindowsPhoneEASEmailProfileConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsPhoneEASEmailProfileConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsPhoneEASEmailProfileConfiguration.class);
    }

    /**
     * Gets the WindowsPhoneEASEmailProfileConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WindowsPhoneEASEmailProfileConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsPhoneEASEmailProfileConfiguration from the service
     *
     * @return the WindowsPhoneEASEmailProfileConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhoneEASEmailProfileConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WindowsPhoneEASEmailProfileConfiguration> callback) {
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
     * Patches this WindowsPhoneEASEmailProfileConfiguration with a source
     *
     * @param sourceWindowsPhoneEASEmailProfileConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsPhoneEASEmailProfileConfiguration sourceWindowsPhoneEASEmailProfileConfiguration, final ICallback<WindowsPhoneEASEmailProfileConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsPhoneEASEmailProfileConfiguration);
    }

    /**
     * Patches this WindowsPhoneEASEmailProfileConfiguration with a source
     *
     * @param sourceWindowsPhoneEASEmailProfileConfiguration the source object with updates
     * @return the updated WindowsPhoneEASEmailProfileConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhoneEASEmailProfileConfiguration patch(final WindowsPhoneEASEmailProfileConfiguration sourceWindowsPhoneEASEmailProfileConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsPhoneEASEmailProfileConfiguration);
    }

    /**
     * Creates a WindowsPhoneEASEmailProfileConfiguration with a new object
     *
     * @param newWindowsPhoneEASEmailProfileConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsPhoneEASEmailProfileConfiguration newWindowsPhoneEASEmailProfileConfiguration, final ICallback<WindowsPhoneEASEmailProfileConfiguration> callback) {
        send(HttpMethod.POST, callback, newWindowsPhoneEASEmailProfileConfiguration);
    }

    /**
     * Creates a WindowsPhoneEASEmailProfileConfiguration with a new object
     *
     * @param newWindowsPhoneEASEmailProfileConfiguration the new object to create
     * @return the created WindowsPhoneEASEmailProfileConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhoneEASEmailProfileConfiguration post(final WindowsPhoneEASEmailProfileConfiguration newWindowsPhoneEASEmailProfileConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindowsPhoneEASEmailProfileConfiguration);
    }

    /**
     * Creates a WindowsPhoneEASEmailProfileConfiguration with a new object
     *
     * @param newWindowsPhoneEASEmailProfileConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsPhoneEASEmailProfileConfiguration newWindowsPhoneEASEmailProfileConfiguration, final ICallback<WindowsPhoneEASEmailProfileConfiguration> callback) {
        send(HttpMethod.PUT, callback, newWindowsPhoneEASEmailProfileConfiguration);
    }

    /**
     * Creates a WindowsPhoneEASEmailProfileConfiguration with a new object
     *
     * @param newWindowsPhoneEASEmailProfileConfiguration the object to create/update
     * @return the created WindowsPhoneEASEmailProfileConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhoneEASEmailProfileConfiguration put(final WindowsPhoneEASEmailProfileConfiguration newWindowsPhoneEASEmailProfileConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindowsPhoneEASEmailProfileConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsPhoneEASEmailProfileConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsPhoneEASEmailProfileConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsPhoneEASEmailProfileConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsPhoneEASEmailProfileConfigurationRequest)this;
     }

}

