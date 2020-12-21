// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ActiveDirectoryWindowsAutopilotDeploymentProfile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Active Directory Windows Autopilot Deployment Profile Request.
 */
public interface IActiveDirectoryWindowsAutopilotDeploymentProfileRequest extends IHttpRequest {

    /**
     * Gets the ActiveDirectoryWindowsAutopilotDeploymentProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ActiveDirectoryWindowsAutopilotDeploymentProfile> callback);

    /**
     * Gets the ActiveDirectoryWindowsAutopilotDeploymentProfile from the service
     *
     * @return the ActiveDirectoryWindowsAutopilotDeploymentProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ActiveDirectoryWindowsAutopilotDeploymentProfile get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ActiveDirectoryWindowsAutopilotDeploymentProfile> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ActiveDirectoryWindowsAutopilotDeploymentProfile with a source
     *
     * @param sourceActiveDirectoryWindowsAutopilotDeploymentProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ActiveDirectoryWindowsAutopilotDeploymentProfile sourceActiveDirectoryWindowsAutopilotDeploymentProfile, final ICallback<? super ActiveDirectoryWindowsAutopilotDeploymentProfile> callback);

    /**
     * Patches this ActiveDirectoryWindowsAutopilotDeploymentProfile with a source
     *
     * @param sourceActiveDirectoryWindowsAutopilotDeploymentProfile the source object with updates
     * @return the updated ActiveDirectoryWindowsAutopilotDeploymentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ActiveDirectoryWindowsAutopilotDeploymentProfile patch(final ActiveDirectoryWindowsAutopilotDeploymentProfile sourceActiveDirectoryWindowsAutopilotDeploymentProfile) throws ClientException;

    /**
     * Posts a ActiveDirectoryWindowsAutopilotDeploymentProfile with a new object
     *
     * @param newActiveDirectoryWindowsAutopilotDeploymentProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ActiveDirectoryWindowsAutopilotDeploymentProfile newActiveDirectoryWindowsAutopilotDeploymentProfile, final ICallback<? super ActiveDirectoryWindowsAutopilotDeploymentProfile> callback);

    /**
     * Posts a ActiveDirectoryWindowsAutopilotDeploymentProfile with a new object
     *
     * @param newActiveDirectoryWindowsAutopilotDeploymentProfile the new object to create
     * @return the created ActiveDirectoryWindowsAutopilotDeploymentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ActiveDirectoryWindowsAutopilotDeploymentProfile post(final ActiveDirectoryWindowsAutopilotDeploymentProfile newActiveDirectoryWindowsAutopilotDeploymentProfile) throws ClientException;

    /**
     * Posts a ActiveDirectoryWindowsAutopilotDeploymentProfile with a new object
     *
     * @param newActiveDirectoryWindowsAutopilotDeploymentProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ActiveDirectoryWindowsAutopilotDeploymentProfile newActiveDirectoryWindowsAutopilotDeploymentProfile, final ICallback<? super ActiveDirectoryWindowsAutopilotDeploymentProfile> callback);

    /**
     * Posts a ActiveDirectoryWindowsAutopilotDeploymentProfile with a new object
     *
     * @param newActiveDirectoryWindowsAutopilotDeploymentProfile the object to create/update
     * @return the created ActiveDirectoryWindowsAutopilotDeploymentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ActiveDirectoryWindowsAutopilotDeploymentProfile put(final ActiveDirectoryWindowsAutopilotDeploymentProfile newActiveDirectoryWindowsAutopilotDeploymentProfile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IActiveDirectoryWindowsAutopilotDeploymentProfileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IActiveDirectoryWindowsAutopilotDeploymentProfileRequest expand(final String value);

}

