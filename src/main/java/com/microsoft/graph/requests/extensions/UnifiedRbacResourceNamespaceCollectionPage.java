// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UnifiedRbacResourceNamespace;
import com.microsoft.graph.requests.extensions.UnifiedRbacResourceNamespaceCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.UnifiedRbacResourceNamespaceCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Rbac Resource Namespace Collection Page.
 */
public class UnifiedRbacResourceNamespaceCollectionPage extends BaseCollectionPage<UnifiedRbacResourceNamespace, UnifiedRbacResourceNamespaceCollectionRequestBuilder> {

    /**
     * A collection page for UnifiedRbacResourceNamespace
     *
     * @param response the serialized UnifiedRbacResourceNamespaceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UnifiedRbacResourceNamespaceCollectionPage(@Nonnull final UnifiedRbacResourceNamespaceCollectionResponse response, @Nonnull final UnifiedRbacResourceNamespaceCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for UnifiedRbacResourceNamespace
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UnifiedRbacResourceNamespaceCollectionPage(@Nonnull final java.util.List<UnifiedRbacResourceNamespace> pageContents, @Nullable final UnifiedRbacResourceNamespaceCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
