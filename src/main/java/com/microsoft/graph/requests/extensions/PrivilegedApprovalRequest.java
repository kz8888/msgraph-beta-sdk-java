// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedApproval;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Approval Request.
 */
public class PrivilegedApprovalRequest extends BaseRequest implements IPrivilegedApprovalRequest {
	
    /**
     * The request for the PrivilegedApproval
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedApprovalRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrivilegedApproval.class);
    }

    /**
     * Gets the PrivilegedApproval from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<PrivilegedApproval> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PrivilegedApproval from the service
     *
     * @return the PrivilegedApproval from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrivilegedApproval get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<PrivilegedApproval> callback) {
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
     * Patches this PrivilegedApproval with a source
     *
     * @param sourcePrivilegedApproval the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PrivilegedApproval sourcePrivilegedApproval, final ICallback<PrivilegedApproval> callback) {
        send(HttpMethod.PATCH, callback, sourcePrivilegedApproval);
    }

    /**
     * Patches this PrivilegedApproval with a source
     *
     * @param sourcePrivilegedApproval the source object with updates
     * @return the updated PrivilegedApproval
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrivilegedApproval patch(final PrivilegedApproval sourcePrivilegedApproval) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrivilegedApproval);
    }

    /**
     * Creates a PrivilegedApproval with a new object
     *
     * @param newPrivilegedApproval the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PrivilegedApproval newPrivilegedApproval, final ICallback<PrivilegedApproval> callback) {
        send(HttpMethod.POST, callback, newPrivilegedApproval);
    }

    /**
     * Creates a PrivilegedApproval with a new object
     *
     * @param newPrivilegedApproval the new object to create
     * @return the created PrivilegedApproval
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrivilegedApproval post(final PrivilegedApproval newPrivilegedApproval) throws ClientException {
        return send(HttpMethod.POST, newPrivilegedApproval);
    }

    /**
     * Creates a PrivilegedApproval with a new object
     *
     * @param newPrivilegedApproval the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PrivilegedApproval newPrivilegedApproval, final ICallback<PrivilegedApproval> callback) {
        send(HttpMethod.PUT, callback, newPrivilegedApproval);
    }

    /**
     * Creates a PrivilegedApproval with a new object
     *
     * @param newPrivilegedApproval the object to create/update
     * @return the created PrivilegedApproval
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrivilegedApproval put(final PrivilegedApproval newPrivilegedApproval) throws ClientException {
        return send(HttpMethod.PUT, newPrivilegedApproval);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPrivilegedApprovalRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PrivilegedApprovalRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPrivilegedApprovalRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PrivilegedApprovalRequest)this;
     }

}

