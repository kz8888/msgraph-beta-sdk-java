// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AgedAccountsPayable;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Aged Accounts Payable Request.
 */
public class AgedAccountsPayableRequest extends BaseRequest implements IAgedAccountsPayableRequest {
	
    /**
     * The request for the AgedAccountsPayable
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AgedAccountsPayableRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AgedAccountsPayable.class);
    }

    /**
     * Gets the AgedAccountsPayable from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AgedAccountsPayable> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AgedAccountsPayable from the service
     *
     * @return the AgedAccountsPayable from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AgedAccountsPayable get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AgedAccountsPayable> callback) {
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
     * Patches this AgedAccountsPayable with a source
     *
     * @param sourceAgedAccountsPayable the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AgedAccountsPayable sourceAgedAccountsPayable, final ICallback<AgedAccountsPayable> callback) {
        send(HttpMethod.PATCH, callback, sourceAgedAccountsPayable);
    }

    /**
     * Patches this AgedAccountsPayable with a source
     *
     * @param sourceAgedAccountsPayable the source object with updates
     * @return the updated AgedAccountsPayable
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AgedAccountsPayable patch(final AgedAccountsPayable sourceAgedAccountsPayable) throws ClientException {
        return send(HttpMethod.PATCH, sourceAgedAccountsPayable);
    }

    /**
     * Creates a AgedAccountsPayable with a new object
     *
     * @param newAgedAccountsPayable the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AgedAccountsPayable newAgedAccountsPayable, final ICallback<AgedAccountsPayable> callback) {
        send(HttpMethod.POST, callback, newAgedAccountsPayable);
    }

    /**
     * Creates a AgedAccountsPayable with a new object
     *
     * @param newAgedAccountsPayable the new object to create
     * @return the created AgedAccountsPayable
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AgedAccountsPayable post(final AgedAccountsPayable newAgedAccountsPayable) throws ClientException {
        return send(HttpMethod.POST, newAgedAccountsPayable);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAgedAccountsPayableRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AgedAccountsPayableRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAgedAccountsPayableRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AgedAccountsPayableRequest)this;
     }

}
