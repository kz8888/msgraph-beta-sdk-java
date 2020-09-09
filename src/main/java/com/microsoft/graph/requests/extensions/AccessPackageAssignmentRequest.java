// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageAssignment;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentResourceRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentResourceRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageSubjectRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageSubjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Request.
 */
public class AccessPackageAssignmentRequest extends BaseRequest implements IAccessPackageAssignmentRequest {
	
    /**
     * The request for the AccessPackageAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageAssignmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageAssignment.class);
    }

    /**
     * Gets the AccessPackageAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AccessPackageAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AccessPackageAssignment from the service
     *
     * @return the AccessPackageAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackageAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AccessPackageAssignment> callback) {
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
     * Patches this AccessPackageAssignment with a source
     *
     * @param sourceAccessPackageAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AccessPackageAssignment sourceAccessPackageAssignment, final ICallback<AccessPackageAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceAccessPackageAssignment);
    }

    /**
     * Patches this AccessPackageAssignment with a source
     *
     * @param sourceAccessPackageAssignment the source object with updates
     * @return the updated AccessPackageAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackageAssignment patch(final AccessPackageAssignment sourceAccessPackageAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceAccessPackageAssignment);
    }

    /**
     * Creates a AccessPackageAssignment with a new object
     *
     * @param newAccessPackageAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AccessPackageAssignment newAccessPackageAssignment, final ICallback<AccessPackageAssignment> callback) {
        send(HttpMethod.POST, callback, newAccessPackageAssignment);
    }

    /**
     * Creates a AccessPackageAssignment with a new object
     *
     * @param newAccessPackageAssignment the new object to create
     * @return the created AccessPackageAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackageAssignment post(final AccessPackageAssignment newAccessPackageAssignment) throws ClientException {
        return send(HttpMethod.POST, newAccessPackageAssignment);
    }

    /**
     * Creates a AccessPackageAssignment with a new object
     *
     * @param newAccessPackageAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AccessPackageAssignment newAccessPackageAssignment, final ICallback<AccessPackageAssignment> callback) {
        send(HttpMethod.PUT, callback, newAccessPackageAssignment);
    }

    /**
     * Creates a AccessPackageAssignment with a new object
     *
     * @param newAccessPackageAssignment the object to create/update
     * @return the created AccessPackageAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackageAssignment put(final AccessPackageAssignment newAccessPackageAssignment) throws ClientException {
        return send(HttpMethod.PUT, newAccessPackageAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAccessPackageAssignmentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AccessPackageAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAccessPackageAssignmentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AccessPackageAssignmentRequest)this;
     }

}

