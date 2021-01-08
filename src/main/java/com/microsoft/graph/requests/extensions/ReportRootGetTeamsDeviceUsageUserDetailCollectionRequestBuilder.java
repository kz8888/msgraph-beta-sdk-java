// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsDeviceUsageUserDetail;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.ReportRootGetTeamsDeviceUsageUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsDeviceUsageUserDetailCollectionRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsDeviceUsageUserDetailCollectionResponse;
import com.microsoft.graph.models.extensions.ReportRootGetTeamsDeviceUsageUserDetailParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Teams Device Usage User Detail Collection Request Builder.
 */
public class ReportRootGetTeamsDeviceUsageUserDetailCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<TeamsDeviceUsageUserDetail, ReportRootGetTeamsDeviceUsageUserDetailCollectionRequestBuilder, ReportRootGetTeamsDeviceUsageUserDetailCollectionResponse, ReportRootGetTeamsDeviceUsageUserDetailCollectionPage, ReportRootGetTeamsDeviceUsageUserDetailCollectionRequest> {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ReportRootGetTeamsDeviceUsageUserDetailCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ReportRootGetTeamsDeviceUsageUserDetailParameterSet parameters) {
        super(requestUrl, client, requestOptions, ReportRootGetTeamsDeviceUsageUserDetailCollectionRequestBuilder.class, ReportRootGetTeamsDeviceUsageUserDetailCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ReportRootGetTeamsDeviceUsageUserDetailCollectionRequest instance
     */
    @Override
    @Nonnull
    public ReportRootGetTeamsDeviceUsageUserDetailCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReportRootGetTeamsDeviceUsageUserDetailCollectionRequest request = super.buildRequest(requestOptions);
          for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }
        return request;
    }
}
