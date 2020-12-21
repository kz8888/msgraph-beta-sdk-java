// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics App Health App Performance By App Version Collection Page.
 */
public class UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionPage extends BaseCollectionPage<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion, IUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionRequestBuilder> implements IUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionPage {

    /**
     * A collection page for UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion
     *
     * @param response the serialized UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionPage(final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionResponse response, final IUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
