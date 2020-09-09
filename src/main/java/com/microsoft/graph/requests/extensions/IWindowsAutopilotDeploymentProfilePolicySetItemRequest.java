// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsAutopilotDeploymentProfilePolicySetItem;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Autopilot Deployment Profile Policy Set Item Request.
 */
public interface IWindowsAutopilotDeploymentProfilePolicySetItemRequest extends IHttpRequest {

    /**
     * Gets the WindowsAutopilotDeploymentProfilePolicySetItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WindowsAutopilotDeploymentProfilePolicySetItem> callback);

    /**
     * Gets the WindowsAutopilotDeploymentProfilePolicySetItem from the service
     *
     * @return the WindowsAutopilotDeploymentProfilePolicySetItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsAutopilotDeploymentProfilePolicySetItem get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<WindowsAutopilotDeploymentProfilePolicySetItem> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsAutopilotDeploymentProfilePolicySetItem with a source
     *
     * @param sourceWindowsAutopilotDeploymentProfilePolicySetItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsAutopilotDeploymentProfilePolicySetItem sourceWindowsAutopilotDeploymentProfilePolicySetItem, final ICallback<WindowsAutopilotDeploymentProfilePolicySetItem> callback);

    /**
     * Patches this WindowsAutopilotDeploymentProfilePolicySetItem with a source
     *
     * @param sourceWindowsAutopilotDeploymentProfilePolicySetItem the source object with updates
     * @return the updated WindowsAutopilotDeploymentProfilePolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsAutopilotDeploymentProfilePolicySetItem patch(final WindowsAutopilotDeploymentProfilePolicySetItem sourceWindowsAutopilotDeploymentProfilePolicySetItem) throws ClientException;

    /**
     * Posts a WindowsAutopilotDeploymentProfilePolicySetItem with a new object
     *
     * @param newWindowsAutopilotDeploymentProfilePolicySetItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsAutopilotDeploymentProfilePolicySetItem newWindowsAutopilotDeploymentProfilePolicySetItem, final ICallback<WindowsAutopilotDeploymentProfilePolicySetItem> callback);

    /**
     * Posts a WindowsAutopilotDeploymentProfilePolicySetItem with a new object
     *
     * @param newWindowsAutopilotDeploymentProfilePolicySetItem the new object to create
     * @return the created WindowsAutopilotDeploymentProfilePolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsAutopilotDeploymentProfilePolicySetItem post(final WindowsAutopilotDeploymentProfilePolicySetItem newWindowsAutopilotDeploymentProfilePolicySetItem) throws ClientException;

    /**
     * Posts a WindowsAutopilotDeploymentProfilePolicySetItem with a new object
     *
     * @param newWindowsAutopilotDeploymentProfilePolicySetItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WindowsAutopilotDeploymentProfilePolicySetItem newWindowsAutopilotDeploymentProfilePolicySetItem, final ICallback<WindowsAutopilotDeploymentProfilePolicySetItem> callback);

    /**
     * Posts a WindowsAutopilotDeploymentProfilePolicySetItem with a new object
     *
     * @param newWindowsAutopilotDeploymentProfilePolicySetItem the object to create/update
     * @return the created WindowsAutopilotDeploymentProfilePolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsAutopilotDeploymentProfilePolicySetItem put(final WindowsAutopilotDeploymentProfilePolicySetItem newWindowsAutopilotDeploymentProfilePolicySetItem) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsAutopilotDeploymentProfilePolicySetItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsAutopilotDeploymentProfilePolicySetItemRequest expand(final String value);

}

