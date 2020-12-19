// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.LocationManagementCondition;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Location Management Condition Request.
 */
public class LocationManagementConditionRequest extends BaseRequest implements ILocationManagementConditionRequest {
	
    /**
     * The request for the LocationManagementCondition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public LocationManagementConditionRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends LocationManagementCondition> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the LocationManagementCondition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public LocationManagementConditionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, LocationManagementCondition.class);
    }

    /**
     * Gets the LocationManagementCondition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super LocationManagementCondition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the LocationManagementCondition from the service
     *
     * @return the LocationManagementCondition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public LocationManagementCondition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super LocationManagementCondition> callback) {
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
     * Patches this LocationManagementCondition with a source
     *
     * @param sourceLocationManagementCondition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final LocationManagementCondition sourceLocationManagementCondition, final ICallback<? super LocationManagementCondition> callback) {
        send(HttpMethod.PATCH, callback, sourceLocationManagementCondition);
    }

    /**
     * Patches this LocationManagementCondition with a source
     *
     * @param sourceLocationManagementCondition the source object with updates
     * @return the updated LocationManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public LocationManagementCondition patch(final LocationManagementCondition sourceLocationManagementCondition) throws ClientException {
        return send(HttpMethod.PATCH, sourceLocationManagementCondition);
    }

    /**
     * Creates a LocationManagementCondition with a new object
     *
     * @param newLocationManagementCondition the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final LocationManagementCondition newLocationManagementCondition, final ICallback<? super LocationManagementCondition> callback) {
        send(HttpMethod.POST, callback, newLocationManagementCondition);
    }

    /**
     * Creates a LocationManagementCondition with a new object
     *
     * @param newLocationManagementCondition the new object to create
     * @return the created LocationManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public LocationManagementCondition post(final LocationManagementCondition newLocationManagementCondition) throws ClientException {
        return send(HttpMethod.POST, newLocationManagementCondition);
    }

    /**
     * Creates a LocationManagementCondition with a new object
     *
     * @param newLocationManagementCondition the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final LocationManagementCondition newLocationManagementCondition, final ICallback<? super LocationManagementCondition> callback) {
        send(HttpMethod.PUT, callback, newLocationManagementCondition);
    }

    /**
     * Creates a LocationManagementCondition with a new object
     *
     * @param newLocationManagementCondition the object to create/update
     * @return the created LocationManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public LocationManagementCondition put(final LocationManagementCondition newLocationManagementCondition) throws ClientException {
        return send(HttpMethod.PUT, newLocationManagementCondition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ILocationManagementConditionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (LocationManagementConditionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ILocationManagementConditionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (LocationManagementConditionRequest)this;
     }

}

