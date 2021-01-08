// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UnifiedRoleAssignment;
import com.microsoft.graph.requests.extensions.UnifiedRoleAssignmentCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.UnifiedRoleAssignmentCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Collection Page.
 */
public class UnifiedRoleAssignmentCollectionPage extends BaseCollectionPage<UnifiedRoleAssignment, UnifiedRoleAssignmentCollectionRequestBuilder> {

    /**
     * A collection page for UnifiedRoleAssignment
     *
     * @param response the serialized UnifiedRoleAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UnifiedRoleAssignmentCollectionPage(@Nonnull final UnifiedRoleAssignmentCollectionResponse response, @Nonnull final UnifiedRoleAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for UnifiedRoleAssignment
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UnifiedRoleAssignmentCollectionPage(@Nonnull final java.util.List<UnifiedRoleAssignment> pageContents, @Nullable final UnifiedRoleAssignmentCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
