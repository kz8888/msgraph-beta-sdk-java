// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportsGetReportFiltersRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Reports Get Report Filters Request Builder.
 */
public interface IDeviceManagementReportsGetReportFiltersRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDeviceManagementReportsGetReportFiltersRequest
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementReportsGetReportFiltersRequest instance
     */
    IDeviceManagementReportsGetReportFiltersRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IDeviceManagementReportsGetReportFiltersRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementReportsGetReportFiltersRequest instance
     */
    IDeviceManagementReportsGetReportFiltersRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
