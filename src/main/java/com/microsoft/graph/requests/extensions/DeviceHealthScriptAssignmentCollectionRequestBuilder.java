// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceHealthScript;
import com.microsoft.graph.models.extensions.DeviceHealthScriptAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceHealthScriptAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptAssignmentCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Health Script Assignment Collection Request Builder.
 */
public class DeviceHealthScriptAssignmentCollectionRequestBuilder extends BaseRequestBuilder implements IDeviceHealthScriptAssignmentCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceHealthScript
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceHealthScriptAssignmentCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IDeviceHealthScriptAssignmentCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDeviceHealthScriptAssignmentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DeviceHealthScriptAssignmentCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDeviceHealthScriptAssignmentRequestBuilder byId(final String id) {
        return new DeviceHealthScriptAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
