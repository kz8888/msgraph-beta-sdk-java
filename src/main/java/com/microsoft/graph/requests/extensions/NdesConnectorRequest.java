// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.NdesConnector;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ndes Connector Request.
 */
public class NdesConnectorRequest extends BaseRequest implements INdesConnectorRequest {
	
    /**
     * The request for the NdesConnector
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NdesConnectorRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, NdesConnector.class);
    }

    /**
     * Gets the NdesConnector from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super NdesConnector> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the NdesConnector from the service
     *
     * @return the NdesConnector from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public NdesConnector get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super NdesConnector> callback) {
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
     * Patches this NdesConnector with a source
     *
     * @param sourceNdesConnector the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final NdesConnector sourceNdesConnector, final ICallback<? super NdesConnector> callback) {
        send(HttpMethod.PATCH, callback, sourceNdesConnector);
    }

    /**
     * Patches this NdesConnector with a source
     *
     * @param sourceNdesConnector the source object with updates
     * @return the updated NdesConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public NdesConnector patch(final NdesConnector sourceNdesConnector) throws ClientException {
        return send(HttpMethod.PATCH, sourceNdesConnector);
    }

    /**
     * Creates a NdesConnector with a new object
     *
     * @param newNdesConnector the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final NdesConnector newNdesConnector, final ICallback<? super NdesConnector> callback) {
        send(HttpMethod.POST, callback, newNdesConnector);
    }

    /**
     * Creates a NdesConnector with a new object
     *
     * @param newNdesConnector the new object to create
     * @return the created NdesConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public NdesConnector post(final NdesConnector newNdesConnector) throws ClientException {
        return send(HttpMethod.POST, newNdesConnector);
    }

    /**
     * Creates a NdesConnector with a new object
     *
     * @param newNdesConnector the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final NdesConnector newNdesConnector, final ICallback<? super NdesConnector> callback) {
        send(HttpMethod.PUT, callback, newNdesConnector);
    }

    /**
     * Creates a NdesConnector with a new object
     *
     * @param newNdesConnector the object to create/update
     * @return the created NdesConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public NdesConnector put(final NdesConnector newNdesConnector) throws ClientException {
        return send(HttpMethod.PUT, newNdesConnector);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public INdesConnectorRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (NdesConnectorRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public INdesConnectorRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (NdesConnectorRequest)this;
     }

}

