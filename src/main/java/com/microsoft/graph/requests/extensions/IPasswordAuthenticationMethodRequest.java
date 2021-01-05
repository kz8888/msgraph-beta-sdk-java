// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PasswordAuthenticationMethod;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Password Authentication Method Request.
 */
public interface IPasswordAuthenticationMethodRequest extends IHttpRequest {

    /**
     * Gets the PasswordAuthenticationMethod from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super PasswordAuthenticationMethod> callback);

    /**
     * Gets the PasswordAuthenticationMethod from the service
     *
     * @return the PasswordAuthenticationMethod from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PasswordAuthenticationMethod get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super PasswordAuthenticationMethod> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PasswordAuthenticationMethod with a source
     *
     * @param sourcePasswordAuthenticationMethod the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PasswordAuthenticationMethod sourcePasswordAuthenticationMethod, final ICallback<? super PasswordAuthenticationMethod> callback);

    /**
     * Patches this PasswordAuthenticationMethod with a source
     *
     * @param sourcePasswordAuthenticationMethod the source object with updates
     * @return the updated PasswordAuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PasswordAuthenticationMethod patch(final PasswordAuthenticationMethod sourcePasswordAuthenticationMethod) throws ClientException;

    /**
     * Posts a PasswordAuthenticationMethod with a new object
     *
     * @param newPasswordAuthenticationMethod the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PasswordAuthenticationMethod newPasswordAuthenticationMethod, final ICallback<? super PasswordAuthenticationMethod> callback);

    /**
     * Posts a PasswordAuthenticationMethod with a new object
     *
     * @param newPasswordAuthenticationMethod the new object to create
     * @return the created PasswordAuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PasswordAuthenticationMethod post(final PasswordAuthenticationMethod newPasswordAuthenticationMethod) throws ClientException;

    /**
     * Posts a PasswordAuthenticationMethod with a new object
     *
     * @param newPasswordAuthenticationMethod the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PasswordAuthenticationMethod newPasswordAuthenticationMethod, final ICallback<? super PasswordAuthenticationMethod> callback);

    /**
     * Posts a PasswordAuthenticationMethod with a new object
     *
     * @param newPasswordAuthenticationMethod the object to create/update
     * @return the created PasswordAuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PasswordAuthenticationMethod put(final PasswordAuthenticationMethod newPasswordAuthenticationMethod) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPasswordAuthenticationMethodRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPasswordAuthenticationMethodRequest expand(final String value);

}

