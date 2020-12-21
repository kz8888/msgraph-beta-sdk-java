// Template Source: IBaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;

import com.microsoft.graph.models.extensions.PrivilegedRoleAssignmentRequest;import com.microsoft.graph.models.extensions.PrivilegedRoleAssignmentRequest;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestCollectionRequest;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestMyCollectionRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Privileged Role Assignment Request Collection Request Builder.
 */
public interface IPrivilegedRoleAssignmentRequestCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IPrivilegedRoleAssignmentRequestCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IPrivilegedRoleAssignmentRequestCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IPrivilegedRoleAssignmentRequestRequestBuilder byId(final String id);


    IPrivilegedRoleAssignmentRequestMyCollectionRequestBuilder my();
}
