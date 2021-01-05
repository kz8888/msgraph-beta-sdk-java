// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IServicePrincipalUpdatePasswordSingleSignOnCredentialsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Service Principal Update Password Single Sign On Credentials Request Builder.
 */
public interface IServicePrincipalUpdatePasswordSingleSignOnCredentialsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IServicePrincipalUpdatePasswordSingleSignOnCredentialsRequest
     *
     * @param requestOptions the options for the request
     * @return the IServicePrincipalUpdatePasswordSingleSignOnCredentialsRequest instance
     */
    IServicePrincipalUpdatePasswordSingleSignOnCredentialsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IServicePrincipalUpdatePasswordSingleSignOnCredentialsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IServicePrincipalUpdatePasswordSingleSignOnCredentialsRequest instance
     */
    IServicePrincipalUpdatePasswordSingleSignOnCredentialsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
