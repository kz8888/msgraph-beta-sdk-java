// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.generated.UserExperienceAnalyticsSummarizedBy;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDevicePerformance;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Device Performance Summarize Device Performance Devices Collection Page.
 */
public class UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionPage extends BaseCollectionPage<UserExperienceAnalyticsDevicePerformance, UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequestBuilder> {

    /**
     * A collection page for UserExperienceAnalyticsDevicePerformance.
     *
     * @param response The serialized UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionPage(@Nonnull final UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionResponse response, @Nonnull final UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevices
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionPage(@Nonnull final java.util.List<UserExperienceAnalyticsDevicePerformance> pageContents, @Nullable final UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
