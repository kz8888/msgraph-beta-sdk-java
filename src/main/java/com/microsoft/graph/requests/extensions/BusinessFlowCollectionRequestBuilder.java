// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ApprovalWorkflowProvider;
import com.microsoft.graph.models.extensions.BusinessFlow;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IBusinessFlowCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBusinessFlowRequestBuilder;
import com.microsoft.graph.requests.extensions.IBusinessFlowCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Business Flow Collection Request Builder.
 */
public class BusinessFlowCollectionRequestBuilder extends BaseRequestBuilder implements IBusinessFlowCollectionRequestBuilder {

    /**
     * The request builder for this collection of ApprovalWorkflowProvider
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BusinessFlowCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IBusinessFlowCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IBusinessFlowCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new BusinessFlowCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IBusinessFlowRequestBuilder byId(final String id) {
        return new BusinessFlowRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}