// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SkypeForBusinessParticipantActivityUserCounts;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessParticipantActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessParticipantActivityUserCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessParticipantActivityUserCountsCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Skype For Business Participant Activity User Counts Collection Page.
 */
public class ReportRootGetSkypeForBusinessParticipantActivityUserCountsCollectionPage extends BaseCollectionPage<SkypeForBusinessParticipantActivityUserCounts, ReportRootGetSkypeForBusinessParticipantActivityUserCountsCollectionRequestBuilder> {

    /**
     * A collection page for SkypeForBusinessParticipantActivityUserCounts.
     *
     * @param response The serialized ReportRootGetSkypeForBusinessParticipantActivityUserCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetSkypeForBusinessParticipantActivityUserCountsCollectionPage(@Nonnull final ReportRootGetSkypeForBusinessParticipantActivityUserCountsCollectionResponse response, @Nonnull final ReportRootGetSkypeForBusinessParticipantActivityUserCountsCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ReportRootGetSkypeForBusinessParticipantActivityUserCounts
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ReportRootGetSkypeForBusinessParticipantActivityUserCountsCollectionPage(@Nonnull final java.util.List<SkypeForBusinessParticipantActivityUserCounts> pageContents, @Nullable final ReportRootGetSkypeForBusinessParticipantActivityUserCountsCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
