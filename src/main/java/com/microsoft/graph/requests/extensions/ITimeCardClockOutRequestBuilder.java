// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITimeCardClockOutRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Time Card Clock Out Request Builder.
 */
public interface ITimeCardClockOutRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ITimeCardClockOutRequest
     *
     * @param requestOptions the options for the request
     * @return the ITimeCardClockOutRequest instance
     */
    ITimeCardClockOutRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the ITimeCardClockOutRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the ITimeCardClockOutRequest instance
     */
    ITimeCardClockOutRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
