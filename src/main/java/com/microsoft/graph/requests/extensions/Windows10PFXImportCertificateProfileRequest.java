// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Windows10PFXImportCertificateProfile;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10PFXImport Certificate Profile Request.
 */
public class Windows10PFXImportCertificateProfileRequest extends BaseRequest<Windows10PFXImportCertificateProfile> {
	
    /**
     * The request for the Windows10PFXImportCertificateProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10PFXImportCertificateProfileRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows10PFXImportCertificateProfile.class);
    }

    /**
     * Gets the Windows10PFXImportCertificateProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super Windows10PFXImportCertificateProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Windows10PFXImportCertificateProfile from the service
     *
     * @return the Windows10PFXImportCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10PFXImportCertificateProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super Windows10PFXImportCertificateProfile> callback) {
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
     * Patches this Windows10PFXImportCertificateProfile with a source
     *
     * @param sourceWindows10PFXImportCertificateProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final Windows10PFXImportCertificateProfile sourceWindows10PFXImportCertificateProfile, @Nonnull final ICallback<? super Windows10PFXImportCertificateProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceWindows10PFXImportCertificateProfile);
    }

    /**
     * Patches this Windows10PFXImportCertificateProfile with a source
     *
     * @param sourceWindows10PFXImportCertificateProfile the source object with updates
     * @return the updated Windows10PFXImportCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10PFXImportCertificateProfile patch(@Nonnull final Windows10PFXImportCertificateProfile sourceWindows10PFXImportCertificateProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows10PFXImportCertificateProfile);
    }

    /**
     * Creates a Windows10PFXImportCertificateProfile with a new object
     *
     * @param newWindows10PFXImportCertificateProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final Windows10PFXImportCertificateProfile newWindows10PFXImportCertificateProfile, @Nonnull final ICallback<? super Windows10PFXImportCertificateProfile> callback) {
        send(HttpMethod.POST, callback, newWindows10PFXImportCertificateProfile);
    }

    /**
     * Creates a Windows10PFXImportCertificateProfile with a new object
     *
     * @param newWindows10PFXImportCertificateProfile the new object to create
     * @return the created Windows10PFXImportCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10PFXImportCertificateProfile post(@Nonnull final Windows10PFXImportCertificateProfile newWindows10PFXImportCertificateProfile) throws ClientException {
        return send(HttpMethod.POST, newWindows10PFXImportCertificateProfile);
    }

    /**
     * Creates a Windows10PFXImportCertificateProfile with a new object
     *
     * @param newWindows10PFXImportCertificateProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final Windows10PFXImportCertificateProfile newWindows10PFXImportCertificateProfile, @Nonnull final ICallback<? super Windows10PFXImportCertificateProfile> callback) {
        send(HttpMethod.PUT, callback, newWindows10PFXImportCertificateProfile);
    }

    /**
     * Creates a Windows10PFXImportCertificateProfile with a new object
     *
     * @param newWindows10PFXImportCertificateProfile the object to create/update
     * @return the created Windows10PFXImportCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10PFXImportCertificateProfile put(@Nonnull final Windows10PFXImportCertificateProfile newWindows10PFXImportCertificateProfile) throws ClientException {
        return send(HttpMethod.PUT, newWindows10PFXImportCertificateProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public Windows10PFXImportCertificateProfileRequest select(@Nonnull final String value) {
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
     public Windows10PFXImportCertificateProfileRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

