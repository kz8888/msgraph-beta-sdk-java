// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Endpoint;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Endpoint Request.
 */
public interface IEndpointRequest extends IHttpRequest {

    /**
     * Gets the Endpoint from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Endpoint> callback);

    /**
     * Gets the Endpoint from the service
     *
     * @return the Endpoint from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Endpoint get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Endpoint> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Endpoint with a source
     *
     * @param sourceEndpoint the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Endpoint sourceEndpoint, final ICallback<? super Endpoint> callback);

    /**
     * Patches this Endpoint with a source
     *
     * @param sourceEndpoint the source object with updates
     * @return the updated Endpoint
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Endpoint patch(final Endpoint sourceEndpoint) throws ClientException;

    /**
     * Posts a Endpoint with a new object
     *
     * @param newEndpoint the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Endpoint newEndpoint, final ICallback<? super Endpoint> callback);

    /**
     * Posts a Endpoint with a new object
     *
     * @param newEndpoint the new object to create
     * @return the created Endpoint
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Endpoint post(final Endpoint newEndpoint) throws ClientException;

    /**
     * Posts a Endpoint with a new object
     *
     * @param newEndpoint the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Endpoint newEndpoint, final ICallback<? super Endpoint> callback);

    /**
     * Posts a Endpoint with a new object
     *
     * @param newEndpoint the object to create/update
     * @return the created Endpoint
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Endpoint put(final Endpoint newEndpoint) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEndpointRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEndpointRequest expand(final String value);

}

