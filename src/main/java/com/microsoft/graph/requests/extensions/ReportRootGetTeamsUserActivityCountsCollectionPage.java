// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsUserActivityCounts;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetTeamsUserActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsUserActivityCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsUserActivityCountsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Teams User Activity Counts Collection Page.
 */
public class ReportRootGetTeamsUserActivityCountsCollectionPage extends BaseCollectionPage<TeamsUserActivityCounts, IReportRootGetTeamsUserActivityCountsCollectionRequestBuilder> implements IReportRootGetTeamsUserActivityCountsCollectionPage {

    /**
     * A collection page for TeamsUserActivityCounts.
     *
     * @param response The serialized ReportRootGetTeamsUserActivityCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetTeamsUserActivityCountsCollectionPage(final ReportRootGetTeamsUserActivityCountsCollectionResponse response, final IReportRootGetTeamsUserActivityCountsCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
