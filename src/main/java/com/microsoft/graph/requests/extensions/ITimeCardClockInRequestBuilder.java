// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITimeCardClockInRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Time Card Clock In Request Builder.
 */
public interface ITimeCardClockInRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ITimeCardClockInRequest
     *
     * @param requestOptions the options for the request
     * @return the ITimeCardClockInRequest instance
     */
    ITimeCardClockInRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the ITimeCardClockInRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the ITimeCardClockInRequest instance
     */
    ITimeCardClockInRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
