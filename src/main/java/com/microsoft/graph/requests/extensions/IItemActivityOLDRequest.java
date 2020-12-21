// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ItemActivityOLD;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Item Activity OLDRequest.
 */
public interface IItemActivityOLDRequest extends IHttpRequest {

    /**
     * Gets the ItemActivityOLD from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ItemActivityOLD> callback);

    /**
     * Gets the ItemActivityOLD from the service
     *
     * @return the ItemActivityOLD from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemActivityOLD get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ItemActivityOLD> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ItemActivityOLD with a source
     *
     * @param sourceItemActivityOLD the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ItemActivityOLD sourceItemActivityOLD, final ICallback<? super ItemActivityOLD> callback);

    /**
     * Patches this ItemActivityOLD with a source
     *
     * @param sourceItemActivityOLD the source object with updates
     * @return the updated ItemActivityOLD
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemActivityOLD patch(final ItemActivityOLD sourceItemActivityOLD) throws ClientException;

    /**
     * Posts a ItemActivityOLD with a new object
     *
     * @param newItemActivityOLD the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ItemActivityOLD newItemActivityOLD, final ICallback<? super ItemActivityOLD> callback);

    /**
     * Posts a ItemActivityOLD with a new object
     *
     * @param newItemActivityOLD the new object to create
     * @return the created ItemActivityOLD
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemActivityOLD post(final ItemActivityOLD newItemActivityOLD) throws ClientException;

    /**
     * Posts a ItemActivityOLD with a new object
     *
     * @param newItemActivityOLD the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ItemActivityOLD newItemActivityOLD, final ICallback<? super ItemActivityOLD> callback);

    /**
     * Posts a ItemActivityOLD with a new object
     *
     * @param newItemActivityOLD the object to create/update
     * @return the created ItemActivityOLD
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemActivityOLD put(final ItemActivityOLD newItemActivityOLD) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IItemActivityOLDRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IItemActivityOLDRequest expand(final String value);

}

