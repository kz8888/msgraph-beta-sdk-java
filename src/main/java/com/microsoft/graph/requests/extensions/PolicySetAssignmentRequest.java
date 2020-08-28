// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PolicySetAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Set Assignment Request.
 */
public class PolicySetAssignmentRequest extends BaseRequest implements IPolicySetAssignmentRequest {
	
    /**
     * The request for the PolicySetAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PolicySetAssignmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PolicySetAssignment.class);
    }

    /**
     * Gets the PolicySetAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<PolicySetAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PolicySetAssignment from the service
     *
     * @return the PolicySetAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PolicySetAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<PolicySetAssignment> callback) {
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
     * Patches this PolicySetAssignment with a source
     *
     * @param sourcePolicySetAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PolicySetAssignment sourcePolicySetAssignment, final ICallback<PolicySetAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourcePolicySetAssignment);
    }

    /**
     * Patches this PolicySetAssignment with a source
     *
     * @param sourcePolicySetAssignment the source object with updates
     * @return the updated PolicySetAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PolicySetAssignment patch(final PolicySetAssignment sourcePolicySetAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourcePolicySetAssignment);
    }

    /**
     * Creates a PolicySetAssignment with a new object
     *
     * @param newPolicySetAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PolicySetAssignment newPolicySetAssignment, final ICallback<PolicySetAssignment> callback) {
        send(HttpMethod.POST, callback, newPolicySetAssignment);
    }

    /**
     * Creates a PolicySetAssignment with a new object
     *
     * @param newPolicySetAssignment the new object to create
     * @return the created PolicySetAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PolicySetAssignment post(final PolicySetAssignment newPolicySetAssignment) throws ClientException {
        return send(HttpMethod.POST, newPolicySetAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPolicySetAssignmentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PolicySetAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPolicySetAssignmentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PolicySetAssignmentRequest)this;
     }

}
