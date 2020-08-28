// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetUserPrintUsageSummaryRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetUserPrintUsageSummaryRequest;
import com.microsoft.graph.models.extensions.UserPrintUsageSummary;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get User Print Usage Summary Request Builder.
 */
public class ReportRootGetUserPrintUsageSummaryRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetUserPrintUsageSummaryRequestBuilder {

    /**
     * The request builder for this ReportRootGetUserPrintUsageSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param userId the userId
     * @param periodStart the periodStart
     * @param periodEnd the periodEnd
     */
    public ReportRootGetUserPrintUsageSummaryRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String userId, final java.util.Calendar periodStart, final java.util.Calendar periodEnd) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("userId", userId));
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("periodStart", periodStart));
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("periodEnd", periodEnd));
    }

    /**
     * Creates the IReportRootGetUserPrintUsageSummaryRequest
     *
     * @return the IReportRootGetUserPrintUsageSummaryRequest instance
     */
    public IReportRootGetUserPrintUsageSummaryRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetUserPrintUsageSummaryRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetUserPrintUsageSummaryRequest instance
     */
    public IReportRootGetUserPrintUsageSummaryRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootGetUserPrintUsageSummaryRequest request = new ReportRootGetUserPrintUsageSummaryRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}