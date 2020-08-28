// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IdentityContainer;
import com.microsoft.graph.models.extensions.B2cIdentityUserFlow;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IB2cIdentityUserFlowCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IB2cIdentityUserFlowRequestBuilder;
import com.microsoft.graph.requests.extensions.IB2cIdentityUserFlowCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the B2c Identity User Flow Collection Request Builder.
 */
public class B2cIdentityUserFlowCollectionRequestBuilder extends BaseRequestBuilder implements IB2cIdentityUserFlowCollectionRequestBuilder {

    /**
     * The request builder for this collection of IdentityContainer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public B2cIdentityUserFlowCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IB2cIdentityUserFlowCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IB2cIdentityUserFlowCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new B2cIdentityUserFlowCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IB2cIdentityUserFlowRequestBuilder byId(final String id) {
        return new B2cIdentityUserFlowRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}