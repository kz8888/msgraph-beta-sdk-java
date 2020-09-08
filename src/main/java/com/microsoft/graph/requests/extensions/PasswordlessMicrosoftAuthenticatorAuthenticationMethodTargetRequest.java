// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Passwordless Microsoft Authenticator Authentication Method Target Request.
 */
public class PasswordlessMicrosoftAuthenticatorAuthenticationMethodTargetRequest extends BaseRequest implements IPasswordlessMicrosoftAuthenticatorAuthenticationMethodTargetRequest {
	
    /**
     * The request for the PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PasswordlessMicrosoftAuthenticatorAuthenticationMethodTargetRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget.class);
    }

    /**
     * Gets the PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget from the service
     *
     * @return the PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget with a source
     *
     * @param sourcePasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget sourcePasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget, final ICallback<PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget> callback) {
        send(HttpMethod.PATCH, callback, sourcePasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget);
    }

    /**
     * Patches this PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget with a source
     *
     * @param sourcePasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget the source object with updates
     * @return the updated PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget patch(final PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget sourcePasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget) throws ClientException {
        return send(HttpMethod.PATCH, sourcePasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget);
    }

    /**
     * Creates a PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget with a new object
     *
     * @param newPasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget newPasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget, final ICallback<PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget> callback) {
        send(HttpMethod.POST, callback, newPasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget);
    }

    /**
     * Creates a PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget with a new object
     *
     * @param newPasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget the new object to create
     * @return the created PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget post(final PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget newPasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget) throws ClientException {
        return send(HttpMethod.POST, newPasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget);
    }

    /**
     * Creates a PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget with a new object
     *
     * @param newPasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget newPasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget, final ICallback<PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget> callback) {
        send(HttpMethod.PUT, callback, newPasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget);
    }

    /**
     * Creates a PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget with a new object
     *
     * @param newPasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget the object to create/update
     * @return the created PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget put(final PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget newPasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget) throws ClientException {
        return send(HttpMethod.PUT, newPasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPasswordlessMicrosoftAuthenticatorAuthenticationMethodTargetRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PasswordlessMicrosoftAuthenticatorAuthenticationMethodTargetRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPasswordlessMicrosoftAuthenticatorAuthenticationMethodTargetRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PasswordlessMicrosoftAuthenticatorAuthenticationMethodTargetRequest)this;
     }

}

