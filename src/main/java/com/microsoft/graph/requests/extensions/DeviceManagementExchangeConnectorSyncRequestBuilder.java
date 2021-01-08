// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorSyncRequest;
import com.microsoft.graph.models.extensions.DeviceManagementExchangeConnector;
import com.microsoft.graph.models.generated.DeviceManagementExchangeConnectorSyncType;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.DeviceManagementExchangeConnectorSyncParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Exchange Connector Sync Request Builder.
 */
public class DeviceManagementExchangeConnectorSyncRequestBuilder extends BaseActionRequestBuilder<DeviceManagementExchangeConnector> {

    private DeviceManagementExchangeConnectorSyncParameterSet body;
    /**
     * The request builder for this DeviceManagementExchangeConnectorSync
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DeviceManagementExchangeConnectorSyncRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DeviceManagementExchangeConnectorSyncParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the DeviceManagementExchangeConnectorSyncRequest
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementExchangeConnectorSyncRequest instance
     */
    @Nonnull
    public DeviceManagementExchangeConnectorSyncRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DeviceManagementExchangeConnectorSyncRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementExchangeConnectorSyncRequest instance
     */
    @Nonnull
    public DeviceManagementExchangeConnectorSyncRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceManagementExchangeConnectorSyncRequest request = new DeviceManagementExchangeConnectorSyncRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
