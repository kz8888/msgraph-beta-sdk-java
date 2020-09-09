// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GovernanceResource;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceResourceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Resource Request Builder.
 */
public class GovernanceResourceRequestBuilder extends BaseRequestBuilder implements IGovernanceResourceRequestBuilder {

    /**
     * The request builder for the GovernanceResource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GovernanceResourceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IGovernanceResourceRequest instance
     */
    public IGovernanceResourceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IGovernanceResourceRequest instance
     */
    public IGovernanceResourceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.GovernanceResourceRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for GovernanceResource
     *
     * @return the IGovernanceResourceRequestBuilder instance
     */
    public IGovernanceResourceRequestBuilder parent() {
        return new GovernanceResourceRequestBuilder(getRequestUrlWithAdditionalSegment("parent"), getClient(), null);
    }
    public IGovernanceRoleAssignmentRequestCollectionRequestBuilder roleAssignmentRequests() {
        return new GovernanceRoleAssignmentRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("roleAssignmentRequests"), getClient(), null);
    }

    public IGovernanceRoleAssignmentRequestRequestBuilder roleAssignmentRequests(final String id) {
        return new GovernanceRoleAssignmentRequestRequestBuilder(getRequestUrlWithAdditionalSegment("roleAssignmentRequests") + "/" + id, getClient(), null);
    }
    public IGovernanceRoleAssignmentCollectionRequestBuilder roleAssignments() {
        return new GovernanceRoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("roleAssignments"), getClient(), null);
    }

    public IGovernanceRoleAssignmentRequestBuilder roleAssignments(final String id) {
        return new GovernanceRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("roleAssignments") + "/" + id, getClient(), null);
    }
    public IGovernanceRoleDefinitionCollectionRequestBuilder roleDefinitions() {
        return new GovernanceRoleDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("roleDefinitions"), getClient(), null);
    }

    public IGovernanceRoleDefinitionRequestBuilder roleDefinitions(final String id) {
        return new GovernanceRoleDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("roleDefinitions") + "/" + id, getClient(), null);
    }
    public IGovernanceRoleSettingCollectionRequestBuilder roleSettings() {
        return new GovernanceRoleSettingCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("roleSettings"), getClient(), null);
    }

    public IGovernanceRoleSettingRequestBuilder roleSettings(final String id) {
        return new GovernanceRoleSettingRequestBuilder(getRequestUrlWithAdditionalSegment("roleSettings") + "/" + id, getClient(), null);
    }
}
