// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EmailActivityUserDetail;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetEmailActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailActivityUserDetailCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailActivityUserDetailCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Email Activity User Detail Collection Page.
 */
public class ReportRootGetEmailActivityUserDetailCollectionPage extends BaseCollectionPage<EmailActivityUserDetail, IReportRootGetEmailActivityUserDetailCollectionRequestBuilder> implements IReportRootGetEmailActivityUserDetailCollectionPage {

    /**
     * A collection page for EmailActivityUserDetail.
     *
     * @param response The serialized ReportRootGetEmailActivityUserDetailCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetEmailActivityUserDetailCollectionPage(final ReportRootGetEmailActivityUserDetailCollectionResponse response, final IReportRootGetEmailActivityUserDetailCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
