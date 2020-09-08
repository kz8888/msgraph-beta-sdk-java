// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CredentialUserRegistrationCount;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Credential User Registration Count Request.
 */
public class CredentialUserRegistrationCountRequest extends BaseRequest implements ICredentialUserRegistrationCountRequest {
	
    /**
     * The request for the CredentialUserRegistrationCount
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CredentialUserRegistrationCountRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CredentialUserRegistrationCount.class);
    }

    /**
     * Gets the CredentialUserRegistrationCount from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<CredentialUserRegistrationCount> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the CredentialUserRegistrationCount from the service
     *
     * @return the CredentialUserRegistrationCount from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CredentialUserRegistrationCount get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<CredentialUserRegistrationCount> callback) {
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
     * Patches this CredentialUserRegistrationCount with a source
     *
     * @param sourceCredentialUserRegistrationCount the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final CredentialUserRegistrationCount sourceCredentialUserRegistrationCount, final ICallback<CredentialUserRegistrationCount> callback) {
        send(HttpMethod.PATCH, callback, sourceCredentialUserRegistrationCount);
    }

    /**
     * Patches this CredentialUserRegistrationCount with a source
     *
     * @param sourceCredentialUserRegistrationCount the source object with updates
     * @return the updated CredentialUserRegistrationCount
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CredentialUserRegistrationCount patch(final CredentialUserRegistrationCount sourceCredentialUserRegistrationCount) throws ClientException {
        return send(HttpMethod.PATCH, sourceCredentialUserRegistrationCount);
    }

    /**
     * Creates a CredentialUserRegistrationCount with a new object
     *
     * @param newCredentialUserRegistrationCount the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final CredentialUserRegistrationCount newCredentialUserRegistrationCount, final ICallback<CredentialUserRegistrationCount> callback) {
        send(HttpMethod.POST, callback, newCredentialUserRegistrationCount);
    }

    /**
     * Creates a CredentialUserRegistrationCount with a new object
     *
     * @param newCredentialUserRegistrationCount the new object to create
     * @return the created CredentialUserRegistrationCount
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CredentialUserRegistrationCount post(final CredentialUserRegistrationCount newCredentialUserRegistrationCount) throws ClientException {
        return send(HttpMethod.POST, newCredentialUserRegistrationCount);
    }

    /**
     * Creates a CredentialUserRegistrationCount with a new object
     *
     * @param newCredentialUserRegistrationCount the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final CredentialUserRegistrationCount newCredentialUserRegistrationCount, final ICallback<CredentialUserRegistrationCount> callback) {
        send(HttpMethod.PUT, callback, newCredentialUserRegistrationCount);
    }

    /**
     * Creates a CredentialUserRegistrationCount with a new object
     *
     * @param newCredentialUserRegistrationCount the object to create/update
     * @return the created CredentialUserRegistrationCount
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CredentialUserRegistrationCount put(final CredentialUserRegistrationCount newCredentialUserRegistrationCount) throws ClientException {
        return send(HttpMethod.PUT, newCredentialUserRegistrationCount);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ICredentialUserRegistrationCountRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (CredentialUserRegistrationCountRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ICredentialUserRegistrationCountRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (CredentialUserRegistrationCountRequest)this;
     }

}

