// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSCertificateProfileBase;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSCertificate Profile Base Request.
 */
public class MacOSCertificateProfileBaseRequest extends BaseRequest<MacOSCertificateProfileBase> {
	
    /**
     * The request for the MacOSCertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public MacOSCertificateProfileBaseRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends MacOSCertificateProfileBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the MacOSCertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSCertificateProfileBaseRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSCertificateProfileBase.class);
    }

    /**
     * Gets the MacOSCertificateProfileBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super MacOSCertificateProfileBase> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MacOSCertificateProfileBase from the service
     *
     * @return the MacOSCertificateProfileBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSCertificateProfileBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super MacOSCertificateProfileBase> callback) {
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
     * Patches this MacOSCertificateProfileBase with a source
     *
     * @param sourceMacOSCertificateProfileBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final MacOSCertificateProfileBase sourceMacOSCertificateProfileBase, @Nonnull final ICallback<? super MacOSCertificateProfileBase> callback) {
        send(HttpMethod.PATCH, callback, sourceMacOSCertificateProfileBase);
    }

    /**
     * Patches this MacOSCertificateProfileBase with a source
     *
     * @param sourceMacOSCertificateProfileBase the source object with updates
     * @return the updated MacOSCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSCertificateProfileBase patch(@Nonnull final MacOSCertificateProfileBase sourceMacOSCertificateProfileBase) throws ClientException {
        return send(HttpMethod.PATCH, sourceMacOSCertificateProfileBase);
    }

    /**
     * Creates a MacOSCertificateProfileBase with a new object
     *
     * @param newMacOSCertificateProfileBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final MacOSCertificateProfileBase newMacOSCertificateProfileBase, @Nonnull final ICallback<? super MacOSCertificateProfileBase> callback) {
        send(HttpMethod.POST, callback, newMacOSCertificateProfileBase);
    }

    /**
     * Creates a MacOSCertificateProfileBase with a new object
     *
     * @param newMacOSCertificateProfileBase the new object to create
     * @return the created MacOSCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSCertificateProfileBase post(@Nonnull final MacOSCertificateProfileBase newMacOSCertificateProfileBase) throws ClientException {
        return send(HttpMethod.POST, newMacOSCertificateProfileBase);
    }

    /**
     * Creates a MacOSCertificateProfileBase with a new object
     *
     * @param newMacOSCertificateProfileBase the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final MacOSCertificateProfileBase newMacOSCertificateProfileBase, @Nonnull final ICallback<? super MacOSCertificateProfileBase> callback) {
        send(HttpMethod.PUT, callback, newMacOSCertificateProfileBase);
    }

    /**
     * Creates a MacOSCertificateProfileBase with a new object
     *
     * @param newMacOSCertificateProfileBase the object to create/update
     * @return the created MacOSCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSCertificateProfileBase put(@Nonnull final MacOSCertificateProfileBase newMacOSCertificateProfileBase) throws ClientException {
        return send(HttpMethod.PUT, newMacOSCertificateProfileBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MacOSCertificateProfileBaseRequest select(@Nonnull final String value) {
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
     public MacOSCertificateProfileBaseRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

