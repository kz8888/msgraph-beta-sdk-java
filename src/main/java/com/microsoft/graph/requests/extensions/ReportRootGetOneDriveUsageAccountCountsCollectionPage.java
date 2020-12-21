// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OneDriveUsageAccountCounts;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageAccountCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveUsageAccountCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveUsageAccountCountsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get One Drive Usage Account Counts Collection Page.
 */
public class ReportRootGetOneDriveUsageAccountCountsCollectionPage extends BaseCollectionPage<OneDriveUsageAccountCounts, IReportRootGetOneDriveUsageAccountCountsCollectionRequestBuilder> implements IReportRootGetOneDriveUsageAccountCountsCollectionPage {

    /**
     * A collection page for OneDriveUsageAccountCounts.
     *
     * @param response The serialized ReportRootGetOneDriveUsageAccountCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetOneDriveUsageAccountCountsCollectionPage(final ReportRootGetOneDriveUsageAccountCountsCollectionResponse response, final IReportRootGetOneDriveUsageAccountCountsCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
