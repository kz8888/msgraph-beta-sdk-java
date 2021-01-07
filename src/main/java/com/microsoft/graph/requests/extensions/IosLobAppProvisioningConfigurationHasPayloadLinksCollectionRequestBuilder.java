// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.IosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequest;
import com.microsoft.graph.requests.extensions.IosLobAppProvisioningConfigurationHasPayloadLinksCollectionResponse;
import com.microsoft.graph.models.extensions.IosLobAppProvisioningConfigurationHasPayloadLinksParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Lob App Provisioning Configuration Has Payload Links Collection Request Builder.
 */
public class IosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<HasPayloadLinkResultItem, IosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequestBuilder, IosLobAppProvisioningConfigurationHasPayloadLinksCollectionResponse, IosLobAppProvisioningConfigurationHasPayloadLinksCollectionPage, IosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequest> {

    private IosLobAppProvisioningConfigurationHasPayloadLinksParameterSet body;
    /**
     * The request builder for this collection of IosLobAppProvisioningConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public IosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final IosLobAppProvisioningConfigurationHasPayloadLinksParameterSet parameters) {
        super(requestUrl, client, requestOptions, IosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequestBuilder.class, IosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequest.class);
        this.body = parameters;
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequest instance
     */
    @Override
    @Nonnull
    public IosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final IosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequest request = super.buildRequest(requestOptions);
            request.body = this.body;
            return request;
    }
}
