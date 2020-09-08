// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Presence;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Presence Request.
 */
public interface IPresenceRequest extends IHttpRequest {

    /**
     * Gets the Presence from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Presence> callback);

    /**
     * Gets the Presence from the service
     *
     * @return the Presence from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Presence get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Presence> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Presence with a source
     *
     * @param sourcePresence the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Presence sourcePresence, final ICallback<Presence> callback);

    /**
     * Patches this Presence with a source
     *
     * @param sourcePresence the source object with updates
     * @return the updated Presence
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Presence patch(final Presence sourcePresence) throws ClientException;

    /**
     * Posts a Presence with a new object
     *
     * @param newPresence the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Presence newPresence, final ICallback<Presence> callback);

    /**
     * Posts a Presence with a new object
     *
     * @param newPresence the new object to create
     * @return the created Presence
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Presence post(final Presence newPresence) throws ClientException;

    /**
     * Posts a Presence with a new object
     *
     * @param newPresence the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Presence newPresence, final ICallback<Presence> callback);

    /**
     * Posts a Presence with a new object
     *
     * @param newPresence the object to create/update
     * @return the created Presence
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Presence put(final Presence newPresence) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPresenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPresenceRequest expand(final String value);

}

