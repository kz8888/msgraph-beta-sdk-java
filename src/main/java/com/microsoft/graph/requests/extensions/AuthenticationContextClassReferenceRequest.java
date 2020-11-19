// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AuthenticationContextClassReference;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Context Class Reference Request.
 */
public class AuthenticationContextClassReferenceRequest extends BaseRequest implements IAuthenticationContextClassReferenceRequest {
	
    /**
     * The request for the AuthenticationContextClassReference
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuthenticationContextClassReferenceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AuthenticationContextClassReference.class);
    }

    /**
     * Gets the AuthenticationContextClassReference from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AuthenticationContextClassReference> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AuthenticationContextClassReference from the service
     *
     * @return the AuthenticationContextClassReference from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AuthenticationContextClassReference get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AuthenticationContextClassReference> callback) {
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
     * Patches this AuthenticationContextClassReference with a source
     *
     * @param sourceAuthenticationContextClassReference the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AuthenticationContextClassReference sourceAuthenticationContextClassReference, final ICallback<? super AuthenticationContextClassReference> callback) {
        send(HttpMethod.PATCH, callback, sourceAuthenticationContextClassReference);
    }

    /**
     * Patches this AuthenticationContextClassReference with a source
     *
     * @param sourceAuthenticationContextClassReference the source object with updates
     * @return the updated AuthenticationContextClassReference
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AuthenticationContextClassReference patch(final AuthenticationContextClassReference sourceAuthenticationContextClassReference) throws ClientException {
        return send(HttpMethod.PATCH, sourceAuthenticationContextClassReference);
    }

    /**
     * Creates a AuthenticationContextClassReference with a new object
     *
     * @param newAuthenticationContextClassReference the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AuthenticationContextClassReference newAuthenticationContextClassReference, final ICallback<? super AuthenticationContextClassReference> callback) {
        send(HttpMethod.POST, callback, newAuthenticationContextClassReference);
    }

    /**
     * Creates a AuthenticationContextClassReference with a new object
     *
     * @param newAuthenticationContextClassReference the new object to create
     * @return the created AuthenticationContextClassReference
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AuthenticationContextClassReference post(final AuthenticationContextClassReference newAuthenticationContextClassReference) throws ClientException {
        return send(HttpMethod.POST, newAuthenticationContextClassReference);
    }

    /**
     * Creates a AuthenticationContextClassReference with a new object
     *
     * @param newAuthenticationContextClassReference the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AuthenticationContextClassReference newAuthenticationContextClassReference, final ICallback<? super AuthenticationContextClassReference> callback) {
        send(HttpMethod.PUT, callback, newAuthenticationContextClassReference);
    }

    /**
     * Creates a AuthenticationContextClassReference with a new object
     *
     * @param newAuthenticationContextClassReference the object to create/update
     * @return the created AuthenticationContextClassReference
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AuthenticationContextClassReference put(final AuthenticationContextClassReference newAuthenticationContextClassReference) throws ClientException {
        return send(HttpMethod.PUT, newAuthenticationContextClassReference);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAuthenticationContextClassReferenceRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AuthenticationContextClassReferenceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAuthenticationContextClassReferenceRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AuthenticationContextClassReferenceRequest)this;
     }

}

