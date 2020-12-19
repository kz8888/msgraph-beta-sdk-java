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

import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveActivityFileCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveActivityFileCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveActivityFileCountsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get One Drive Activity File Counts Collection Page.
 */
public class ReportRootGetOneDriveActivityFileCountsCollectionPage extends BaseCollectionPage<SiteActivitySummary, IReportRootGetOneDriveActivityFileCountsCollectionRequestBuilder> implements IReportRootGetOneDriveActivityFileCountsCollectionPage {

    /**
     * A collection page for SiteActivitySummary.
     *
     * @param response The serialized ReportRootGetOneDriveActivityFileCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetOneDriveActivityFileCountsCollectionPage(final ReportRootGetOneDriveActivityFileCountsCollectionResponse response, final IReportRootGetOneDriveActivityFileCountsCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
