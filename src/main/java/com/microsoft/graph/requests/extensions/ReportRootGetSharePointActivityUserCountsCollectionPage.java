// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SharePointActivityUserCounts;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetSharePointActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointActivityUserCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointActivityUserCountsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Share Point Activity User Counts Collection Page.
 */
public class ReportRootGetSharePointActivityUserCountsCollectionPage extends BaseCollectionPage<SharePointActivityUserCounts, IReportRootGetSharePointActivityUserCountsCollectionRequestBuilder> implements IReportRootGetSharePointActivityUserCountsCollectionPage {

    /**
     * A collection page for SharePointActivityUserCounts.
     *
     * @param response The serialized ReportRootGetSharePointActivityUserCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetSharePointActivityUserCountsCollectionPage(final ReportRootGetSharePointActivityUserCountsCollectionResponse response, final IReportRootGetSharePointActivityUserCountsCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
