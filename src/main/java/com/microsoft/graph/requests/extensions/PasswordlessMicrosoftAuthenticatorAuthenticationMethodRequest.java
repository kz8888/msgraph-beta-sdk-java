// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PasswordlessMicrosoftAuthenticatorAuthenticationMethod;
import com.microsoft.graph.requests.extensions.DeviceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Passwordless Microsoft Authenticator Authentication Method Request.
 */
public class PasswordlessMicrosoftAuthenticatorAuthenticationMethodRequest extends BaseRequest<PasswordlessMicrosoftAuthenticatorAuthenticationMethod> {
	
    /**
     * The request for the PasswordlessMicrosoftAuthenticatorAuthenticationMethod
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PasswordlessMicrosoftAuthenticatorAuthenticationMethodRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PasswordlessMicrosoftAuthenticatorAuthenticationMethod.class);
    }

    /**
     * Gets the PasswordlessMicrosoftAuthenticatorAuthenticationMethod from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super PasswordlessMicrosoftAuthenticatorAuthenticationMethod> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PasswordlessMicrosoftAuthenticatorAuthenticationMethod from the service
     *
     * @return the PasswordlessMicrosoftAuthenticatorAuthenticationMethod from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PasswordlessMicrosoftAuthenticatorAuthenticationMethod get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super PasswordlessMicrosoftAuthenticatorAuthenticationMethod> callback) {
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
     * Patches this PasswordlessMicrosoftAuthenticatorAuthenticationMethod with a source
     *
     * @param sourcePasswordlessMicrosoftAuthenticatorAuthenticationMethod the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final PasswordlessMicrosoftAuthenticatorAuthenticationMethod sourcePasswordlessMicrosoftAuthenticatorAuthenticationMethod, @Nonnull final ICallback<? super PasswordlessMicrosoftAuthenticatorAuthenticationMethod> callback) {
        send(HttpMethod.PATCH, callback, sourcePasswordlessMicrosoftAuthenticatorAuthenticationMethod);
    }

    /**
     * Patches this PasswordlessMicrosoftAuthenticatorAuthenticationMethod with a source
     *
     * @param sourcePasswordlessMicrosoftAuthenticatorAuthenticationMethod the source object with updates
     * @return the updated PasswordlessMicrosoftAuthenticatorAuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PasswordlessMicrosoftAuthenticatorAuthenticationMethod patch(@Nonnull final PasswordlessMicrosoftAuthenticatorAuthenticationMethod sourcePasswordlessMicrosoftAuthenticatorAuthenticationMethod) throws ClientException {
        return send(HttpMethod.PATCH, sourcePasswordlessMicrosoftAuthenticatorAuthenticationMethod);
    }

    /**
     * Creates a PasswordlessMicrosoftAuthenticatorAuthenticationMethod with a new object
     *
     * @param newPasswordlessMicrosoftAuthenticatorAuthenticationMethod the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final PasswordlessMicrosoftAuthenticatorAuthenticationMethod newPasswordlessMicrosoftAuthenticatorAuthenticationMethod, @Nonnull final ICallback<? super PasswordlessMicrosoftAuthenticatorAuthenticationMethod> callback) {
        send(HttpMethod.POST, callback, newPasswordlessMicrosoftAuthenticatorAuthenticationMethod);
    }

    /**
     * Creates a PasswordlessMicrosoftAuthenticatorAuthenticationMethod with a new object
     *
     * @param newPasswordlessMicrosoftAuthenticatorAuthenticationMethod the new object to create
     * @return the created PasswordlessMicrosoftAuthenticatorAuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PasswordlessMicrosoftAuthenticatorAuthenticationMethod post(@Nonnull final PasswordlessMicrosoftAuthenticatorAuthenticationMethod newPasswordlessMicrosoftAuthenticatorAuthenticationMethod) throws ClientException {
        return send(HttpMethod.POST, newPasswordlessMicrosoftAuthenticatorAuthenticationMethod);
    }

    /**
     * Creates a PasswordlessMicrosoftAuthenticatorAuthenticationMethod with a new object
     *
     * @param newPasswordlessMicrosoftAuthenticatorAuthenticationMethod the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final PasswordlessMicrosoftAuthenticatorAuthenticationMethod newPasswordlessMicrosoftAuthenticatorAuthenticationMethod, @Nonnull final ICallback<? super PasswordlessMicrosoftAuthenticatorAuthenticationMethod> callback) {
        send(HttpMethod.PUT, callback, newPasswordlessMicrosoftAuthenticatorAuthenticationMethod);
    }

    /**
     * Creates a PasswordlessMicrosoftAuthenticatorAuthenticationMethod with a new object
     *
     * @param newPasswordlessMicrosoftAuthenticatorAuthenticationMethod the object to create/update
     * @return the created PasswordlessMicrosoftAuthenticatorAuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PasswordlessMicrosoftAuthenticatorAuthenticationMethod put(@Nonnull final PasswordlessMicrosoftAuthenticatorAuthenticationMethod newPasswordlessMicrosoftAuthenticatorAuthenticationMethod) throws ClientException {
        return send(HttpMethod.PUT, newPasswordlessMicrosoftAuthenticatorAuthenticationMethod);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PasswordlessMicrosoftAuthenticatorAuthenticationMethodRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public PasswordlessMicrosoftAuthenticatorAuthenticationMethodRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

