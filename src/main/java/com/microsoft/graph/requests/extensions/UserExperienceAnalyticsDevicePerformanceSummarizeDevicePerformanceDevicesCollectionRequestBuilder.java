// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.generated.UserExperienceAnalyticsSummarizedBy;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDevicePerformance;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequest;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionResponse;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Device Performance Summarize Device Performance Devices Collection Request Builder.
 */
public class UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<UserExperienceAnalyticsDevicePerformance, UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequestBuilder, UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionResponse, UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionPage, UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequest> {

    /**
     * The request builder for this collection of UserExperienceAnalyticsDevicePerformance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesParameterSet parameters) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequestBuilder.class, UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequest instance
     */
    @Override
    @Nonnull
    public UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequest request = super.buildRequest(requestOptions);
          for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }
        return request;
    }
}
