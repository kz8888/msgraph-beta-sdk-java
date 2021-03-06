// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ApplicationTemplate;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Application Template Request.
 */
public interface IApplicationTemplateRequest extends IHttpRequest {

    /**
     * Gets the ApplicationTemplate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ApplicationTemplate> callback);

    /**
     * Gets the ApplicationTemplate from the service
     *
     * @return the ApplicationTemplate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ApplicationTemplate get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ApplicationTemplate> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ApplicationTemplate with a source
     *
     * @param sourceApplicationTemplate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ApplicationTemplate sourceApplicationTemplate, final ICallback<? super ApplicationTemplate> callback);

    /**
     * Patches this ApplicationTemplate with a source
     *
     * @param sourceApplicationTemplate the source object with updates
     * @return the updated ApplicationTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ApplicationTemplate patch(final ApplicationTemplate sourceApplicationTemplate) throws ClientException;

    /**
     * Posts a ApplicationTemplate with a new object
     *
     * @param newApplicationTemplate the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ApplicationTemplate newApplicationTemplate, final ICallback<? super ApplicationTemplate> callback);

    /**
     * Posts a ApplicationTemplate with a new object
     *
     * @param newApplicationTemplate the new object to create
     * @return the created ApplicationTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ApplicationTemplate post(final ApplicationTemplate newApplicationTemplate) throws ClientException;

    /**
     * Posts a ApplicationTemplate with a new object
     *
     * @param newApplicationTemplate the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ApplicationTemplate newApplicationTemplate, final ICallback<? super ApplicationTemplate> callback);

    /**
     * Posts a ApplicationTemplate with a new object
     *
     * @param newApplicationTemplate the object to create/update
     * @return the created ApplicationTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ApplicationTemplate put(final ApplicationTemplate newApplicationTemplate) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IApplicationTemplateRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IApplicationTemplateRequest expand(final String value);

}

