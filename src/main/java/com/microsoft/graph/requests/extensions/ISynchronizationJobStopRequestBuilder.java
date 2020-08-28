// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ISynchronizationJobStopRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Synchronization Job Stop Request Builder.
 */
public interface ISynchronizationJobStopRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ISynchronizationJobStopRequest
     *
     * @return the ISynchronizationJobStopRequest instance
     */
    ISynchronizationJobStopRequest buildRequest();

    /**
     * Creates the ISynchronizationJobStopRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the ISynchronizationJobStopRequest instance
     */
    ISynchronizationJobStopRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}