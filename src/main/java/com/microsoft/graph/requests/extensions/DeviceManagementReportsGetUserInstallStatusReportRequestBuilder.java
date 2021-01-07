// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.DeviceManagementReportsGetUserInstallStatusReportRequest;
import com.microsoft.graph.models.extensions.DeviceManagementReports;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.DeviceManagementReportsGetUserInstallStatusReportParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Reports Get User Install Status Report Request Builder.
 */
public class DeviceManagementReportsGetUserInstallStatusReportRequestBuilder extends BaseActionRequestBuilder<java.io.InputStream> {

    private DeviceManagementReportsGetUserInstallStatusReportParameterSet body;
    /**
     * The request builder for this DeviceManagementReportsGetUserInstallStatusReport
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DeviceManagementReportsGetUserInstallStatusReportRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DeviceManagementReportsGetUserInstallStatusReportParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the DeviceManagementReportsGetUserInstallStatusReportRequest
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementReportsGetUserInstallStatusReportRequest instance
     */
    @Nonnull
    public DeviceManagementReportsGetUserInstallStatusReportRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DeviceManagementReportsGetUserInstallStatusReportRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementReportsGetUserInstallStatusReportRequest instance
     */
    @Nonnull
    public DeviceManagementReportsGetUserInstallStatusReportRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceManagementReportsGetUserInstallStatusReportRequest request = new DeviceManagementReportsGetUserInstallStatusReportRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
