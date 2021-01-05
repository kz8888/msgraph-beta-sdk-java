// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.BusinessFlow;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Business Flow Request.
 */
public interface IBusinessFlowRequest extends IHttpRequest {

    /**
     * Gets the BusinessFlow from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super BusinessFlow> callback);

    /**
     * Gets the BusinessFlow from the service
     *
     * @return the BusinessFlow from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BusinessFlow get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super BusinessFlow> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this BusinessFlow with a source
     *
     * @param sourceBusinessFlow the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final BusinessFlow sourceBusinessFlow, final ICallback<? super BusinessFlow> callback);

    /**
     * Patches this BusinessFlow with a source
     *
     * @param sourceBusinessFlow the source object with updates
     * @return the updated BusinessFlow
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BusinessFlow patch(final BusinessFlow sourceBusinessFlow) throws ClientException;

    /**
     * Posts a BusinessFlow with a new object
     *
     * @param newBusinessFlow the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final BusinessFlow newBusinessFlow, final ICallback<? super BusinessFlow> callback);

    /**
     * Posts a BusinessFlow with a new object
     *
     * @param newBusinessFlow the new object to create
     * @return the created BusinessFlow
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BusinessFlow post(final BusinessFlow newBusinessFlow) throws ClientException;

    /**
     * Posts a BusinessFlow with a new object
     *
     * @param newBusinessFlow the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final BusinessFlow newBusinessFlow, final ICallback<? super BusinessFlow> callback);

    /**
     * Posts a BusinessFlow with a new object
     *
     * @param newBusinessFlow the object to create/update
     * @return the created BusinessFlow
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BusinessFlow put(final BusinessFlow newBusinessFlow) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBusinessFlowRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBusinessFlowRequest expand(final String value);

}

