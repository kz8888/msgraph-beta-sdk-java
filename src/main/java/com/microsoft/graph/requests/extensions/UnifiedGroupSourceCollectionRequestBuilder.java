// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Custodian;
import com.microsoft.graph.models.extensions.UnifiedGroupSource;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IUnifiedGroupSourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedGroupSourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedGroupSourceCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Group Source Collection Request Builder.
 */
public class UnifiedGroupSourceCollectionRequestBuilder extends BaseRequestBuilder implements IUnifiedGroupSourceCollectionRequestBuilder {

    /**
     * The request builder for this collection of Custodian
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedGroupSourceCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IUnifiedGroupSourceCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IUnifiedGroupSourceCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new UnifiedGroupSourceCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IUnifiedGroupSourceRequestBuilder byId(final String id) {
        return new UnifiedGroupSourceRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
