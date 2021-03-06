// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SalesQuoteLine;
import com.microsoft.graph.requests.extensions.IAccountRequestBuilder;
import com.microsoft.graph.requests.extensions.AccountRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sales Quote Line Request.
 */
public class SalesQuoteLineRequest extends BaseRequest implements ISalesQuoteLineRequest {
	
    /**
     * The request for the SalesQuoteLine
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SalesQuoteLineRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SalesQuoteLine.class);
    }

    /**
     * Gets the SalesQuoteLine from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super SalesQuoteLine> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SalesQuoteLine from the service
     *
     * @return the SalesQuoteLine from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SalesQuoteLine get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super SalesQuoteLine> callback) {
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
     * Patches this SalesQuoteLine with a source
     *
     * @param sourceSalesQuoteLine the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SalesQuoteLine sourceSalesQuoteLine, final ICallback<? super SalesQuoteLine> callback) {
        send(HttpMethod.PATCH, callback, sourceSalesQuoteLine);
    }

    /**
     * Patches this SalesQuoteLine with a source
     *
     * @param sourceSalesQuoteLine the source object with updates
     * @return the updated SalesQuoteLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SalesQuoteLine patch(final SalesQuoteLine sourceSalesQuoteLine) throws ClientException {
        return send(HttpMethod.PATCH, sourceSalesQuoteLine);
    }

    /**
     * Creates a SalesQuoteLine with a new object
     *
     * @param newSalesQuoteLine the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SalesQuoteLine newSalesQuoteLine, final ICallback<? super SalesQuoteLine> callback) {
        send(HttpMethod.POST, callback, newSalesQuoteLine);
    }

    /**
     * Creates a SalesQuoteLine with a new object
     *
     * @param newSalesQuoteLine the new object to create
     * @return the created SalesQuoteLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SalesQuoteLine post(final SalesQuoteLine newSalesQuoteLine) throws ClientException {
        return send(HttpMethod.POST, newSalesQuoteLine);
    }

    /**
     * Creates a SalesQuoteLine with a new object
     *
     * @param newSalesQuoteLine the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SalesQuoteLine newSalesQuoteLine, final ICallback<? super SalesQuoteLine> callback) {
        send(HttpMethod.PUT, callback, newSalesQuoteLine);
    }

    /**
     * Creates a SalesQuoteLine with a new object
     *
     * @param newSalesQuoteLine the object to create/update
     * @return the created SalesQuoteLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SalesQuoteLine put(final SalesQuoteLine newSalesQuoteLine) throws ClientException {
        return send(HttpMethod.PUT, newSalesQuoteLine);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISalesQuoteLineRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SalesQuoteLineRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISalesQuoteLineRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SalesQuoteLineRequest)this;
     }

}

