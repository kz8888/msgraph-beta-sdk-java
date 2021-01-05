// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Office365ActivationCounts;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office365Activation Counts Request.
 */
public class Office365ActivationCountsRequest extends BaseRequest implements IOffice365ActivationCountsRequest {
	
    /**
     * The request for the Office365ActivationCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Office365ActivationCountsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Office365ActivationCounts.class);
    }

    /**
     * Gets the Office365ActivationCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Office365ActivationCounts> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Office365ActivationCounts from the service
     *
     * @return the Office365ActivationCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Office365ActivationCounts get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Office365ActivationCounts> callback) {
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
     * Patches this Office365ActivationCounts with a source
     *
     * @param sourceOffice365ActivationCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Office365ActivationCounts sourceOffice365ActivationCounts, final ICallback<? super Office365ActivationCounts> callback) {
        send(HttpMethod.PATCH, callback, sourceOffice365ActivationCounts);
    }

    /**
     * Patches this Office365ActivationCounts with a source
     *
     * @param sourceOffice365ActivationCounts the source object with updates
     * @return the updated Office365ActivationCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Office365ActivationCounts patch(final Office365ActivationCounts sourceOffice365ActivationCounts) throws ClientException {
        return send(HttpMethod.PATCH, sourceOffice365ActivationCounts);
    }

    /**
     * Creates a Office365ActivationCounts with a new object
     *
     * @param newOffice365ActivationCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Office365ActivationCounts newOffice365ActivationCounts, final ICallback<? super Office365ActivationCounts> callback) {
        send(HttpMethod.POST, callback, newOffice365ActivationCounts);
    }

    /**
     * Creates a Office365ActivationCounts with a new object
     *
     * @param newOffice365ActivationCounts the new object to create
     * @return the created Office365ActivationCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Office365ActivationCounts post(final Office365ActivationCounts newOffice365ActivationCounts) throws ClientException {
        return send(HttpMethod.POST, newOffice365ActivationCounts);
    }

    /**
     * Creates a Office365ActivationCounts with a new object
     *
     * @param newOffice365ActivationCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Office365ActivationCounts newOffice365ActivationCounts, final ICallback<? super Office365ActivationCounts> callback) {
        send(HttpMethod.PUT, callback, newOffice365ActivationCounts);
    }

    /**
     * Creates a Office365ActivationCounts with a new object
     *
     * @param newOffice365ActivationCounts the object to create/update
     * @return the created Office365ActivationCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Office365ActivationCounts put(final Office365ActivationCounts newOffice365ActivationCounts) throws ClientException {
        return send(HttpMethod.PUT, newOffice365ActivationCounts);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IOffice365ActivationCountsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (Office365ActivationCountsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IOffice365ActivationCountsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (Office365ActivationCountsRequest)this;
     }

}

