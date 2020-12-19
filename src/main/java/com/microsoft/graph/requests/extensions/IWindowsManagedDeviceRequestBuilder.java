// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsManagedDevice;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Managed Device Request Builder.
 */
public interface IWindowsManagedDeviceRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWindowsManagedDeviceRequest instance
     */
    IWindowsManagedDeviceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWindowsManagedDeviceRequest instance
     */
    IWindowsManagedDeviceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    ISecurityBaselineStateCollectionRequestBuilder securityBaselineStates();

    ISecurityBaselineStateRequestBuilder securityBaselineStates(final String id);

    IDeviceCompliancePolicyStateCollectionRequestBuilder deviceCompliancePolicyStates();

    IDeviceCompliancePolicyStateRequestBuilder deviceCompliancePolicyStates(final String id);

    IDeviceConfigurationStateCollectionRequestBuilder deviceConfigurationStates();

    IDeviceConfigurationStateRequestBuilder deviceConfigurationStates(final String id);

    IManagedDeviceMobileAppConfigurationStateCollectionRequestBuilder managedDeviceMobileAppConfigurationStates();

    IManagedDeviceMobileAppConfigurationStateRequestBuilder managedDeviceMobileAppConfigurationStates(final String id);

    IDetectedAppCollectionWithReferencesRequestBuilder detectedApps();

    IDetectedAppWithReferenceRequestBuilder detectedApps(final String id);

    /**
     * Gets the request builder for DeviceCategory
     *
     * @return the IDeviceCategoryRequestBuilder instance
     */
    IDeviceCategoryRequestBuilder deviceCategory();

    IDeviceLogCollectionResponseCollectionRequestBuilder logCollectionRequests();

    IDeviceLogCollectionResponseRequestBuilder logCollectionRequests(final String id);

    IUserCollectionRequestBuilder users();

    IUserRequestBuilder users(final String id);

    /**
     * Gets the request builder for WindowsProtectionState
     *
     * @return the IWindowsProtectionStateRequestBuilder instance
     */
    IWindowsProtectionStateRequestBuilder windowsProtectionState();

}