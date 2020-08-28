// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GovernanceRoleAssignment;
import com.microsoft.graph.requests.extensions.IGovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceSubjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.GovernanceRoleAssignment;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Governance Role Assignment Reference Request.
 */
public interface IGovernanceRoleAssignmentReferenceRequest extends IHttpRequest {

    void delete(final ICallback<GovernanceRoleAssignment> callback);

    GovernanceRoleAssignment delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGovernanceRoleAssignmentReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGovernanceRoleAssignmentReferenceRequest expand(final String value);

    /**
     * Puts the GovernanceRoleAssignment
     *
     * @param srcGovernanceRoleAssignment the GovernanceRoleAssignment to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(GovernanceRoleAssignment srcGovernanceRoleAssignment, final ICallback<GovernanceRoleAssignment> callback);

    /**
     * Puts the GovernanceRoleAssignment
     *
     * @param srcGovernanceRoleAssignment the GovernanceRoleAssignment to PUT
     * @return the GovernanceRoleAssignment
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    GovernanceRoleAssignment put(GovernanceRoleAssignment srcGovernanceRoleAssignment) throws ClientException;
}