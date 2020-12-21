// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleAssignment;
import com.microsoft.graph.requests.extensions.IAppScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.AppScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRoleDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Request.
 */
public class UnifiedRoleAssignmentRequest extends BaseRequest implements IUnifiedRoleAssignmentRequest {
	
    /**
     * The request for the UnifiedRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleAssignmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleAssignment.class);
    }

    /**
     * Gets the UnifiedRoleAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super UnifiedRoleAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UnifiedRoleAssignment from the service
     *
     * @return the UnifiedRoleAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super UnifiedRoleAssignment> callback) {
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
     * Patches this UnifiedRoleAssignment with a source
     *
     * @param sourceUnifiedRoleAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UnifiedRoleAssignment sourceUnifiedRoleAssignment, final ICallback<? super UnifiedRoleAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceUnifiedRoleAssignment);
    }

    /**
     * Patches this UnifiedRoleAssignment with a source
     *
     * @param sourceUnifiedRoleAssignment the source object with updates
     * @return the updated UnifiedRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleAssignment patch(final UnifiedRoleAssignment sourceUnifiedRoleAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceUnifiedRoleAssignment);
    }

    /**
     * Creates a UnifiedRoleAssignment with a new object
     *
     * @param newUnifiedRoleAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UnifiedRoleAssignment newUnifiedRoleAssignment, final ICallback<? super UnifiedRoleAssignment> callback) {
        send(HttpMethod.POST, callback, newUnifiedRoleAssignment);
    }

    /**
     * Creates a UnifiedRoleAssignment with a new object
     *
     * @param newUnifiedRoleAssignment the new object to create
     * @return the created UnifiedRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleAssignment post(final UnifiedRoleAssignment newUnifiedRoleAssignment) throws ClientException {
        return send(HttpMethod.POST, newUnifiedRoleAssignment);
    }

    /**
     * Creates a UnifiedRoleAssignment with a new object
     *
     * @param newUnifiedRoleAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UnifiedRoleAssignment newUnifiedRoleAssignment, final ICallback<? super UnifiedRoleAssignment> callback) {
        send(HttpMethod.PUT, callback, newUnifiedRoleAssignment);
    }

    /**
     * Creates a UnifiedRoleAssignment with a new object
     *
     * @param newUnifiedRoleAssignment the object to create/update
     * @return the created UnifiedRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleAssignment put(final UnifiedRoleAssignment newUnifiedRoleAssignment) throws ClientException {
        return send(HttpMethod.PUT, newUnifiedRoleAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUnifiedRoleAssignmentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UnifiedRoleAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUnifiedRoleAssignmentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UnifiedRoleAssignmentRequest)this;
     }

}

