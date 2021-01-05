// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidDeviceOwnerVpnConfiguration;
import com.microsoft.graph.requests.extensions.IDeviceManagementDerivedCredentialSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementDerivedCredentialSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidDeviceOwnerCertificateProfileBaseRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidDeviceOwnerCertificateProfileBaseRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner Vpn Configuration Request.
 */
public class AndroidDeviceOwnerVpnConfigurationRequest extends BaseRequest implements IAndroidDeviceOwnerVpnConfigurationRequest {
	
    /**
     * The request for the AndroidDeviceOwnerVpnConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidDeviceOwnerVpnConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidDeviceOwnerVpnConfiguration.class);
    }

    /**
     * Gets the AndroidDeviceOwnerVpnConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AndroidDeviceOwnerVpnConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidDeviceOwnerVpnConfiguration from the service
     *
     * @return the AndroidDeviceOwnerVpnConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidDeviceOwnerVpnConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AndroidDeviceOwnerVpnConfiguration> callback) {
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
     * Patches this AndroidDeviceOwnerVpnConfiguration with a source
     *
     * @param sourceAndroidDeviceOwnerVpnConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidDeviceOwnerVpnConfiguration sourceAndroidDeviceOwnerVpnConfiguration, final ICallback<? super AndroidDeviceOwnerVpnConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidDeviceOwnerVpnConfiguration);
    }

    /**
     * Patches this AndroidDeviceOwnerVpnConfiguration with a source
     *
     * @param sourceAndroidDeviceOwnerVpnConfiguration the source object with updates
     * @return the updated AndroidDeviceOwnerVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidDeviceOwnerVpnConfiguration patch(final AndroidDeviceOwnerVpnConfiguration sourceAndroidDeviceOwnerVpnConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidDeviceOwnerVpnConfiguration);
    }

    /**
     * Creates a AndroidDeviceOwnerVpnConfiguration with a new object
     *
     * @param newAndroidDeviceOwnerVpnConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidDeviceOwnerVpnConfiguration newAndroidDeviceOwnerVpnConfiguration, final ICallback<? super AndroidDeviceOwnerVpnConfiguration> callback) {
        send(HttpMethod.POST, callback, newAndroidDeviceOwnerVpnConfiguration);
    }

    /**
     * Creates a AndroidDeviceOwnerVpnConfiguration with a new object
     *
     * @param newAndroidDeviceOwnerVpnConfiguration the new object to create
     * @return the created AndroidDeviceOwnerVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidDeviceOwnerVpnConfiguration post(final AndroidDeviceOwnerVpnConfiguration newAndroidDeviceOwnerVpnConfiguration) throws ClientException {
        return send(HttpMethod.POST, newAndroidDeviceOwnerVpnConfiguration);
    }

    /**
     * Creates a AndroidDeviceOwnerVpnConfiguration with a new object
     *
     * @param newAndroidDeviceOwnerVpnConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AndroidDeviceOwnerVpnConfiguration newAndroidDeviceOwnerVpnConfiguration, final ICallback<? super AndroidDeviceOwnerVpnConfiguration> callback) {
        send(HttpMethod.PUT, callback, newAndroidDeviceOwnerVpnConfiguration);
    }

    /**
     * Creates a AndroidDeviceOwnerVpnConfiguration with a new object
     *
     * @param newAndroidDeviceOwnerVpnConfiguration the object to create/update
     * @return the created AndroidDeviceOwnerVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidDeviceOwnerVpnConfiguration put(final AndroidDeviceOwnerVpnConfiguration newAndroidDeviceOwnerVpnConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newAndroidDeviceOwnerVpnConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidDeviceOwnerVpnConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidDeviceOwnerVpnConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidDeviceOwnerVpnConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidDeviceOwnerVpnConfigurationRequest)this;
     }

}

