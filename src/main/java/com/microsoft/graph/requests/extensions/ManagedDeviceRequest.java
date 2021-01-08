// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.generated.AdministratorConfiguredDeviceComplianceState;
import com.microsoft.graph.models.extensions.DeviceLogCollectionRequest;
import com.microsoft.graph.models.extensions.DeviceLogCollectionResponse;
import com.microsoft.graph.models.extensions.ConfigurationManagerAction;
import com.microsoft.graph.models.extensions.UpdateWindowsDeviceAccountActionParameter;
import com.microsoft.graph.models.generated.ManagedDeviceRemoteAction;
import com.microsoft.graph.models.extensions.BulkManagedDeviceActionResult;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicySettingState;
import com.microsoft.graph.requests.extensions.SecurityBaselineStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityBaselineStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationStateRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DetectedAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DetectedAppRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceLogCollectionResponseCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceLogCollectionResponseRequestBuilder;
import com.microsoft.graph.requests.extensions.UserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsProtectionStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Request.
 */
public class ManagedDeviceRequest extends BaseRequest<ManagedDevice> {
	
    /**
     * The request for the ManagedDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ManagedDeviceRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends ManagedDevice> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ManagedDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDevice.class);
    }

    /**
     * Gets the ManagedDevice from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ManagedDevice> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedDevice from the service
     *
     * @return the ManagedDevice from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDevice get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ManagedDevice> callback) {
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
     * Patches this ManagedDevice with a source
     *
     * @param sourceManagedDevice the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ManagedDevice sourceManagedDevice, @Nonnull final ICallback<? super ManagedDevice> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedDevice);
    }

    /**
     * Patches this ManagedDevice with a source
     *
     * @param sourceManagedDevice the source object with updates
     * @return the updated ManagedDevice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDevice patch(@Nonnull final ManagedDevice sourceManagedDevice) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedDevice);
    }

    /**
     * Creates a ManagedDevice with a new object
     *
     * @param newManagedDevice the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ManagedDevice newManagedDevice, @Nonnull final ICallback<? super ManagedDevice> callback) {
        send(HttpMethod.POST, callback, newManagedDevice);
    }

    /**
     * Creates a ManagedDevice with a new object
     *
     * @param newManagedDevice the new object to create
     * @return the created ManagedDevice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDevice post(@Nonnull final ManagedDevice newManagedDevice) throws ClientException {
        return send(HttpMethod.POST, newManagedDevice);
    }

    /**
     * Creates a ManagedDevice with a new object
     *
     * @param newManagedDevice the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ManagedDevice newManagedDevice, @Nonnull final ICallback<? super ManagedDevice> callback) {
        send(HttpMethod.PUT, callback, newManagedDevice);
    }

    /**
     * Creates a ManagedDevice with a new object
     *
     * @param newManagedDevice the object to create/update
     * @return the created ManagedDevice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDevice put(@Nonnull final ManagedDevice newManagedDevice) throws ClientException {
        return send(HttpMethod.PUT, newManagedDevice);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedDeviceRequest select(@Nonnull final String value) {
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
     public ManagedDeviceRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

