// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Notebook;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Notebook Request.
 */
public interface INotebookRequest extends IHttpRequest {

    /**
     * Gets the Notebook from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Notebook> callback);

    /**
     * Gets the Notebook from the service
     *
     * @return the Notebook from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Notebook get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Notebook> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Notebook with a source
     *
     * @param sourceNotebook the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Notebook sourceNotebook, final ICallback<? super Notebook> callback);

    /**
     * Patches this Notebook with a source
     *
     * @param sourceNotebook the source object with updates
     * @return the updated Notebook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Notebook patch(final Notebook sourceNotebook) throws ClientException;

    /**
     * Posts a Notebook with a new object
     *
     * @param newNotebook the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Notebook newNotebook, final ICallback<? super Notebook> callback);

    /**
     * Posts a Notebook with a new object
     *
     * @param newNotebook the new object to create
     * @return the created Notebook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Notebook post(final Notebook newNotebook) throws ClientException;

    /**
     * Posts a Notebook with a new object
     *
     * @param newNotebook the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Notebook newNotebook, final ICallback<? super Notebook> callback);

    /**
     * Posts a Notebook with a new object
     *
     * @param newNotebook the object to create/update
     * @return the created Notebook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Notebook put(final Notebook newNotebook) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    INotebookRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    INotebookRequest expand(final String value);

}

