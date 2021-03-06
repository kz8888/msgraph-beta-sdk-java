// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IIosVppAppRevokeDeviceLicenseRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Ios Vpp App Revoke Device License Request Builder.
 */
public interface IIosVppAppRevokeDeviceLicenseRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IIosVppAppRevokeDeviceLicenseRequest
     *
     * @param requestOptions the options for the request
     * @return the IIosVppAppRevokeDeviceLicenseRequest instance
     */
    IIosVppAppRevokeDeviceLicenseRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IIosVppAppRevokeDeviceLicenseRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IIosVppAppRevokeDeviceLicenseRequest instance
     */
    IIosVppAppRevokeDeviceLicenseRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
