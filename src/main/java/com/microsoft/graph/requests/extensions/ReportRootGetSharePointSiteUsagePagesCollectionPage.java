// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SharePointSiteUsagePages;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsagePagesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsagePagesCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsagePagesCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Share Point Site Usage Pages Collection Page.
 */
public class ReportRootGetSharePointSiteUsagePagesCollectionPage extends BaseCollectionPage<SharePointSiteUsagePages, ReportRootGetSharePointSiteUsagePagesCollectionRequestBuilder> {

    /**
     * A collection page for SharePointSiteUsagePages.
     *
     * @param response The serialized ReportRootGetSharePointSiteUsagePagesCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetSharePointSiteUsagePagesCollectionPage(@Nonnull final ReportRootGetSharePointSiteUsagePagesCollectionResponse response, @Nonnull final ReportRootGetSharePointSiteUsagePagesCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ReportRootGetSharePointSiteUsagePages
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ReportRootGetSharePointSiteUsagePagesCollectionPage(@Nonnull final java.util.List<SharePointSiteUsagePages> pageContents, @Nullable final ReportRootGetSharePointSiteUsagePagesCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
