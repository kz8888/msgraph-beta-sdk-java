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
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Enterprise Wi Fi Configuration Request Builder.
 */
public class IosEnterpriseWiFiConfigurationRequestBuilder extends BaseRequestBuilder implements IIosEnterpriseWiFiConfigurationRequestBuilder {

    /**
     * The request builder for the IosEnterpriseWiFiConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosEnterpriseWiFiConfigurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IIosEnterpriseWiFiConfigurationRequest instance
     */
    public IIosEnterpriseWiFiConfigurationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IIosEnterpriseWiFiConfigurationRequest instance
     */
    public IIosEnterpriseWiFiConfigurationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.IosEnterpriseWiFiConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDeviceConfigurationAssignmentCollectionRequestBuilder assignments() {
        return new DeviceConfigurationAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IDeviceConfigurationAssignmentRequestBuilder assignments(final String id) {
        return new DeviceConfigurationAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    public ISettingStateDeviceSummaryCollectionRequestBuilder deviceSettingStateSummaries() {
        return new SettingStateDeviceSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries"), getClient(), null);
    }

    public ISettingStateDeviceSummaryRequestBuilder deviceSettingStateSummaries(final String id) {
        return new SettingStateDeviceSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries") + "/" + id, getClient(), null);
    }
    public IDeviceConfigurationDeviceStatusCollectionRequestBuilder deviceStatuses() {
        return new DeviceConfigurationDeviceStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses"), getClient(), null);
    }

    public IDeviceConfigurationDeviceStatusRequestBuilder deviceStatuses(final String id) {
        return new DeviceConfigurationDeviceStatusRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceConfigurationDeviceOverview
     *
     * @return the IDeviceConfigurationDeviceOverviewRequestBuilder instance
     */
    public IDeviceConfigurationDeviceOverviewRequestBuilder deviceStatusOverview() {
        return new DeviceConfigurationDeviceOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatusOverview"), getClient(), null);
    }
    public IDeviceConfigurationGroupAssignmentCollectionRequestBuilder groupAssignments() {
        return new DeviceConfigurationGroupAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("groupAssignments"), getClient(), null);
    }

    public IDeviceConfigurationGroupAssignmentRequestBuilder groupAssignments(final String id) {
        return new DeviceConfigurationGroupAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("groupAssignments") + "/" + id, getClient(), null);
    }
    public IDeviceConfigurationUserStatusCollectionRequestBuilder userStatuses() {
        return new DeviceConfigurationUserStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses"), getClient(), null);
    }

    public IDeviceConfigurationUserStatusRequestBuilder userStatuses(final String id) {
        return new DeviceConfigurationUserStatusRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceConfigurationUserOverview
     *
     * @return the IDeviceConfigurationUserOverviewRequestBuilder instance
     */
    public IDeviceConfigurationUserOverviewRequestBuilder userStatusOverview() {
        return new DeviceConfigurationUserOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("userStatusOverview"), getClient(), null);
    }

    /**
     * Gets the request builder for DeviceManagementDerivedCredentialSettings
     *
     * @return the IDeviceManagementDerivedCredentialSettingsWithReferenceRequestBuilder instance
     */
    public IDeviceManagementDerivedCredentialSettingsWithReferenceRequestBuilder derivedCredentialSettings() {
        return new DeviceManagementDerivedCredentialSettingsWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("derivedCredentialSettings"), getClient(), null);
    }

    /**
     * Gets the request builder for IosCertificateProfileBase
     *
     * @return the IIosCertificateProfileBaseWithReferenceRequestBuilder instance
     */
    public IIosCertificateProfileBaseWithReferenceRequestBuilder identityCertificateForClientAuthentication() {
        return new IosCertificateProfileBaseWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("identityCertificateForClientAuthentication"), getClient(), null);
    }
    public IIosTrustedRootCertificateCollectionRequestBuilder rootCertificatesForServerValidation() {
        return new IosTrustedRootCertificateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("rootCertificatesForServerValidation"), getClient(), null);
    }

    public IIosTrustedRootCertificateRequestBuilder rootCertificatesForServerValidation(final String id) {
        return new IosTrustedRootCertificateRequestBuilder(getRequestUrlWithAdditionalSegment("rootCertificatesForServerValidation") + "/" + id, getClient(), null);
    }
}
