// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceComplianceScheduledActionForRule;
import com.microsoft.graph.models.extensions.DeviceComplianceActionItem;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceComplianceActionItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceActionItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceActionItemCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Action Item Collection Request Builder.
 */
public class DeviceComplianceActionItemCollectionRequestBuilder extends BaseRequestBuilder implements IDeviceComplianceActionItemCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceComplianceScheduledActionForRule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceComplianceActionItemCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IDeviceComplianceActionItemCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IDeviceComplianceActionItemCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DeviceComplianceActionItemCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDeviceComplianceActionItemRequestBuilder byId(final String id) {
        return new DeviceComplianceActionItemRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
