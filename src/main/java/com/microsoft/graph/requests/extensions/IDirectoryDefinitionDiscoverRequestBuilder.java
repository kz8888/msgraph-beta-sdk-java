// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDirectoryDefinitionDiscoverRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Directory Definition Discover Request Builder.
 */
public interface IDirectoryDefinitionDiscoverRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDirectoryDefinitionDiscoverRequest
     *
     * @param requestOptions the options for the request
     * @return the IDirectoryDefinitionDiscoverRequest instance
     */
    IDirectoryDefinitionDiscoverRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IDirectoryDefinitionDiscoverRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDirectoryDefinitionDiscoverRequest instance
     */
    IDirectoryDefinitionDiscoverRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
