// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.RemoteActionAudit;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Remote Action Audit Request.
 */
public interface IRemoteActionAuditRequest extends IHttpRequest {

    /**
     * Gets the RemoteActionAudit from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<RemoteActionAudit> callback);

    /**
     * Gets the RemoteActionAudit from the service
     *
     * @return the RemoteActionAudit from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RemoteActionAudit get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<RemoteActionAudit> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this RemoteActionAudit with a source
     *
     * @param sourceRemoteActionAudit the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final RemoteActionAudit sourceRemoteActionAudit, final ICallback<RemoteActionAudit> callback);

    /**
     * Patches this RemoteActionAudit with a source
     *
     * @param sourceRemoteActionAudit the source object with updates
     * @return the updated RemoteActionAudit
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RemoteActionAudit patch(final RemoteActionAudit sourceRemoteActionAudit) throws ClientException;

    /**
     * Posts a RemoteActionAudit with a new object
     *
     * @param newRemoteActionAudit the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final RemoteActionAudit newRemoteActionAudit, final ICallback<RemoteActionAudit> callback);

    /**
     * Posts a RemoteActionAudit with a new object
     *
     * @param newRemoteActionAudit the new object to create
     * @return the created RemoteActionAudit
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RemoteActionAudit post(final RemoteActionAudit newRemoteActionAudit) throws ClientException;

    /**
     * Posts a RemoteActionAudit with a new object
     *
     * @param newRemoteActionAudit the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final RemoteActionAudit newRemoteActionAudit, final ICallback<RemoteActionAudit> callback);

    /**
     * Posts a RemoteActionAudit with a new object
     *
     * @param newRemoteActionAudit the object to create/update
     * @return the created RemoteActionAudit
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RemoteActionAudit put(final RemoteActionAudit newRemoteActionAudit) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IRemoteActionAuditRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IRemoteActionAuditRequest expand(final String value);

}

