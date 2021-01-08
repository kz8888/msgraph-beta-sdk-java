// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UsedInsight;
import com.microsoft.graph.requests.extensions.UsedInsightCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.UsedInsightCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Used Insight Collection Page.
 */
public class UsedInsightCollectionPage extends BaseCollectionPage<UsedInsight, UsedInsightCollectionRequestBuilder> {

    /**
     * A collection page for UsedInsight
     *
     * @param response the serialized UsedInsightCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UsedInsightCollectionPage(@Nonnull final UsedInsightCollectionResponse response, @Nonnull final UsedInsightCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for UsedInsight
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UsedInsightCollectionPage(@Nonnull final java.util.List<UsedInsight> pageContents, @Nullable final UsedInsightCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
