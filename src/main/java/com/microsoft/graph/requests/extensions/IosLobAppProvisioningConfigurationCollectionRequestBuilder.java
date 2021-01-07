// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.models.extensions.IosLobAppProvisioningConfiguration;
import com.microsoft.graph.models.extensions.MobileAppProvisioningConfigGroupAssignment;
import com.microsoft.graph.models.extensions.IosLobAppProvisioningConfigurationAssignment;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.IosLobAppProvisioningConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IosLobAppProvisioningConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IosLobAppProvisioningConfigurationCollectionRequest;
import com.microsoft.graph.requests.extensions.IosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.extensions.IosLobAppProvisioningConfigurationAssignParameterSet;
import com.microsoft.graph.models.extensions.IosLobAppProvisioningConfigurationHasPayloadLinksParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Lob App Provisioning Configuration Collection Request Builder.
 */
public class IosLobAppProvisioningConfigurationCollectionRequestBuilder extends BaseCollectionRequestBuilder<IosLobAppProvisioningConfiguration, IosLobAppProvisioningConfigurationRequestBuilder, IosLobAppProvisioningConfigurationCollectionResponse, IosLobAppProvisioningConfigurationCollectionPage, IosLobAppProvisioningConfigurationCollectionRequest> {

    /**
     * The request builder for this collection of DeviceAppManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosLobAppProvisioningConfigurationCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosLobAppProvisioningConfigurationRequestBuilder.class, IosLobAppProvisioningConfigurationCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public IosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequestBuilder hasPayloadLinks(@Nonnull final IosLobAppProvisioningConfigurationHasPayloadLinksParameterSet parameters) {
        return new IosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.hasPayloadLinks"), getClient(), null, parameters);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
