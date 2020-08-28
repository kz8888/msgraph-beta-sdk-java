// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.MobileAppTroubleshootingEvent;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IMobileAppTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppTroubleshootingEventCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Troubleshooting Event Collection Request Builder.
 */
public class MobileAppTroubleshootingEventCollectionRequestBuilder extends BaseRequestBuilder implements IMobileAppTroubleshootingEventCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppTroubleshootingEventCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IMobileAppTroubleshootingEventCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IMobileAppTroubleshootingEventCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new MobileAppTroubleshootingEventCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IMobileAppTroubleshootingEventRequestBuilder byId(final String id) {
        return new MobileAppTroubleshootingEventRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}