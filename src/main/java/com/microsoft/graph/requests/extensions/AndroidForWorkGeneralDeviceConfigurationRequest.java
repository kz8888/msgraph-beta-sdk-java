// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidForWorkGeneralDeviceConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work General Device Configuration Request.
 */
public class AndroidForWorkGeneralDeviceConfigurationRequest extends BaseRequest<AndroidForWorkGeneralDeviceConfiguration> {
	
    /**
     * The request for the AndroidForWorkGeneralDeviceConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkGeneralDeviceConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidForWorkGeneralDeviceConfiguration.class);
    }

    /**
     * Gets the AndroidForWorkGeneralDeviceConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super AndroidForWorkGeneralDeviceConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidForWorkGeneralDeviceConfiguration from the service
     *
     * @return the AndroidForWorkGeneralDeviceConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkGeneralDeviceConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super AndroidForWorkGeneralDeviceConfiguration> callback) {
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
     * Patches this AndroidForWorkGeneralDeviceConfiguration with a source
     *
     * @param sourceAndroidForWorkGeneralDeviceConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final AndroidForWorkGeneralDeviceConfiguration sourceAndroidForWorkGeneralDeviceConfiguration, @Nonnull final ICallback<? super AndroidForWorkGeneralDeviceConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidForWorkGeneralDeviceConfiguration);
    }

    /**
     * Patches this AndroidForWorkGeneralDeviceConfiguration with a source
     *
     * @param sourceAndroidForWorkGeneralDeviceConfiguration the source object with updates
     * @return the updated AndroidForWorkGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkGeneralDeviceConfiguration patch(@Nonnull final AndroidForWorkGeneralDeviceConfiguration sourceAndroidForWorkGeneralDeviceConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidForWorkGeneralDeviceConfiguration);
    }

    /**
     * Creates a AndroidForWorkGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidForWorkGeneralDeviceConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final AndroidForWorkGeneralDeviceConfiguration newAndroidForWorkGeneralDeviceConfiguration, @Nonnull final ICallback<? super AndroidForWorkGeneralDeviceConfiguration> callback) {
        send(HttpMethod.POST, callback, newAndroidForWorkGeneralDeviceConfiguration);
    }

    /**
     * Creates a AndroidForWorkGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidForWorkGeneralDeviceConfiguration the new object to create
     * @return the created AndroidForWorkGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkGeneralDeviceConfiguration post(@Nonnull final AndroidForWorkGeneralDeviceConfiguration newAndroidForWorkGeneralDeviceConfiguration) throws ClientException {
        return send(HttpMethod.POST, newAndroidForWorkGeneralDeviceConfiguration);
    }

    /**
     * Creates a AndroidForWorkGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidForWorkGeneralDeviceConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final AndroidForWorkGeneralDeviceConfiguration newAndroidForWorkGeneralDeviceConfiguration, @Nonnull final ICallback<? super AndroidForWorkGeneralDeviceConfiguration> callback) {
        send(HttpMethod.PUT, callback, newAndroidForWorkGeneralDeviceConfiguration);
    }

    /**
     * Creates a AndroidForWorkGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidForWorkGeneralDeviceConfiguration the object to create/update
     * @return the created AndroidForWorkGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkGeneralDeviceConfiguration put(@Nonnull final AndroidForWorkGeneralDeviceConfiguration newAndroidForWorkGeneralDeviceConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newAndroidForWorkGeneralDeviceConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidForWorkGeneralDeviceConfigurationRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public AndroidForWorkGeneralDeviceConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

