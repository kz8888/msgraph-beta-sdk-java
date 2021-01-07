// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AccessReviewReviewer;
import com.microsoft.graph.requests.extensions.AccessReviewReviewerCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.AccessReviewReviewerCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Reviewer Collection Page.
 */
public class AccessReviewReviewerCollectionPage extends BaseCollectionPage<AccessReviewReviewer, AccessReviewReviewerCollectionRequestBuilder> {

    /**
     * A collection page for AccessReviewReviewer
     *
     * @param response the serialized AccessReviewReviewerCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AccessReviewReviewerCollectionPage(@Nonnull final AccessReviewReviewerCollectionResponse response, @Nonnull final AccessReviewReviewerCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AccessReviewReviewer
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AccessReviewReviewerCollectionPage(@Nonnull final java.util.List<AccessReviewReviewer> pageContents, @Nullable final AccessReviewReviewerCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
