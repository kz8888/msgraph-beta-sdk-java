// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ItemPatent;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Item Patent Request.
 */
public interface IItemPatentRequest extends IHttpRequest {

    /**
     * Gets the ItemPatent from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ItemPatent> callback);

    /**
     * Gets the ItemPatent from the service
     *
     * @return the ItemPatent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemPatent get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ItemPatent> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ItemPatent with a source
     *
     * @param sourceItemPatent the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ItemPatent sourceItemPatent, final ICallback<? super ItemPatent> callback);

    /**
     * Patches this ItemPatent with a source
     *
     * @param sourceItemPatent the source object with updates
     * @return the updated ItemPatent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemPatent patch(final ItemPatent sourceItemPatent) throws ClientException;

    /**
     * Posts a ItemPatent with a new object
     *
     * @param newItemPatent the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ItemPatent newItemPatent, final ICallback<? super ItemPatent> callback);

    /**
     * Posts a ItemPatent with a new object
     *
     * @param newItemPatent the new object to create
     * @return the created ItemPatent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemPatent post(final ItemPatent newItemPatent) throws ClientException;

    /**
     * Posts a ItemPatent with a new object
     *
     * @param newItemPatent the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ItemPatent newItemPatent, final ICallback<? super ItemPatent> callback);

    /**
     * Posts a ItemPatent with a new object
     *
     * @param newItemPatent the object to create/update
     * @return the created ItemPatent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemPatent put(final ItemPatent newItemPatent) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IItemPatentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IItemPatentRequest expand(final String value);

}

