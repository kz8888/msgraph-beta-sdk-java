// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ExternalItem;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the External Item Request.
 */
public interface IExternalItemRequest extends IHttpRequest {

    /**
     * Gets the ExternalItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ExternalItem> callback);

    /**
     * Gets the ExternalItem from the service
     *
     * @return the ExternalItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExternalItem get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ExternalItem> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ExternalItem with a source
     *
     * @param sourceExternalItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ExternalItem sourceExternalItem, final ICallback<ExternalItem> callback);

    /**
     * Patches this ExternalItem with a source
     *
     * @param sourceExternalItem the source object with updates
     * @return the updated ExternalItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExternalItem patch(final ExternalItem sourceExternalItem) throws ClientException;

    /**
     * Posts a ExternalItem with a new object
     *
     * @param newExternalItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ExternalItem newExternalItem, final ICallback<ExternalItem> callback);

    /**
     * Posts a ExternalItem with a new object
     *
     * @param newExternalItem the new object to create
     * @return the created ExternalItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExternalItem post(final ExternalItem newExternalItem) throws ClientException;

    /**
     * Posts a ExternalItem with a new object
     *
     * @param newExternalItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ExternalItem newExternalItem, final ICallback<ExternalItem> callback);

    /**
     * Posts a ExternalItem with a new object
     *
     * @param newExternalItem the object to create/update
     * @return the created ExternalItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExternalItem put(final ExternalItem newExternalItem) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IExternalItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IExternalItemRequest expand(final String value);

}

