// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ConnectedOrganization;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Connected Organization Request.
 */
public interface IConnectedOrganizationRequest extends IHttpRequest {

    /**
     * Gets the ConnectedOrganization from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ConnectedOrganization> callback);

    /**
     * Gets the ConnectedOrganization from the service
     *
     * @return the ConnectedOrganization from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ConnectedOrganization get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ConnectedOrganization> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ConnectedOrganization with a source
     *
     * @param sourceConnectedOrganization the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ConnectedOrganization sourceConnectedOrganization, final ICallback<ConnectedOrganization> callback);

    /**
     * Patches this ConnectedOrganization with a source
     *
     * @param sourceConnectedOrganization the source object with updates
     * @return the updated ConnectedOrganization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ConnectedOrganization patch(final ConnectedOrganization sourceConnectedOrganization) throws ClientException;

    /**
     * Posts a ConnectedOrganization with a new object
     *
     * @param newConnectedOrganization the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ConnectedOrganization newConnectedOrganization, final ICallback<ConnectedOrganization> callback);

    /**
     * Posts a ConnectedOrganization with a new object
     *
     * @param newConnectedOrganization the new object to create
     * @return the created ConnectedOrganization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ConnectedOrganization post(final ConnectedOrganization newConnectedOrganization) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IConnectedOrganizationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IConnectedOrganizationRequest expand(final String value);

}
