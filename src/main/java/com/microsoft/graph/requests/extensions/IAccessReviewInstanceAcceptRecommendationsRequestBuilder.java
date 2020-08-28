// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAccessReviewInstanceAcceptRecommendationsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Review Instance Accept Recommendations Request Builder.
 */
public interface IAccessReviewInstanceAcceptRecommendationsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IAccessReviewInstanceAcceptRecommendationsRequest
     *
     * @return the IAccessReviewInstanceAcceptRecommendationsRequest instance
     */
    IAccessReviewInstanceAcceptRecommendationsRequest buildRequest();

    /**
     * Creates the IAccessReviewInstanceAcceptRecommendationsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IAccessReviewInstanceAcceptRecommendationsRequest instance
     */
    IAccessReviewInstanceAcceptRecommendationsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}