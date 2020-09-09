// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GovernanceRoleAssignment;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceSubjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Governance Role Assignment With Reference Request Builder.
 */
public interface IGovernanceRoleAssignmentWithReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @return the IGovernanceRoleAssignmentWithReferenceRequest instance
     */
    IGovernanceRoleAssignmentWithReferenceRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IGovernanceRoleAssignmentWithReferenceRequest instance
     */
    IGovernanceRoleAssignmentWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IGovernanceRoleAssignmentReferenceRequestBuilder reference();

}
