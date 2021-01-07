// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.TrustFrameworkKeySetGetActiveKeyRequest;
import com.microsoft.graph.models.extensions.TrustFrameworkKeySet;
import com.microsoft.graph.models.extensions.TrustFrameworkKey;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Trust Framework Key Set Get Active Key Request Builder.
 */
public class TrustFrameworkKeySetGetActiveKeyRequestBuilder extends BaseFunctionRequestBuilder<TrustFrameworkKey> {

    /**
     * The request builder for this TrustFrameworkKeySetGetActiveKey
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TrustFrameworkKeySetGetActiveKeyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the TrustFrameworkKeySetGetActiveKeyRequest
     *
     * @param requestOptions the options for the request
     * @return the TrustFrameworkKeySetGetActiveKeyRequest instance
     */
    @Nonnull
    public TrustFrameworkKeySetGetActiveKeyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the TrustFrameworkKeySetGetActiveKeyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the TrustFrameworkKeySetGetActiveKeyRequest instance
     */
    @Nonnull
    public TrustFrameworkKeySetGetActiveKeyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        TrustFrameworkKeySetGetActiveKeyRequest request = new TrustFrameworkKeySetGetActiveKeyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
