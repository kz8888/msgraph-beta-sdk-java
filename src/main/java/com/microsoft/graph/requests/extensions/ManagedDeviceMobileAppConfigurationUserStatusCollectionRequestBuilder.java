// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosLobAppProvisioningConfiguration;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationUserStatus;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationUserStatusCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration User Status Collection Request Builder.
 */
public class ManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder extends BaseRequestBuilder implements IManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder {

    /**
     * The request builder for this collection of IosLobAppProvisioningConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IManagedDeviceMobileAppConfigurationUserStatusCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IManagedDeviceMobileAppConfigurationUserStatusCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ManagedDeviceMobileAppConfigurationUserStatusCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IManagedDeviceMobileAppConfigurationUserStatusRequestBuilder byId(final String id) {
        return new ManagedDeviceMobileAppConfigurationUserStatusRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
