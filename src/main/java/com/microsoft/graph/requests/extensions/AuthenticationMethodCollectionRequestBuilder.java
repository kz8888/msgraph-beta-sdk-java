// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Authentication;
import com.microsoft.graph.models.extensions.AuthenticationMethod;
import com.microsoft.graph.models.extensions.PasswordResetResponse;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuthenticationMethodCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Method Collection Request Builder.
 */
public class AuthenticationMethodCollectionRequestBuilder extends BaseRequestBuilder implements IAuthenticationMethodCollectionRequestBuilder {

    /**
     * The request builder for this collection of Authentication
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuthenticationMethodCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IAuthenticationMethodCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IAuthenticationMethodCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new AuthenticationMethodCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IAuthenticationMethodRequestBuilder byId(final String id) {
        return new AuthenticationMethodRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}