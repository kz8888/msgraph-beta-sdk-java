// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RoleScopeTagAutoAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Scope Tag Auto Assignment Request.
 */
public class RoleScopeTagAutoAssignmentRequest extends BaseRequest implements IRoleScopeTagAutoAssignmentRequest {
	
    /**
     * The request for the RoleScopeTagAutoAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RoleScopeTagAutoAssignmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RoleScopeTagAutoAssignment.class);
    }

    /**
     * Gets the RoleScopeTagAutoAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super RoleScopeTagAutoAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the RoleScopeTagAutoAssignment from the service
     *
     * @return the RoleScopeTagAutoAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RoleScopeTagAutoAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super RoleScopeTagAutoAssignment> callback) {
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
     * Patches this RoleScopeTagAutoAssignment with a source
     *
     * @param sourceRoleScopeTagAutoAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final RoleScopeTagAutoAssignment sourceRoleScopeTagAutoAssignment, final ICallback<? super RoleScopeTagAutoAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceRoleScopeTagAutoAssignment);
    }

    /**
     * Patches this RoleScopeTagAutoAssignment with a source
     *
     * @param sourceRoleScopeTagAutoAssignment the source object with updates
     * @return the updated RoleScopeTagAutoAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RoleScopeTagAutoAssignment patch(final RoleScopeTagAutoAssignment sourceRoleScopeTagAutoAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceRoleScopeTagAutoAssignment);
    }

    /**
     * Creates a RoleScopeTagAutoAssignment with a new object
     *
     * @param newRoleScopeTagAutoAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final RoleScopeTagAutoAssignment newRoleScopeTagAutoAssignment, final ICallback<? super RoleScopeTagAutoAssignment> callback) {
        send(HttpMethod.POST, callback, newRoleScopeTagAutoAssignment);
    }

    /**
     * Creates a RoleScopeTagAutoAssignment with a new object
     *
     * @param newRoleScopeTagAutoAssignment the new object to create
     * @return the created RoleScopeTagAutoAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RoleScopeTagAutoAssignment post(final RoleScopeTagAutoAssignment newRoleScopeTagAutoAssignment) throws ClientException {
        return send(HttpMethod.POST, newRoleScopeTagAutoAssignment);
    }

    /**
     * Creates a RoleScopeTagAutoAssignment with a new object
     *
     * @param newRoleScopeTagAutoAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final RoleScopeTagAutoAssignment newRoleScopeTagAutoAssignment, final ICallback<? super RoleScopeTagAutoAssignment> callback) {
        send(HttpMethod.PUT, callback, newRoleScopeTagAutoAssignment);
    }

    /**
     * Creates a RoleScopeTagAutoAssignment with a new object
     *
     * @param newRoleScopeTagAutoAssignment the object to create/update
     * @return the created RoleScopeTagAutoAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RoleScopeTagAutoAssignment put(final RoleScopeTagAutoAssignment newRoleScopeTagAutoAssignment) throws ClientException {
        return send(HttpMethod.PUT, newRoleScopeTagAutoAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IRoleScopeTagAutoAssignmentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (RoleScopeTagAutoAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IRoleScopeTagAutoAssignmentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (RoleScopeTagAutoAssignmentRequest)this;
     }

}

