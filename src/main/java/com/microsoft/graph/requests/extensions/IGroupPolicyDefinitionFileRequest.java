// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupPolicyDefinitionFile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Definition File Request.
 */
public interface IGroupPolicyDefinitionFileRequest extends IHttpRequest {

    /**
     * Gets the GroupPolicyDefinitionFile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<GroupPolicyDefinitionFile> callback);

    /**
     * Gets the GroupPolicyDefinitionFile from the service
     *
     * @return the GroupPolicyDefinitionFile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyDefinitionFile get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<GroupPolicyDefinitionFile> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this GroupPolicyDefinitionFile with a source
     *
     * @param sourceGroupPolicyDefinitionFile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final GroupPolicyDefinitionFile sourceGroupPolicyDefinitionFile, final ICallback<GroupPolicyDefinitionFile> callback);

    /**
     * Patches this GroupPolicyDefinitionFile with a source
     *
     * @param sourceGroupPolicyDefinitionFile the source object with updates
     * @return the updated GroupPolicyDefinitionFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyDefinitionFile patch(final GroupPolicyDefinitionFile sourceGroupPolicyDefinitionFile) throws ClientException;

    /**
     * Posts a GroupPolicyDefinitionFile with a new object
     *
     * @param newGroupPolicyDefinitionFile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final GroupPolicyDefinitionFile newGroupPolicyDefinitionFile, final ICallback<GroupPolicyDefinitionFile> callback);

    /**
     * Posts a GroupPolicyDefinitionFile with a new object
     *
     * @param newGroupPolicyDefinitionFile the new object to create
     * @return the created GroupPolicyDefinitionFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyDefinitionFile post(final GroupPolicyDefinitionFile newGroupPolicyDefinitionFile) throws ClientException;

    /**
     * Posts a GroupPolicyDefinitionFile with a new object
     *
     * @param newGroupPolicyDefinitionFile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final GroupPolicyDefinitionFile newGroupPolicyDefinitionFile, final ICallback<GroupPolicyDefinitionFile> callback);

    /**
     * Posts a GroupPolicyDefinitionFile with a new object
     *
     * @param newGroupPolicyDefinitionFile the object to create/update
     * @return the created GroupPolicyDefinitionFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyDefinitionFile put(final GroupPolicyDefinitionFile newGroupPolicyDefinitionFile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGroupPolicyDefinitionFileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGroupPolicyDefinitionFileRequest expand(final String value);

}

