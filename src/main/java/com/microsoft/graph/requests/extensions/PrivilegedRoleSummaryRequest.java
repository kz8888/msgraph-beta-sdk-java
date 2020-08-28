// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedRoleSummary;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Summary Request.
 */
public class PrivilegedRoleSummaryRequest extends BaseRequest implements IPrivilegedRoleSummaryRequest {
	
    /**
     * The request for the PrivilegedRoleSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedRoleSummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrivilegedRoleSummary.class);
    }

    /**
     * Gets the PrivilegedRoleSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<PrivilegedRoleSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PrivilegedRoleSummary from the service
     *
     * @return the PrivilegedRoleSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrivilegedRoleSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<PrivilegedRoleSummary> callback) {
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
     * Patches this PrivilegedRoleSummary with a source
     *
     * @param sourcePrivilegedRoleSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PrivilegedRoleSummary sourcePrivilegedRoleSummary, final ICallback<PrivilegedRoleSummary> callback) {
        send(HttpMethod.PATCH, callback, sourcePrivilegedRoleSummary);
    }

    /**
     * Patches this PrivilegedRoleSummary with a source
     *
     * @param sourcePrivilegedRoleSummary the source object with updates
     * @return the updated PrivilegedRoleSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrivilegedRoleSummary patch(final PrivilegedRoleSummary sourcePrivilegedRoleSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrivilegedRoleSummary);
    }

    /**
     * Creates a PrivilegedRoleSummary with a new object
     *
     * @param newPrivilegedRoleSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PrivilegedRoleSummary newPrivilegedRoleSummary, final ICallback<PrivilegedRoleSummary> callback) {
        send(HttpMethod.POST, callback, newPrivilegedRoleSummary);
    }

    /**
     * Creates a PrivilegedRoleSummary with a new object
     *
     * @param newPrivilegedRoleSummary the new object to create
     * @return the created PrivilegedRoleSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrivilegedRoleSummary post(final PrivilegedRoleSummary newPrivilegedRoleSummary) throws ClientException {
        return send(HttpMethod.POST, newPrivilegedRoleSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPrivilegedRoleSummaryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PrivilegedRoleSummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPrivilegedRoleSummaryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PrivilegedRoleSummaryRequest)this;
     }

}
