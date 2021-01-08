// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.DeviceManagementReportsGetPolicyNonComplianceMetadataRequest;
import com.microsoft.graph.models.extensions.DeviceManagementReports;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.DeviceManagementReportsGetPolicyNonComplianceMetadataParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Reports Get Policy Non Compliance Metadata Request Builder.
 */
public class DeviceManagementReportsGetPolicyNonComplianceMetadataRequestBuilder extends BaseActionRequestBuilder<java.io.InputStream> {

    private DeviceManagementReportsGetPolicyNonComplianceMetadataParameterSet body;
    /**
     * The request builder for this DeviceManagementReportsGetPolicyNonComplianceMetadata
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DeviceManagementReportsGetPolicyNonComplianceMetadataRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DeviceManagementReportsGetPolicyNonComplianceMetadataParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the DeviceManagementReportsGetPolicyNonComplianceMetadataRequest
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementReportsGetPolicyNonComplianceMetadataRequest instance
     */
    @Nonnull
    public DeviceManagementReportsGetPolicyNonComplianceMetadataRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DeviceManagementReportsGetPolicyNonComplianceMetadataRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementReportsGetPolicyNonComplianceMetadataRequest instance
     */
    @Nonnull
    public DeviceManagementReportsGetPolicyNonComplianceMetadataRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceManagementReportsGetPolicyNonComplianceMetadataRequest request = new DeviceManagementReportsGetPolicyNonComplianceMetadataRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
