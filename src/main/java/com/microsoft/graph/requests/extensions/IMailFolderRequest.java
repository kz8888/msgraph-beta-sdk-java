// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MailFolder;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mail Folder Request.
 */
public interface IMailFolderRequest extends IHttpRequest {

    /**
     * Gets the MailFolder from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<MailFolder> callback);

    /**
     * Gets the MailFolder from the service
     *
     * @return the MailFolder from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MailFolder get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<MailFolder> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MailFolder with a source
     *
     * @param sourceMailFolder the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MailFolder sourceMailFolder, final ICallback<MailFolder> callback);

    /**
     * Patches this MailFolder with a source
     *
     * @param sourceMailFolder the source object with updates
     * @return the updated MailFolder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MailFolder patch(final MailFolder sourceMailFolder) throws ClientException;

    /**
     * Posts a MailFolder with a new object
     *
     * @param newMailFolder the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MailFolder newMailFolder, final ICallback<MailFolder> callback);

    /**
     * Posts a MailFolder with a new object
     *
     * @param newMailFolder the new object to create
     * @return the created MailFolder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MailFolder post(final MailFolder newMailFolder) throws ClientException;

    /**
     * Posts a MailFolder with a new object
     *
     * @param newMailFolder the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MailFolder newMailFolder, final ICallback<MailFolder> callback);

    /**
     * Posts a MailFolder with a new object
     *
     * @param newMailFolder the object to create/update
     * @return the created MailFolder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MailFolder put(final MailFolder newMailFolder) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMailFolderRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMailFolderRequest expand(final String value);

}

