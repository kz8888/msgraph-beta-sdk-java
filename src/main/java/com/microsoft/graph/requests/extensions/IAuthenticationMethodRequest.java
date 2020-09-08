// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AuthenticationMethod;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Authentication Method Request.
 */
public interface IAuthenticationMethodRequest extends IHttpRequest {

    /**
     * Gets the AuthenticationMethod from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AuthenticationMethod> callback);

    /**
     * Gets the AuthenticationMethod from the service
     *
     * @return the AuthenticationMethod from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AuthenticationMethod get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AuthenticationMethod> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AuthenticationMethod with a source
     *
     * @param sourceAuthenticationMethod the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AuthenticationMethod sourceAuthenticationMethod, final ICallback<AuthenticationMethod> callback);

    /**
     * Patches this AuthenticationMethod with a source
     *
     * @param sourceAuthenticationMethod the source object with updates
     * @return the updated AuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AuthenticationMethod patch(final AuthenticationMethod sourceAuthenticationMethod) throws ClientException;

    /**
     * Posts a AuthenticationMethod with a new object
     *
     * @param newAuthenticationMethod the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AuthenticationMethod newAuthenticationMethod, final ICallback<AuthenticationMethod> callback);

    /**
     * Posts a AuthenticationMethod with a new object
     *
     * @param newAuthenticationMethod the new object to create
     * @return the created AuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AuthenticationMethod post(final AuthenticationMethod newAuthenticationMethod) throws ClientException;

    /**
     * Posts a AuthenticationMethod with a new object
     *
     * @param newAuthenticationMethod the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AuthenticationMethod newAuthenticationMethod, final ICallback<AuthenticationMethod> callback);

    /**
     * Posts a AuthenticationMethod with a new object
     *
     * @param newAuthenticationMethod the object to create/update
     * @return the created AuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AuthenticationMethod put(final AuthenticationMethod newAuthenticationMethod) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAuthenticationMethodRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAuthenticationMethodRequest expand(final String value);

}

