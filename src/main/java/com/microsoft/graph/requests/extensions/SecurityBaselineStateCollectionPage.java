// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SecurityBaselineState;
import com.microsoft.graph.requests.extensions.SecurityBaselineStateCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.SecurityBaselineStateCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Baseline State Collection Page.
 */
public class SecurityBaselineStateCollectionPage extends BaseCollectionPage<SecurityBaselineState, SecurityBaselineStateCollectionRequestBuilder> {

    /**
     * A collection page for SecurityBaselineState
     *
     * @param response the serialized SecurityBaselineStateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SecurityBaselineStateCollectionPage(@Nonnull final SecurityBaselineStateCollectionResponse response, @Nonnull final SecurityBaselineStateCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for SecurityBaselineState
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public SecurityBaselineStateCollectionPage(@Nonnull final java.util.List<SecurityBaselineState> pageContents, @Nullable final SecurityBaselineStateCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
