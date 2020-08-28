// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.termstore.models.extensions.Set;
import com.microsoft.graph.termstore.requests.extensions.ITermCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.ITermRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.TermCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.TermRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IRelationCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IRelationRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.RelationCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.RelationRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IGroupRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.GroupRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Set Reference Request.
 */
public class SetReferenceRequest extends BaseRequest implements ISetReferenceRequest {

    /**
     * The request for the Set
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SetReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Set.class);
    }

    public void delete(final ICallback<Set> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public Set delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISetReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (SetReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISetReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (SetReferenceRequest)this;
    }
    /**
     * Puts the Set
     *
     * @param srcSet the Set reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(Set srcSet, final ICallback<Set> callback) {
        send(HttpMethod.PUT, callback, srcSet);
    }

    /**
     * Puts the Set
     *
     * @param srcSet the Set reference to PUT
     * @return the Set
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public Set put(Set srcSet) throws ClientException {
        return send(HttpMethod.PUT, srcSet);
    }
}