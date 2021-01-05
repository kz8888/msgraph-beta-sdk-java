// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.termstore.models.extensions.Store;
import com.microsoft.graph.termstore.requests.extensions.IGroupCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IGroupRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.GroupCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.GroupRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.ISetCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.ISetRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.SetCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.SetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Store Request.
 */
public class StoreRequest extends BaseRequest implements IStoreRequest {
	
    /**
     * The request for the Store
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public StoreRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Store.class);
    }

    /**
     * Gets the Store from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Store> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Store from the service
     *
     * @return the Store from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Store get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Store> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Store with a source
     *
     * @param sourceStore the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Store sourceStore, final ICallback<? super Store> callback) {
        send(HttpMethod.PATCH, callback, sourceStore);
    }

    /**
     * Patches this Store with a source
     *
     * @param sourceStore the source object with updates
     * @return the updated Store
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Store patch(final Store sourceStore) throws ClientException {
        return send(HttpMethod.PATCH, sourceStore);
    }

    /**
     * Creates a Store with a new object
     *
     * @param newStore the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Store newStore, final ICallback<? super Store> callback) {
        send(HttpMethod.POST, callback, newStore);
    }

    /**
     * Creates a Store with a new object
     *
     * @param newStore the new object to create
     * @return the created Store
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Store post(final Store newStore) throws ClientException {
        return send(HttpMethod.POST, newStore);
    }

    /**
     * Creates a Store with a new object
     *
     * @param newStore the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Store newStore, final ICallback<? super Store> callback) {
        send(HttpMethod.PUT, callback, newStore);
    }

    /**
     * Creates a Store with a new object
     *
     * @param newStore the object to create/update
     * @return the created Store
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Store put(final Store newStore) throws ClientException {
        return send(HttpMethod.PUT, newStore);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IStoreRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (StoreRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IStoreRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (StoreRequest)this;
     }

}

