// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementAutopilotEvent;
import com.microsoft.graph.models.extensions.DeviceManagementAutopilotPolicyStatusDetail;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceManagementAutopilotPolicyStatusDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementAutopilotPolicyStatusDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementAutopilotPolicyStatusDetailCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Autopilot Policy Status Detail Collection Request Builder.
 */
public class DeviceManagementAutopilotPolicyStatusDetailCollectionRequestBuilder extends BaseRequestBuilder implements IDeviceManagementAutopilotPolicyStatusDetailCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagementAutopilotEvent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementAutopilotPolicyStatusDetailCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IDeviceManagementAutopilotPolicyStatusDetailCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IDeviceManagementAutopilotPolicyStatusDetailCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DeviceManagementAutopilotPolicyStatusDetailCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDeviceManagementAutopilotPolicyStatusDetailRequestBuilder byId(final String id) {
        return new DeviceManagementAutopilotPolicyStatusDetailRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
