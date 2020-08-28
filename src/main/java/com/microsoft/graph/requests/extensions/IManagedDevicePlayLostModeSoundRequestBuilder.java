// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagedDevicePlayLostModeSoundRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed Device Play Lost Mode Sound Request Builder.
 */
public interface IManagedDevicePlayLostModeSoundRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IManagedDevicePlayLostModeSoundRequest
     *
     * @return the IManagedDevicePlayLostModeSoundRequest instance
     */
    IManagedDevicePlayLostModeSoundRequest buildRequest();

    /**
     * Creates the IManagedDevicePlayLostModeSoundRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IManagedDevicePlayLostModeSoundRequest instance
     */
    IManagedDevicePlayLostModeSoundRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}