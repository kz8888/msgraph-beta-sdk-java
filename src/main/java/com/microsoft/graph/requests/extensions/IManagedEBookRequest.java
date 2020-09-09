// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedEBook;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed EBook Request.
 */
public interface IManagedEBookRequest extends IHttpRequest {

    /**
     * Gets the ManagedEBook from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ManagedEBook> callback);

    /**
     * Gets the ManagedEBook from the service
     *
     * @return the ManagedEBook from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedEBook get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ManagedEBook> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ManagedEBook with a source
     *
     * @param sourceManagedEBook the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ManagedEBook sourceManagedEBook, final ICallback<ManagedEBook> callback);

    /**
     * Patches this ManagedEBook with a source
     *
     * @param sourceManagedEBook the source object with updates
     * @return the updated ManagedEBook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedEBook patch(final ManagedEBook sourceManagedEBook) throws ClientException;

    /**
     * Posts a ManagedEBook with a new object
     *
     * @param newManagedEBook the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ManagedEBook newManagedEBook, final ICallback<ManagedEBook> callback);

    /**
     * Posts a ManagedEBook with a new object
     *
     * @param newManagedEBook the new object to create
     * @return the created ManagedEBook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedEBook post(final ManagedEBook newManagedEBook) throws ClientException;

    /**
     * Posts a ManagedEBook with a new object
     *
     * @param newManagedEBook the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ManagedEBook newManagedEBook, final ICallback<ManagedEBook> callback);

    /**
     * Posts a ManagedEBook with a new object
     *
     * @param newManagedEBook the object to create/update
     * @return the created ManagedEBook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedEBook put(final ManagedEBook newManagedEBook) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IManagedEBookRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IManagedEBookRequest expand(final String value);

}

