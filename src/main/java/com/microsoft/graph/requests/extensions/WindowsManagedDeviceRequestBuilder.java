// Template Source: BaseEntityRequestBuilder.java.tt
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
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Managed Device Request Builder.
 */
public class WindowsManagedDeviceRequestBuilder extends BaseRequestBuilder implements IWindowsManagedDeviceRequestBuilder {

    /**
     * The request builder for the WindowsManagedDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsManagedDeviceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWindowsManagedDeviceRequest instance
     */
    public IWindowsManagedDeviceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWindowsManagedDeviceRequest instance
     */
    public IWindowsManagedDeviceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WindowsManagedDeviceRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDeviceCompliancePolicyStateCollectionRequestBuilder deviceCompliancePolicyStates() {
        return new DeviceCompliancePolicyStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicyStates"), getClient(), null);
    }

    public IDeviceCompliancePolicyStateRequestBuilder deviceCompliancePolicyStates(final String id) {
        return new DeviceCompliancePolicyStateRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicyStates") + "/" + id, getClient(), null);
    }
    public IAssignmentFilterEvaluationStatusDetailsCollectionRequestBuilder assignmentFilterEvaluationStatusDetails() {
        return new AssignmentFilterEvaluationStatusDetailsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignmentFilterEvaluationStatusDetails"), getClient(), null);
    }

    public IAssignmentFilterEvaluationStatusDetailsRequestBuilder assignmentFilterEvaluationStatusDetails(final String id) {
        return new AssignmentFilterEvaluationStatusDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("assignmentFilterEvaluationStatusDetails") + "/" + id, getClient(), null);
    }
    public IDeviceConfigurationStateCollectionRequestBuilder deviceConfigurationStates() {
        return new DeviceConfigurationStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationStates"), getClient(), null);
    }

    public IDeviceConfigurationStateRequestBuilder deviceConfigurationStates(final String id) {
        return new DeviceConfigurationStateRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationStates") + "/" + id, getClient(), null);
    }
    public IManagedDeviceMobileAppConfigurationStateCollectionRequestBuilder managedDeviceMobileAppConfigurationStates() {
        return new ManagedDeviceMobileAppConfigurationStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedDeviceMobileAppConfigurationStates"), getClient(), null);
    }

    public IManagedDeviceMobileAppConfigurationStateRequestBuilder managedDeviceMobileAppConfigurationStates(final String id) {
        return new ManagedDeviceMobileAppConfigurationStateRequestBuilder(getRequestUrlWithAdditionalSegment("managedDeviceMobileAppConfigurationStates") + "/" + id, getClient(), null);
    }
    public ISecurityBaselineStateCollectionRequestBuilder securityBaselineStates() {
        return new SecurityBaselineStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("securityBaselineStates"), getClient(), null);
    }

    public ISecurityBaselineStateRequestBuilder securityBaselineStates(final String id) {
        return new SecurityBaselineStateRequestBuilder(getRequestUrlWithAdditionalSegment("securityBaselineStates") + "/" + id, getClient(), null);
    }
    public IDetectedAppCollectionWithReferencesRequestBuilder detectedApps() {
        return new DetectedAppCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("detectedApps"), getClient(), null);
    }

    public IDetectedAppWithReferenceRequestBuilder detectedApps(final String id) {
        return new DetectedAppWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("detectedApps") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceCategory
     *
     * @return the IDeviceCategoryRequestBuilder instance
     */
    public IDeviceCategoryRequestBuilder deviceCategory() {
        return new DeviceCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCategory"), getClient(), null);
    }
    public IDeviceLogCollectionResponseCollectionRequestBuilder logCollectionRequests() {
        return new DeviceLogCollectionResponseCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("logCollectionRequests"), getClient(), null);
    }

    public IDeviceLogCollectionResponseRequestBuilder logCollectionRequests(final String id) {
        return new DeviceLogCollectionResponseRequestBuilder(getRequestUrlWithAdditionalSegment("logCollectionRequests") + "/" + id, getClient(), null);
    }
    public IUserCollectionRequestBuilder users() {
        return new UserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("users"), getClient(), null);
    }

    public IUserRequestBuilder users(final String id) {
        return new UserRequestBuilder(getRequestUrlWithAdditionalSegment("users") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WindowsProtectionState
     *
     * @return the IWindowsProtectionStateRequestBuilder instance
     */
    public IWindowsProtectionStateRequestBuilder windowsProtectionState() {
        return new WindowsProtectionStateRequestBuilder(getRequestUrlWithAdditionalSegment("windowsProtectionState"), getClient(), null);
    }
}
