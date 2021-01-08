// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidForWorkImportedPFXCertificateProfile;
import com.microsoft.graph.requests.extensions.ManagedDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCertificateStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Imported PFXCertificate Profile Request.
 */
public class AndroidForWorkImportedPFXCertificateProfileRequest extends BaseRequest<AndroidForWorkImportedPFXCertificateProfile> {
	
    /**
     * The request for the AndroidForWorkImportedPFXCertificateProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkImportedPFXCertificateProfileRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidForWorkImportedPFXCertificateProfile.class);
    }

    /**
     * Gets the AndroidForWorkImportedPFXCertificateProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super AndroidForWorkImportedPFXCertificateProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidForWorkImportedPFXCertificateProfile from the service
     *
     * @return the AndroidForWorkImportedPFXCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkImportedPFXCertificateProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super AndroidForWorkImportedPFXCertificateProfile> callback) {
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
     * Patches this AndroidForWorkImportedPFXCertificateProfile with a source
     *
     * @param sourceAndroidForWorkImportedPFXCertificateProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final AndroidForWorkImportedPFXCertificateProfile sourceAndroidForWorkImportedPFXCertificateProfile, @Nonnull final ICallback<? super AndroidForWorkImportedPFXCertificateProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidForWorkImportedPFXCertificateProfile);
    }

    /**
     * Patches this AndroidForWorkImportedPFXCertificateProfile with a source
     *
     * @param sourceAndroidForWorkImportedPFXCertificateProfile the source object with updates
     * @return the updated AndroidForWorkImportedPFXCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkImportedPFXCertificateProfile patch(@Nonnull final AndroidForWorkImportedPFXCertificateProfile sourceAndroidForWorkImportedPFXCertificateProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidForWorkImportedPFXCertificateProfile);
    }

    /**
     * Creates a AndroidForWorkImportedPFXCertificateProfile with a new object
     *
     * @param newAndroidForWorkImportedPFXCertificateProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final AndroidForWorkImportedPFXCertificateProfile newAndroidForWorkImportedPFXCertificateProfile, @Nonnull final ICallback<? super AndroidForWorkImportedPFXCertificateProfile> callback) {
        send(HttpMethod.POST, callback, newAndroidForWorkImportedPFXCertificateProfile);
    }

    /**
     * Creates a AndroidForWorkImportedPFXCertificateProfile with a new object
     *
     * @param newAndroidForWorkImportedPFXCertificateProfile the new object to create
     * @return the created AndroidForWorkImportedPFXCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkImportedPFXCertificateProfile post(@Nonnull final AndroidForWorkImportedPFXCertificateProfile newAndroidForWorkImportedPFXCertificateProfile) throws ClientException {
        return send(HttpMethod.POST, newAndroidForWorkImportedPFXCertificateProfile);
    }

    /**
     * Creates a AndroidForWorkImportedPFXCertificateProfile with a new object
     *
     * @param newAndroidForWorkImportedPFXCertificateProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final AndroidForWorkImportedPFXCertificateProfile newAndroidForWorkImportedPFXCertificateProfile, @Nonnull final ICallback<? super AndroidForWorkImportedPFXCertificateProfile> callback) {
        send(HttpMethod.PUT, callback, newAndroidForWorkImportedPFXCertificateProfile);
    }

    /**
     * Creates a AndroidForWorkImportedPFXCertificateProfile with a new object
     *
     * @param newAndroidForWorkImportedPFXCertificateProfile the object to create/update
     * @return the created AndroidForWorkImportedPFXCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkImportedPFXCertificateProfile put(@Nonnull final AndroidForWorkImportedPFXCertificateProfile newAndroidForWorkImportedPFXCertificateProfile) throws ClientException {
        return send(HttpMethod.PUT, newAndroidForWorkImportedPFXCertificateProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidForWorkImportedPFXCertificateProfileRequest select(@Nonnull final String value) {
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
     public AndroidForWorkImportedPFXCertificateProfileRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

