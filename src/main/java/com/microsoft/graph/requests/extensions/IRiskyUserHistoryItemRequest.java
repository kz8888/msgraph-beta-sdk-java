// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.RiskyUserHistoryItem;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Risky User History Item Request.
 */
public interface IRiskyUserHistoryItemRequest extends IHttpRequest {

    /**
     * Gets the RiskyUserHistoryItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<RiskyUserHistoryItem> callback);

    /**
     * Gets the RiskyUserHistoryItem from the service
     *
     * @return the RiskyUserHistoryItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RiskyUserHistoryItem get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<RiskyUserHistoryItem> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this RiskyUserHistoryItem with a source
     *
     * @param sourceRiskyUserHistoryItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final RiskyUserHistoryItem sourceRiskyUserHistoryItem, final ICallback<RiskyUserHistoryItem> callback);

    /**
     * Patches this RiskyUserHistoryItem with a source
     *
     * @param sourceRiskyUserHistoryItem the source object with updates
     * @return the updated RiskyUserHistoryItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RiskyUserHistoryItem patch(final RiskyUserHistoryItem sourceRiskyUserHistoryItem) throws ClientException;

    /**
     * Posts a RiskyUserHistoryItem with a new object
     *
     * @param newRiskyUserHistoryItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final RiskyUserHistoryItem newRiskyUserHistoryItem, final ICallback<RiskyUserHistoryItem> callback);

    /**
     * Posts a RiskyUserHistoryItem with a new object
     *
     * @param newRiskyUserHistoryItem the new object to create
     * @return the created RiskyUserHistoryItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RiskyUserHistoryItem post(final RiskyUserHistoryItem newRiskyUserHistoryItem) throws ClientException;

    /**
     * Posts a RiskyUserHistoryItem with a new object
     *
     * @param newRiskyUserHistoryItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final RiskyUserHistoryItem newRiskyUserHistoryItem, final ICallback<RiskyUserHistoryItem> callback);

    /**
     * Posts a RiskyUserHistoryItem with a new object
     *
     * @param newRiskyUserHistoryItem the object to create/update
     * @return the created RiskyUserHistoryItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RiskyUserHistoryItem put(final RiskyUserHistoryItem newRiskyUserHistoryItem) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IRiskyUserHistoryItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IRiskyUserHistoryItemRequest expand(final String value);

}

