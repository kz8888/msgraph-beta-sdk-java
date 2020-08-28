// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GovernancePolicyTemplate;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Governance Policy Template Request.
 */
public interface IGovernancePolicyTemplateRequest extends IHttpRequest {

    /**
     * Gets the GovernancePolicyTemplate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<GovernancePolicyTemplate> callback);

    /**
     * Gets the GovernancePolicyTemplate from the service
     *
     * @return the GovernancePolicyTemplate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GovernancePolicyTemplate get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<GovernancePolicyTemplate> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this GovernancePolicyTemplate with a source
     *
     * @param sourceGovernancePolicyTemplate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final GovernancePolicyTemplate sourceGovernancePolicyTemplate, final ICallback<GovernancePolicyTemplate> callback);

    /**
     * Patches this GovernancePolicyTemplate with a source
     *
     * @param sourceGovernancePolicyTemplate the source object with updates
     * @return the updated GovernancePolicyTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GovernancePolicyTemplate patch(final GovernancePolicyTemplate sourceGovernancePolicyTemplate) throws ClientException;

    /**
     * Posts a GovernancePolicyTemplate with a new object
     *
     * @param newGovernancePolicyTemplate the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final GovernancePolicyTemplate newGovernancePolicyTemplate, final ICallback<GovernancePolicyTemplate> callback);

    /**
     * Posts a GovernancePolicyTemplate with a new object
     *
     * @param newGovernancePolicyTemplate the new object to create
     * @return the created GovernancePolicyTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GovernancePolicyTemplate post(final GovernancePolicyTemplate newGovernancePolicyTemplate) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGovernancePolicyTemplateRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGovernancePolicyTemplateRequest expand(final String value);

}
