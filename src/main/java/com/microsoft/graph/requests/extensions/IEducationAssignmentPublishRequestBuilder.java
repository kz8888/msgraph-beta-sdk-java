// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEducationAssignmentPublishRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education Assignment Publish Request Builder.
 */
public interface IEducationAssignmentPublishRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IEducationAssignmentPublishRequest
     *
     * @param requestOptions the options for the request
     * @return the IEducationAssignmentPublishRequest instance
     */
    IEducationAssignmentPublishRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IEducationAssignmentPublishRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IEducationAssignmentPublishRequest instance
     */
    IEducationAssignmentPublishRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
