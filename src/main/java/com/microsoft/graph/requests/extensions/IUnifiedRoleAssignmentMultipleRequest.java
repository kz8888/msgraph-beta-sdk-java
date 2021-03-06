// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UnifiedRoleAssignmentMultiple;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Unified Role Assignment Multiple Request.
 */
public interface IUnifiedRoleAssignmentMultipleRequest extends IHttpRequest {

    /**
     * Gets the UnifiedRoleAssignmentMultiple from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UnifiedRoleAssignmentMultiple> callback);

    /**
     * Gets the UnifiedRoleAssignmentMultiple from the service
     *
     * @return the UnifiedRoleAssignmentMultiple from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleAssignmentMultiple get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UnifiedRoleAssignmentMultiple> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UnifiedRoleAssignmentMultiple with a source
     *
     * @param sourceUnifiedRoleAssignmentMultiple the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UnifiedRoleAssignmentMultiple sourceUnifiedRoleAssignmentMultiple, final ICallback<? super UnifiedRoleAssignmentMultiple> callback);

    /**
     * Patches this UnifiedRoleAssignmentMultiple with a source
     *
     * @param sourceUnifiedRoleAssignmentMultiple the source object with updates
     * @return the updated UnifiedRoleAssignmentMultiple
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleAssignmentMultiple patch(final UnifiedRoleAssignmentMultiple sourceUnifiedRoleAssignmentMultiple) throws ClientException;

    /**
     * Posts a UnifiedRoleAssignmentMultiple with a new object
     *
     * @param newUnifiedRoleAssignmentMultiple the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UnifiedRoleAssignmentMultiple newUnifiedRoleAssignmentMultiple, final ICallback<? super UnifiedRoleAssignmentMultiple> callback);

    /**
     * Posts a UnifiedRoleAssignmentMultiple with a new object
     *
     * @param newUnifiedRoleAssignmentMultiple the new object to create
     * @return the created UnifiedRoleAssignmentMultiple
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleAssignmentMultiple post(final UnifiedRoleAssignmentMultiple newUnifiedRoleAssignmentMultiple) throws ClientException;

    /**
     * Posts a UnifiedRoleAssignmentMultiple with a new object
     *
     * @param newUnifiedRoleAssignmentMultiple the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UnifiedRoleAssignmentMultiple newUnifiedRoleAssignmentMultiple, final ICallback<? super UnifiedRoleAssignmentMultiple> callback);

    /**
     * Posts a UnifiedRoleAssignmentMultiple with a new object
     *
     * @param newUnifiedRoleAssignmentMultiple the object to create/update
     * @return the created UnifiedRoleAssignmentMultiple
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleAssignmentMultiple put(final UnifiedRoleAssignmentMultiple newUnifiedRoleAssignmentMultiple) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUnifiedRoleAssignmentMultipleRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUnifiedRoleAssignmentMultipleRequest expand(final String value);

}

