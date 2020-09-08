// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DirectoryRoleAccessReviewPolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Directory Role Access Review Policy Request.
 */
public interface IDirectoryRoleAccessReviewPolicyRequest extends IHttpRequest {

    /**
     * Gets the DirectoryRoleAccessReviewPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DirectoryRoleAccessReviewPolicy> callback);

    /**
     * Gets the DirectoryRoleAccessReviewPolicy from the service
     *
     * @return the DirectoryRoleAccessReviewPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DirectoryRoleAccessReviewPolicy get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DirectoryRoleAccessReviewPolicy> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DirectoryRoleAccessReviewPolicy with a source
     *
     * @param sourceDirectoryRoleAccessReviewPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DirectoryRoleAccessReviewPolicy sourceDirectoryRoleAccessReviewPolicy, final ICallback<DirectoryRoleAccessReviewPolicy> callback);

    /**
     * Patches this DirectoryRoleAccessReviewPolicy with a source
     *
     * @param sourceDirectoryRoleAccessReviewPolicy the source object with updates
     * @return the updated DirectoryRoleAccessReviewPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DirectoryRoleAccessReviewPolicy patch(final DirectoryRoleAccessReviewPolicy sourceDirectoryRoleAccessReviewPolicy) throws ClientException;

    /**
     * Posts a DirectoryRoleAccessReviewPolicy with a new object
     *
     * @param newDirectoryRoleAccessReviewPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DirectoryRoleAccessReviewPolicy newDirectoryRoleAccessReviewPolicy, final ICallback<DirectoryRoleAccessReviewPolicy> callback);

    /**
     * Posts a DirectoryRoleAccessReviewPolicy with a new object
     *
     * @param newDirectoryRoleAccessReviewPolicy the new object to create
     * @return the created DirectoryRoleAccessReviewPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DirectoryRoleAccessReviewPolicy post(final DirectoryRoleAccessReviewPolicy newDirectoryRoleAccessReviewPolicy) throws ClientException;

    /**
     * Posts a DirectoryRoleAccessReviewPolicy with a new object
     *
     * @param newDirectoryRoleAccessReviewPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DirectoryRoleAccessReviewPolicy newDirectoryRoleAccessReviewPolicy, final ICallback<DirectoryRoleAccessReviewPolicy> callback);

    /**
     * Posts a DirectoryRoleAccessReviewPolicy with a new object
     *
     * @param newDirectoryRoleAccessReviewPolicy the object to create/update
     * @return the created DirectoryRoleAccessReviewPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DirectoryRoleAccessReviewPolicy put(final DirectoryRoleAccessReviewPolicy newDirectoryRoleAccessReviewPolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDirectoryRoleAccessReviewPolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDirectoryRoleAccessReviewPolicyRequest expand(final String value);

}

