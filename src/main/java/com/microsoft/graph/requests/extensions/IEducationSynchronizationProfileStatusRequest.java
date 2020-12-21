// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EducationSynchronizationProfileStatus;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education Synchronization Profile Status Request.
 */
public interface IEducationSynchronizationProfileStatusRequest extends IHttpRequest {

    /**
     * Gets the EducationSynchronizationProfileStatus from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super EducationSynchronizationProfileStatus> callback);

    /**
     * Gets the EducationSynchronizationProfileStatus from the service
     *
     * @return the EducationSynchronizationProfileStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationSynchronizationProfileStatus get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super EducationSynchronizationProfileStatus> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EducationSynchronizationProfileStatus with a source
     *
     * @param sourceEducationSynchronizationProfileStatus the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EducationSynchronizationProfileStatus sourceEducationSynchronizationProfileStatus, final ICallback<? super EducationSynchronizationProfileStatus> callback);

    /**
     * Patches this EducationSynchronizationProfileStatus with a source
     *
     * @param sourceEducationSynchronizationProfileStatus the source object with updates
     * @return the updated EducationSynchronizationProfileStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationSynchronizationProfileStatus patch(final EducationSynchronizationProfileStatus sourceEducationSynchronizationProfileStatus) throws ClientException;

    /**
     * Posts a EducationSynchronizationProfileStatus with a new object
     *
     * @param newEducationSynchronizationProfileStatus the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EducationSynchronizationProfileStatus newEducationSynchronizationProfileStatus, final ICallback<? super EducationSynchronizationProfileStatus> callback);

    /**
     * Posts a EducationSynchronizationProfileStatus with a new object
     *
     * @param newEducationSynchronizationProfileStatus the new object to create
     * @return the created EducationSynchronizationProfileStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationSynchronizationProfileStatus post(final EducationSynchronizationProfileStatus newEducationSynchronizationProfileStatus) throws ClientException;

    /**
     * Posts a EducationSynchronizationProfileStatus with a new object
     *
     * @param newEducationSynchronizationProfileStatus the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final EducationSynchronizationProfileStatus newEducationSynchronizationProfileStatus, final ICallback<? super EducationSynchronizationProfileStatus> callback);

    /**
     * Posts a EducationSynchronizationProfileStatus with a new object
     *
     * @param newEducationSynchronizationProfileStatus the object to create/update
     * @return the created EducationSynchronizationProfileStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationSynchronizationProfileStatus put(final EducationSynchronizationProfileStatus newEducationSynchronizationProfileStatus) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEducationSynchronizationProfileStatusRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEducationSynchronizationProfileStatusRequest expand(final String value);

}

