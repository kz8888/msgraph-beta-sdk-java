// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MailboxUsageDetail;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetMailboxUsageDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetMailboxUsageDetailCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetMailboxUsageDetailCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Mailbox Usage Detail Collection Page.
 */
public class ReportRootGetMailboxUsageDetailCollectionPage extends BaseCollectionPage<MailboxUsageDetail, ReportRootGetMailboxUsageDetailCollectionRequestBuilder> {

    /**
     * A collection page for MailboxUsageDetail.
     *
     * @param response The serialized ReportRootGetMailboxUsageDetailCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetMailboxUsageDetailCollectionPage(@Nonnull final ReportRootGetMailboxUsageDetailCollectionResponse response, @Nonnull final ReportRootGetMailboxUsageDetailCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ReportRootGetMailboxUsageDetail
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ReportRootGetMailboxUsageDetailCollectionPage(@Nonnull final java.util.List<MailboxUsageDetail> pageContents, @Nullable final ReportRootGetMailboxUsageDetailCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
