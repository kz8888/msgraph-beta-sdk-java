// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementIntent;
import com.microsoft.graph.models.extensions.DeviceManagementIntentUserState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceManagementIntentUserStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentUserStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentUserStateCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent User State Collection Request Builder.
 */
public class DeviceManagementIntentUserStateCollectionRequestBuilder extends BaseRequestBuilder implements IDeviceManagementIntentUserStateCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagementIntent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementIntentUserStateCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IDeviceManagementIntentUserStateCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDeviceManagementIntentUserStateCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DeviceManagementIntentUserStateCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDeviceManagementIntentUserStateRequestBuilder byId(final String id) {
        return new DeviceManagementIntentUserStateRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}