// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GovernanceRoleDefinition;
import com.microsoft.graph.requests.extensions.GovernanceRoleDefinitionCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.GovernanceRoleDefinitionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Role Definition Collection Page.
 */
public class GovernanceRoleDefinitionCollectionPage extends BaseCollectionPage<GovernanceRoleDefinition, GovernanceRoleDefinitionCollectionRequestBuilder> {

    /**
     * A collection page for GovernanceRoleDefinition
     *
     * @param response the serialized GovernanceRoleDefinitionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GovernanceRoleDefinitionCollectionPage(@Nonnull final GovernanceRoleDefinitionCollectionResponse response, @Nonnull final GovernanceRoleDefinitionCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for GovernanceRoleDefinition
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public GovernanceRoleDefinitionCollectionPage(@Nonnull final java.util.List<GovernanceRoleDefinition> pageContents, @Nullable final GovernanceRoleDefinitionCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
