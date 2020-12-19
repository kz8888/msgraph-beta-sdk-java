// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosEduDeviceConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Edu Device Configuration Request.
 */
public class IosEduDeviceConfigurationRequest extends BaseRequest implements IIosEduDeviceConfigurationRequest {
	
    /**
     * The request for the IosEduDeviceConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosEduDeviceConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosEduDeviceConfiguration.class);
    }

    /**
     * Gets the IosEduDeviceConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super IosEduDeviceConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosEduDeviceConfiguration from the service
     *
     * @return the IosEduDeviceConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosEduDeviceConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super IosEduDeviceConfiguration> callback) {
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
     * Patches this IosEduDeviceConfiguration with a source
     *
     * @param sourceIosEduDeviceConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IosEduDeviceConfiguration sourceIosEduDeviceConfiguration, final ICallback<? super IosEduDeviceConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceIosEduDeviceConfiguration);
    }

    /**
     * Patches this IosEduDeviceConfiguration with a source
     *
     * @param sourceIosEduDeviceConfiguration the source object with updates
     * @return the updated IosEduDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosEduDeviceConfiguration patch(final IosEduDeviceConfiguration sourceIosEduDeviceConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosEduDeviceConfiguration);
    }

    /**
     * Creates a IosEduDeviceConfiguration with a new object
     *
     * @param newIosEduDeviceConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IosEduDeviceConfiguration newIosEduDeviceConfiguration, final ICallback<? super IosEduDeviceConfiguration> callback) {
        send(HttpMethod.POST, callback, newIosEduDeviceConfiguration);
    }

    /**
     * Creates a IosEduDeviceConfiguration with a new object
     *
     * @param newIosEduDeviceConfiguration the new object to create
     * @return the created IosEduDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosEduDeviceConfiguration post(final IosEduDeviceConfiguration newIosEduDeviceConfiguration) throws ClientException {
        return send(HttpMethod.POST, newIosEduDeviceConfiguration);
    }

    /**
     * Creates a IosEduDeviceConfiguration with a new object
     *
     * @param newIosEduDeviceConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final IosEduDeviceConfiguration newIosEduDeviceConfiguration, final ICallback<? super IosEduDeviceConfiguration> callback) {
        send(HttpMethod.PUT, callback, newIosEduDeviceConfiguration);
    }

    /**
     * Creates a IosEduDeviceConfiguration with a new object
     *
     * @param newIosEduDeviceConfiguration the object to create/update
     * @return the created IosEduDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosEduDeviceConfiguration put(final IosEduDeviceConfiguration newIosEduDeviceConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newIosEduDeviceConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIosEduDeviceConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (IosEduDeviceConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIosEduDeviceConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (IosEduDeviceConfigurationRequest)this;
     }

}

