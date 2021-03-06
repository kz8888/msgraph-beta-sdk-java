// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Dimension;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Dimension Request.
 */
public interface IDimensionRequest extends IHttpRequest {

    /**
     * Gets the Dimension from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Dimension> callback);

    /**
     * Gets the Dimension from the service
     *
     * @return the Dimension from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Dimension get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Dimension> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Dimension with a source
     *
     * @param sourceDimension the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Dimension sourceDimension, final ICallback<? super Dimension> callback);

    /**
     * Patches this Dimension with a source
     *
     * @param sourceDimension the source object with updates
     * @return the updated Dimension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Dimension patch(final Dimension sourceDimension) throws ClientException;

    /**
     * Posts a Dimension with a new object
     *
     * @param newDimension the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Dimension newDimension, final ICallback<? super Dimension> callback);

    /**
     * Posts a Dimension with a new object
     *
     * @param newDimension the new object to create
     * @return the created Dimension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Dimension post(final Dimension newDimension) throws ClientException;

    /**
     * Posts a Dimension with a new object
     *
     * @param newDimension the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Dimension newDimension, final ICallback<? super Dimension> callback);

    /**
     * Posts a Dimension with a new object
     *
     * @param newDimension the object to create/update
     * @return the created Dimension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Dimension put(final Dimension newDimension) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDimensionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDimensionRequest expand(final String value);

}

