// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IdentityProvider;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Provider Reference Request.
 */
public class IdentityProviderReferenceRequest extends BaseRequest implements IIdentityProviderReferenceRequest {

    /**
     * The request for the IdentityProvider
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityProviderReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IdentityProvider.class);
    }

    public void delete(final ICallback<? super IdentityProvider> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public IdentityProvider delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IIdentityProviderReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IdentityProviderReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IIdentityProviderReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IdentityProviderReferenceRequest)this;
    }
    /**
     * Puts the IdentityProvider
     *
     * @param srcIdentityProvider the IdentityProvider reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(IdentityProvider srcIdentityProvider, final ICallback<? super IdentityProvider> callback) {
        send(HttpMethod.PUT, callback, srcIdentityProvider);
    }

    /**
     * Puts the IdentityProvider
     *
     * @param srcIdentityProvider the IdentityProvider reference to PUT
     * @return the IdentityProvider
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public IdentityProvider put(IdentityProvider srcIdentityProvider) throws ClientException {
        return send(HttpMethod.PUT, srcIdentityProvider);
    }
}
