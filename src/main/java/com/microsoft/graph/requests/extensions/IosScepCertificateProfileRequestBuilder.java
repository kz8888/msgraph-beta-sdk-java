// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosScepCertificateProfile;
import com.microsoft.graph.requests.extensions.IManagedDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceCertificateStateRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCertificateStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosTrustedRootCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.IosTrustedRootCertificateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Scep Certificate Profile Request Builder.
 */
public class IosScepCertificateProfileRequestBuilder extends BaseRequestBuilder implements IIosScepCertificateProfileRequestBuilder {

    /**
     * The request builder for the IosScepCertificateProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosScepCertificateProfileRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IIosScepCertificateProfileRequest instance
     */
    public IIosScepCertificateProfileRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IIosScepCertificateProfileRequest instance
     */
    public IIosScepCertificateProfileRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.IosScepCertificateProfileRequest(getRequestUrl(), getClient(), requestOptions);
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
    public IManagedDeviceCertificateStateCollectionRequestBuilder managedDeviceCertificateStates() {
        return new ManagedDeviceCertificateStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedDeviceCertificateStates"), getClient(), null);
    }

    public IManagedDeviceCertificateStateRequestBuilder managedDeviceCertificateStates(final String id) {
        return new ManagedDeviceCertificateStateRequestBuilder(getRequestUrlWithAdditionalSegment("managedDeviceCertificateStates") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for IosTrustedRootCertificate
     *
     * @return the IIosTrustedRootCertificateWithReferenceRequestBuilder instance
     */
    public IIosTrustedRootCertificateWithReferenceRequestBuilder rootCertificate() {
        return new IosTrustedRootCertificateWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("rootCertificate"), getClient(), null);
    }
}
