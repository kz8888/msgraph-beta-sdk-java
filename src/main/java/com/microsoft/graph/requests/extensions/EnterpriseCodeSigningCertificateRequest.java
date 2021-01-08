// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EnterpriseCodeSigningCertificate;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Enterprise Code Signing Certificate Request.
 */
public class EnterpriseCodeSigningCertificateRequest extends BaseRequest<EnterpriseCodeSigningCertificate> {
	
    /**
     * The request for the EnterpriseCodeSigningCertificate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EnterpriseCodeSigningCertificateRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EnterpriseCodeSigningCertificate.class);
    }

    /**
     * Gets the EnterpriseCodeSigningCertificate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super EnterpriseCodeSigningCertificate> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EnterpriseCodeSigningCertificate from the service
     *
     * @return the EnterpriseCodeSigningCertificate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EnterpriseCodeSigningCertificate get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super EnterpriseCodeSigningCertificate> callback) {
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
     * Patches this EnterpriseCodeSigningCertificate with a source
     *
     * @param sourceEnterpriseCodeSigningCertificate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final EnterpriseCodeSigningCertificate sourceEnterpriseCodeSigningCertificate, @Nonnull final ICallback<? super EnterpriseCodeSigningCertificate> callback) {
        send(HttpMethod.PATCH, callback, sourceEnterpriseCodeSigningCertificate);
    }

    /**
     * Patches this EnterpriseCodeSigningCertificate with a source
     *
     * @param sourceEnterpriseCodeSigningCertificate the source object with updates
     * @return the updated EnterpriseCodeSigningCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EnterpriseCodeSigningCertificate patch(@Nonnull final EnterpriseCodeSigningCertificate sourceEnterpriseCodeSigningCertificate) throws ClientException {
        return send(HttpMethod.PATCH, sourceEnterpriseCodeSigningCertificate);
    }

    /**
     * Creates a EnterpriseCodeSigningCertificate with a new object
     *
     * @param newEnterpriseCodeSigningCertificate the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final EnterpriseCodeSigningCertificate newEnterpriseCodeSigningCertificate, @Nonnull final ICallback<? super EnterpriseCodeSigningCertificate> callback) {
        send(HttpMethod.POST, callback, newEnterpriseCodeSigningCertificate);
    }

    /**
     * Creates a EnterpriseCodeSigningCertificate with a new object
     *
     * @param newEnterpriseCodeSigningCertificate the new object to create
     * @return the created EnterpriseCodeSigningCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EnterpriseCodeSigningCertificate post(@Nonnull final EnterpriseCodeSigningCertificate newEnterpriseCodeSigningCertificate) throws ClientException {
        return send(HttpMethod.POST, newEnterpriseCodeSigningCertificate);
    }

    /**
     * Creates a EnterpriseCodeSigningCertificate with a new object
     *
     * @param newEnterpriseCodeSigningCertificate the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final EnterpriseCodeSigningCertificate newEnterpriseCodeSigningCertificate, @Nonnull final ICallback<? super EnterpriseCodeSigningCertificate> callback) {
        send(HttpMethod.PUT, callback, newEnterpriseCodeSigningCertificate);
    }

    /**
     * Creates a EnterpriseCodeSigningCertificate with a new object
     *
     * @param newEnterpriseCodeSigningCertificate the object to create/update
     * @return the created EnterpriseCodeSigningCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EnterpriseCodeSigningCertificate put(@Nonnull final EnterpriseCodeSigningCertificate newEnterpriseCodeSigningCertificate) throws ClientException {
        return send(HttpMethod.PUT, newEnterpriseCodeSigningCertificate);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EnterpriseCodeSigningCertificateRequest select(@Nonnull final String value) {
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
     public EnterpriseCodeSigningCertificateRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

