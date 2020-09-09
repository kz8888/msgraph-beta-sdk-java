// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsPhone81SCEPCertificateProfile;
import com.microsoft.graph.requests.extensions.IManagedDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceCertificateStateRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCertificateStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsPhone81TrustedRootCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsPhone81TrustedRootCertificateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Phone81SCEPCertificate Profile Request.
 */
public class WindowsPhone81SCEPCertificateProfileRequest extends BaseRequest implements IWindowsPhone81SCEPCertificateProfileRequest {
	
    /**
     * The request for the WindowsPhone81SCEPCertificateProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsPhone81SCEPCertificateProfileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsPhone81SCEPCertificateProfile.class);
    }

    /**
     * Gets the WindowsPhone81SCEPCertificateProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WindowsPhone81SCEPCertificateProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsPhone81SCEPCertificateProfile from the service
     *
     * @return the WindowsPhone81SCEPCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81SCEPCertificateProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WindowsPhone81SCEPCertificateProfile> callback) {
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
     * Patches this WindowsPhone81SCEPCertificateProfile with a source
     *
     * @param sourceWindowsPhone81SCEPCertificateProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsPhone81SCEPCertificateProfile sourceWindowsPhone81SCEPCertificateProfile, final ICallback<WindowsPhone81SCEPCertificateProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsPhone81SCEPCertificateProfile);
    }

    /**
     * Patches this WindowsPhone81SCEPCertificateProfile with a source
     *
     * @param sourceWindowsPhone81SCEPCertificateProfile the source object with updates
     * @return the updated WindowsPhone81SCEPCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81SCEPCertificateProfile patch(final WindowsPhone81SCEPCertificateProfile sourceWindowsPhone81SCEPCertificateProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsPhone81SCEPCertificateProfile);
    }

    /**
     * Creates a WindowsPhone81SCEPCertificateProfile with a new object
     *
     * @param newWindowsPhone81SCEPCertificateProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsPhone81SCEPCertificateProfile newWindowsPhone81SCEPCertificateProfile, final ICallback<WindowsPhone81SCEPCertificateProfile> callback) {
        send(HttpMethod.POST, callback, newWindowsPhone81SCEPCertificateProfile);
    }

    /**
     * Creates a WindowsPhone81SCEPCertificateProfile with a new object
     *
     * @param newWindowsPhone81SCEPCertificateProfile the new object to create
     * @return the created WindowsPhone81SCEPCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81SCEPCertificateProfile post(final WindowsPhone81SCEPCertificateProfile newWindowsPhone81SCEPCertificateProfile) throws ClientException {
        return send(HttpMethod.POST, newWindowsPhone81SCEPCertificateProfile);
    }

    /**
     * Creates a WindowsPhone81SCEPCertificateProfile with a new object
     *
     * @param newWindowsPhone81SCEPCertificateProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsPhone81SCEPCertificateProfile newWindowsPhone81SCEPCertificateProfile, final ICallback<WindowsPhone81SCEPCertificateProfile> callback) {
        send(HttpMethod.PUT, callback, newWindowsPhone81SCEPCertificateProfile);
    }

    /**
     * Creates a WindowsPhone81SCEPCertificateProfile with a new object
     *
     * @param newWindowsPhone81SCEPCertificateProfile the object to create/update
     * @return the created WindowsPhone81SCEPCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81SCEPCertificateProfile put(final WindowsPhone81SCEPCertificateProfile newWindowsPhone81SCEPCertificateProfile) throws ClientException {
        return send(HttpMethod.PUT, newWindowsPhone81SCEPCertificateProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsPhone81SCEPCertificateProfileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsPhone81SCEPCertificateProfileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsPhone81SCEPCertificateProfileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsPhone81SCEPCertificateProfileRequest)this;
     }

}

