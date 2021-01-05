// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.B2cIdentityUserFlow;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the B2c Identity User Flow Request.
 */
public interface IB2cIdentityUserFlowRequest extends IHttpRequest {

    /**
     * Gets the B2cIdentityUserFlow from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super B2cIdentityUserFlow> callback);

    /**
     * Gets the B2cIdentityUserFlow from the service
     *
     * @return the B2cIdentityUserFlow from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    B2cIdentityUserFlow get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super B2cIdentityUserFlow> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this B2cIdentityUserFlow with a source
     *
     * @param sourceB2cIdentityUserFlow the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final B2cIdentityUserFlow sourceB2cIdentityUserFlow, final ICallback<? super B2cIdentityUserFlow> callback);

    /**
     * Patches this B2cIdentityUserFlow with a source
     *
     * @param sourceB2cIdentityUserFlow the source object with updates
     * @return the updated B2cIdentityUserFlow
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    B2cIdentityUserFlow patch(final B2cIdentityUserFlow sourceB2cIdentityUserFlow) throws ClientException;

    /**
     * Posts a B2cIdentityUserFlow with a new object
     *
     * @param newB2cIdentityUserFlow the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final B2cIdentityUserFlow newB2cIdentityUserFlow, final ICallback<? super B2cIdentityUserFlow> callback);

    /**
     * Posts a B2cIdentityUserFlow with a new object
     *
     * @param newB2cIdentityUserFlow the new object to create
     * @return the created B2cIdentityUserFlow
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    B2cIdentityUserFlow post(final B2cIdentityUserFlow newB2cIdentityUserFlow) throws ClientException;

    /**
     * Posts a B2cIdentityUserFlow with a new object
     *
     * @param newB2cIdentityUserFlow the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final B2cIdentityUserFlow newB2cIdentityUserFlow, final ICallback<? super B2cIdentityUserFlow> callback);

    /**
     * Posts a B2cIdentityUserFlow with a new object
     *
     * @param newB2cIdentityUserFlow the object to create/update
     * @return the created B2cIdentityUserFlow
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    B2cIdentityUserFlow put(final B2cIdentityUserFlow newB2cIdentityUserFlow) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IB2cIdentityUserFlowRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IB2cIdentityUserFlowRequest expand(final String value);

}

