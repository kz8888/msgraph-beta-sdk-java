// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupPolicyConfigurationAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Configuration Assignment Request.
 */
public interface IGroupPolicyConfigurationAssignmentRequest extends IHttpRequest {

    /**
     * Gets the GroupPolicyConfigurationAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super GroupPolicyConfigurationAssignment> callback);

    /**
     * Gets the GroupPolicyConfigurationAssignment from the service
     *
     * @return the GroupPolicyConfigurationAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyConfigurationAssignment get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super GroupPolicyConfigurationAssignment> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this GroupPolicyConfigurationAssignment with a source
     *
     * @param sourceGroupPolicyConfigurationAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final GroupPolicyConfigurationAssignment sourceGroupPolicyConfigurationAssignment, final ICallback<? super GroupPolicyConfigurationAssignment> callback);

    /**
     * Patches this GroupPolicyConfigurationAssignment with a source
     *
     * @param sourceGroupPolicyConfigurationAssignment the source object with updates
     * @return the updated GroupPolicyConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyConfigurationAssignment patch(final GroupPolicyConfigurationAssignment sourceGroupPolicyConfigurationAssignment) throws ClientException;

    /**
     * Posts a GroupPolicyConfigurationAssignment with a new object
     *
     * @param newGroupPolicyConfigurationAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final GroupPolicyConfigurationAssignment newGroupPolicyConfigurationAssignment, final ICallback<? super GroupPolicyConfigurationAssignment> callback);

    /**
     * Posts a GroupPolicyConfigurationAssignment with a new object
     *
     * @param newGroupPolicyConfigurationAssignment the new object to create
     * @return the created GroupPolicyConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyConfigurationAssignment post(final GroupPolicyConfigurationAssignment newGroupPolicyConfigurationAssignment) throws ClientException;

    /**
     * Posts a GroupPolicyConfigurationAssignment with a new object
     *
     * @param newGroupPolicyConfigurationAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final GroupPolicyConfigurationAssignment newGroupPolicyConfigurationAssignment, final ICallback<? super GroupPolicyConfigurationAssignment> callback);

    /**
     * Posts a GroupPolicyConfigurationAssignment with a new object
     *
     * @param newGroupPolicyConfigurationAssignment the object to create/update
     * @return the created GroupPolicyConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyConfigurationAssignment put(final GroupPolicyConfigurationAssignment newGroupPolicyConfigurationAssignment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGroupPolicyConfigurationAssignmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGroupPolicyConfigurationAssignmentRequest expand(final String value);

}

