// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.DeviceManagementScopedForResourceRequest;
import com.microsoft.graph.models.extensions.DeviceManagement;

import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.models.extensions.DeviceManagementScopedForResourceParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Scoped For Resource Request Builder.
 */
public class DeviceManagementScopedForResourceRequestBuilder extends BaseFunctionRequestBuilder<Boolean> {

    /**
     * The request builder for this DeviceManagementScopedForResource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DeviceManagementScopedForResourceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DeviceManagementScopedForResourceParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }

    /**
     * Creates the DeviceManagementScopedForResourceRequest
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementScopedForResourceRequest instance
     */
    @Nonnull
    public DeviceManagementScopedForResourceRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DeviceManagementScopedForResourceRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementScopedForResourceRequest instance
     */
    @Nonnull
    public DeviceManagementScopedForResourceRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceManagementScopedForResourceRequest request = new DeviceManagementScopedForResourceRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

            for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
        }
        return request;
    }
}
