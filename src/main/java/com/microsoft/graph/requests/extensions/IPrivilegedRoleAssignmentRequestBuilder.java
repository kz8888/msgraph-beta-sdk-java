// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedRoleAssignment;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Privileged Role Assignment Request Builder.
 */
public interface IPrivilegedRoleAssignmentRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IPrivilegedRoleAssignmentRequest instance
     */
    IPrivilegedRoleAssignmentRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IPrivilegedRoleAssignmentRequest instance
     */
    IPrivilegedRoleAssignmentRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for PrivilegedRole
     *
     * @return the IPrivilegedRoleRequestBuilder instance
     */
    IPrivilegedRoleRequestBuilder roleInfo();
    IPrivilegedRoleAssignmentMakeEligibleRequestBuilder makeEligible();
    IPrivilegedRoleAssignmentMakePermanentRequestBuilder makePermanent(final String reason, final String ticketNumber, final String ticketSystem);

}