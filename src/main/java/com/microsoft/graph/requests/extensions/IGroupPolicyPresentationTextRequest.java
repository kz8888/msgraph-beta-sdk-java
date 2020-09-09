// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupPolicyPresentationText;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Presentation Text Request.
 */
public interface IGroupPolicyPresentationTextRequest extends IHttpRequest {

    /**
     * Gets the GroupPolicyPresentationText from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<GroupPolicyPresentationText> callback);

    /**
     * Gets the GroupPolicyPresentationText from the service
     *
     * @return the GroupPolicyPresentationText from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyPresentationText get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<GroupPolicyPresentationText> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this GroupPolicyPresentationText with a source
     *
     * @param sourceGroupPolicyPresentationText the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final GroupPolicyPresentationText sourceGroupPolicyPresentationText, final ICallback<GroupPolicyPresentationText> callback);

    /**
     * Patches this GroupPolicyPresentationText with a source
     *
     * @param sourceGroupPolicyPresentationText the source object with updates
     * @return the updated GroupPolicyPresentationText
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyPresentationText patch(final GroupPolicyPresentationText sourceGroupPolicyPresentationText) throws ClientException;

    /**
     * Posts a GroupPolicyPresentationText with a new object
     *
     * @param newGroupPolicyPresentationText the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final GroupPolicyPresentationText newGroupPolicyPresentationText, final ICallback<GroupPolicyPresentationText> callback);

    /**
     * Posts a GroupPolicyPresentationText with a new object
     *
     * @param newGroupPolicyPresentationText the new object to create
     * @return the created GroupPolicyPresentationText
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyPresentationText post(final GroupPolicyPresentationText newGroupPolicyPresentationText) throws ClientException;

    /**
     * Posts a GroupPolicyPresentationText with a new object
     *
     * @param newGroupPolicyPresentationText the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final GroupPolicyPresentationText newGroupPolicyPresentationText, final ICallback<GroupPolicyPresentationText> callback);

    /**
     * Posts a GroupPolicyPresentationText with a new object
     *
     * @param newGroupPolicyPresentationText the object to create/update
     * @return the created GroupPolicyPresentationText
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyPresentationText put(final GroupPolicyPresentationText newGroupPolicyPresentationText) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGroupPolicyPresentationTextRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGroupPolicyPresentationTextRequest expand(final String value);

}

