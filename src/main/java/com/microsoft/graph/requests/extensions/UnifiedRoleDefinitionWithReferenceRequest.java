// Template Source: BaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleDefinition;
import com.microsoft.graph.requests.extensions.IUnifiedRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRoleDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Definition With Reference Request.
 */
public class UnifiedRoleDefinitionWithReferenceRequest extends BaseRequest implements IUnifiedRoleDefinitionWithReferenceRequest {

    /**
     * The request for the UnifiedRoleDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleDefinitionWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleDefinition.class);
    }

    public void post(final UnifiedRoleDefinition newUnifiedRoleDefinition, final IJsonBackedObject payload, final ICallback<? super UnifiedRoleDefinition> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public UnifiedRoleDefinition post(final UnifiedRoleDefinition newUnifiedRoleDefinition, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newUnifiedRoleDefinition;
        }
        return null;
    }

    public void get(final ICallback<? super UnifiedRoleDefinition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public UnifiedRoleDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super UnifiedRoleDefinition> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final UnifiedRoleDefinition sourceUnifiedRoleDefinition, final ICallback<? super UnifiedRoleDefinition> callback) {
		send(HttpMethod.PATCH, callback, sourceUnifiedRoleDefinition);
	}

	public UnifiedRoleDefinition patch(final UnifiedRoleDefinition sourceUnifiedRoleDefinition) throws ClientException {
		return send(HttpMethod.PATCH, sourceUnifiedRoleDefinition);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUnifiedRoleDefinitionWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IUnifiedRoleDefinitionWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUnifiedRoleDefinitionWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UnifiedRoleDefinitionWithReferenceRequest)this;
    }
}
