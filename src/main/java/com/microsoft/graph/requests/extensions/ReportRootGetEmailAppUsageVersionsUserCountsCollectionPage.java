// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EmailAppUsageVersionsUserCounts;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailAppUsageVersionsUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailAppUsageVersionsUserCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailAppUsageVersionsUserCountsCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Email App Usage Versions User Counts Collection Page.
 */
public class ReportRootGetEmailAppUsageVersionsUserCountsCollectionPage extends BaseCollectionPage<EmailAppUsageVersionsUserCounts, ReportRootGetEmailAppUsageVersionsUserCountsCollectionRequestBuilder> {

    /**
     * A collection page for EmailAppUsageVersionsUserCounts.
     *
     * @param response The serialized ReportRootGetEmailAppUsageVersionsUserCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetEmailAppUsageVersionsUserCountsCollectionPage(@Nonnull final ReportRootGetEmailAppUsageVersionsUserCountsCollectionResponse response, @Nonnull final ReportRootGetEmailAppUsageVersionsUserCountsCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ReportRootGetEmailAppUsageVersionsUserCounts
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ReportRootGetEmailAppUsageVersionsUserCountsCollectionPage(@Nonnull final java.util.List<EmailAppUsageVersionsUserCounts> pageContents, @Nullable final ReportRootGetEmailAppUsageVersionsUserCountsCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
