// Template Source: BaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.ediscovery.models.extensions.Tag;
import com.microsoft.graph.ediscovery.requests.extensions.ITagCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.ITagRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.TagCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.TagRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tag With Reference Request.
 */
public class TagWithReferenceRequest extends BaseRequest implements ITagWithReferenceRequest {

    /**
     * The request for the Tag
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TagWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Tag.class);
    }

    public void post(final Tag newTag, final IJsonBackedObject payload, final ICallback<? super Tag> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public Tag post(final Tag newTag, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newTag;
        }
        return null;
    }

    public void get(final ICallback<? super Tag> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public Tag get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super Tag> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final Tag sourceTag, final ICallback<? super Tag> callback) {
		send(HttpMethod.PATCH, callback, sourceTag);
	}

	public Tag patch(final Tag sourceTag) throws ClientException {
		return send(HttpMethod.PATCH, sourceTag);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITagWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ITagWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITagWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (TagWithReferenceRequest)this;
    }
}
