// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Planner;
import com.microsoft.graph.models.extensions.PlannerBucket;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IPlannerBucketCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerBucketRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerBucketCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Bucket Collection Request Builder.
 */
public class PlannerBucketCollectionRequestBuilder extends BaseRequestBuilder implements IPlannerBucketCollectionRequestBuilder {

    /**
     * The request builder for this collection of Planner
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerBucketCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IPlannerBucketCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IPlannerBucketCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new PlannerBucketCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPlannerBucketRequestBuilder byId(final String id) {
        return new PlannerBucketRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}