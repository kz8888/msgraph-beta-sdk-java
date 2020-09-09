// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosEnterpriseWiFiConfiguration;
import com.microsoft.graph.requests.extensions.IIosTrustedRootCertificateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosTrustedRootCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.IosTrustedRootCertificateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IosTrustedRootCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementDerivedCredentialSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementDerivedCredentialSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosCertificateProfileBaseRequestBuilder;
import com.microsoft.graph.requests.extensions.IosCertificateProfileBaseRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Enterprise Wi Fi Configuration Request.
 */
public class IosEnterpriseWiFiConfigurationRequest extends BaseRequest implements IIosEnterpriseWiFiConfigurationRequest {
	
    /**
     * The request for the IosEnterpriseWiFiConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosEnterpriseWiFiConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosEnterpriseWiFiConfiguration.class);
    }

    /**
     * Gets the IosEnterpriseWiFiConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<IosEnterpriseWiFiConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosEnterpriseWiFiConfiguration from the service
     *
     * @return the IosEnterpriseWiFiConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosEnterpriseWiFiConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<IosEnterpriseWiFiConfiguration> callback) {
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
     * Patches this IosEnterpriseWiFiConfiguration with a source
     *
     * @param sourceIosEnterpriseWiFiConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IosEnterpriseWiFiConfiguration sourceIosEnterpriseWiFiConfiguration, final ICallback<IosEnterpriseWiFiConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceIosEnterpriseWiFiConfiguration);
    }

    /**
     * Patches this IosEnterpriseWiFiConfiguration with a source
     *
     * @param sourceIosEnterpriseWiFiConfiguration the source object with updates
     * @return the updated IosEnterpriseWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosEnterpriseWiFiConfiguration patch(final IosEnterpriseWiFiConfiguration sourceIosEnterpriseWiFiConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosEnterpriseWiFiConfiguration);
    }

    /**
     * Creates a IosEnterpriseWiFiConfiguration with a new object
     *
     * @param newIosEnterpriseWiFiConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IosEnterpriseWiFiConfiguration newIosEnterpriseWiFiConfiguration, final ICallback<IosEnterpriseWiFiConfiguration> callback) {
        send(HttpMethod.POST, callback, newIosEnterpriseWiFiConfiguration);
    }

    /**
     * Creates a IosEnterpriseWiFiConfiguration with a new object
     *
     * @param newIosEnterpriseWiFiConfiguration the new object to create
     * @return the created IosEnterpriseWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosEnterpriseWiFiConfiguration post(final IosEnterpriseWiFiConfiguration newIosEnterpriseWiFiConfiguration) throws ClientException {
        return send(HttpMethod.POST, newIosEnterpriseWiFiConfiguration);
    }

    /**
     * Creates a IosEnterpriseWiFiConfiguration with a new object
     *
     * @param newIosEnterpriseWiFiConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final IosEnterpriseWiFiConfiguration newIosEnterpriseWiFiConfiguration, final ICallback<IosEnterpriseWiFiConfiguration> callback) {
        send(HttpMethod.PUT, callback, newIosEnterpriseWiFiConfiguration);
    }

    /**
     * Creates a IosEnterpriseWiFiConfiguration with a new object
     *
     * @param newIosEnterpriseWiFiConfiguration the object to create/update
     * @return the created IosEnterpriseWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosEnterpriseWiFiConfiguration put(final IosEnterpriseWiFiConfiguration newIosEnterpriseWiFiConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newIosEnterpriseWiFiConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIosEnterpriseWiFiConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (IosEnterpriseWiFiConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIosEnterpriseWiFiConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (IosEnterpriseWiFiConfigurationRequest)this;
     }

}

