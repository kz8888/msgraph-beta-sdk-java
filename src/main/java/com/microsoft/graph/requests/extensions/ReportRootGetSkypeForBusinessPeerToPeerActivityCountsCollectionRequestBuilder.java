// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SkypeForBusinessPeerToPeerActivityCounts;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionResponse;
import com.microsoft.graph.models.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityCountsParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Skype For Business Peer To Peer Activity Counts Collection Request Builder.
 */
public class ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<SkypeForBusinessPeerToPeerActivityCounts, ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequestBuilder, ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionResponse, ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionPage, ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequest> {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ReportRootGetSkypeForBusinessPeerToPeerActivityCountsParameterSet parameters) {
        super(requestUrl, client, requestOptions, ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequestBuilder.class, ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequest instance
     */
    @Override
    @Nonnull
    public ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequest request = super.buildRequest(requestOptions);
          for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }
        return request;
    }
}
