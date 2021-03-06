// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AppleUserInitiatedEnrollmentProfile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Apple User Initiated Enrollment Profile Request.
 */
public interface IAppleUserInitiatedEnrollmentProfileRequest extends IHttpRequest {

    /**
     * Gets the AppleUserInitiatedEnrollmentProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AppleUserInitiatedEnrollmentProfile> callback);

    /**
     * Gets the AppleUserInitiatedEnrollmentProfile from the service
     *
     * @return the AppleUserInitiatedEnrollmentProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppleUserInitiatedEnrollmentProfile get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AppleUserInitiatedEnrollmentProfile> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AppleUserInitiatedEnrollmentProfile with a source
     *
     * @param sourceAppleUserInitiatedEnrollmentProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AppleUserInitiatedEnrollmentProfile sourceAppleUserInitiatedEnrollmentProfile, final ICallback<? super AppleUserInitiatedEnrollmentProfile> callback);

    /**
     * Patches this AppleUserInitiatedEnrollmentProfile with a source
     *
     * @param sourceAppleUserInitiatedEnrollmentProfile the source object with updates
     * @return the updated AppleUserInitiatedEnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppleUserInitiatedEnrollmentProfile patch(final AppleUserInitiatedEnrollmentProfile sourceAppleUserInitiatedEnrollmentProfile) throws ClientException;

    /**
     * Posts a AppleUserInitiatedEnrollmentProfile with a new object
     *
     * @param newAppleUserInitiatedEnrollmentProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AppleUserInitiatedEnrollmentProfile newAppleUserInitiatedEnrollmentProfile, final ICallback<? super AppleUserInitiatedEnrollmentProfile> callback);

    /**
     * Posts a AppleUserInitiatedEnrollmentProfile with a new object
     *
     * @param newAppleUserInitiatedEnrollmentProfile the new object to create
     * @return the created AppleUserInitiatedEnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppleUserInitiatedEnrollmentProfile post(final AppleUserInitiatedEnrollmentProfile newAppleUserInitiatedEnrollmentProfile) throws ClientException;

    /**
     * Posts a AppleUserInitiatedEnrollmentProfile with a new object
     *
     * @param newAppleUserInitiatedEnrollmentProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AppleUserInitiatedEnrollmentProfile newAppleUserInitiatedEnrollmentProfile, final ICallback<? super AppleUserInitiatedEnrollmentProfile> callback);

    /**
     * Posts a AppleUserInitiatedEnrollmentProfile with a new object
     *
     * @param newAppleUserInitiatedEnrollmentProfile the object to create/update
     * @return the created AppleUserInitiatedEnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppleUserInitiatedEnrollmentProfile put(final AppleUserInitiatedEnrollmentProfile newAppleUserInitiatedEnrollmentProfile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAppleUserInitiatedEnrollmentProfileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAppleUserInitiatedEnrollmentProfileRequest expand(final String value);

}

