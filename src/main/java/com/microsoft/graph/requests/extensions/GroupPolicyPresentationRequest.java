// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyPresentation;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Presentation Request.
 */
public class GroupPolicyPresentationRequest extends BaseRequest implements IGroupPolicyPresentationRequest {
	
    /**
     * The request for the GroupPolicyPresentation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public GroupPolicyPresentationRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends GroupPolicyPresentation> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the GroupPolicyPresentation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyPresentationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyPresentation.class);
    }

    /**
     * Gets the GroupPolicyPresentation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<GroupPolicyPresentation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GroupPolicyPresentation from the service
     *
     * @return the GroupPolicyPresentation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyPresentation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<GroupPolicyPresentation> callback) {
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
     * Patches this GroupPolicyPresentation with a source
     *
     * @param sourceGroupPolicyPresentation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final GroupPolicyPresentation sourceGroupPolicyPresentation, final ICallback<GroupPolicyPresentation> callback) {
        send(HttpMethod.PATCH, callback, sourceGroupPolicyPresentation);
    }

    /**
     * Patches this GroupPolicyPresentation with a source
     *
     * @param sourceGroupPolicyPresentation the source object with updates
     * @return the updated GroupPolicyPresentation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyPresentation patch(final GroupPolicyPresentation sourceGroupPolicyPresentation) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupPolicyPresentation);
    }

    /**
     * Creates a GroupPolicyPresentation with a new object
     *
     * @param newGroupPolicyPresentation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final GroupPolicyPresentation newGroupPolicyPresentation, final ICallback<GroupPolicyPresentation> callback) {
        send(HttpMethod.POST, callback, newGroupPolicyPresentation);
    }

    /**
     * Creates a GroupPolicyPresentation with a new object
     *
     * @param newGroupPolicyPresentation the new object to create
     * @return the created GroupPolicyPresentation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyPresentation post(final GroupPolicyPresentation newGroupPolicyPresentation) throws ClientException {
        return send(HttpMethod.POST, newGroupPolicyPresentation);
    }

    /**
     * Creates a GroupPolicyPresentation with a new object
     *
     * @param newGroupPolicyPresentation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final GroupPolicyPresentation newGroupPolicyPresentation, final ICallback<GroupPolicyPresentation> callback) {
        send(HttpMethod.PUT, callback, newGroupPolicyPresentation);
    }

    /**
     * Creates a GroupPolicyPresentation with a new object
     *
     * @param newGroupPolicyPresentation the object to create/update
     * @return the created GroupPolicyPresentation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyPresentation put(final GroupPolicyPresentation newGroupPolicyPresentation) throws ClientException {
        return send(HttpMethod.PUT, newGroupPolicyPresentation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IGroupPolicyPresentationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (GroupPolicyPresentationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IGroupPolicyPresentationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (GroupPolicyPresentationRequest)this;
     }

}

