// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileAppTroubleshootingEvent;
import com.microsoft.graph.models.extensions.AppLogCollectionRequest;
import com.microsoft.graph.models.extensions.AppLogCollectionDownloadDetails;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAppLogCollectionRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppLogCollectionRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppLogCollectionRequestCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Log Collection Request Collection Request Builder.
 */
public class AppLogCollectionRequestCollectionRequestBuilder extends BaseRequestBuilder implements IAppLogCollectionRequestCollectionRequestBuilder {

    /**
     * The request builder for this collection of MobileAppTroubleshootingEvent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppLogCollectionRequestCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IAppLogCollectionRequestCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IAppLogCollectionRequestCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new AppLogCollectionRequestCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IAppLogCollectionRequestRequestBuilder byId(final String id) {
        return new AppLogCollectionRequestRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}