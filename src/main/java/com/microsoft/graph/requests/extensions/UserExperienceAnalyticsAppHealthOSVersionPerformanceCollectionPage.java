// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthOSVersionPerformance;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics App Health OSVersion Performance Collection Page.
 */
public class UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionPage extends BaseCollectionPage<UserExperienceAnalyticsAppHealthOSVersionPerformance, UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionRequestBuilder> {

    /**
     * A collection page for UserExperienceAnalyticsAppHealthOSVersionPerformance
     *
     * @param response the serialized UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionPage(@Nonnull final UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionResponse response, @Nonnull final UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for UserExperienceAnalyticsAppHealthOSVersionPerformance
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionPage(@Nonnull final java.util.List<UserExperienceAnalyticsAppHealthOSVersionPerformance> pageContents, @Nullable final UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
