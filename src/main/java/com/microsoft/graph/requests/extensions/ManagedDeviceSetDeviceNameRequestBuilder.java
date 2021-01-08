// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ManagedDeviceSetDeviceNameRequest;
import com.microsoft.graph.models.extensions.ManagedDevice;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.ManagedDeviceSetDeviceNameParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Set Device Name Request Builder.
 */
public class ManagedDeviceSetDeviceNameRequestBuilder extends BaseActionRequestBuilder<ManagedDevice> {

    private ManagedDeviceSetDeviceNameParameterSet body;
    /**
     * The request builder for this ManagedDeviceSetDeviceName
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ManagedDeviceSetDeviceNameRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ManagedDeviceSetDeviceNameParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the ManagedDeviceSetDeviceNameRequest
     *
     * @param requestOptions the options for the request
     * @return the ManagedDeviceSetDeviceNameRequest instance
     */
    @Nonnull
    public ManagedDeviceSetDeviceNameRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ManagedDeviceSetDeviceNameRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ManagedDeviceSetDeviceNameRequest instance
     */
    @Nonnull
    public ManagedDeviceSetDeviceNameRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ManagedDeviceSetDeviceNameRequest request = new ManagedDeviceSetDeviceNameRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
