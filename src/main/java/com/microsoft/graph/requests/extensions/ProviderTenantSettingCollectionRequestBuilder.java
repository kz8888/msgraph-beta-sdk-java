// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Security;
import com.microsoft.graph.models.extensions.ProviderTenantSetting;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IProviderTenantSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProviderTenantSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.IProviderTenantSettingCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Provider Tenant Setting Collection Request Builder.
 */
public class ProviderTenantSettingCollectionRequestBuilder extends BaseRequestBuilder implements IProviderTenantSettingCollectionRequestBuilder {

    /**
     * The request builder for this collection of Security
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ProviderTenantSettingCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IProviderTenantSettingCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IProviderTenantSettingCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ProviderTenantSettingCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IProviderTenantSettingRequestBuilder byId(final String id) {
        return new ProviderTenantSettingRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}