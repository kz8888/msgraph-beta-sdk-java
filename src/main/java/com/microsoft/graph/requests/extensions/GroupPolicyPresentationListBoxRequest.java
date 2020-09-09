// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyPresentationListBox;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Presentation List Box Request.
 */
public class GroupPolicyPresentationListBoxRequest extends BaseRequest implements IGroupPolicyPresentationListBoxRequest {
	
    /**
     * The request for the GroupPolicyPresentationListBox
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyPresentationListBoxRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyPresentationListBox.class);
    }

    /**
     * Gets the GroupPolicyPresentationListBox from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<GroupPolicyPresentationListBox> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GroupPolicyPresentationListBox from the service
     *
     * @return the GroupPolicyPresentationListBox from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyPresentationListBox get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<GroupPolicyPresentationListBox> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this GroupPolicyPresentationListBox with a source
     *
     * @param sourceGroupPolicyPresentationListBox the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final GroupPolicyPresentationListBox sourceGroupPolicyPresentationListBox, final ICallback<GroupPolicyPresentationListBox> callback) {
        send(HttpMethod.PATCH, callback, sourceGroupPolicyPresentationListBox);
    }

    /**
     * Patches this GroupPolicyPresentationListBox with a source
     *
     * @param sourceGroupPolicyPresentationListBox the source object with updates
     * @return the updated GroupPolicyPresentationListBox
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyPresentationListBox patch(final GroupPolicyPresentationListBox sourceGroupPolicyPresentationListBox) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupPolicyPresentationListBox);
    }

    /**
     * Creates a GroupPolicyPresentationListBox with a new object
     *
     * @param newGroupPolicyPresentationListBox the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final GroupPolicyPresentationListBox newGroupPolicyPresentationListBox, final ICallback<GroupPolicyPresentationListBox> callback) {
        send(HttpMethod.POST, callback, newGroupPolicyPresentationListBox);
    }

    /**
     * Creates a GroupPolicyPresentationListBox with a new object
     *
     * @param newGroupPolicyPresentationListBox the new object to create
     * @return the created GroupPolicyPresentationListBox
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyPresentationListBox post(final GroupPolicyPresentationListBox newGroupPolicyPresentationListBox) throws ClientException {
        return send(HttpMethod.POST, newGroupPolicyPresentationListBox);
    }

    /**
     * Creates a GroupPolicyPresentationListBox with a new object
     *
     * @param newGroupPolicyPresentationListBox the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final GroupPolicyPresentationListBox newGroupPolicyPresentationListBox, final ICallback<GroupPolicyPresentationListBox> callback) {
        send(HttpMethod.PUT, callback, newGroupPolicyPresentationListBox);
    }

    /**
     * Creates a GroupPolicyPresentationListBox with a new object
     *
     * @param newGroupPolicyPresentationListBox the object to create/update
     * @return the created GroupPolicyPresentationListBox
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyPresentationListBox put(final GroupPolicyPresentationListBox newGroupPolicyPresentationListBox) throws ClientException {
        return send(HttpMethod.PUT, newGroupPolicyPresentationListBox);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IGroupPolicyPresentationListBoxRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (GroupPolicyPresentationListBoxRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IGroupPolicyPresentationListBoxRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (GroupPolicyPresentationListBoxRequest)this;
     }

}

