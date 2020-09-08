// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import com.microsoft.graph.models.extensions.DeviceConfigurationTargetedUserAndDevice;
import com.microsoft.graph.models.extensions.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.extensions.DeviceConfigurationAssignment;
import com.microsoft.graph.models.extensions.WindowsAssignedAccessProfile;
import com.microsoft.graph.models.extensions.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.models.extensions.IosAvailableUpdateVersion;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationCollectionRequest;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationHasPayloadLinksCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationGetTargetedUsersAndDevicesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationGetIosAvailableUpdateVersionsCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Collection Request Builder.
 */
public class DeviceConfigurationCollectionRequestBuilder extends BaseRequestBuilder implements IDeviceConfigurationCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IDeviceConfigurationCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDeviceConfigurationCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DeviceConfigurationCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDeviceConfigurationRequestBuilder byId(final String id) {
        return new DeviceConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IDeviceConfigurationHasPayloadLinksCollectionRequestBuilder hasPayloadLinks(final java.util.List<String> payloadIds) {
        return new DeviceConfigurationHasPayloadLinksCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.hasPayloadLinks"), getClient(), null, payloadIds);
    }

    public IDeviceConfigurationGetTargetedUsersAndDevicesCollectionRequestBuilder getTargetedUsersAndDevices(final java.util.List<String> deviceConfigurationIds) {
        return new DeviceConfigurationGetTargetedUsersAndDevicesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTargetedUsersAndDevices"), getClient(), null, deviceConfigurationIds);
    }

    public IDeviceConfigurationGetIosAvailableUpdateVersionsCollectionRequestBuilder getIosAvailableUpdateVersions() {
        return new DeviceConfigurationGetIosAvailableUpdateVersionsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getIosAvailableUpdateVersions"), getClient(), null);
    }
}
