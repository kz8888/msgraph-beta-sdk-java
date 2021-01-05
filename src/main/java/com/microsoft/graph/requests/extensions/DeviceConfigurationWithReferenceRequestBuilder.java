// Template Source: BaseEntityWithReferenceRequestBuilder.java.tt
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
import com.microsoft.graph.requests.extensions.IDeviceConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationGroupAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationGroupAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationUserOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationUserOverviewRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration With Reference Request Builder.
 */
public class DeviceConfigurationWithReferenceRequestBuilder extends BaseRequestBuilder implements IDeviceConfigurationWithReferenceRequestBuilder {

    /**
     * The request builder for the DeviceConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDeviceConfigurationWithReferenceRequest instance
     */
    public IDeviceConfigurationWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IDeviceConfigurationWithReferenceRequest instance
     */
    public IDeviceConfigurationWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DeviceConfigurationWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDeviceConfigurationReferenceRequestBuilder reference(){
        return new DeviceConfigurationReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
