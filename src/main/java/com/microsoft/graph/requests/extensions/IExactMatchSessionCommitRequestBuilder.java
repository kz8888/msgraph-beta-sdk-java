// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IExactMatchSessionCommitRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Exact Match Session Commit Request Builder.
 */
public interface IExactMatchSessionCommitRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IExactMatchSessionCommitRequest
     *
     * @param requestOptions the options for the request
     * @return the IExactMatchSessionCommitRequest instance
     */
    IExactMatchSessionCommitRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IExactMatchSessionCommitRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IExactMatchSessionCommitRequest instance
     */
    IExactMatchSessionCommitRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
