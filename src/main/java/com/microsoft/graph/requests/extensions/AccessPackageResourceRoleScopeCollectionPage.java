// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AccessPackageResourceRoleScope;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleScopeCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleScopeCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource Role Scope Collection Page.
 */
public class AccessPackageResourceRoleScopeCollectionPage extends BaseCollectionPage<AccessPackageResourceRoleScope, AccessPackageResourceRoleScopeCollectionRequestBuilder> {

    /**
     * A collection page for AccessPackageResourceRoleScope
     *
     * @param response the serialized AccessPackageResourceRoleScopeCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AccessPackageResourceRoleScopeCollectionPage(@Nonnull final AccessPackageResourceRoleScopeCollectionResponse response, @Nonnull final AccessPackageResourceRoleScopeCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AccessPackageResourceRoleScope
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AccessPackageResourceRoleScopeCollectionPage(@Nonnull final java.util.List<AccessPackageResourceRoleScope> pageContents, @Nullable final AccessPackageResourceRoleScopeCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
