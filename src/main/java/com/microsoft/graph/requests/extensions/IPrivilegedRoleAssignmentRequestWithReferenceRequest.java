// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedRoleAssignmentRequest;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.PrivilegedRoleAssignmentRequest;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Privileged Role Assignment Request With Reference Request.
 */
public interface IPrivilegedRoleAssignmentRequestWithReferenceRequest extends IHttpRequest {

    void post(final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest, final IJsonBackedObject payload, final ICallback<? super PrivilegedRoleAssignmentRequest> callback);

    PrivilegedRoleAssignmentRequest post(final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super PrivilegedRoleAssignmentRequest> callback);

    PrivilegedRoleAssignmentRequest get() throws ClientException;

	void delete(final ICallback<? super PrivilegedRoleAssignmentRequest> callback);

	void delete() throws ClientException;

	void patch(final PrivilegedRoleAssignmentRequest sourcePrivilegedRoleAssignmentRequest, final ICallback<? super PrivilegedRoleAssignmentRequest> callback);

	PrivilegedRoleAssignmentRequest patch(final PrivilegedRoleAssignmentRequest sourcePrivilegedRoleAssignmentRequest) throws ClientException;

    IPrivilegedRoleAssignmentRequestWithReferenceRequest select(final String value);

    IPrivilegedRoleAssignmentRequestWithReferenceRequest expand(final String value);

}
