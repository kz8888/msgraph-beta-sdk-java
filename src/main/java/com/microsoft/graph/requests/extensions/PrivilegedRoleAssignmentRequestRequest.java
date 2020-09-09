// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedRoleAssignmentRequest;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Assignment Request Request.
 */
public class PrivilegedRoleAssignmentRequestRequest extends BaseRequest implements IPrivilegedRoleAssignmentRequestRequest {
	
    /**
     * The request for the PrivilegedRoleAssignmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedRoleAssignmentRequestRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrivilegedRoleAssignmentRequest.class);
    }

    /**
     * Gets the PrivilegedRoleAssignmentRequest from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<PrivilegedRoleAssignmentRequest> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PrivilegedRoleAssignmentRequest from the service
     *
     * @return the PrivilegedRoleAssignmentRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrivilegedRoleAssignmentRequest get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<PrivilegedRoleAssignmentRequest> callback) {
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
     * Patches this PrivilegedRoleAssignmentRequest with a source
     *
     * @param sourcePrivilegedRoleAssignmentRequest the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PrivilegedRoleAssignmentRequest sourcePrivilegedRoleAssignmentRequest, final ICallback<PrivilegedRoleAssignmentRequest> callback) {
        send(HttpMethod.PATCH, callback, sourcePrivilegedRoleAssignmentRequest);
    }

    /**
     * Patches this PrivilegedRoleAssignmentRequest with a source
     *
     * @param sourcePrivilegedRoleAssignmentRequest the source object with updates
     * @return the updated PrivilegedRoleAssignmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrivilegedRoleAssignmentRequest patch(final PrivilegedRoleAssignmentRequest sourcePrivilegedRoleAssignmentRequest) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrivilegedRoleAssignmentRequest);
    }

    /**
     * Creates a PrivilegedRoleAssignmentRequest with a new object
     *
     * @param newPrivilegedRoleAssignmentRequest the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest, final ICallback<PrivilegedRoleAssignmentRequest> callback) {
        send(HttpMethod.POST, callback, newPrivilegedRoleAssignmentRequest);
    }

    /**
     * Creates a PrivilegedRoleAssignmentRequest with a new object
     *
     * @param newPrivilegedRoleAssignmentRequest the new object to create
     * @return the created PrivilegedRoleAssignmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrivilegedRoleAssignmentRequest post(final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest) throws ClientException {
        return send(HttpMethod.POST, newPrivilegedRoleAssignmentRequest);
    }

    /**
     * Creates a PrivilegedRoleAssignmentRequest with a new object
     *
     * @param newPrivilegedRoleAssignmentRequest the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest, final ICallback<PrivilegedRoleAssignmentRequest> callback) {
        send(HttpMethod.PUT, callback, newPrivilegedRoleAssignmentRequest);
    }

    /**
     * Creates a PrivilegedRoleAssignmentRequest with a new object
     *
     * @param newPrivilegedRoleAssignmentRequest the object to create/update
     * @return the created PrivilegedRoleAssignmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrivilegedRoleAssignmentRequest put(final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest) throws ClientException {
        return send(HttpMethod.PUT, newPrivilegedRoleAssignmentRequest);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPrivilegedRoleAssignmentRequestRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PrivilegedRoleAssignmentRequestRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPrivilegedRoleAssignmentRequestRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PrivilegedRoleAssignmentRequestRequest)this;
     }

}

