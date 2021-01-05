// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ReviewSet;
import com.microsoft.graph.requests.extensions.IReviewSetCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ReviewSetCollectionPage;
import com.microsoft.graph.requests.extensions.ReviewSetCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Review Set Collection Page.
 */
public class ReviewSetCollectionPage extends BaseCollectionPage<ReviewSet, IReviewSetCollectionRequestBuilder> implements IReviewSetCollectionPage {

    /**
     * A collection page for ReviewSet
     *
     * @param response the serialized ReviewSetCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ReviewSetCollectionPage(final ReviewSetCollectionResponse response, final IReviewSetCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
