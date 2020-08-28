// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.NamedLocation;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Named Location Request.
 */
public class NamedLocationRequest extends BaseRequest implements INamedLocationRequest {
	
    /**
     * The request for the NamedLocation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public NamedLocationRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends NamedLocation> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the NamedLocation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NamedLocationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, NamedLocation.class);
    }

    /**
     * Gets the NamedLocation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<NamedLocation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the NamedLocation from the service
     *
     * @return the NamedLocation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public NamedLocation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<NamedLocation> callback) {
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
     * Patches this NamedLocation with a source
     *
     * @param sourceNamedLocation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final NamedLocation sourceNamedLocation, final ICallback<NamedLocation> callback) {
        send(HttpMethod.PATCH, callback, sourceNamedLocation);
    }

    /**
     * Patches this NamedLocation with a source
     *
     * @param sourceNamedLocation the source object with updates
     * @return the updated NamedLocation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public NamedLocation patch(final NamedLocation sourceNamedLocation) throws ClientException {
        return send(HttpMethod.PATCH, sourceNamedLocation);
    }

    /**
     * Creates a NamedLocation with a new object
     *
     * @param newNamedLocation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final NamedLocation newNamedLocation, final ICallback<NamedLocation> callback) {
        send(HttpMethod.POST, callback, newNamedLocation);
    }

    /**
     * Creates a NamedLocation with a new object
     *
     * @param newNamedLocation the new object to create
     * @return the created NamedLocation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public NamedLocation post(final NamedLocation newNamedLocation) throws ClientException {
        return send(HttpMethod.POST, newNamedLocation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public INamedLocationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (NamedLocationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public INamedLocationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (NamedLocationRequest)this;
     }

}
