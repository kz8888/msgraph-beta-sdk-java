// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SymantecCodeSigningCertificate;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Symantec Code Signing Certificate Request.
 */
public class SymantecCodeSigningCertificateRequest extends BaseRequest implements ISymantecCodeSigningCertificateRequest {
	
    /**
     * The request for the SymantecCodeSigningCertificate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SymantecCodeSigningCertificateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SymantecCodeSigningCertificate.class);
    }

    /**
     * Gets the SymantecCodeSigningCertificate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super SymantecCodeSigningCertificate> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SymantecCodeSigningCertificate from the service
     *
     * @return the SymantecCodeSigningCertificate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SymantecCodeSigningCertificate get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super SymantecCodeSigningCertificate> callback) {
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
     * Patches this SymantecCodeSigningCertificate with a source
     *
     * @param sourceSymantecCodeSigningCertificate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SymantecCodeSigningCertificate sourceSymantecCodeSigningCertificate, final ICallback<? super SymantecCodeSigningCertificate> callback) {
        send(HttpMethod.PATCH, callback, sourceSymantecCodeSigningCertificate);
    }

    /**
     * Patches this SymantecCodeSigningCertificate with a source
     *
     * @param sourceSymantecCodeSigningCertificate the source object with updates
     * @return the updated SymantecCodeSigningCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SymantecCodeSigningCertificate patch(final SymantecCodeSigningCertificate sourceSymantecCodeSigningCertificate) throws ClientException {
        return send(HttpMethod.PATCH, sourceSymantecCodeSigningCertificate);
    }

    /**
     * Creates a SymantecCodeSigningCertificate with a new object
     *
     * @param newSymantecCodeSigningCertificate the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SymantecCodeSigningCertificate newSymantecCodeSigningCertificate, final ICallback<? super SymantecCodeSigningCertificate> callback) {
        send(HttpMethod.POST, callback, newSymantecCodeSigningCertificate);
    }

    /**
     * Creates a SymantecCodeSigningCertificate with a new object
     *
     * @param newSymantecCodeSigningCertificate the new object to create
     * @return the created SymantecCodeSigningCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SymantecCodeSigningCertificate post(final SymantecCodeSigningCertificate newSymantecCodeSigningCertificate) throws ClientException {
        return send(HttpMethod.POST, newSymantecCodeSigningCertificate);
    }

    /**
     * Creates a SymantecCodeSigningCertificate with a new object
     *
     * @param newSymantecCodeSigningCertificate the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SymantecCodeSigningCertificate newSymantecCodeSigningCertificate, final ICallback<? super SymantecCodeSigningCertificate> callback) {
        send(HttpMethod.PUT, callback, newSymantecCodeSigningCertificate);
    }

    /**
     * Creates a SymantecCodeSigningCertificate with a new object
     *
     * @param newSymantecCodeSigningCertificate the object to create/update
     * @return the created SymantecCodeSigningCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SymantecCodeSigningCertificate put(final SymantecCodeSigningCertificate newSymantecCodeSigningCertificate) throws ClientException {
        return send(HttpMethod.PUT, newSymantecCodeSigningCertificate);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISymantecCodeSigningCertificateRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SymantecCodeSigningCertificateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISymantecCodeSigningCertificateRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SymantecCodeSigningCertificateRequest)this;
     }

}

