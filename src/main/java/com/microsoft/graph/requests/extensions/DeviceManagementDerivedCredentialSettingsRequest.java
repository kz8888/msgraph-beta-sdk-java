// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementDerivedCredentialSettings;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Derived Credential Settings Request.
 */
public class DeviceManagementDerivedCredentialSettingsRequest extends BaseRequest<DeviceManagementDerivedCredentialSettings> {
	
    /**
     * The request for the DeviceManagementDerivedCredentialSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementDerivedCredentialSettingsRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementDerivedCredentialSettings.class);
    }

    /**
     * Gets the DeviceManagementDerivedCredentialSettings from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super DeviceManagementDerivedCredentialSettings> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementDerivedCredentialSettings from the service
     *
     * @return the DeviceManagementDerivedCredentialSettings from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementDerivedCredentialSettings get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super DeviceManagementDerivedCredentialSettings> callback) {
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
     * Patches this DeviceManagementDerivedCredentialSettings with a source
     *
     * @param sourceDeviceManagementDerivedCredentialSettings the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final DeviceManagementDerivedCredentialSettings sourceDeviceManagementDerivedCredentialSettings, @Nonnull final ICallback<? super DeviceManagementDerivedCredentialSettings> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementDerivedCredentialSettings);
    }

    /**
     * Patches this DeviceManagementDerivedCredentialSettings with a source
     *
     * @param sourceDeviceManagementDerivedCredentialSettings the source object with updates
     * @return the updated DeviceManagementDerivedCredentialSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementDerivedCredentialSettings patch(@Nonnull final DeviceManagementDerivedCredentialSettings sourceDeviceManagementDerivedCredentialSettings) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementDerivedCredentialSettings);
    }

    /**
     * Creates a DeviceManagementDerivedCredentialSettings with a new object
     *
     * @param newDeviceManagementDerivedCredentialSettings the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final DeviceManagementDerivedCredentialSettings newDeviceManagementDerivedCredentialSettings, @Nonnull final ICallback<? super DeviceManagementDerivedCredentialSettings> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementDerivedCredentialSettings);
    }

    /**
     * Creates a DeviceManagementDerivedCredentialSettings with a new object
     *
     * @param newDeviceManagementDerivedCredentialSettings the new object to create
     * @return the created DeviceManagementDerivedCredentialSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementDerivedCredentialSettings post(@Nonnull final DeviceManagementDerivedCredentialSettings newDeviceManagementDerivedCredentialSettings) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementDerivedCredentialSettings);
    }

    /**
     * Creates a DeviceManagementDerivedCredentialSettings with a new object
     *
     * @param newDeviceManagementDerivedCredentialSettings the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final DeviceManagementDerivedCredentialSettings newDeviceManagementDerivedCredentialSettings, @Nonnull final ICallback<? super DeviceManagementDerivedCredentialSettings> callback) {
        send(HttpMethod.PUT, callback, newDeviceManagementDerivedCredentialSettings);
    }

    /**
     * Creates a DeviceManagementDerivedCredentialSettings with a new object
     *
     * @param newDeviceManagementDerivedCredentialSettings the object to create/update
     * @return the created DeviceManagementDerivedCredentialSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementDerivedCredentialSettings put(@Nonnull final DeviceManagementDerivedCredentialSettings newDeviceManagementDerivedCredentialSettings) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementDerivedCredentialSettings);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementDerivedCredentialSettingsRequest select(@Nonnull final String value) {
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
     public DeviceManagementDerivedCredentialSettingsRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

