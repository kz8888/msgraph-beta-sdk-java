// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UnifiedRoleDefinition;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Unified Role Definition Request.
 */
public interface IUnifiedRoleDefinitionRequest extends IHttpRequest {

    /**
     * Gets the UnifiedRoleDefinition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UnifiedRoleDefinition> callback);

    /**
     * Gets the UnifiedRoleDefinition from the service
     *
     * @return the UnifiedRoleDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleDefinition get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UnifiedRoleDefinition> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UnifiedRoleDefinition with a source
     *
     * @param sourceUnifiedRoleDefinition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UnifiedRoleDefinition sourceUnifiedRoleDefinition, final ICallback<? super UnifiedRoleDefinition> callback);

    /**
     * Patches this UnifiedRoleDefinition with a source
     *
     * @param sourceUnifiedRoleDefinition the source object with updates
     * @return the updated UnifiedRoleDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleDefinition patch(final UnifiedRoleDefinition sourceUnifiedRoleDefinition) throws ClientException;

    /**
     * Posts a UnifiedRoleDefinition with a new object
     *
     * @param newUnifiedRoleDefinition the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UnifiedRoleDefinition newUnifiedRoleDefinition, final ICallback<? super UnifiedRoleDefinition> callback);

    /**
     * Posts a UnifiedRoleDefinition with a new object
     *
     * @param newUnifiedRoleDefinition the new object to create
     * @return the created UnifiedRoleDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleDefinition post(final UnifiedRoleDefinition newUnifiedRoleDefinition) throws ClientException;

    /**
     * Posts a UnifiedRoleDefinition with a new object
     *
     * @param newUnifiedRoleDefinition the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UnifiedRoleDefinition newUnifiedRoleDefinition, final ICallback<? super UnifiedRoleDefinition> callback);

    /**
     * Posts a UnifiedRoleDefinition with a new object
     *
     * @param newUnifiedRoleDefinition the object to create/update
     * @return the created UnifiedRoleDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleDefinition put(final UnifiedRoleDefinition newUnifiedRoleDefinition) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUnifiedRoleDefinitionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUnifiedRoleDefinitionRequest expand(final String value);

}

