// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthDevicePerformanceDetails;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics App Health Device Performance Details Collection Page.
 */
public class UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionPage extends BaseCollectionPage<UserExperienceAnalyticsAppHealthDevicePerformanceDetails, UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionRequestBuilder> {

    /**
     * A collection page for UserExperienceAnalyticsAppHealthDevicePerformanceDetails
     *
     * @param response the serialized UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionPage(@Nonnull final UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionResponse response, @Nonnull final UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for UserExperienceAnalyticsAppHealthDevicePerformanceDetails
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionPage(@Nonnull final java.util.List<UserExperienceAnalyticsAppHealthDevicePerformanceDetails> pageContents, @Nullable final UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
