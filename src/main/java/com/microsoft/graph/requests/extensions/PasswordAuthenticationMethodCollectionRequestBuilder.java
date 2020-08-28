// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Authentication;
import com.microsoft.graph.models.extensions.PasswordAuthenticationMethod;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IPasswordAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPasswordAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.IPasswordAuthenticationMethodCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Password Authentication Method Collection Request Builder.
 */
public class PasswordAuthenticationMethodCollectionRequestBuilder extends BaseRequestBuilder implements IPasswordAuthenticationMethodCollectionRequestBuilder {

    /**
     * The request builder for this collection of Authentication
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PasswordAuthenticationMethodCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IPasswordAuthenticationMethodCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IPasswordAuthenticationMethodCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new PasswordAuthenticationMethodCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPasswordAuthenticationMethodRequestBuilder byId(final String id) {
        return new PasswordAuthenticationMethodRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}