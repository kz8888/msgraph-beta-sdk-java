// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.requests.extensions.ManagedEBookCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedEBookCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.EnterpriseCodeSigningCertificateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EnterpriseCodeSigningCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.IosLobAppProvisioningConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IosLobAppProvisioningConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedEBookCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedEBookRequestBuilder;
import com.microsoft.graph.requests.extensions.PolicySetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PolicySetRequestBuilder;
import com.microsoft.graph.requests.extensions.SideLoadingKeyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SideLoadingKeyRequestBuilder;
import com.microsoft.graph.requests.extensions.VppTokenCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.VppTokenRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DefaultManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DefaultManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IosManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IosManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.MdmWindowsInformationProtectionPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MdmWindowsInformationProtectionPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.TargetedManagedAppConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TargetedManagedAppConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionDeviceRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionDeviceRegistrationRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionWipeActionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionWipeActionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAppManagementTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAppManagementTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.SymantecCodeSigningCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsManagementAppRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device App Management Request.
 */
public class DeviceAppManagementRequest extends BaseRequest<DeviceAppManagement> {
	
    /**
     * The request for the DeviceAppManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAppManagementRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceAppManagement.class);
    }

    /**
     * Gets the DeviceAppManagement from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super DeviceAppManagement> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceAppManagement from the service
     *
     * @return the DeviceAppManagement from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceAppManagement get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super DeviceAppManagement> callback) {
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
     * Patches this DeviceAppManagement with a source
     *
     * @param sourceDeviceAppManagement the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final DeviceAppManagement sourceDeviceAppManagement, @Nonnull final ICallback<? super DeviceAppManagement> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceAppManagement);
    }

    /**
     * Patches this DeviceAppManagement with a source
     *
     * @param sourceDeviceAppManagement the source object with updates
     * @return the updated DeviceAppManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceAppManagement patch(@Nonnull final DeviceAppManagement sourceDeviceAppManagement) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceAppManagement);
    }

    /**
     * Creates a DeviceAppManagement with a new object
     *
     * @param newDeviceAppManagement the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final DeviceAppManagement newDeviceAppManagement, @Nonnull final ICallback<? super DeviceAppManagement> callback) {
        send(HttpMethod.POST, callback, newDeviceAppManagement);
    }

    /**
     * Creates a DeviceAppManagement with a new object
     *
     * @param newDeviceAppManagement the new object to create
     * @return the created DeviceAppManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceAppManagement post(@Nonnull final DeviceAppManagement newDeviceAppManagement) throws ClientException {
        return send(HttpMethod.POST, newDeviceAppManagement);
    }

    /**
     * Creates a DeviceAppManagement with a new object
     *
     * @param newDeviceAppManagement the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final DeviceAppManagement newDeviceAppManagement, @Nonnull final ICallback<? super DeviceAppManagement> callback) {
        send(HttpMethod.PUT, callback, newDeviceAppManagement);
    }

    /**
     * Creates a DeviceAppManagement with a new object
     *
     * @param newDeviceAppManagement the object to create/update
     * @return the created DeviceAppManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceAppManagement put(@Nonnull final DeviceAppManagement newDeviceAppManagement) throws ClientException {
        return send(HttpMethod.PUT, newDeviceAppManagement);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceAppManagementRequest select(@Nonnull final String value) {
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
     public DeviceAppManagementRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

