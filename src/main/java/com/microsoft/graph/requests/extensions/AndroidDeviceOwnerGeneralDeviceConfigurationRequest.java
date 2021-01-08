// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidDeviceOwnerGeneralDeviceConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner General Device Configuration Request.
 */
public class AndroidDeviceOwnerGeneralDeviceConfigurationRequest extends BaseRequest<AndroidDeviceOwnerGeneralDeviceConfiguration> {
	
    /**
     * The request for the AndroidDeviceOwnerGeneralDeviceConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidDeviceOwnerGeneralDeviceConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidDeviceOwnerGeneralDeviceConfiguration.class);
    }

    /**
     * Gets the AndroidDeviceOwnerGeneralDeviceConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super AndroidDeviceOwnerGeneralDeviceConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidDeviceOwnerGeneralDeviceConfiguration from the service
     *
     * @return the AndroidDeviceOwnerGeneralDeviceConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceOwnerGeneralDeviceConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super AndroidDeviceOwnerGeneralDeviceConfiguration> callback) {
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
     * Patches this AndroidDeviceOwnerGeneralDeviceConfiguration with a source
     *
     * @param sourceAndroidDeviceOwnerGeneralDeviceConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final AndroidDeviceOwnerGeneralDeviceConfiguration sourceAndroidDeviceOwnerGeneralDeviceConfiguration, @Nonnull final ICallback<? super AndroidDeviceOwnerGeneralDeviceConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidDeviceOwnerGeneralDeviceConfiguration);
    }

    /**
     * Patches this AndroidDeviceOwnerGeneralDeviceConfiguration with a source
     *
     * @param sourceAndroidDeviceOwnerGeneralDeviceConfiguration the source object with updates
     * @return the updated AndroidDeviceOwnerGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceOwnerGeneralDeviceConfiguration patch(@Nonnull final AndroidDeviceOwnerGeneralDeviceConfiguration sourceAndroidDeviceOwnerGeneralDeviceConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidDeviceOwnerGeneralDeviceConfiguration);
    }

    /**
     * Creates a AndroidDeviceOwnerGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidDeviceOwnerGeneralDeviceConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final AndroidDeviceOwnerGeneralDeviceConfiguration newAndroidDeviceOwnerGeneralDeviceConfiguration, @Nonnull final ICallback<? super AndroidDeviceOwnerGeneralDeviceConfiguration> callback) {
        send(HttpMethod.POST, callback, newAndroidDeviceOwnerGeneralDeviceConfiguration);
    }

    /**
     * Creates a AndroidDeviceOwnerGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidDeviceOwnerGeneralDeviceConfiguration the new object to create
     * @return the created AndroidDeviceOwnerGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceOwnerGeneralDeviceConfiguration post(@Nonnull final AndroidDeviceOwnerGeneralDeviceConfiguration newAndroidDeviceOwnerGeneralDeviceConfiguration) throws ClientException {
        return send(HttpMethod.POST, newAndroidDeviceOwnerGeneralDeviceConfiguration);
    }

    /**
     * Creates a AndroidDeviceOwnerGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidDeviceOwnerGeneralDeviceConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final AndroidDeviceOwnerGeneralDeviceConfiguration newAndroidDeviceOwnerGeneralDeviceConfiguration, @Nonnull final ICallback<? super AndroidDeviceOwnerGeneralDeviceConfiguration> callback) {
        send(HttpMethod.PUT, callback, newAndroidDeviceOwnerGeneralDeviceConfiguration);
    }

    /**
     * Creates a AndroidDeviceOwnerGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidDeviceOwnerGeneralDeviceConfiguration the object to create/update
     * @return the created AndroidDeviceOwnerGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceOwnerGeneralDeviceConfiguration put(@Nonnull final AndroidDeviceOwnerGeneralDeviceConfiguration newAndroidDeviceOwnerGeneralDeviceConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newAndroidDeviceOwnerGeneralDeviceConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidDeviceOwnerGeneralDeviceConfigurationRequest select(@Nonnull final String value) {
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
     public AndroidDeviceOwnerGeneralDeviceConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

