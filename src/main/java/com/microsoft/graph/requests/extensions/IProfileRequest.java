// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Profile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Profile Request.
 */
public interface IProfileRequest extends IHttpRequest {

    /**
     * Gets the Profile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Profile> callback);

    /**
     * Gets the Profile from the service
     *
     * @return the Profile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Profile get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Profile> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Profile with a source
     *
     * @param sourceProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Profile sourceProfile, final ICallback<Profile> callback);

    /**
     * Patches this Profile with a source
     *
     * @param sourceProfile the source object with updates
     * @return the updated Profile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Profile patch(final Profile sourceProfile) throws ClientException;

    /**
     * Posts a Profile with a new object
     *
     * @param newProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Profile newProfile, final ICallback<Profile> callback);

    /**
     * Posts a Profile with a new object
     *
     * @param newProfile the new object to create
     * @return the created Profile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Profile post(final Profile newProfile) throws ClientException;

    /**
     * Posts a Profile with a new object
     *
     * @param newProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Profile newProfile, final ICallback<Profile> callback);

    /**
     * Posts a Profile with a new object
     *
     * @param newProfile the object to create/update
     * @return the created Profile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Profile put(final Profile newProfile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IProfileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IProfileRequest expand(final String value);

}

