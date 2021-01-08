// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPrintUsageSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.ReportRootGetPrintUsageSummariesByGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetPrintUsageSummariesByGroupCollectionRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetPrintUsageSummariesByGroupCollectionResponse;
import com.microsoft.graph.models.extensions.ReportRootGetPrintUsageSummariesByGroupParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Print Usage Summaries By Group Collection Request Builder.
 */
public class ReportRootGetPrintUsageSummariesByGroupCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<GroupPrintUsageSummary, ReportRootGetPrintUsageSummariesByGroupCollectionRequestBuilder, ReportRootGetPrintUsageSummariesByGroupCollectionResponse, ReportRootGetPrintUsageSummariesByGroupCollectionPage, ReportRootGetPrintUsageSummariesByGroupCollectionRequest> {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ReportRootGetPrintUsageSummariesByGroupCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ReportRootGetPrintUsageSummariesByGroupParameterSet parameters) {
        super(requestUrl, client, requestOptions, ReportRootGetPrintUsageSummariesByGroupCollectionRequestBuilder.class, ReportRootGetPrintUsageSummariesByGroupCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ReportRootGetPrintUsageSummariesByGroupCollectionRequest instance
     */
    @Override
    @Nonnull
    public ReportRootGetPrintUsageSummariesByGroupCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReportRootGetPrintUsageSummariesByGroupCollectionRequest request = super.buildRequest(requestOptions);
          for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }
        return request;
    }
}
