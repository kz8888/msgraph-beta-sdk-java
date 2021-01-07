// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IdentityUserFlowAttributeAssignment;
import com.microsoft.graph.requests.extensions.IdentityUserFlowAttributeAssignmentCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.IdentityUserFlowAttributeAssignmentCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity User Flow Attribute Assignment Collection Page.
 */
public class IdentityUserFlowAttributeAssignmentCollectionPage extends BaseCollectionPage<IdentityUserFlowAttributeAssignment, IdentityUserFlowAttributeAssignmentCollectionRequestBuilder> {

    /**
     * A collection page for IdentityUserFlowAttributeAssignment
     *
     * @param response the serialized IdentityUserFlowAttributeAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public IdentityUserFlowAttributeAssignmentCollectionPage(@Nonnull final IdentityUserFlowAttributeAssignmentCollectionResponse response, @Nonnull final IdentityUserFlowAttributeAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for IdentityUserFlowAttributeAssignment
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public IdentityUserFlowAttributeAssignmentCollectionPage(@Nonnull final java.util.List<IdentityUserFlowAttributeAssignment> pageContents, @Nullable final IdentityUserFlowAttributeAssignmentCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
