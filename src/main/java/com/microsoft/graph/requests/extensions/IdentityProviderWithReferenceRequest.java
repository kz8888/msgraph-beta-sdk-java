// Template Source: BaseEntityWithReferenceRequest.java.tt
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
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Provider With Reference Request.
 */
public class IdentityProviderWithReferenceRequest extends BaseRequest implements IIdentityProviderWithReferenceRequest {

    /**
     * The request for the IdentityProvider
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityProviderWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IdentityProvider.class);
    }

    public void post(final IdentityProvider newIdentityProvider, final IJsonBackedObject payload, final ICallback<? super IdentityProvider> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public IdentityProvider post(final IdentityProvider newIdentityProvider, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newIdentityProvider;
        }
        return null;
    }

    public void get(final ICallback<? super IdentityProvider> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public IdentityProvider get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super IdentityProvider> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final IdentityProvider sourceIdentityProvider, final ICallback<? super IdentityProvider> callback) {
		send(HttpMethod.PATCH, callback, sourceIdentityProvider);
	}

	public IdentityProvider patch(final IdentityProvider sourceIdentityProvider) throws ClientException {
		return send(HttpMethod.PATCH, sourceIdentityProvider);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IIdentityProviderWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IIdentityProviderWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IIdentityProviderWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IdentityProviderWithReferenceRequest)this;
    }
}
