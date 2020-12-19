// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsDeviceUsageUserCounts;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams Device Usage User Counts Request.
 */
public class TeamsDeviceUsageUserCountsRequest extends BaseRequest implements ITeamsDeviceUsageUserCountsRequest {
	
    /**
     * The request for the TeamsDeviceUsageUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsDeviceUsageUserCountsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsDeviceUsageUserCounts.class);
    }

    /**
     * Gets the TeamsDeviceUsageUserCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super TeamsDeviceUsageUserCounts> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TeamsDeviceUsageUserCounts from the service
     *
     * @return the TeamsDeviceUsageUserCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsDeviceUsageUserCounts get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super TeamsDeviceUsageUserCounts> callback) {
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
     * Patches this TeamsDeviceUsageUserCounts with a source
     *
     * @param sourceTeamsDeviceUsageUserCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final TeamsDeviceUsageUserCounts sourceTeamsDeviceUsageUserCounts, final ICallback<? super TeamsDeviceUsageUserCounts> callback) {
        send(HttpMethod.PATCH, callback, sourceTeamsDeviceUsageUserCounts);
    }

    /**
     * Patches this TeamsDeviceUsageUserCounts with a source
     *
     * @param sourceTeamsDeviceUsageUserCounts the source object with updates
     * @return the updated TeamsDeviceUsageUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsDeviceUsageUserCounts patch(final TeamsDeviceUsageUserCounts sourceTeamsDeviceUsageUserCounts) throws ClientException {
        return send(HttpMethod.PATCH, sourceTeamsDeviceUsageUserCounts);
    }

    /**
     * Creates a TeamsDeviceUsageUserCounts with a new object
     *
     * @param newTeamsDeviceUsageUserCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final TeamsDeviceUsageUserCounts newTeamsDeviceUsageUserCounts, final ICallback<? super TeamsDeviceUsageUserCounts> callback) {
        send(HttpMethod.POST, callback, newTeamsDeviceUsageUserCounts);
    }

    /**
     * Creates a TeamsDeviceUsageUserCounts with a new object
     *
     * @param newTeamsDeviceUsageUserCounts the new object to create
     * @return the created TeamsDeviceUsageUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsDeviceUsageUserCounts post(final TeamsDeviceUsageUserCounts newTeamsDeviceUsageUserCounts) throws ClientException {
        return send(HttpMethod.POST, newTeamsDeviceUsageUserCounts);
    }

    /**
     * Creates a TeamsDeviceUsageUserCounts with a new object
     *
     * @param newTeamsDeviceUsageUserCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final TeamsDeviceUsageUserCounts newTeamsDeviceUsageUserCounts, final ICallback<? super TeamsDeviceUsageUserCounts> callback) {
        send(HttpMethod.PUT, callback, newTeamsDeviceUsageUserCounts);
    }

    /**
     * Creates a TeamsDeviceUsageUserCounts with a new object
     *
     * @param newTeamsDeviceUsageUserCounts the object to create/update
     * @return the created TeamsDeviceUsageUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsDeviceUsageUserCounts put(final TeamsDeviceUsageUserCounts newTeamsDeviceUsageUserCounts) throws ClientException {
        return send(HttpMethod.PUT, newTeamsDeviceUsageUserCounts);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ITeamsDeviceUsageUserCountsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (TeamsDeviceUsageUserCountsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ITeamsDeviceUsageUserCountsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (TeamsDeviceUsageUserCountsRequest)this;
     }

}

