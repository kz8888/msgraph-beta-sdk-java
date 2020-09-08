// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserSecurityProfile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Security Profile Request.
 */
public interface IUserSecurityProfileRequest extends IHttpRequest {

    /**
     * Gets the UserSecurityProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<UserSecurityProfile> callback);

    /**
     * Gets the UserSecurityProfile from the service
     *
     * @return the UserSecurityProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserSecurityProfile get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<UserSecurityProfile> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UserSecurityProfile with a source
     *
     * @param sourceUserSecurityProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UserSecurityProfile sourceUserSecurityProfile, final ICallback<UserSecurityProfile> callback);

    /**
     * Patches this UserSecurityProfile with a source
     *
     * @param sourceUserSecurityProfile the source object with updates
     * @return the updated UserSecurityProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserSecurityProfile patch(final UserSecurityProfile sourceUserSecurityProfile) throws ClientException;

    /**
     * Posts a UserSecurityProfile with a new object
     *
     * @param newUserSecurityProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UserSecurityProfile newUserSecurityProfile, final ICallback<UserSecurityProfile> callback);

    /**
     * Posts a UserSecurityProfile with a new object
     *
     * @param newUserSecurityProfile the new object to create
     * @return the created UserSecurityProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserSecurityProfile post(final UserSecurityProfile newUserSecurityProfile) throws ClientException;

    /**
     * Posts a UserSecurityProfile with a new object
     *
     * @param newUserSecurityProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UserSecurityProfile newUserSecurityProfile, final ICallback<UserSecurityProfile> callback);

    /**
     * Posts a UserSecurityProfile with a new object
     *
     * @param newUserSecurityProfile the object to create/update
     * @return the created UserSecurityProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserSecurityProfile put(final UserSecurityProfile newUserSecurityProfile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserSecurityProfileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserSecurityProfileRequest expand(final String value);

}

