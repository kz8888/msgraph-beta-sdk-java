// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidTrustedRootCertificate;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Trusted Root Certificate Request.
 */
public class AndroidTrustedRootCertificateRequest extends BaseRequest implements IAndroidTrustedRootCertificateRequest {
	
    /**
     * The request for the AndroidTrustedRootCertificate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidTrustedRootCertificateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidTrustedRootCertificate.class);
    }

    /**
     * Gets the AndroidTrustedRootCertificate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AndroidTrustedRootCertificate> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidTrustedRootCertificate from the service
     *
     * @return the AndroidTrustedRootCertificate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidTrustedRootCertificate get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AndroidTrustedRootCertificate> callback) {
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
     * Patches this AndroidTrustedRootCertificate with a source
     *
     * @param sourceAndroidTrustedRootCertificate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidTrustedRootCertificate sourceAndroidTrustedRootCertificate, final ICallback<AndroidTrustedRootCertificate> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidTrustedRootCertificate);
    }

    /**
     * Patches this AndroidTrustedRootCertificate with a source
     *
     * @param sourceAndroidTrustedRootCertificate the source object with updates
     * @return the updated AndroidTrustedRootCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidTrustedRootCertificate patch(final AndroidTrustedRootCertificate sourceAndroidTrustedRootCertificate) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidTrustedRootCertificate);
    }

    /**
     * Creates a AndroidTrustedRootCertificate with a new object
     *
     * @param newAndroidTrustedRootCertificate the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidTrustedRootCertificate newAndroidTrustedRootCertificate, final ICallback<AndroidTrustedRootCertificate> callback) {
        send(HttpMethod.POST, callback, newAndroidTrustedRootCertificate);
    }

    /**
     * Creates a AndroidTrustedRootCertificate with a new object
     *
     * @param newAndroidTrustedRootCertificate the new object to create
     * @return the created AndroidTrustedRootCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidTrustedRootCertificate post(final AndroidTrustedRootCertificate newAndroidTrustedRootCertificate) throws ClientException {
        return send(HttpMethod.POST, newAndroidTrustedRootCertificate);
    }

    /**
     * Creates a AndroidTrustedRootCertificate with a new object
     *
     * @param newAndroidTrustedRootCertificate the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AndroidTrustedRootCertificate newAndroidTrustedRootCertificate, final ICallback<AndroidTrustedRootCertificate> callback) {
        send(HttpMethod.PUT, callback, newAndroidTrustedRootCertificate);
    }

    /**
     * Creates a AndroidTrustedRootCertificate with a new object
     *
     * @param newAndroidTrustedRootCertificate the object to create/update
     * @return the created AndroidTrustedRootCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidTrustedRootCertificate put(final AndroidTrustedRootCertificate newAndroidTrustedRootCertificate) throws ClientException {
        return send(HttpMethod.PUT, newAndroidTrustedRootCertificate);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidTrustedRootCertificateRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidTrustedRootCertificateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidTrustedRootCertificateRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidTrustedRootCertificateRequest)this;
     }

}

