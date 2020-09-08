// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsPhone81AppX;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Phone81App XRequest.
 */
public interface IWindowsPhone81AppXRequest extends IHttpRequest {

    /**
     * Gets the WindowsPhone81AppX from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WindowsPhone81AppX> callback);

    /**
     * Gets the WindowsPhone81AppX from the service
     *
     * @return the WindowsPhone81AppX from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhone81AppX get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<WindowsPhone81AppX> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsPhone81AppX with a source
     *
     * @param sourceWindowsPhone81AppX the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsPhone81AppX sourceWindowsPhone81AppX, final ICallback<WindowsPhone81AppX> callback);

    /**
     * Patches this WindowsPhone81AppX with a source
     *
     * @param sourceWindowsPhone81AppX the source object with updates
     * @return the updated WindowsPhone81AppX
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhone81AppX patch(final WindowsPhone81AppX sourceWindowsPhone81AppX) throws ClientException;

    /**
     * Posts a WindowsPhone81AppX with a new object
     *
     * @param newWindowsPhone81AppX the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsPhone81AppX newWindowsPhone81AppX, final ICallback<WindowsPhone81AppX> callback);

    /**
     * Posts a WindowsPhone81AppX with a new object
     *
     * @param newWindowsPhone81AppX the new object to create
     * @return the created WindowsPhone81AppX
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhone81AppX post(final WindowsPhone81AppX newWindowsPhone81AppX) throws ClientException;

    /**
     * Posts a WindowsPhone81AppX with a new object
     *
     * @param newWindowsPhone81AppX the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WindowsPhone81AppX newWindowsPhone81AppX, final ICallback<WindowsPhone81AppX> callback);

    /**
     * Posts a WindowsPhone81AppX with a new object
     *
     * @param newWindowsPhone81AppX the object to create/update
     * @return the created WindowsPhone81AppX
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhone81AppX put(final WindowsPhone81AppX newWindowsPhone81AppX) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsPhone81AppXRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsPhone81AppXRequest expand(final String value);

}

