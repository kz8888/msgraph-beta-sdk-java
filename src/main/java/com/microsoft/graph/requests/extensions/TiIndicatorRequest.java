// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TiIndicator;
import com.microsoft.graph.models.extensions.ResultInfo;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ti Indicator Request.
 */
public class TiIndicatorRequest extends BaseRequest implements ITiIndicatorRequest {
	
    /**
     * The request for the TiIndicator
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TiIndicatorRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TiIndicator.class);
    }

    /**
     * Gets the TiIndicator from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super TiIndicator> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TiIndicator from the service
     *
     * @return the TiIndicator from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TiIndicator get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super TiIndicator> callback) {
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
     * Patches this TiIndicator with a source
     *
     * @param sourceTiIndicator the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final TiIndicator sourceTiIndicator, final ICallback<? super TiIndicator> callback) {
        send(HttpMethod.PATCH, callback, sourceTiIndicator);
    }

    /**
     * Patches this TiIndicator with a source
     *
     * @param sourceTiIndicator the source object with updates
     * @return the updated TiIndicator
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TiIndicator patch(final TiIndicator sourceTiIndicator) throws ClientException {
        return send(HttpMethod.PATCH, sourceTiIndicator);
    }

    /**
     * Creates a TiIndicator with a new object
     *
     * @param newTiIndicator the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final TiIndicator newTiIndicator, final ICallback<? super TiIndicator> callback) {
        send(HttpMethod.POST, callback, newTiIndicator);
    }

    /**
     * Creates a TiIndicator with a new object
     *
     * @param newTiIndicator the new object to create
     * @return the created TiIndicator
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TiIndicator post(final TiIndicator newTiIndicator) throws ClientException {
        return send(HttpMethod.POST, newTiIndicator);
    }

    /**
     * Creates a TiIndicator with a new object
     *
     * @param newTiIndicator the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final TiIndicator newTiIndicator, final ICallback<? super TiIndicator> callback) {
        send(HttpMethod.PUT, callback, newTiIndicator);
    }

    /**
     * Creates a TiIndicator with a new object
     *
     * @param newTiIndicator the object to create/update
     * @return the created TiIndicator
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TiIndicator put(final TiIndicator newTiIndicator) throws ClientException {
        return send(HttpMethod.PUT, newTiIndicator);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ITiIndicatorRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (TiIndicatorRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ITiIndicatorRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (TiIndicatorRequest)this;
     }

}

