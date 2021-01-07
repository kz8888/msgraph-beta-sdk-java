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
import com.microsoft.graph.requests.extensions.GroupPolicyConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionValueCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionValueRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.extensions.GroupPolicyConfigurationAssignParameterSet;
import com.microsoft.graph.models.extensions.GroupPolicyConfigurationUpdateDefinitionValuesParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Configuration Request Builder.
 */
public class GroupPolicyConfigurationRequestBuilder extends BaseRequestBuilder<GroupPolicyConfiguration> {

    /**
     * The request builder for the GroupPolicyConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyConfigurationRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the GroupPolicyConfigurationRequest instance
     */
    @Nonnull
    public GroupPolicyConfigurationRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the GroupPolicyConfigurationRequest instance
     */
    @Nonnull
    public GroupPolicyConfigurationRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.GroupPolicyConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the GroupPolicyConfigurationAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public GroupPolicyConfigurationAssignmentCollectionRequestBuilder assignments() {
        return new GroupPolicyConfigurationAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the GroupPolicyConfigurationAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public GroupPolicyConfigurationAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new GroupPolicyConfigurationAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the GroupPolicyDefinitionValue collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public GroupPolicyDefinitionValueCollectionRequestBuilder definitionValues() {
        return new GroupPolicyDefinitionValueCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("definitionValues"), getClient(), null);
    }

    /**
     * Gets a request builder for the GroupPolicyDefinitionValue item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public GroupPolicyDefinitionValueRequestBuilder definitionValues(@Nonnull final String id) {
        return new GroupPolicyDefinitionValueRequestBuilder(getRequestUrlWithAdditionalSegment("definitionValues") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public GroupPolicyConfigurationAssignCollectionRequestBuilder assign(@Nonnull final GroupPolicyConfigurationAssignParameterSet parameters) {
        return new GroupPolicyConfigurationAssignCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public GroupPolicyConfigurationUpdateDefinitionValuesRequestBuilder updateDefinitionValues(@Nonnull final GroupPolicyConfigurationUpdateDefinitionValuesParameterSet parameters) {
        return new GroupPolicyConfigurationUpdateDefinitionValuesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.updateDefinitionValues"), getClient(), null, parameters);
    }
}
