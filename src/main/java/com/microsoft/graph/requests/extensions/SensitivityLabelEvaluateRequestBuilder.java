// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ISensitivityLabelEvaluateRequest;
import com.microsoft.graph.requests.extensions.SensitivityLabelEvaluateRequest;
import com.microsoft.graph.models.extensions.DiscoveredSensitiveType;
import com.microsoft.graph.models.extensions.CurrentLabel;
import com.microsoft.graph.models.extensions.EvaluateLabelJobResponse;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sensitivity Label Evaluate Request Builder.
 */
public class SensitivityLabelEvaluateRequestBuilder extends BaseActionRequestBuilder implements ISensitivityLabelEvaluateRequestBuilder {

    /**
     * The request builder for this SensitivityLabelEvaluate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param discoveredSensitiveTypes the discoveredSensitiveTypes
     * @param currentLabel the currentLabel
     */
    public SensitivityLabelEvaluateRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<DiscoveredSensitiveType> discoveredSensitiveTypes, final CurrentLabel currentLabel) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("discoveredSensitiveTypes", discoveredSensitiveTypes);
        bodyParams.put("currentLabel", currentLabel);
    }

    /**
     * Creates the ISensitivityLabelEvaluateRequest
     *
     * @param requestOptions the options for the request
     * @return the ISensitivityLabelEvaluateRequest instance
     */
    public ISensitivityLabelEvaluateRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ISensitivityLabelEvaluateRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ISensitivityLabelEvaluateRequest instance
     */
    public ISensitivityLabelEvaluateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        SensitivityLabelEvaluateRequest request = new SensitivityLabelEvaluateRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("discoveredSensitiveTypes")) {
            request.body.discoveredSensitiveTypes = getParameter("discoveredSensitiveTypes");
        }

        if (hasParameter("currentLabel")) {
            request.body.currentLabel = getParameter("currentLabel");
        }

        return request;
    }
}
