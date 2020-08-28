// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAccessReviewResetDecisionsRequest;
import com.microsoft.graph.requests.extensions.AccessReviewResetDecisionsRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Reset Decisions Request Builder.
 */
public class AccessReviewResetDecisionsRequestBuilder extends BaseActionRequestBuilder implements IAccessReviewResetDecisionsRequestBuilder {

    /**
     * The request builder for this AccessReviewResetDecisions
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewResetDecisionsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IAccessReviewResetDecisionsRequest
     *
     * @return the IAccessReviewResetDecisionsRequest instance
     */
    public IAccessReviewResetDecisionsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IAccessReviewResetDecisionsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IAccessReviewResetDecisionsRequest instance
     */
    public IAccessReviewResetDecisionsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        AccessReviewResetDecisionsRequest request = new AccessReviewResetDecisionsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}