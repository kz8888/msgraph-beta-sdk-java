// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidWorkProfileTrustedRootCertificate;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Work Profile Trusted Root Certificate Request.
 */
public class AndroidWorkProfileTrustedRootCertificateRequest extends BaseRequest implements IAndroidWorkProfileTrustedRootCertificateRequest {
	
    /**
     * The request for the AndroidWorkProfileTrustedRootCertificate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidWorkProfileTrustedRootCertificateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidWorkProfileTrustedRootCertificate.class);
    }

    /**
     * Gets the AndroidWorkProfileTrustedRootCertificate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AndroidWorkProfileTrustedRootCertificate> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidWorkProfileTrustedRootCertificate from the service
     *
     * @return the AndroidWorkProfileTrustedRootCertificate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidWorkProfileTrustedRootCertificate get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AndroidWorkProfileTrustedRootCertificate> callback) {
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
     * Patches this AndroidWorkProfileTrustedRootCertificate with a source
     *
     * @param sourceAndroidWorkProfileTrustedRootCertificate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidWorkProfileTrustedRootCertificate sourceAndroidWorkProfileTrustedRootCertificate, final ICallback<AndroidWorkProfileTrustedRootCertificate> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidWorkProfileTrustedRootCertificate);
    }

    /**
     * Patches this AndroidWorkProfileTrustedRootCertificate with a source
     *
     * @param sourceAndroidWorkProfileTrustedRootCertificate the source object with updates
     * @return the updated AndroidWorkProfileTrustedRootCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidWorkProfileTrustedRootCertificate patch(final AndroidWorkProfileTrustedRootCertificate sourceAndroidWorkProfileTrustedRootCertificate) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidWorkProfileTrustedRootCertificate);
    }

    /**
     * Creates a AndroidWorkProfileTrustedRootCertificate with a new object
     *
     * @param newAndroidWorkProfileTrustedRootCertificate the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidWorkProfileTrustedRootCertificate newAndroidWorkProfileTrustedRootCertificate, final ICallback<AndroidWorkProfileTrustedRootCertificate> callback) {
        send(HttpMethod.POST, callback, newAndroidWorkProfileTrustedRootCertificate);
    }

    /**
     * Creates a AndroidWorkProfileTrustedRootCertificate with a new object
     *
     * @param newAndroidWorkProfileTrustedRootCertificate the new object to create
     * @return the created AndroidWorkProfileTrustedRootCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidWorkProfileTrustedRootCertificate post(final AndroidWorkProfileTrustedRootCertificate newAndroidWorkProfileTrustedRootCertificate) throws ClientException {
        return send(HttpMethod.POST, newAndroidWorkProfileTrustedRootCertificate);
    }

    /**
     * Creates a AndroidWorkProfileTrustedRootCertificate with a new object
     *
     * @param newAndroidWorkProfileTrustedRootCertificate the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AndroidWorkProfileTrustedRootCertificate newAndroidWorkProfileTrustedRootCertificate, final ICallback<AndroidWorkProfileTrustedRootCertificate> callback) {
        send(HttpMethod.PUT, callback, newAndroidWorkProfileTrustedRootCertificate);
    }

    /**
     * Creates a AndroidWorkProfileTrustedRootCertificate with a new object
     *
     * @param newAndroidWorkProfileTrustedRootCertificate the object to create/update
     * @return the created AndroidWorkProfileTrustedRootCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidWorkProfileTrustedRootCertificate put(final AndroidWorkProfileTrustedRootCertificate newAndroidWorkProfileTrustedRootCertificate) throws ClientException {
        return send(HttpMethod.PUT, newAndroidWorkProfileTrustedRootCertificate);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidWorkProfileTrustedRootCertificateRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidWorkProfileTrustedRootCertificateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidWorkProfileTrustedRootCertificateRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidWorkProfileTrustedRootCertificateRequest)this;
     }

}

