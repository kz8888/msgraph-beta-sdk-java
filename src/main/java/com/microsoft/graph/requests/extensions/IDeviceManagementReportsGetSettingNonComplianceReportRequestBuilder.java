// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportsGetSettingNonComplianceReportRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Reports Get Setting Non Compliance Report Request Builder.
 */
public interface IDeviceManagementReportsGetSettingNonComplianceReportRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDeviceManagementReportsGetSettingNonComplianceReportRequest
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementReportsGetSettingNonComplianceReportRequest instance
     */
    IDeviceManagementReportsGetSettingNonComplianceReportRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IDeviceManagementReportsGetSettingNonComplianceReportRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementReportsGetSettingNonComplianceReportRequest instance
     */
    IDeviceManagementReportsGetSettingNonComplianceReportRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
