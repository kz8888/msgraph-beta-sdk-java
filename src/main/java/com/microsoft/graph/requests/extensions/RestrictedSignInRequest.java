// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RestrictedSignIn;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Restricted Sign In Request.
 */
public class RestrictedSignInRequest extends BaseRequest<RestrictedSignIn> {
	
    /**
     * The request for the RestrictedSignIn
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RestrictedSignInRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RestrictedSignIn.class);
    }

    /**
     * Gets the RestrictedSignIn from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super RestrictedSignIn> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the RestrictedSignIn from the service
     *
     * @return the RestrictedSignIn from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public RestrictedSignIn get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super RestrictedSignIn> callback) {
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
     * Patches this RestrictedSignIn with a source
     *
     * @param sourceRestrictedSignIn the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final RestrictedSignIn sourceRestrictedSignIn, @Nonnull final ICallback<? super RestrictedSignIn> callback) {
        send(HttpMethod.PATCH, callback, sourceRestrictedSignIn);
    }

    /**
     * Patches this RestrictedSignIn with a source
     *
     * @param sourceRestrictedSignIn the source object with updates
     * @return the updated RestrictedSignIn
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public RestrictedSignIn patch(@Nonnull final RestrictedSignIn sourceRestrictedSignIn) throws ClientException {
        return send(HttpMethod.PATCH, sourceRestrictedSignIn);
    }

    /**
     * Creates a RestrictedSignIn with a new object
     *
     * @param newRestrictedSignIn the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final RestrictedSignIn newRestrictedSignIn, @Nonnull final ICallback<? super RestrictedSignIn> callback) {
        send(HttpMethod.POST, callback, newRestrictedSignIn);
    }

    /**
     * Creates a RestrictedSignIn with a new object
     *
     * @param newRestrictedSignIn the new object to create
     * @return the created RestrictedSignIn
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public RestrictedSignIn post(@Nonnull final RestrictedSignIn newRestrictedSignIn) throws ClientException {
        return send(HttpMethod.POST, newRestrictedSignIn);
    }

    /**
     * Creates a RestrictedSignIn with a new object
     *
     * @param newRestrictedSignIn the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final RestrictedSignIn newRestrictedSignIn, @Nonnull final ICallback<? super RestrictedSignIn> callback) {
        send(HttpMethod.PUT, callback, newRestrictedSignIn);
    }

    /**
     * Creates a RestrictedSignIn with a new object
     *
     * @param newRestrictedSignIn the object to create/update
     * @return the created RestrictedSignIn
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public RestrictedSignIn put(@Nonnull final RestrictedSignIn newRestrictedSignIn) throws ClientException {
        return send(HttpMethod.PUT, newRestrictedSignIn);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public RestrictedSignInRequest select(@Nonnull final String value) {
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
     public RestrictedSignInRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

