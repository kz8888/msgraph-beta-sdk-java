// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentMakePermanentRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Privileged Role Assignment Make Permanent Request Builder.
 */
public interface IPrivilegedRoleAssignmentMakePermanentRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IPrivilegedRoleAssignmentMakePermanentRequest
     *
     * @param requestOptions the options for the request
     * @return the IPrivilegedRoleAssignmentMakePermanentRequest instance
     */
    IPrivilegedRoleAssignmentMakePermanentRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IPrivilegedRoleAssignmentMakePermanentRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IPrivilegedRoleAssignmentMakePermanentRequest instance
     */
    IPrivilegedRoleAssignmentMakePermanentRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
