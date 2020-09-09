// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidScepCertificateProfile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Scep Certificate Profile Request.
 */
public interface IAndroidScepCertificateProfileRequest extends IHttpRequest {

    /**
     * Gets the AndroidScepCertificateProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AndroidScepCertificateProfile> callback);

    /**
     * Gets the AndroidScepCertificateProfile from the service
     *
     * @return the AndroidScepCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidScepCertificateProfile get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AndroidScepCertificateProfile> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidScepCertificateProfile with a source
     *
     * @param sourceAndroidScepCertificateProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidScepCertificateProfile sourceAndroidScepCertificateProfile, final ICallback<AndroidScepCertificateProfile> callback);

    /**
     * Patches this AndroidScepCertificateProfile with a source
     *
     * @param sourceAndroidScepCertificateProfile the source object with updates
     * @return the updated AndroidScepCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidScepCertificateProfile patch(final AndroidScepCertificateProfile sourceAndroidScepCertificateProfile) throws ClientException;

    /**
     * Posts a AndroidScepCertificateProfile with a new object
     *
     * @param newAndroidScepCertificateProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidScepCertificateProfile newAndroidScepCertificateProfile, final ICallback<AndroidScepCertificateProfile> callback);

    /**
     * Posts a AndroidScepCertificateProfile with a new object
     *
     * @param newAndroidScepCertificateProfile the new object to create
     * @return the created AndroidScepCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidScepCertificateProfile post(final AndroidScepCertificateProfile newAndroidScepCertificateProfile) throws ClientException;

    /**
     * Posts a AndroidScepCertificateProfile with a new object
     *
     * @param newAndroidScepCertificateProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AndroidScepCertificateProfile newAndroidScepCertificateProfile, final ICallback<AndroidScepCertificateProfile> callback);

    /**
     * Posts a AndroidScepCertificateProfile with a new object
     *
     * @param newAndroidScepCertificateProfile the object to create/update
     * @return the created AndroidScepCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidScepCertificateProfile put(final AndroidScepCertificateProfile newAndroidScepCertificateProfile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidScepCertificateProfileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidScepCertificateProfileRequest expand(final String value);

}

