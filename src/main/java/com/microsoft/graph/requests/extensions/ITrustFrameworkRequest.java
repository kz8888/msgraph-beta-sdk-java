// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TrustFramework;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Trust Framework Request.
 */
public interface ITrustFrameworkRequest extends IHttpRequest {

    /**
     * Gets the TrustFramework from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super TrustFramework> callback);

    /**
     * Gets the TrustFramework from the service
     *
     * @return the TrustFramework from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TrustFramework get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super TrustFramework> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this TrustFramework with a source
     *
     * @param sourceTrustFramework the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final TrustFramework sourceTrustFramework, final ICallback<? super TrustFramework> callback);

    /**
     * Patches this TrustFramework with a source
     *
     * @param sourceTrustFramework the source object with updates
     * @return the updated TrustFramework
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TrustFramework patch(final TrustFramework sourceTrustFramework) throws ClientException;

    /**
     * Posts a TrustFramework with a new object
     *
     * @param newTrustFramework the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final TrustFramework newTrustFramework, final ICallback<? super TrustFramework> callback);

    /**
     * Posts a TrustFramework with a new object
     *
     * @param newTrustFramework the new object to create
     * @return the created TrustFramework
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TrustFramework post(final TrustFramework newTrustFramework) throws ClientException;

    /**
     * Posts a TrustFramework with a new object
     *
     * @param newTrustFramework the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final TrustFramework newTrustFramework, final ICallback<? super TrustFramework> callback);

    /**
     * Posts a TrustFramework with a new object
     *
     * @param newTrustFramework the object to create/update
     * @return the created TrustFramework
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TrustFramework put(final TrustFramework newTrustFramework) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITrustFrameworkRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITrustFrameworkRequest expand(final String value);

}

