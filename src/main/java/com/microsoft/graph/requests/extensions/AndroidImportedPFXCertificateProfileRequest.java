// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidImportedPFXCertificateProfile;
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
 * The class for the Android Imported PFXCertificate Profile Request.
 */
public class AndroidImportedPFXCertificateProfileRequest extends BaseRequest implements IAndroidImportedPFXCertificateProfileRequest {
	
    /**
     * The request for the AndroidImportedPFXCertificateProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidImportedPFXCertificateProfileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidImportedPFXCertificateProfile.class);
    }

    /**
     * Gets the AndroidImportedPFXCertificateProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AndroidImportedPFXCertificateProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidImportedPFXCertificateProfile from the service
     *
     * @return the AndroidImportedPFXCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidImportedPFXCertificateProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AndroidImportedPFXCertificateProfile> callback) {
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
     * Patches this AndroidImportedPFXCertificateProfile with a source
     *
     * @param sourceAndroidImportedPFXCertificateProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidImportedPFXCertificateProfile sourceAndroidImportedPFXCertificateProfile, final ICallback<? super AndroidImportedPFXCertificateProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidImportedPFXCertificateProfile);
    }

    /**
     * Patches this AndroidImportedPFXCertificateProfile with a source
     *
     * @param sourceAndroidImportedPFXCertificateProfile the source object with updates
     * @return the updated AndroidImportedPFXCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidImportedPFXCertificateProfile patch(final AndroidImportedPFXCertificateProfile sourceAndroidImportedPFXCertificateProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidImportedPFXCertificateProfile);
    }

    /**
     * Creates a AndroidImportedPFXCertificateProfile with a new object
     *
     * @param newAndroidImportedPFXCertificateProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidImportedPFXCertificateProfile newAndroidImportedPFXCertificateProfile, final ICallback<? super AndroidImportedPFXCertificateProfile> callback) {
        send(HttpMethod.POST, callback, newAndroidImportedPFXCertificateProfile);
    }

    /**
     * Creates a AndroidImportedPFXCertificateProfile with a new object
     *
     * @param newAndroidImportedPFXCertificateProfile the new object to create
     * @return the created AndroidImportedPFXCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidImportedPFXCertificateProfile post(final AndroidImportedPFXCertificateProfile newAndroidImportedPFXCertificateProfile) throws ClientException {
        return send(HttpMethod.POST, newAndroidImportedPFXCertificateProfile);
    }

    /**
     * Creates a AndroidImportedPFXCertificateProfile with a new object
     *
     * @param newAndroidImportedPFXCertificateProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AndroidImportedPFXCertificateProfile newAndroidImportedPFXCertificateProfile, final ICallback<? super AndroidImportedPFXCertificateProfile> callback) {
        send(HttpMethod.PUT, callback, newAndroidImportedPFXCertificateProfile);
    }

    /**
     * Creates a AndroidImportedPFXCertificateProfile with a new object
     *
     * @param newAndroidImportedPFXCertificateProfile the object to create/update
     * @return the created AndroidImportedPFXCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidImportedPFXCertificateProfile put(final AndroidImportedPFXCertificateProfile newAndroidImportedPFXCertificateProfile) throws ClientException {
        return send(HttpMethod.PUT, newAndroidImportedPFXCertificateProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidImportedPFXCertificateProfileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidImportedPFXCertificateProfileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidImportedPFXCertificateProfileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidImportedPFXCertificateProfileRequest)this;
     }

}

