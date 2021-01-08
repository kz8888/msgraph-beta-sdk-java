// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Office365ActivationsUserCounts;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationsUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationsUserCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationsUserCountsCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Activations User Counts Collection Page.
 */
public class ReportRootGetOffice365ActivationsUserCountsCollectionPage extends BaseCollectionPage<Office365ActivationsUserCounts, ReportRootGetOffice365ActivationsUserCountsCollectionRequestBuilder> {

    /**
     * A collection page for Office365ActivationsUserCounts.
     *
     * @param response The serialized ReportRootGetOffice365ActivationsUserCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetOffice365ActivationsUserCountsCollectionPage(@Nonnull final ReportRootGetOffice365ActivationsUserCountsCollectionResponse response, @Nonnull final ReportRootGetOffice365ActivationsUserCountsCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ReportRootGetOffice365ActivationsUserCounts
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ReportRootGetOffice365ActivationsUserCountsCollectionPage(@Nonnull final java.util.List<Office365ActivationsUserCounts> pageContents, @Nullable final ReportRootGetOffice365ActivationsUserCountsCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
