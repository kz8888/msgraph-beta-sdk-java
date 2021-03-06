// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ReviewSet;
import com.microsoft.graph.models.extensions.ReviewSetQuery;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReviewSetQueryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReviewSetQueryRequestBuilder;
import com.microsoft.graph.requests.extensions.IReviewSetQueryCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Review Set Query Collection Request Builder.
 */
public class ReviewSetQueryCollectionRequestBuilder extends BaseRequestBuilder implements IReviewSetQueryCollectionRequestBuilder {

    /**
     * The request builder for this collection of ReviewSet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReviewSetQueryCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IReviewSetQueryCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IReviewSetQueryCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ReviewSetQueryCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IReviewSetQueryRequestBuilder byId(final String id) {
        return new ReviewSetQueryRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
