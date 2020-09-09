// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GovernanceRoleAssignment;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceSubjectRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceSubjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Role Assignment Request.
 */
public class GovernanceRoleAssignmentRequest extends BaseRequest implements IGovernanceRoleAssignmentRequest {
	
    /**
     * The request for the GovernanceRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GovernanceRoleAssignmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GovernanceRoleAssignment.class);
    }

    /**
     * Gets the GovernanceRoleAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<GovernanceRoleAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GovernanceRoleAssignment from the service
     *
     * @return the GovernanceRoleAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GovernanceRoleAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<GovernanceRoleAssignment> callback) {
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
     * Patches this GovernanceRoleAssignment with a source
     *
     * @param sourceGovernanceRoleAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final GovernanceRoleAssignment sourceGovernanceRoleAssignment, final ICallback<GovernanceRoleAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceGovernanceRoleAssignment);
    }

    /**
     * Patches this GovernanceRoleAssignment with a source
     *
     * @param sourceGovernanceRoleAssignment the source object with updates
     * @return the updated GovernanceRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GovernanceRoleAssignment patch(final GovernanceRoleAssignment sourceGovernanceRoleAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceGovernanceRoleAssignment);
    }

    /**
     * Creates a GovernanceRoleAssignment with a new object
     *
     * @param newGovernanceRoleAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final GovernanceRoleAssignment newGovernanceRoleAssignment, final ICallback<GovernanceRoleAssignment> callback) {
        send(HttpMethod.POST, callback, newGovernanceRoleAssignment);
    }

    /**
     * Creates a GovernanceRoleAssignment with a new object
     *
     * @param newGovernanceRoleAssignment the new object to create
     * @return the created GovernanceRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GovernanceRoleAssignment post(final GovernanceRoleAssignment newGovernanceRoleAssignment) throws ClientException {
        return send(HttpMethod.POST, newGovernanceRoleAssignment);
    }

    /**
     * Creates a GovernanceRoleAssignment with a new object
     *
     * @param newGovernanceRoleAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final GovernanceRoleAssignment newGovernanceRoleAssignment, final ICallback<GovernanceRoleAssignment> callback) {
        send(HttpMethod.PUT, callback, newGovernanceRoleAssignment);
    }

    /**
     * Creates a GovernanceRoleAssignment with a new object
     *
     * @param newGovernanceRoleAssignment the object to create/update
     * @return the created GovernanceRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GovernanceRoleAssignment put(final GovernanceRoleAssignment newGovernanceRoleAssignment) throws ClientException {
        return send(HttpMethod.PUT, newGovernanceRoleAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IGovernanceRoleAssignmentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (GovernanceRoleAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IGovernanceRoleAssignmentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (GovernanceRoleAssignmentRequest)this;
     }

}

