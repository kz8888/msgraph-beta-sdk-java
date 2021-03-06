// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Windows10ImportedPFXCertificateProfile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows10Imported PFXCertificate Profile Request.
 */
public interface IWindows10ImportedPFXCertificateProfileRequest extends IHttpRequest {

    /**
     * Gets the Windows10ImportedPFXCertificateProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Windows10ImportedPFXCertificateProfile> callback);

    /**
     * Gets the Windows10ImportedPFXCertificateProfile from the service
     *
     * @return the Windows10ImportedPFXCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10ImportedPFXCertificateProfile get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Windows10ImportedPFXCertificateProfile> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Windows10ImportedPFXCertificateProfile with a source
     *
     * @param sourceWindows10ImportedPFXCertificateProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Windows10ImportedPFXCertificateProfile sourceWindows10ImportedPFXCertificateProfile, final ICallback<? super Windows10ImportedPFXCertificateProfile> callback);

    /**
     * Patches this Windows10ImportedPFXCertificateProfile with a source
     *
     * @param sourceWindows10ImportedPFXCertificateProfile the source object with updates
     * @return the updated Windows10ImportedPFXCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10ImportedPFXCertificateProfile patch(final Windows10ImportedPFXCertificateProfile sourceWindows10ImportedPFXCertificateProfile) throws ClientException;

    /**
     * Posts a Windows10ImportedPFXCertificateProfile with a new object
     *
     * @param newWindows10ImportedPFXCertificateProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Windows10ImportedPFXCertificateProfile newWindows10ImportedPFXCertificateProfile, final ICallback<? super Windows10ImportedPFXCertificateProfile> callback);

    /**
     * Posts a Windows10ImportedPFXCertificateProfile with a new object
     *
     * @param newWindows10ImportedPFXCertificateProfile the new object to create
     * @return the created Windows10ImportedPFXCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10ImportedPFXCertificateProfile post(final Windows10ImportedPFXCertificateProfile newWindows10ImportedPFXCertificateProfile) throws ClientException;

    /**
     * Posts a Windows10ImportedPFXCertificateProfile with a new object
     *
     * @param newWindows10ImportedPFXCertificateProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Windows10ImportedPFXCertificateProfile newWindows10ImportedPFXCertificateProfile, final ICallback<? super Windows10ImportedPFXCertificateProfile> callback);

    /**
     * Posts a Windows10ImportedPFXCertificateProfile with a new object
     *
     * @param newWindows10ImportedPFXCertificateProfile the object to create/update
     * @return the created Windows10ImportedPFXCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10ImportedPFXCertificateProfile put(final Windows10ImportedPFXCertificateProfile newWindows10ImportedPFXCertificateProfile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindows10ImportedPFXCertificateProfileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindows10ImportedPFXCertificateProfileRequest expand(final String value);

}

