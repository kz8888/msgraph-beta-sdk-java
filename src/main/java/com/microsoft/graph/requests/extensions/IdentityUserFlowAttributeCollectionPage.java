// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IdentityUserFlowAttribute;
import com.microsoft.graph.requests.extensions.IdentityUserFlowAttributeCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.IdentityUserFlowAttributeCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity User Flow Attribute Collection Page.
 */
public class IdentityUserFlowAttributeCollectionPage extends BaseCollectionPage<IdentityUserFlowAttribute, IdentityUserFlowAttributeCollectionRequestBuilder> {

    /**
     * A collection page for IdentityUserFlowAttribute
     *
     * @param response the serialized IdentityUserFlowAttributeCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public IdentityUserFlowAttributeCollectionPage(@Nonnull final IdentityUserFlowAttributeCollectionResponse response, @Nonnull final IdentityUserFlowAttributeCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for IdentityUserFlowAttribute
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public IdentityUserFlowAttributeCollectionPage(@Nonnull final java.util.List<IdentityUserFlowAttribute> pageContents, @Nullable final IdentityUserFlowAttributeCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
