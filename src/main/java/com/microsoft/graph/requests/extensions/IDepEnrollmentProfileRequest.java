// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DepEnrollmentProfile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Dep Enrollment Profile Request.
 */
public interface IDepEnrollmentProfileRequest extends IHttpRequest {

    /**
     * Gets the DepEnrollmentProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DepEnrollmentProfile> callback);

    /**
     * Gets the DepEnrollmentProfile from the service
     *
     * @return the DepEnrollmentProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DepEnrollmentProfile get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DepEnrollmentProfile> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DepEnrollmentProfile with a source
     *
     * @param sourceDepEnrollmentProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DepEnrollmentProfile sourceDepEnrollmentProfile, final ICallback<DepEnrollmentProfile> callback);

    /**
     * Patches this DepEnrollmentProfile with a source
     *
     * @param sourceDepEnrollmentProfile the source object with updates
     * @return the updated DepEnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DepEnrollmentProfile patch(final DepEnrollmentProfile sourceDepEnrollmentProfile) throws ClientException;

    /**
     * Posts a DepEnrollmentProfile with a new object
     *
     * @param newDepEnrollmentProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DepEnrollmentProfile newDepEnrollmentProfile, final ICallback<DepEnrollmentProfile> callback);

    /**
     * Posts a DepEnrollmentProfile with a new object
     *
     * @param newDepEnrollmentProfile the new object to create
     * @return the created DepEnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DepEnrollmentProfile post(final DepEnrollmentProfile newDepEnrollmentProfile) throws ClientException;

    /**
     * Posts a DepEnrollmentProfile with a new object
     *
     * @param newDepEnrollmentProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DepEnrollmentProfile newDepEnrollmentProfile, final ICallback<DepEnrollmentProfile> callback);

    /**
     * Posts a DepEnrollmentProfile with a new object
     *
     * @param newDepEnrollmentProfile the object to create/update
     * @return the created DepEnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DepEnrollmentProfile put(final DepEnrollmentProfile newDepEnrollmentProfile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDepEnrollmentProfileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDepEnrollmentProfileRequest expand(final String value);

}

