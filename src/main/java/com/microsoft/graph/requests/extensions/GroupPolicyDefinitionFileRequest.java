// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyDefinitionFile;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Definition File Request.
 */
public class GroupPolicyDefinitionFileRequest extends BaseRequest implements IGroupPolicyDefinitionFileRequest {
	
    /**
     * The request for the GroupPolicyDefinitionFile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public GroupPolicyDefinitionFileRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends GroupPolicyDefinitionFile> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the GroupPolicyDefinitionFile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyDefinitionFileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyDefinitionFile.class);
    }

    /**
     * Gets the GroupPolicyDefinitionFile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<GroupPolicyDefinitionFile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GroupPolicyDefinitionFile from the service
     *
     * @return the GroupPolicyDefinitionFile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyDefinitionFile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<GroupPolicyDefinitionFile> callback) {
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
     * Patches this GroupPolicyDefinitionFile with a source
     *
     * @param sourceGroupPolicyDefinitionFile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final GroupPolicyDefinitionFile sourceGroupPolicyDefinitionFile, final ICallback<GroupPolicyDefinitionFile> callback) {
        send(HttpMethod.PATCH, callback, sourceGroupPolicyDefinitionFile);
    }

    /**
     * Patches this GroupPolicyDefinitionFile with a source
     *
     * @param sourceGroupPolicyDefinitionFile the source object with updates
     * @return the updated GroupPolicyDefinitionFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyDefinitionFile patch(final GroupPolicyDefinitionFile sourceGroupPolicyDefinitionFile) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupPolicyDefinitionFile);
    }

    /**
     * Creates a GroupPolicyDefinitionFile with a new object
     *
     * @param newGroupPolicyDefinitionFile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final GroupPolicyDefinitionFile newGroupPolicyDefinitionFile, final ICallback<GroupPolicyDefinitionFile> callback) {
        send(HttpMethod.POST, callback, newGroupPolicyDefinitionFile);
    }

    /**
     * Creates a GroupPolicyDefinitionFile with a new object
     *
     * @param newGroupPolicyDefinitionFile the new object to create
     * @return the created GroupPolicyDefinitionFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyDefinitionFile post(final GroupPolicyDefinitionFile newGroupPolicyDefinitionFile) throws ClientException {
        return send(HttpMethod.POST, newGroupPolicyDefinitionFile);
    }

    /**
     * Creates a GroupPolicyDefinitionFile with a new object
     *
     * @param newGroupPolicyDefinitionFile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final GroupPolicyDefinitionFile newGroupPolicyDefinitionFile, final ICallback<GroupPolicyDefinitionFile> callback) {
        send(HttpMethod.PUT, callback, newGroupPolicyDefinitionFile);
    }

    /**
     * Creates a GroupPolicyDefinitionFile with a new object
     *
     * @param newGroupPolicyDefinitionFile the object to create/update
     * @return the created GroupPolicyDefinitionFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyDefinitionFile put(final GroupPolicyDefinitionFile newGroupPolicyDefinitionFile) throws ClientException {
        return send(HttpMethod.PUT, newGroupPolicyDefinitionFile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IGroupPolicyDefinitionFileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (GroupPolicyDefinitionFileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IGroupPolicyDefinitionFileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (GroupPolicyDefinitionFileRequest)this;
     }

}

