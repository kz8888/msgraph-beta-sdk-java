// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsRegressionSummary;
import com.microsoft.graph.models.generated.UserExperienceAnalyticsSummarizedBy;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsMetricCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsMetricRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsMetricCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsMetricRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Regression Summary Request Builder.
 */
public class UserExperienceAnalyticsRegressionSummaryRequestBuilder extends BaseRequestBuilder implements IUserExperienceAnalyticsRegressionSummaryRequestBuilder {

    /**
     * The request builder for the UserExperienceAnalyticsRegressionSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsRegressionSummaryRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserExperienceAnalyticsRegressionSummaryRequest instance
     */
    public IUserExperienceAnalyticsRegressionSummaryRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IUserExperienceAnalyticsRegressionSummaryRequest instance
     */
    public IUserExperienceAnalyticsRegressionSummaryRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.UserExperienceAnalyticsRegressionSummaryRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IUserExperienceAnalyticsMetricCollectionRequestBuilder manufacturerRegression() {
        return new UserExperienceAnalyticsMetricCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("manufacturerRegression"), getClient(), null);
    }

    public IUserExperienceAnalyticsMetricRequestBuilder manufacturerRegression(final String id) {
        return new UserExperienceAnalyticsMetricRequestBuilder(getRequestUrlWithAdditionalSegment("manufacturerRegression") + "/" + id, getClient(), null);
    }
    public IUserExperienceAnalyticsMetricCollectionRequestBuilder modelRegression() {
        return new UserExperienceAnalyticsMetricCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("modelRegression"), getClient(), null);
    }

    public IUserExperienceAnalyticsMetricRequestBuilder modelRegression(final String id) {
        return new UserExperienceAnalyticsMetricRequestBuilder(getRequestUrlWithAdditionalSegment("modelRegression") + "/" + id, getClient(), null);
    }
    public IUserExperienceAnalyticsMetricCollectionRequestBuilder operatingSystemRegression() {
        return new UserExperienceAnalyticsMetricCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("operatingSystemRegression"), getClient(), null);
    }

    public IUserExperienceAnalyticsMetricRequestBuilder operatingSystemRegression(final String id) {
        return new UserExperienceAnalyticsMetricRequestBuilder(getRequestUrlWithAdditionalSegment("operatingSystemRegression") + "/" + id, getClient(), null);
    }

    public IUserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceRequestBuilder summarizeDeviceRegressionPerformance(final UserExperienceAnalyticsSummarizedBy summarizeBy) {
        return new UserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.summarizeDeviceRegressionPerformance"), getClient(), null, summarizeBy);
    }
}
