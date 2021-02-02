// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsResourcePerformance;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsResourcePerformanceCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsResourcePerformanceCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsResourcePerformanceCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Resource Performance Collection Page.
 */
public class UserExperienceAnalyticsResourcePerformanceCollectionPage extends BaseCollectionPage<UserExperienceAnalyticsResourcePerformance, IUserExperienceAnalyticsResourcePerformanceCollectionRequestBuilder> implements IUserExperienceAnalyticsResourcePerformanceCollectionPage {

    /**
     * A collection page for UserExperienceAnalyticsResourcePerformance
     *
     * @param response the serialized UserExperienceAnalyticsResourcePerformanceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserExperienceAnalyticsResourcePerformanceCollectionPage(final UserExperienceAnalyticsResourcePerformanceCollectionResponse response, final IUserExperienceAnalyticsResourcePerformanceCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
