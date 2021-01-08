// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportRequest;
import com.microsoft.graph.models.extensions.DeviceManagementReports;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Reports Get Windows Update Alerts Per Policy Per Device Report Request Builder.
 */
public class DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportRequestBuilder extends BaseActionRequestBuilder<java.io.InputStream> {

    private DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSet body;
    /**
     * The request builder for this DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReport
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportRequest
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportRequest instance
     */
    @Nonnull
    public DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportRequest instance
     */
    @Nonnull
    public DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportRequest request = new DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
