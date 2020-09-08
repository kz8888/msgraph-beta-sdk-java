// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyObjectFile;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Object File Request.
 */
public class GroupPolicyObjectFileRequest extends BaseRequest implements IGroupPolicyObjectFileRequest {
	
    /**
     * The request for the GroupPolicyObjectFile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyObjectFileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyObjectFile.class);
    }

    /**
     * Gets the GroupPolicyObjectFile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<GroupPolicyObjectFile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GroupPolicyObjectFile from the service
     *
     * @return the GroupPolicyObjectFile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyObjectFile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<GroupPolicyObjectFile> callback) {
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
     * Patches this GroupPolicyObjectFile with a source
     *
     * @param sourceGroupPolicyObjectFile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final GroupPolicyObjectFile sourceGroupPolicyObjectFile, final ICallback<GroupPolicyObjectFile> callback) {
        send(HttpMethod.PATCH, callback, sourceGroupPolicyObjectFile);
    }

    /**
     * Patches this GroupPolicyObjectFile with a source
     *
     * @param sourceGroupPolicyObjectFile the source object with updates
     * @return the updated GroupPolicyObjectFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyObjectFile patch(final GroupPolicyObjectFile sourceGroupPolicyObjectFile) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupPolicyObjectFile);
    }

    /**
     * Creates a GroupPolicyObjectFile with a new object
     *
     * @param newGroupPolicyObjectFile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final GroupPolicyObjectFile newGroupPolicyObjectFile, final ICallback<GroupPolicyObjectFile> callback) {
        send(HttpMethod.POST, callback, newGroupPolicyObjectFile);
    }

    /**
     * Creates a GroupPolicyObjectFile with a new object
     *
     * @param newGroupPolicyObjectFile the new object to create
     * @return the created GroupPolicyObjectFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyObjectFile post(final GroupPolicyObjectFile newGroupPolicyObjectFile) throws ClientException {
        return send(HttpMethod.POST, newGroupPolicyObjectFile);
    }

    /**
     * Creates a GroupPolicyObjectFile with a new object
     *
     * @param newGroupPolicyObjectFile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final GroupPolicyObjectFile newGroupPolicyObjectFile, final ICallback<GroupPolicyObjectFile> callback) {
        send(HttpMethod.PUT, callback, newGroupPolicyObjectFile);
    }

    /**
     * Creates a GroupPolicyObjectFile with a new object
     *
     * @param newGroupPolicyObjectFile the object to create/update
     * @return the created GroupPolicyObjectFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyObjectFile put(final GroupPolicyObjectFile newGroupPolicyObjectFile) throws ClientException {
        return send(HttpMethod.PUT, newGroupPolicyObjectFile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IGroupPolicyObjectFileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (GroupPolicyObjectFileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IGroupPolicyObjectFileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (GroupPolicyObjectFileRequest)this;
     }

}

