// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsDefenderApplicationControlSupplementalPolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Defender Application Control Supplemental Policy Request.
 */
public interface IWindowsDefenderApplicationControlSupplementalPolicyRequest extends IHttpRequest {

    /**
     * Gets the WindowsDefenderApplicationControlSupplementalPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WindowsDefenderApplicationControlSupplementalPolicy> callback);

    /**
     * Gets the WindowsDefenderApplicationControlSupplementalPolicy from the service
     *
     * @return the WindowsDefenderApplicationControlSupplementalPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsDefenderApplicationControlSupplementalPolicy get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WindowsDefenderApplicationControlSupplementalPolicy> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsDefenderApplicationControlSupplementalPolicy with a source
     *
     * @param sourceWindowsDefenderApplicationControlSupplementalPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsDefenderApplicationControlSupplementalPolicy sourceWindowsDefenderApplicationControlSupplementalPolicy, final ICallback<? super WindowsDefenderApplicationControlSupplementalPolicy> callback);

    /**
     * Patches this WindowsDefenderApplicationControlSupplementalPolicy with a source
     *
     * @param sourceWindowsDefenderApplicationControlSupplementalPolicy the source object with updates
     * @return the updated WindowsDefenderApplicationControlSupplementalPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsDefenderApplicationControlSupplementalPolicy patch(final WindowsDefenderApplicationControlSupplementalPolicy sourceWindowsDefenderApplicationControlSupplementalPolicy) throws ClientException;

    /**
     * Posts a WindowsDefenderApplicationControlSupplementalPolicy with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsDefenderApplicationControlSupplementalPolicy newWindowsDefenderApplicationControlSupplementalPolicy, final ICallback<? super WindowsDefenderApplicationControlSupplementalPolicy> callback);

    /**
     * Posts a WindowsDefenderApplicationControlSupplementalPolicy with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicy the new object to create
     * @return the created WindowsDefenderApplicationControlSupplementalPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsDefenderApplicationControlSupplementalPolicy post(final WindowsDefenderApplicationControlSupplementalPolicy newWindowsDefenderApplicationControlSupplementalPolicy) throws ClientException;

    /**
     * Posts a WindowsDefenderApplicationControlSupplementalPolicy with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WindowsDefenderApplicationControlSupplementalPolicy newWindowsDefenderApplicationControlSupplementalPolicy, final ICallback<? super WindowsDefenderApplicationControlSupplementalPolicy> callback);

    /**
     * Posts a WindowsDefenderApplicationControlSupplementalPolicy with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicy the object to create/update
     * @return the created WindowsDefenderApplicationControlSupplementalPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsDefenderApplicationControlSupplementalPolicy put(final WindowsDefenderApplicationControlSupplementalPolicy newWindowsDefenderApplicationControlSupplementalPolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsDefenderApplicationControlSupplementalPolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsDefenderApplicationControlSupplementalPolicyRequest expand(final String value);

}

