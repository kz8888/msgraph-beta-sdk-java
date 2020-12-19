// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ArchivedPrintJob;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetUserArchivedPrintJobsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetUserArchivedPrintJobsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetUserArchivedPrintJobsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get User Archived Print Jobs Collection Page.
 */
public class ReportRootGetUserArchivedPrintJobsCollectionPage extends BaseCollectionPage<ArchivedPrintJob, IReportRootGetUserArchivedPrintJobsCollectionRequestBuilder> implements IReportRootGetUserArchivedPrintJobsCollectionPage {

    /**
     * A collection page for ArchivedPrintJob.
     *
     * @param response The serialized ReportRootGetUserArchivedPrintJobsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetUserArchivedPrintJobsCollectionPage(final ReportRootGetUserArchivedPrintJobsCollectionResponse response, final IReportRootGetUserArchivedPrintJobsCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
