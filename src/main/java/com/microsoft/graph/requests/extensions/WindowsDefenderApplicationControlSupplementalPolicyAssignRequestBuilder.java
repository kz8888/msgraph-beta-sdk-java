// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignRequest;
import com.microsoft.graph.models.extensions.WindowsDefenderApplicationControlSupplementalPolicy;
import com.microsoft.graph.models.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignment;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Defender Application Control Supplemental Policy Assign Request Builder.
 */
public class WindowsDefenderApplicationControlSupplementalPolicyAssignRequestBuilder extends BaseActionRequestBuilder<WindowsDefenderApplicationControlSupplementalPolicy> {

    private WindowsDefenderApplicationControlSupplementalPolicyAssignParameterSet body;
    /**
     * The request builder for this WindowsDefenderApplicationControlSupplementalPolicyAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public WindowsDefenderApplicationControlSupplementalPolicyAssignRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final WindowsDefenderApplicationControlSupplementalPolicyAssignParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the WindowsDefenderApplicationControlSupplementalPolicyAssignRequest
     *
     * @param requestOptions the options for the request
     * @return the WindowsDefenderApplicationControlSupplementalPolicyAssignRequest instance
     */
    @Nonnull
    public WindowsDefenderApplicationControlSupplementalPolicyAssignRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WindowsDefenderApplicationControlSupplementalPolicyAssignRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WindowsDefenderApplicationControlSupplementalPolicyAssignRequest instance
     */
    @Nonnull
    public WindowsDefenderApplicationControlSupplementalPolicyAssignRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WindowsDefenderApplicationControlSupplementalPolicyAssignRequest request = new WindowsDefenderApplicationControlSupplementalPolicyAssignRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
