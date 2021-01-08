// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentRequestCancelRequest;
import com.microsoft.graph.models.extensions.PrivilegedRoleAssignmentRequest;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Assignment Request Cancel Request Builder.
 */
public class PrivilegedRoleAssignmentRequestCancelRequestBuilder extends BaseActionRequestBuilder<PrivilegedRoleAssignmentRequest> {

    /**
     * The request builder for this PrivilegedRoleAssignmentRequestCancel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedRoleAssignmentRequestCancelRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the PrivilegedRoleAssignmentRequestCancelRequest
     *
     * @param requestOptions the options for the request
     * @return the PrivilegedRoleAssignmentRequestCancelRequest instance
     */
    @Nonnull
    public PrivilegedRoleAssignmentRequestCancelRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the PrivilegedRoleAssignmentRequestCancelRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the PrivilegedRoleAssignmentRequestCancelRequest instance
     */
    @Nonnull
    public PrivilegedRoleAssignmentRequestCancelRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        PrivilegedRoleAssignmentRequestCancelRequest request = new PrivilegedRoleAssignmentRequestCancelRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
