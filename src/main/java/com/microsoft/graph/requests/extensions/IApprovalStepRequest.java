// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ApprovalStep;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Approval Step Request.
 */
public interface IApprovalStepRequest extends IHttpRequest {

    /**
     * Gets the ApprovalStep from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ApprovalStep> callback);

    /**
     * Gets the ApprovalStep from the service
     *
     * @return the ApprovalStep from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ApprovalStep get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ApprovalStep> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ApprovalStep with a source
     *
     * @param sourceApprovalStep the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ApprovalStep sourceApprovalStep, final ICallback<ApprovalStep> callback);

    /**
     * Patches this ApprovalStep with a source
     *
     * @param sourceApprovalStep the source object with updates
     * @return the updated ApprovalStep
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ApprovalStep patch(final ApprovalStep sourceApprovalStep) throws ClientException;

    /**
     * Posts a ApprovalStep with a new object
     *
     * @param newApprovalStep the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ApprovalStep newApprovalStep, final ICallback<ApprovalStep> callback);

    /**
     * Posts a ApprovalStep with a new object
     *
     * @param newApprovalStep the new object to create
     * @return the created ApprovalStep
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ApprovalStep post(final ApprovalStep newApprovalStep) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IApprovalStepRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IApprovalStepRequest expand(final String value);

}
