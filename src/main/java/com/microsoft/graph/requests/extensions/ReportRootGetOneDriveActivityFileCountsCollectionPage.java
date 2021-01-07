// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SiteActivitySummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveActivityFileCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveActivityFileCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveActivityFileCountsCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get One Drive Activity File Counts Collection Page.
 */
public class ReportRootGetOneDriveActivityFileCountsCollectionPage extends BaseCollectionPage<SiteActivitySummary, ReportRootGetOneDriveActivityFileCountsCollectionRequestBuilder> {

    /**
     * A collection page for SiteActivitySummary.
     *
     * @param response The serialized ReportRootGetOneDriveActivityFileCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetOneDriveActivityFileCountsCollectionPage(@Nonnull final ReportRootGetOneDriveActivityFileCountsCollectionResponse response, @Nonnull final ReportRootGetOneDriveActivityFileCountsCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ReportRootGetOneDriveActivityFileCounts
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ReportRootGetOneDriveActivityFileCountsCollectionPage(@Nonnull final java.util.List<SiteActivitySummary> pageContents, @Nullable final ReportRootGetOneDriveActivityFileCountsCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
