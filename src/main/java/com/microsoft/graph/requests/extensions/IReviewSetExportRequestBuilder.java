// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReviewSetExportRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Review Set Export Request Builder.
 */
public interface IReviewSetExportRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReviewSetExportRequest
     *
     * @param requestOptions the options for the request
     * @return the IReviewSetExportRequest instance
     */
    IReviewSetExportRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IReviewSetExportRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReviewSetExportRequest instance
     */
    IReviewSetExportRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
