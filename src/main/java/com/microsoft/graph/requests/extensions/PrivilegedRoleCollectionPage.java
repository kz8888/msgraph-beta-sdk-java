// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrivilegedRole;
import com.microsoft.graph.requests.extensions.PrivilegedRoleCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.PrivilegedRoleCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Collection Page.
 */
public class PrivilegedRoleCollectionPage extends BaseCollectionPage<PrivilegedRole, PrivilegedRoleCollectionRequestBuilder> {

    /**
     * A collection page for PrivilegedRole
     *
     * @param response the serialized PrivilegedRoleCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PrivilegedRoleCollectionPage(@Nonnull final PrivilegedRoleCollectionResponse response, @Nonnull final PrivilegedRoleCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for PrivilegedRole
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PrivilegedRoleCollectionPage(@Nonnull final java.util.List<PrivilegedRole> pageContents, @Nullable final PrivilegedRoleCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
