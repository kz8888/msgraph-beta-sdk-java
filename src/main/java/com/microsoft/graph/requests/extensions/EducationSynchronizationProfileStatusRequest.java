// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationSynchronizationProfileStatus;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Synchronization Profile Status Request.
 */
public class EducationSynchronizationProfileStatusRequest extends BaseRequest implements IEducationSynchronizationProfileStatusRequest {
	
    /**
     * The request for the EducationSynchronizationProfileStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationSynchronizationProfileStatusRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationSynchronizationProfileStatus.class);
    }

    /**
     * Gets the EducationSynchronizationProfileStatus from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super EducationSynchronizationProfileStatus> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EducationSynchronizationProfileStatus from the service
     *
     * @return the EducationSynchronizationProfileStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationSynchronizationProfileStatus get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super EducationSynchronizationProfileStatus> callback) {
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
     * Patches this EducationSynchronizationProfileStatus with a source
     *
     * @param sourceEducationSynchronizationProfileStatus the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EducationSynchronizationProfileStatus sourceEducationSynchronizationProfileStatus, final ICallback<? super EducationSynchronizationProfileStatus> callback) {
        send(HttpMethod.PATCH, callback, sourceEducationSynchronizationProfileStatus);
    }

    /**
     * Patches this EducationSynchronizationProfileStatus with a source
     *
     * @param sourceEducationSynchronizationProfileStatus the source object with updates
     * @return the updated EducationSynchronizationProfileStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationSynchronizationProfileStatus patch(final EducationSynchronizationProfileStatus sourceEducationSynchronizationProfileStatus) throws ClientException {
        return send(HttpMethod.PATCH, sourceEducationSynchronizationProfileStatus);
    }

    /**
     * Creates a EducationSynchronizationProfileStatus with a new object
     *
     * @param newEducationSynchronizationProfileStatus the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EducationSynchronizationProfileStatus newEducationSynchronizationProfileStatus, final ICallback<? super EducationSynchronizationProfileStatus> callback) {
        send(HttpMethod.POST, callback, newEducationSynchronizationProfileStatus);
    }

    /**
     * Creates a EducationSynchronizationProfileStatus with a new object
     *
     * @param newEducationSynchronizationProfileStatus the new object to create
     * @return the created EducationSynchronizationProfileStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationSynchronizationProfileStatus post(final EducationSynchronizationProfileStatus newEducationSynchronizationProfileStatus) throws ClientException {
        return send(HttpMethod.POST, newEducationSynchronizationProfileStatus);
    }

    /**
     * Creates a EducationSynchronizationProfileStatus with a new object
     *
     * @param newEducationSynchronizationProfileStatus the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final EducationSynchronizationProfileStatus newEducationSynchronizationProfileStatus, final ICallback<? super EducationSynchronizationProfileStatus> callback) {
        send(HttpMethod.PUT, callback, newEducationSynchronizationProfileStatus);
    }

    /**
     * Creates a EducationSynchronizationProfileStatus with a new object
     *
     * @param newEducationSynchronizationProfileStatus the object to create/update
     * @return the created EducationSynchronizationProfileStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationSynchronizationProfileStatus put(final EducationSynchronizationProfileStatus newEducationSynchronizationProfileStatus) throws ClientException {
        return send(HttpMethod.PUT, newEducationSynchronizationProfileStatus);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEducationSynchronizationProfileStatusRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EducationSynchronizationProfileStatusRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEducationSynchronizationProfileStatusRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EducationSynchronizationProfileStatusRequest)this;
     }

}

