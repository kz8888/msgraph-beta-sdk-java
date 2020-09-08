// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Thumbnail;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Thumbnail Request.
 */
public interface IThumbnailRequest extends IHttpRequest {

    /**
     * Gets the Thumbnail from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Thumbnail> callback);

    /**
     * Gets the Thumbnail from the service
     *
     * @return the Thumbnail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Thumbnail get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Thumbnail> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Thumbnail with a source
     *
     * @param sourceThumbnail the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Thumbnail sourceThumbnail, final ICallback<Thumbnail> callback);

    /**
     * Patches this Thumbnail with a source
     *
     * @param sourceThumbnail the source object with updates
     * @return the updated Thumbnail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Thumbnail patch(final Thumbnail sourceThumbnail) throws ClientException;

    /**
     * Posts a Thumbnail with a new object
     *
     * @param newThumbnail the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Thumbnail newThumbnail, final ICallback<Thumbnail> callback);

    /**
     * Posts a Thumbnail with a new object
     *
     * @param newThumbnail the new object to create
     * @return the created Thumbnail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Thumbnail post(final Thumbnail newThumbnail) throws ClientException;

    /**
     * Posts a Thumbnail with a new object
     *
     * @param newThumbnail the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Thumbnail newThumbnail, final ICallback<Thumbnail> callback);

    /**
     * Posts a Thumbnail with a new object
     *
     * @param newThumbnail the object to create/update
     * @return the created Thumbnail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Thumbnail put(final Thumbnail newThumbnail) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IThumbnailRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IThumbnailRequest expand(final String value);

}

