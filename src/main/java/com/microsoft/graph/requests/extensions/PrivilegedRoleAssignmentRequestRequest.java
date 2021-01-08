// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedRoleAssignmentRequest;
import com.microsoft.graph.requests.extensions.PrivilegedRoleRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Assignment Request Request.
 */
public class PrivilegedRoleAssignmentRequestRequest extends BaseRequest<PrivilegedRoleAssignmentRequest> {
	
    /**
     * The request for the PrivilegedRoleAssignmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedRoleAssignmentRequestRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrivilegedRoleAssignmentRequest.class);
    }

    /**
     * Gets the PrivilegedRoleAssignmentRequest from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super PrivilegedRoleAssignmentRequest> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PrivilegedRoleAssignmentRequest from the service
     *
     * @return the PrivilegedRoleAssignmentRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrivilegedRoleAssignmentRequest get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super PrivilegedRoleAssignmentRequest> callback) {
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
    public void patch(@Nonnull final PrivilegedRoleAssignmentRequest sourcePrivilegedRoleAssignmentRequest, @Nonnull final ICallback<? super PrivilegedRoleAssignmentRequest> callback) {
        send(HttpMethod.PATCH, callback, sourcePrivilegedRoleAssignmentRequest);
    }

    /**
     * Patches this PrivilegedRoleAssignmentRequest with a source
     *
     * @param sourcePrivilegedRoleAssignmentRequest the source object with updates
     * @return the updated PrivilegedRoleAssignmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrivilegedRoleAssignmentRequest patch(@Nonnull final PrivilegedRoleAssignmentRequest sourcePrivilegedRoleAssignmentRequest) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrivilegedRoleAssignmentRequest);
    }

    /**
     * Creates a PrivilegedRoleAssignmentRequest with a new object
     *
     * @param newPrivilegedRoleAssignmentRequest the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest, @Nonnull final ICallback<? super PrivilegedRoleAssignmentRequest> callback) {
        send(HttpMethod.POST, callback, newPrivilegedRoleAssignmentRequest);
    }

    /**
     * Creates a PrivilegedRoleAssignmentRequest with a new object
     *
     * @param newPrivilegedRoleAssignmentRequest the new object to create
     * @return the created PrivilegedRoleAssignmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrivilegedRoleAssignmentRequest post(@Nonnull final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest) throws ClientException {
        return send(HttpMethod.POST, newPrivilegedRoleAssignmentRequest);
    }

    /**
     * Creates a PrivilegedRoleAssignmentRequest with a new object
     *
     * @param newPrivilegedRoleAssignmentRequest the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest, @Nonnull final ICallback<? super PrivilegedRoleAssignmentRequest> callback) {
        send(HttpMethod.PUT, callback, newPrivilegedRoleAssignmentRequest);
    }

    /**
     * Creates a PrivilegedRoleAssignmentRequest with a new object
     *
     * @param newPrivilegedRoleAssignmentRequest the object to create/update
     * @return the created PrivilegedRoleAssignmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrivilegedRoleAssignmentRequest put(@Nonnull final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest) throws ClientException {
        return send(HttpMethod.PUT, newPrivilegedRoleAssignmentRequest);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PrivilegedRoleAssignmentRequestRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public PrivilegedRoleAssignmentRequestRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

