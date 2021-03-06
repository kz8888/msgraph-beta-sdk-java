// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyRefreshDeviceComplianceReportSummarizationRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Compliance Policy Refresh Device Compliance Report Summarization Request Builder.
 */
public interface IDeviceCompliancePolicyRefreshDeviceComplianceReportSummarizationRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDeviceCompliancePolicyRefreshDeviceComplianceReportSummarizationRequest
     *
     * @param requestOptions the options for the request
     * @return the IDeviceCompliancePolicyRefreshDeviceComplianceReportSummarizationRequest instance
     */
    IDeviceCompliancePolicyRefreshDeviceComplianceReportSummarizationRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IDeviceCompliancePolicyRefreshDeviceComplianceReportSummarizationRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDeviceCompliancePolicyRefreshDeviceComplianceReportSummarizationRequest instance
     */
    IDeviceCompliancePolicyRefreshDeviceComplianceReportSummarizationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
