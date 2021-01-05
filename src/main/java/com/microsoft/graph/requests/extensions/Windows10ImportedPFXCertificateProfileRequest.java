// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Windows10ImportedPFXCertificateProfile;
import com.microsoft.graph.requests.extensions.IManagedDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceCertificateStateRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCertificateStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Imported PFXCertificate Profile Request.
 */
public class Windows10ImportedPFXCertificateProfileRequest extends BaseRequest implements IWindows10ImportedPFXCertificateProfileRequest {
	
    /**
     * The request for the Windows10ImportedPFXCertificateProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10ImportedPFXCertificateProfileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows10ImportedPFXCertificateProfile.class);
    }

    /**
     * Gets the Windows10ImportedPFXCertificateProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Windows10ImportedPFXCertificateProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Windows10ImportedPFXCertificateProfile from the service
     *
     * @return the Windows10ImportedPFXCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10ImportedPFXCertificateProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Windows10ImportedPFXCertificateProfile> callback) {
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
     * Patches this Windows10ImportedPFXCertificateProfile with a source
     *
     * @param sourceWindows10ImportedPFXCertificateProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Windows10ImportedPFXCertificateProfile sourceWindows10ImportedPFXCertificateProfile, final ICallback<? super Windows10ImportedPFXCertificateProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceWindows10ImportedPFXCertificateProfile);
    }

    /**
     * Patches this Windows10ImportedPFXCertificateProfile with a source
     *
     * @param sourceWindows10ImportedPFXCertificateProfile the source object with updates
     * @return the updated Windows10ImportedPFXCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10ImportedPFXCertificateProfile patch(final Windows10ImportedPFXCertificateProfile sourceWindows10ImportedPFXCertificateProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows10ImportedPFXCertificateProfile);
    }

    /**
     * Creates a Windows10ImportedPFXCertificateProfile with a new object
     *
     * @param newWindows10ImportedPFXCertificateProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Windows10ImportedPFXCertificateProfile newWindows10ImportedPFXCertificateProfile, final ICallback<? super Windows10ImportedPFXCertificateProfile> callback) {
        send(HttpMethod.POST, callback, newWindows10ImportedPFXCertificateProfile);
    }

    /**
     * Creates a Windows10ImportedPFXCertificateProfile with a new object
     *
     * @param newWindows10ImportedPFXCertificateProfile the new object to create
     * @return the created Windows10ImportedPFXCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10ImportedPFXCertificateProfile post(final Windows10ImportedPFXCertificateProfile newWindows10ImportedPFXCertificateProfile) throws ClientException {
        return send(HttpMethod.POST, newWindows10ImportedPFXCertificateProfile);
    }

    /**
     * Creates a Windows10ImportedPFXCertificateProfile with a new object
     *
     * @param newWindows10ImportedPFXCertificateProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Windows10ImportedPFXCertificateProfile newWindows10ImportedPFXCertificateProfile, final ICallback<? super Windows10ImportedPFXCertificateProfile> callback) {
        send(HttpMethod.PUT, callback, newWindows10ImportedPFXCertificateProfile);
    }

    /**
     * Creates a Windows10ImportedPFXCertificateProfile with a new object
     *
     * @param newWindows10ImportedPFXCertificateProfile the object to create/update
     * @return the created Windows10ImportedPFXCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10ImportedPFXCertificateProfile put(final Windows10ImportedPFXCertificateProfile newWindows10ImportedPFXCertificateProfile) throws ClientException {
        return send(HttpMethod.PUT, newWindows10ImportedPFXCertificateProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindows10ImportedPFXCertificateProfileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (Windows10ImportedPFXCertificateProfileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindows10ImportedPFXCertificateProfileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (Windows10ImportedPFXCertificateProfileRequest)this;
     }

}

