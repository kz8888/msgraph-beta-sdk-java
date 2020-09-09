// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.requests.extensions;
import com.microsoft.graph.termstore.models.extensions.Store;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Store Request.
 */
public interface IStoreRequest extends IHttpRequest {

    /**
     * Gets the Store from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Store> callback);

    /**
     * Gets the Store from the service
     *
     * @return the Store from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Store get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Store> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Store with a source
     *
     * @param sourceStore the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Store sourceStore, final ICallback<Store> callback);

    /**
     * Patches this Store with a source
     *
     * @param sourceStore the source object with updates
     * @return the updated Store
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Store patch(final Store sourceStore) throws ClientException;

    /**
     * Posts a Store with a new object
     *
     * @param newStore the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Store newStore, final ICallback<Store> callback);

    /**
     * Posts a Store with a new object
     *
     * @param newStore the new object to create
     * @return the created Store
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Store post(final Store newStore) throws ClientException;

    /**
     * Posts a Store with a new object
     *
     * @param newStore the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Store newStore, final ICallback<Store> callback);

    /**
     * Posts a Store with a new object
     *
     * @param newStore the object to create/update
     * @return the created Store
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Store put(final Store newStore) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IStoreRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IStoreRequest expand(final String value);

}

