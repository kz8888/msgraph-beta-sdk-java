// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IBookingBusinessPublishRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Booking Business Publish Request Builder.
 */
public interface IBookingBusinessPublishRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IBookingBusinessPublishRequest
     *
     * @param requestOptions the options for the request
     * @return the IBookingBusinessPublishRequest instance
     */
    IBookingBusinessPublishRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IBookingBusinessPublishRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IBookingBusinessPublishRequest instance
     */
    IBookingBusinessPublishRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
