// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Office365ServicesUserCounts;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office365Services User Counts Request.
 */
public class Office365ServicesUserCountsRequest extends BaseRequest implements IOffice365ServicesUserCountsRequest {
	
    /**
     * The request for the Office365ServicesUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Office365ServicesUserCountsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Office365ServicesUserCounts.class);
    }

    /**
     * Gets the Office365ServicesUserCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Office365ServicesUserCounts> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Office365ServicesUserCounts from the service
     *
     * @return the Office365ServicesUserCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Office365ServicesUserCounts get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Office365ServicesUserCounts> callback) {
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
     * Patches this Office365ServicesUserCounts with a source
     *
     * @param sourceOffice365ServicesUserCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Office365ServicesUserCounts sourceOffice365ServicesUserCounts, final ICallback<? super Office365ServicesUserCounts> callback) {
        send(HttpMethod.PATCH, callback, sourceOffice365ServicesUserCounts);
    }

    /**
     * Patches this Office365ServicesUserCounts with a source
     *
     * @param sourceOffice365ServicesUserCounts the source object with updates
     * @return the updated Office365ServicesUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Office365ServicesUserCounts patch(final Office365ServicesUserCounts sourceOffice365ServicesUserCounts) throws ClientException {
        return send(HttpMethod.PATCH, sourceOffice365ServicesUserCounts);
    }

    /**
     * Creates a Office365ServicesUserCounts with a new object
     *
     * @param newOffice365ServicesUserCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Office365ServicesUserCounts newOffice365ServicesUserCounts, final ICallback<? super Office365ServicesUserCounts> callback) {
        send(HttpMethod.POST, callback, newOffice365ServicesUserCounts);
    }

    /**
     * Creates a Office365ServicesUserCounts with a new object
     *
     * @param newOffice365ServicesUserCounts the new object to create
     * @return the created Office365ServicesUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Office365ServicesUserCounts post(final Office365ServicesUserCounts newOffice365ServicesUserCounts) throws ClientException {
        return send(HttpMethod.POST, newOffice365ServicesUserCounts);
    }

    /**
     * Creates a Office365ServicesUserCounts with a new object
     *
     * @param newOffice365ServicesUserCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Office365ServicesUserCounts newOffice365ServicesUserCounts, final ICallback<? super Office365ServicesUserCounts> callback) {
        send(HttpMethod.PUT, callback, newOffice365ServicesUserCounts);
    }

    /**
     * Creates a Office365ServicesUserCounts with a new object
     *
     * @param newOffice365ServicesUserCounts the object to create/update
     * @return the created Office365ServicesUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Office365ServicesUserCounts put(final Office365ServicesUserCounts newOffice365ServicesUserCounts) throws ClientException {
        return send(HttpMethod.PUT, newOffice365ServicesUserCounts);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IOffice365ServicesUserCountsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (Office365ServicesUserCountsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IOffice365ServicesUserCountsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (Office365ServicesUserCountsRequest)this;
     }

}

