// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsPhone81TrustedRootCertificate;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Phone81Trusted Root Certificate Request.
 */
public interface IWindowsPhone81TrustedRootCertificateRequest extends IHttpRequest {

    /**
     * Gets the WindowsPhone81TrustedRootCertificate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WindowsPhone81TrustedRootCertificate> callback);

    /**
     * Gets the WindowsPhone81TrustedRootCertificate from the service
     *
     * @return the WindowsPhone81TrustedRootCertificate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhone81TrustedRootCertificate get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<WindowsPhone81TrustedRootCertificate> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsPhone81TrustedRootCertificate with a source
     *
     * @param sourceWindowsPhone81TrustedRootCertificate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsPhone81TrustedRootCertificate sourceWindowsPhone81TrustedRootCertificate, final ICallback<WindowsPhone81TrustedRootCertificate> callback);

    /**
     * Patches this WindowsPhone81TrustedRootCertificate with a source
     *
     * @param sourceWindowsPhone81TrustedRootCertificate the source object with updates
     * @return the updated WindowsPhone81TrustedRootCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhone81TrustedRootCertificate patch(final WindowsPhone81TrustedRootCertificate sourceWindowsPhone81TrustedRootCertificate) throws ClientException;

    /**
     * Posts a WindowsPhone81TrustedRootCertificate with a new object
     *
     * @param newWindowsPhone81TrustedRootCertificate the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsPhone81TrustedRootCertificate newWindowsPhone81TrustedRootCertificate, final ICallback<WindowsPhone81TrustedRootCertificate> callback);

    /**
     * Posts a WindowsPhone81TrustedRootCertificate with a new object
     *
     * @param newWindowsPhone81TrustedRootCertificate the new object to create
     * @return the created WindowsPhone81TrustedRootCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhone81TrustedRootCertificate post(final WindowsPhone81TrustedRootCertificate newWindowsPhone81TrustedRootCertificate) throws ClientException;

    /**
     * Posts a WindowsPhone81TrustedRootCertificate with a new object
     *
     * @param newWindowsPhone81TrustedRootCertificate the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WindowsPhone81TrustedRootCertificate newWindowsPhone81TrustedRootCertificate, final ICallback<WindowsPhone81TrustedRootCertificate> callback);

    /**
     * Posts a WindowsPhone81TrustedRootCertificate with a new object
     *
     * @param newWindowsPhone81TrustedRootCertificate the object to create/update
     * @return the created WindowsPhone81TrustedRootCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhone81TrustedRootCertificate put(final WindowsPhone81TrustedRootCertificate newWindowsPhone81TrustedRootCertificate) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsPhone81TrustedRootCertificateRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsPhone81TrustedRootCertificateRequest expand(final String value);

}

