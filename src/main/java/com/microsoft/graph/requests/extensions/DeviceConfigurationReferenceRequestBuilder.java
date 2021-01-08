
// Template Source: BaseEntityReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.models.extensions.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.extensions.DeviceConfigurationAssignment;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import com.microsoft.graph.models.extensions.DeviceConfigurationTargetedUserAndDevice;
import com.microsoft.graph.models.extensions.WindowsAssignedAccessProfile;
import com.microsoft.graph.models.extensions.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.models.extensions.IosAvailableUpdateVersion;
import com.microsoft.graph.requests.extensions.DeviceConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationGroupAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationUserOverviewRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Reference Request Builder.
 */
public class DeviceConfigurationReferenceRequestBuilder extends BaseReferenceRequestBuilder<DeviceConfiguration, DeviceConfigurationReferenceRequest> {

    /**
     * The request builder for the DeviceConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfigurationReferenceRequest.class);
    }
}
