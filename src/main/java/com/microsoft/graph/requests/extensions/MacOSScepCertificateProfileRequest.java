// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSScepCertificateProfile;
import com.microsoft.graph.requests.extensions.ManagedDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCertificateStateRequestBuilder;
import com.microsoft.graph.requests.extensions.MacOSTrustedRootCertificateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSScep Certificate Profile Request.
 */
public class MacOSScepCertificateProfileRequest extends BaseRequest<MacOSScepCertificateProfile> {
	
    /**
     * The request for the MacOSScepCertificateProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSScepCertificateProfileRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSScepCertificateProfile.class);
    }

    /**
     * Gets the MacOSScepCertificateProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super MacOSScepCertificateProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MacOSScepCertificateProfile from the service
     *
     * @return the MacOSScepCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSScepCertificateProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super MacOSScepCertificateProfile> callback) {
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
     * Patches this MacOSScepCertificateProfile with a source
     *
     * @param sourceMacOSScepCertificateProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final MacOSScepCertificateProfile sourceMacOSScepCertificateProfile, @Nonnull final ICallback<? super MacOSScepCertificateProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceMacOSScepCertificateProfile);
    }

    /**
     * Patches this MacOSScepCertificateProfile with a source
     *
     * @param sourceMacOSScepCertificateProfile the source object with updates
     * @return the updated MacOSScepCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSScepCertificateProfile patch(@Nonnull final MacOSScepCertificateProfile sourceMacOSScepCertificateProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceMacOSScepCertificateProfile);
    }

    /**
     * Creates a MacOSScepCertificateProfile with a new object
     *
     * @param newMacOSScepCertificateProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final MacOSScepCertificateProfile newMacOSScepCertificateProfile, @Nonnull final ICallback<? super MacOSScepCertificateProfile> callback) {
        send(HttpMethod.POST, callback, newMacOSScepCertificateProfile);
    }

    /**
     * Creates a MacOSScepCertificateProfile with a new object
     *
     * @param newMacOSScepCertificateProfile the new object to create
     * @return the created MacOSScepCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSScepCertificateProfile post(@Nonnull final MacOSScepCertificateProfile newMacOSScepCertificateProfile) throws ClientException {
        return send(HttpMethod.POST, newMacOSScepCertificateProfile);
    }

    /**
     * Creates a MacOSScepCertificateProfile with a new object
     *
     * @param newMacOSScepCertificateProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final MacOSScepCertificateProfile newMacOSScepCertificateProfile, @Nonnull final ICallback<? super MacOSScepCertificateProfile> callback) {
        send(HttpMethod.PUT, callback, newMacOSScepCertificateProfile);
    }

    /**
     * Creates a MacOSScepCertificateProfile with a new object
     *
     * @param newMacOSScepCertificateProfile the object to create/update
     * @return the created MacOSScepCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSScepCertificateProfile put(@Nonnull final MacOSScepCertificateProfile newMacOSScepCertificateProfile) throws ClientException {
        return send(HttpMethod.PUT, newMacOSScepCertificateProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MacOSScepCertificateProfileRequest select(@Nonnull final String value) {
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
     public MacOSScepCertificateProfileRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

