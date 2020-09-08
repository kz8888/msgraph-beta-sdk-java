// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ApprovalWorkflowProvider;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Approval Workflow Provider Request.
 */
public interface IApprovalWorkflowProviderRequest extends IHttpRequest {

    /**
     * Gets the ApprovalWorkflowProvider from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ApprovalWorkflowProvider> callback);

    /**
     * Gets the ApprovalWorkflowProvider from the service
     *
     * @return the ApprovalWorkflowProvider from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ApprovalWorkflowProvider get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ApprovalWorkflowProvider> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ApprovalWorkflowProvider with a source
     *
     * @param sourceApprovalWorkflowProvider the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ApprovalWorkflowProvider sourceApprovalWorkflowProvider, final ICallback<ApprovalWorkflowProvider> callback);

    /**
     * Patches this ApprovalWorkflowProvider with a source
     *
     * @param sourceApprovalWorkflowProvider the source object with updates
     * @return the updated ApprovalWorkflowProvider
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ApprovalWorkflowProvider patch(final ApprovalWorkflowProvider sourceApprovalWorkflowProvider) throws ClientException;

    /**
     * Posts a ApprovalWorkflowProvider with a new object
     *
     * @param newApprovalWorkflowProvider the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ApprovalWorkflowProvider newApprovalWorkflowProvider, final ICallback<ApprovalWorkflowProvider> callback);

    /**
     * Posts a ApprovalWorkflowProvider with a new object
     *
     * @param newApprovalWorkflowProvider the new object to create
     * @return the created ApprovalWorkflowProvider
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ApprovalWorkflowProvider post(final ApprovalWorkflowProvider newApprovalWorkflowProvider) throws ClientException;

    /**
     * Posts a ApprovalWorkflowProvider with a new object
     *
     * @param newApprovalWorkflowProvider the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ApprovalWorkflowProvider newApprovalWorkflowProvider, final ICallback<ApprovalWorkflowProvider> callback);

    /**
     * Posts a ApprovalWorkflowProvider with a new object
     *
     * @param newApprovalWorkflowProvider the object to create/update
     * @return the created ApprovalWorkflowProvider
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ApprovalWorkflowProvider put(final ApprovalWorkflowProvider newApprovalWorkflowProvider) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IApprovalWorkflowProviderRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IApprovalWorkflowProviderRequest expand(final String value);

}

