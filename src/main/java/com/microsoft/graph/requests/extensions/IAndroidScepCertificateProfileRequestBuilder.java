// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidScepCertificateProfile;
import com.microsoft.graph.requests.extensions.IManagedDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceCertificateStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Scep Certificate Profile Request Builder.
 */
public interface IAndroidScepCertificateProfileRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IAndroidScepCertificateProfileRequest instance
     */
    IAndroidScepCertificateProfileRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IAndroidScepCertificateProfileRequest instance
     */
    IAndroidScepCertificateProfileRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IDeviceConfigurationAssignmentCollectionRequestBuilder assignments();

    IDeviceConfigurationAssignmentRequestBuilder assignments(final String id);

    ISettingStateDeviceSummaryCollectionRequestBuilder deviceSettingStateSummaries();

    ISettingStateDeviceSummaryRequestBuilder deviceSettingStateSummaries(final String id);

    IDeviceConfigurationDeviceStatusCollectionRequestBuilder deviceStatuses();

    IDeviceConfigurationDeviceStatusRequestBuilder deviceStatuses(final String id);

    /**
     * Gets the request builder for DeviceConfigurationDeviceOverview
     *
     * @return the IDeviceConfigurationDeviceOverviewRequestBuilder instance
     */
    IDeviceConfigurationDeviceOverviewRequestBuilder deviceStatusOverview();

    IDeviceConfigurationGroupAssignmentCollectionRequestBuilder groupAssignments();

    IDeviceConfigurationGroupAssignmentRequestBuilder groupAssignments(final String id);

    IDeviceConfigurationUserStatusCollectionRequestBuilder userStatuses();

    IDeviceConfigurationUserStatusRequestBuilder userStatuses(final String id);

    /**
     * Gets the request builder for DeviceConfigurationUserOverview
     *
     * @return the IDeviceConfigurationUserOverviewRequestBuilder instance
     */
    IDeviceConfigurationUserOverviewRequestBuilder userStatusOverview();

    /**
     * Gets the request builder for AndroidTrustedRootCertificate
     *
     * @return the IAndroidTrustedRootCertificateWithReferenceRequestBuilder instance
     */
    IAndroidTrustedRootCertificateWithReferenceRequestBuilder rootCertificate();

    IManagedDeviceCertificateStateCollectionRequestBuilder managedDeviceCertificateStates();

    IManagedDeviceCertificateStateRequestBuilder managedDeviceCertificateStates(final String id);

}