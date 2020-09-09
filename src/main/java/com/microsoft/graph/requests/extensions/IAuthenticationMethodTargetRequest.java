// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AuthenticationMethodTarget;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Authentication Method Target Request.
 */
public interface IAuthenticationMethodTargetRequest extends IHttpRequest {

    /**
     * Gets the AuthenticationMethodTarget from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AuthenticationMethodTarget> callback);

    /**
     * Gets the AuthenticationMethodTarget from the service
     *
     * @return the AuthenticationMethodTarget from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AuthenticationMethodTarget get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AuthenticationMethodTarget> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AuthenticationMethodTarget with a source
     *
     * @param sourceAuthenticationMethodTarget the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AuthenticationMethodTarget sourceAuthenticationMethodTarget, final ICallback<AuthenticationMethodTarget> callback);

    /**
     * Patches this AuthenticationMethodTarget with a source
     *
     * @param sourceAuthenticationMethodTarget the source object with updates
     * @return the updated AuthenticationMethodTarget
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AuthenticationMethodTarget patch(final AuthenticationMethodTarget sourceAuthenticationMethodTarget) throws ClientException;

    /**
     * Posts a AuthenticationMethodTarget with a new object
     *
     * @param newAuthenticationMethodTarget the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AuthenticationMethodTarget newAuthenticationMethodTarget, final ICallback<AuthenticationMethodTarget> callback);

    /**
     * Posts a AuthenticationMethodTarget with a new object
     *
     * @param newAuthenticationMethodTarget the new object to create
     * @return the created AuthenticationMethodTarget
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AuthenticationMethodTarget post(final AuthenticationMethodTarget newAuthenticationMethodTarget) throws ClientException;

    /**
     * Posts a AuthenticationMethodTarget with a new object
     *
     * @param newAuthenticationMethodTarget the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AuthenticationMethodTarget newAuthenticationMethodTarget, final ICallback<AuthenticationMethodTarget> callback);

    /**
     * Posts a AuthenticationMethodTarget with a new object
     *
     * @param newAuthenticationMethodTarget the object to create/update
     * @return the created AuthenticationMethodTarget
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AuthenticationMethodTarget put(final AuthenticationMethodTarget newAuthenticationMethodTarget) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAuthenticationMethodTargetRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAuthenticationMethodTargetRequest expand(final String value);

}

