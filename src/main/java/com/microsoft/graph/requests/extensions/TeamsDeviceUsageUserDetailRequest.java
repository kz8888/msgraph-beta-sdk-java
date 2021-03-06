// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsDeviceUsageUserDetail;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams Device Usage User Detail Request.
 */
public class TeamsDeviceUsageUserDetailRequest extends BaseRequest implements ITeamsDeviceUsageUserDetailRequest {
	
    /**
     * The request for the TeamsDeviceUsageUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsDeviceUsageUserDetailRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsDeviceUsageUserDetail.class);
    }

    /**
     * Gets the TeamsDeviceUsageUserDetail from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super TeamsDeviceUsageUserDetail> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TeamsDeviceUsageUserDetail from the service
     *
     * @return the TeamsDeviceUsageUserDetail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsDeviceUsageUserDetail get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super TeamsDeviceUsageUserDetail> callback) {
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
     * Patches this TeamsDeviceUsageUserDetail with a source
     *
     * @param sourceTeamsDeviceUsageUserDetail the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final TeamsDeviceUsageUserDetail sourceTeamsDeviceUsageUserDetail, final ICallback<? super TeamsDeviceUsageUserDetail> callback) {
        send(HttpMethod.PATCH, callback, sourceTeamsDeviceUsageUserDetail);
    }

    /**
     * Patches this TeamsDeviceUsageUserDetail with a source
     *
     * @param sourceTeamsDeviceUsageUserDetail the source object with updates
     * @return the updated TeamsDeviceUsageUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsDeviceUsageUserDetail patch(final TeamsDeviceUsageUserDetail sourceTeamsDeviceUsageUserDetail) throws ClientException {
        return send(HttpMethod.PATCH, sourceTeamsDeviceUsageUserDetail);
    }

    /**
     * Creates a TeamsDeviceUsageUserDetail with a new object
     *
     * @param newTeamsDeviceUsageUserDetail the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final TeamsDeviceUsageUserDetail newTeamsDeviceUsageUserDetail, final ICallback<? super TeamsDeviceUsageUserDetail> callback) {
        send(HttpMethod.POST, callback, newTeamsDeviceUsageUserDetail);
    }

    /**
     * Creates a TeamsDeviceUsageUserDetail with a new object
     *
     * @param newTeamsDeviceUsageUserDetail the new object to create
     * @return the created TeamsDeviceUsageUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsDeviceUsageUserDetail post(final TeamsDeviceUsageUserDetail newTeamsDeviceUsageUserDetail) throws ClientException {
        return send(HttpMethod.POST, newTeamsDeviceUsageUserDetail);
    }

    /**
     * Creates a TeamsDeviceUsageUserDetail with a new object
     *
     * @param newTeamsDeviceUsageUserDetail the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final TeamsDeviceUsageUserDetail newTeamsDeviceUsageUserDetail, final ICallback<? super TeamsDeviceUsageUserDetail> callback) {
        send(HttpMethod.PUT, callback, newTeamsDeviceUsageUserDetail);
    }

    /**
     * Creates a TeamsDeviceUsageUserDetail with a new object
     *
     * @param newTeamsDeviceUsageUserDetail the object to create/update
     * @return the created TeamsDeviceUsageUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsDeviceUsageUserDetail put(final TeamsDeviceUsageUserDetail newTeamsDeviceUsageUserDetail) throws ClientException {
        return send(HttpMethod.PUT, newTeamsDeviceUsageUserDetail);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ITeamsDeviceUsageUserDetailRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (TeamsDeviceUsageUserDetailRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ITeamsDeviceUsageUserDetailRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (TeamsDeviceUsageUserDetailRequest)this;
     }

}

