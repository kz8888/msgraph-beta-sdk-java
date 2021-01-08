// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Office365ActivationsUserDetail;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationsUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationsUserDetailCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationsUserDetailCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Activations User Detail Collection Page.
 */
public class ReportRootGetOffice365ActivationsUserDetailCollectionPage extends BaseCollectionPage<Office365ActivationsUserDetail, ReportRootGetOffice365ActivationsUserDetailCollectionRequestBuilder> {

    /**
     * A collection page for Office365ActivationsUserDetail.
     *
     * @param response The serialized ReportRootGetOffice365ActivationsUserDetailCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetOffice365ActivationsUserDetailCollectionPage(@Nonnull final ReportRootGetOffice365ActivationsUserDetailCollectionResponse response, @Nonnull final ReportRootGetOffice365ActivationsUserDetailCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ReportRootGetOffice365ActivationsUserDetail
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ReportRootGetOffice365ActivationsUserDetailCollectionPage(@Nonnull final java.util.List<Office365ActivationsUserDetail> pageContents, @Nullable final ReportRootGetOffice365ActivationsUserDetailCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
