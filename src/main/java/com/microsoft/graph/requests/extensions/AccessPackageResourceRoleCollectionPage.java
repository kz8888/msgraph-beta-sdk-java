// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AccessPackageResourceRole;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource Role Collection Page.
 */
public class AccessPackageResourceRoleCollectionPage extends BaseCollectionPage<AccessPackageResourceRole, AccessPackageResourceRoleCollectionRequestBuilder> {

    /**
     * A collection page for AccessPackageResourceRole
     *
     * @param response the serialized AccessPackageResourceRoleCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AccessPackageResourceRoleCollectionPage(@Nonnull final AccessPackageResourceRoleCollectionResponse response, @Nonnull final AccessPackageResourceRoleCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AccessPackageResourceRole
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AccessPackageResourceRoleCollectionPage(@Nonnull final java.util.List<AccessPackageResourceRole> pageContents, @Nullable final AccessPackageResourceRoleCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
