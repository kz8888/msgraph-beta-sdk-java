// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Ediscovery;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Ediscovery Request.
 */
public interface IEdiscoveryRequest extends IHttpRequest {

    /**
     * Gets the Ediscovery from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Ediscovery> callback);

    /**
     * Gets the Ediscovery from the service
     *
     * @return the Ediscovery from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Ediscovery get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Ediscovery> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Ediscovery with a source
     *
     * @param sourceEdiscovery the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Ediscovery sourceEdiscovery, final ICallback<Ediscovery> callback);

    /**
     * Patches this Ediscovery with a source
     *
     * @param sourceEdiscovery the source object with updates
     * @return the updated Ediscovery
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Ediscovery patch(final Ediscovery sourceEdiscovery) throws ClientException;

    /**
     * Posts a Ediscovery with a new object
     *
     * @param newEdiscovery the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Ediscovery newEdiscovery, final ICallback<Ediscovery> callback);

    /**
     * Posts a Ediscovery with a new object
     *
     * @param newEdiscovery the new object to create
     * @return the created Ediscovery
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Ediscovery post(final Ediscovery newEdiscovery) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEdiscoveryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEdiscoveryRequest expand(final String value);

}
