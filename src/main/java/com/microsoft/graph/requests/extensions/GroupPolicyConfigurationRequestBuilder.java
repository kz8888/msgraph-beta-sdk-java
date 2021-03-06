// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyConfiguration;
import com.microsoft.graph.models.extensions.GroupPolicyConfigurationAssignment;
import com.microsoft.graph.models.extensions.GroupPolicyDefinitionValue;
import com.microsoft.graph.requests.extensions.IGroupPolicyConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionValueCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionValueRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionValueCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionValueRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Configuration Request Builder.
 */
public class GroupPolicyConfigurationRequestBuilder extends BaseRequestBuilder implements IGroupPolicyConfigurationRequestBuilder {

    /**
     * The request builder for the GroupPolicyConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyConfigurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IGroupPolicyConfigurationRequest instance
     */
    public IGroupPolicyConfigurationRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IGroupPolicyConfigurationRequest instance
     */
    public IGroupPolicyConfigurationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.GroupPolicyConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IGroupPolicyConfigurationAssignmentCollectionRequestBuilder assignments() {
        return new GroupPolicyConfigurationAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IGroupPolicyConfigurationAssignmentRequestBuilder assignments(final String id) {
        return new GroupPolicyConfigurationAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    public IGroupPolicyDefinitionValueCollectionRequestBuilder definitionValues() {
        return new GroupPolicyDefinitionValueCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("definitionValues"), getClient(), null);
    }

    public IGroupPolicyDefinitionValueRequestBuilder definitionValues(final String id) {
        return new GroupPolicyDefinitionValueRequestBuilder(getRequestUrlWithAdditionalSegment("definitionValues") + "/" + id, getClient(), null);
    }

    public IGroupPolicyConfigurationAssignCollectionRequestBuilder assign(final java.util.List<GroupPolicyConfigurationAssignment> assignments) {
        return new GroupPolicyConfigurationAssignCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, assignments);
    }

    public IGroupPolicyConfigurationUpdateDefinitionValuesRequestBuilder updateDefinitionValues(final java.util.List<GroupPolicyDefinitionValue> added, final java.util.List<GroupPolicyDefinitionValue> updated, final java.util.List<String> deletedIds) {
        return new GroupPolicyConfigurationUpdateDefinitionValuesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.updateDefinitionValues"), getClient(), null, added, updated, deletedIds);
    }
}
