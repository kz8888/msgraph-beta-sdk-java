// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SharePointSiteUsageFileCounts;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsageFileCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsageFileCountsCollectionRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsageFileCountsCollectionResponse;
import com.microsoft.graph.models.extensions.ReportRootGetSharePointSiteUsageFileCountsParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Share Point Site Usage File Counts Collection Request Builder.
 */
public class ReportRootGetSharePointSiteUsageFileCountsCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<SharePointSiteUsageFileCounts, ReportRootGetSharePointSiteUsageFileCountsCollectionRequestBuilder, ReportRootGetSharePointSiteUsageFileCountsCollectionResponse, ReportRootGetSharePointSiteUsageFileCountsCollectionPage, ReportRootGetSharePointSiteUsageFileCountsCollectionRequest> {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ReportRootGetSharePointSiteUsageFileCountsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ReportRootGetSharePointSiteUsageFileCountsParameterSet parameters) {
        super(requestUrl, client, requestOptions, ReportRootGetSharePointSiteUsageFileCountsCollectionRequestBuilder.class, ReportRootGetSharePointSiteUsageFileCountsCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ReportRootGetSharePointSiteUsageFileCountsCollectionRequest instance
     */
    @Override
    @Nonnull
    public ReportRootGetSharePointSiteUsageFileCountsCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReportRootGetSharePointSiteUsageFileCountsCollectionRequest request = super.buildRequest(requestOptions);
          for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }
        return request;
    }
}
