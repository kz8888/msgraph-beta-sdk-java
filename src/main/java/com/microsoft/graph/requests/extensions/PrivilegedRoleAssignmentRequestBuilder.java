// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedRoleAssignment;
import com.microsoft.graph.requests.extensions.PrivilegedRoleRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.extensions.PrivilegedRoleAssignmentMakePermanentParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Assignment Request Builder.
 */
public class PrivilegedRoleAssignmentRequestBuilder extends BaseRequestBuilder<PrivilegedRoleAssignment> {

    /**
     * The request builder for the PrivilegedRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedRoleAssignmentRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the PrivilegedRoleAssignmentRequest instance
     */
    @Nonnull
    public PrivilegedRoleAssignmentRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the PrivilegedRoleAssignmentRequest instance
     */
    @Nonnull
    public PrivilegedRoleAssignmentRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for PrivilegedRole
     *
     * @return the PrivilegedRoleRequestBuilder instance
     */
    @Nonnull
    public PrivilegedRoleRequestBuilder roleInfo() {
        return new PrivilegedRoleRequestBuilder(getRequestUrlWithAdditionalSegment("roleInfo"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public PrivilegedRoleAssignmentMakeEligibleRequestBuilder makeEligible() {
        return new PrivilegedRoleAssignmentMakeEligibleRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.makeEligible"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public PrivilegedRoleAssignmentMakePermanentRequestBuilder makePermanent(@Nonnull final PrivilegedRoleAssignmentMakePermanentParameterSet parameters) {
        return new PrivilegedRoleAssignmentMakePermanentRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.makePermanent"), getClient(), null, parameters);
    }
}
