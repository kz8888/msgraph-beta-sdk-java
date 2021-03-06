// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.RiskyUser;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Risky User Request.
 */
public interface IRiskyUserRequest extends IHttpRequest {

    /**
     * Gets the RiskyUser from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super RiskyUser> callback);

    /**
     * Gets the RiskyUser from the service
     *
     * @return the RiskyUser from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RiskyUser get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super RiskyUser> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this RiskyUser with a source
     *
     * @param sourceRiskyUser the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final RiskyUser sourceRiskyUser, final ICallback<? super RiskyUser> callback);

    /**
     * Patches this RiskyUser with a source
     *
     * @param sourceRiskyUser the source object with updates
     * @return the updated RiskyUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RiskyUser patch(final RiskyUser sourceRiskyUser) throws ClientException;

    /**
     * Posts a RiskyUser with a new object
     *
     * @param newRiskyUser the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final RiskyUser newRiskyUser, final ICallback<? super RiskyUser> callback);

    /**
     * Posts a RiskyUser with a new object
     *
     * @param newRiskyUser the new object to create
     * @return the created RiskyUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RiskyUser post(final RiskyUser newRiskyUser) throws ClientException;

    /**
     * Posts a RiskyUser with a new object
     *
     * @param newRiskyUser the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final RiskyUser newRiskyUser, final ICallback<? super RiskyUser> callback);

    /**
     * Posts a RiskyUser with a new object
     *
     * @param newRiskyUser the object to create/update
     * @return the created RiskyUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RiskyUser put(final RiskyUser newRiskyUser) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IRiskyUserRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IRiskyUserRequest expand(final String value);

}

