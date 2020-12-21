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

import com.microsoft.graph.requests.extensions.IIosLobAppProvisioningConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosLobAppProvisioningConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosLobAppProvisioningConfigurationCollectionRequest;
import com.microsoft.graph.requests.extensions.IIosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Lob App Provisioning Configuration Collection Request Builder.
 */
public class IosLobAppProvisioningConfigurationCollectionRequestBuilder extends BaseRequestBuilder implements IIosLobAppProvisioningConfigurationCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceAppManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosLobAppProvisioningConfigurationCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IIosLobAppProvisioningConfigurationCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IIosLobAppProvisioningConfigurationCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new IosLobAppProvisioningConfigurationCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IIosLobAppProvisioningConfigurationRequestBuilder byId(final String id) {
        return new IosLobAppProvisioningConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IIosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequestBuilder hasPayloadLinks(final java.util.List<String> payloadIds) {
        return new IosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.hasPayloadLinks"), getClient(), null, payloadIds);
    }
}
