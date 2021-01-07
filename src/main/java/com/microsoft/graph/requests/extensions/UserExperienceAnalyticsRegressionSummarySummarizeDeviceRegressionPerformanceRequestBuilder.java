// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceRequest;
import com.microsoft.graph.models.generated.UserExperienceAnalyticsSummarizedBy;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsRegressionSummary;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Regression Summary Summarize Device Regression Performance Request Builder.
 */
public class UserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceRequestBuilder extends BaseFunctionRequestBuilder<UserExperienceAnalyticsRegressionSummary> {

    /**
     * The request builder for this UserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public UserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final UserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }

    /**
     * Creates the UserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceRequest
     *
     * @param requestOptions the options for the request
     * @return the UserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceRequest instance
     */
    @Nonnull
    public UserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the UserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the UserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceRequest instance
     */
    @Nonnull
    public UserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        UserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceRequest request = new UserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

            for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
        }
        return request;
    }
    /**
     *  Gets a request builder for the UserExperienceAnalyticsMetric collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserExperienceAnalyticsMetricCollectionRequestBuilder manufacturerRegression() {
        return new UserExperienceAnalyticsMetricCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("manufacturerRegression"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserExperienceAnalyticsMetric item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserExperienceAnalyticsMetricRequestBuilder manufacturerRegression(@Nonnull final String id) {
        return new UserExperienceAnalyticsMetricRequestBuilder(getRequestUrlWithAdditionalSegment("manufacturerRegression") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UserExperienceAnalyticsMetric collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserExperienceAnalyticsMetricCollectionRequestBuilder modelRegression() {
        return new UserExperienceAnalyticsMetricCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("modelRegression"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserExperienceAnalyticsMetric item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserExperienceAnalyticsMetricRequestBuilder modelRegression(@Nonnull final String id) {
        return new UserExperienceAnalyticsMetricRequestBuilder(getRequestUrlWithAdditionalSegment("modelRegression") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UserExperienceAnalyticsMetric collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserExperienceAnalyticsMetricCollectionRequestBuilder operatingSystemRegression() {
        return new UserExperienceAnalyticsMetricCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("operatingSystemRegression"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserExperienceAnalyticsMetric item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserExperienceAnalyticsMetricRequestBuilder operatingSystemRegression(@Nonnull final String id) {
        return new UserExperienceAnalyticsMetricRequestBuilder(getRequestUrlWithAdditionalSegment("operatingSystemRegression") + "/" + id, getClient(), null);
    }
}
