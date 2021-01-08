// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsScoreHistory;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsScoreHistoryCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsScoreHistoryCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Score History Collection Page.
 */
public class UserExperienceAnalyticsScoreHistoryCollectionPage extends BaseCollectionPage<UserExperienceAnalyticsScoreHistory, UserExperienceAnalyticsScoreHistoryCollectionRequestBuilder> {

    /**
     * A collection page for UserExperienceAnalyticsScoreHistory
     *
     * @param response the serialized UserExperienceAnalyticsScoreHistoryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserExperienceAnalyticsScoreHistoryCollectionPage(@Nonnull final UserExperienceAnalyticsScoreHistoryCollectionResponse response, @Nonnull final UserExperienceAnalyticsScoreHistoryCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for UserExperienceAnalyticsScoreHistory
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UserExperienceAnalyticsScoreHistoryCollectionPage(@Nonnull final java.util.List<UserExperienceAnalyticsScoreHistory> pageContents, @Nullable final UserExperienceAnalyticsScoreHistoryCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
