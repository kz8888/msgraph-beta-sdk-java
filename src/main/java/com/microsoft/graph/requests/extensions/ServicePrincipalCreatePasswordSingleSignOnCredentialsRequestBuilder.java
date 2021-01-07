// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ServicePrincipalCreatePasswordSingleSignOnCredentialsRequest;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.Credential;
import com.microsoft.graph.models.extensions.PasswordSingleSignOnCredentialSet;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.ServicePrincipalCreatePasswordSingleSignOnCredentialsParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Create Password Single Sign On Credentials Request Builder.
 */
public class ServicePrincipalCreatePasswordSingleSignOnCredentialsRequestBuilder extends BaseActionRequestBuilder<PasswordSingleSignOnCredentialSet> {

    private ServicePrincipalCreatePasswordSingleSignOnCredentialsParameterSet body;
    /**
     * The request builder for this ServicePrincipalCreatePasswordSingleSignOnCredentials
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ServicePrincipalCreatePasswordSingleSignOnCredentialsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ServicePrincipalCreatePasswordSingleSignOnCredentialsParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the ServicePrincipalCreatePasswordSingleSignOnCredentialsRequest
     *
     * @param requestOptions the options for the request
     * @return the ServicePrincipalCreatePasswordSingleSignOnCredentialsRequest instance
     */
    @Nonnull
    public ServicePrincipalCreatePasswordSingleSignOnCredentialsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ServicePrincipalCreatePasswordSingleSignOnCredentialsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ServicePrincipalCreatePasswordSingleSignOnCredentialsRequest instance
     */
    @Nonnull
    public ServicePrincipalCreatePasswordSingleSignOnCredentialsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ServicePrincipalCreatePasswordSingleSignOnCredentialsRequest request = new ServicePrincipalCreatePasswordSingleSignOnCredentialsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
