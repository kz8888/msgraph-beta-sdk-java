// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagedDeviceOverrideComplianceStateRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceOverrideComplianceStateRequest;
import com.microsoft.graph.models.generated.AdministratorConfiguredDeviceComplianceState;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Override Compliance State Request Builder.
 */
public class ManagedDeviceOverrideComplianceStateRequestBuilder extends BaseActionRequestBuilder implements IManagedDeviceOverrideComplianceStateRequestBuilder {

    /**
     * The request builder for this ManagedDeviceOverrideComplianceState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param complianceState the complianceState
     * @param remediationUrl the remediationUrl
     */
    public ManagedDeviceOverrideComplianceStateRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final AdministratorConfiguredDeviceComplianceState complianceState, final String remediationUrl) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("complianceState", complianceState);
        bodyParams.put("remediationUrl", remediationUrl);
    }

    /**
     * Creates the IManagedDeviceOverrideComplianceStateRequest
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceOverrideComplianceStateRequest instance
     */
    public IManagedDeviceOverrideComplianceStateRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IManagedDeviceOverrideComplianceStateRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceOverrideComplianceStateRequest instance
     */
    public IManagedDeviceOverrideComplianceStateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ManagedDeviceOverrideComplianceStateRequest request = new ManagedDeviceOverrideComplianceStateRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("complianceState")) {
            request.body.complianceState = getParameter("complianceState");
        }

        if (hasParameter("remediationUrl")) {
            request.body.remediationUrl = getParameter("remediationUrl");
        }

        return request;
    }
}
