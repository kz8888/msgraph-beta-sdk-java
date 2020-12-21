// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileAppAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Assignment Request.
 */
public class MobileAppAssignmentRequest extends BaseRequest implements IMobileAppAssignmentRequest {
	
    /**
     * The request for the MobileAppAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppAssignmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppAssignment.class);
    }

    /**
     * Gets the MobileAppAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super MobileAppAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MobileAppAssignment from the service
     *
     * @return the MobileAppAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super MobileAppAssignment> callback) {
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
     * Patches this MobileAppAssignment with a source
     *
     * @param sourceMobileAppAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MobileAppAssignment sourceMobileAppAssignment, final ICallback<? super MobileAppAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceMobileAppAssignment);
    }

    /**
     * Patches this MobileAppAssignment with a source
     *
     * @param sourceMobileAppAssignment the source object with updates
     * @return the updated MobileAppAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppAssignment patch(final MobileAppAssignment sourceMobileAppAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceMobileAppAssignment);
    }

    /**
     * Creates a MobileAppAssignment with a new object
     *
     * @param newMobileAppAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MobileAppAssignment newMobileAppAssignment, final ICallback<? super MobileAppAssignment> callback) {
        send(HttpMethod.POST, callback, newMobileAppAssignment);
    }

    /**
     * Creates a MobileAppAssignment with a new object
     *
     * @param newMobileAppAssignment the new object to create
     * @return the created MobileAppAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppAssignment post(final MobileAppAssignment newMobileAppAssignment) throws ClientException {
        return send(HttpMethod.POST, newMobileAppAssignment);
    }

    /**
     * Creates a MobileAppAssignment with a new object
     *
     * @param newMobileAppAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final MobileAppAssignment newMobileAppAssignment, final ICallback<? super MobileAppAssignment> callback) {
        send(HttpMethod.PUT, callback, newMobileAppAssignment);
    }

    /**
     * Creates a MobileAppAssignment with a new object
     *
     * @param newMobileAppAssignment the object to create/update
     * @return the created MobileAppAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppAssignment put(final MobileAppAssignment newMobileAppAssignment) throws ClientException {
        return send(HttpMethod.PUT, newMobileAppAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMobileAppAssignmentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MobileAppAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMobileAppAssignmentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MobileAppAssignmentRequest)this;
     }

}

