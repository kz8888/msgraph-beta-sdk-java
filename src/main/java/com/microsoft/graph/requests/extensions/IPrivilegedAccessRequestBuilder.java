// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedAccess;
import com.microsoft.graph.requests.extensions.IGovernanceResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleSettingRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Privileged Access Request Builder.
 */
public interface IPrivilegedAccessRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IPrivilegedAccessRequest instance
     */
    IPrivilegedAccessRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IPrivilegedAccessRequest instance
     */
    IPrivilegedAccessRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IGovernanceResourceCollectionRequestBuilder resources();

    IGovernanceResourceRequestBuilder resources(final String id);

    IGovernanceRoleAssignmentRequestCollectionRequestBuilder roleAssignmentRequests();

    IGovernanceRoleAssignmentRequestRequestBuilder roleAssignmentRequests(final String id);

    IGovernanceRoleAssignmentCollectionRequestBuilder roleAssignments();

    IGovernanceRoleAssignmentRequestBuilder roleAssignments(final String id);

    IGovernanceRoleDefinitionCollectionRequestBuilder roleDefinitions();

    IGovernanceRoleDefinitionRequestBuilder roleDefinitions(final String id);

    IGovernanceRoleSettingCollectionRequestBuilder roleSettings();

    IGovernanceRoleSettingRequestBuilder roleSettings(final String id);

}