// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RelyingPartyDetailedSummary;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Relying Party Detailed Summary Request.
 */
public class RelyingPartyDetailedSummaryRequest extends BaseRequest implements IRelyingPartyDetailedSummaryRequest {
	
    /**
     * The request for the RelyingPartyDetailedSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RelyingPartyDetailedSummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RelyingPartyDetailedSummary.class);
    }

    /**
     * Gets the RelyingPartyDetailedSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super RelyingPartyDetailedSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the RelyingPartyDetailedSummary from the service
     *
     * @return the RelyingPartyDetailedSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RelyingPartyDetailedSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super RelyingPartyDetailedSummary> callback) {
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
     * Patches this RelyingPartyDetailedSummary with a source
     *
     * @param sourceRelyingPartyDetailedSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final RelyingPartyDetailedSummary sourceRelyingPartyDetailedSummary, final ICallback<? super RelyingPartyDetailedSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceRelyingPartyDetailedSummary);
    }

    /**
     * Patches this RelyingPartyDetailedSummary with a source
     *
     * @param sourceRelyingPartyDetailedSummary the source object with updates
     * @return the updated RelyingPartyDetailedSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RelyingPartyDetailedSummary patch(final RelyingPartyDetailedSummary sourceRelyingPartyDetailedSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceRelyingPartyDetailedSummary);
    }

    /**
     * Creates a RelyingPartyDetailedSummary with a new object
     *
     * @param newRelyingPartyDetailedSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final RelyingPartyDetailedSummary newRelyingPartyDetailedSummary, final ICallback<? super RelyingPartyDetailedSummary> callback) {
        send(HttpMethod.POST, callback, newRelyingPartyDetailedSummary);
    }

    /**
     * Creates a RelyingPartyDetailedSummary with a new object
     *
     * @param newRelyingPartyDetailedSummary the new object to create
     * @return the created RelyingPartyDetailedSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RelyingPartyDetailedSummary post(final RelyingPartyDetailedSummary newRelyingPartyDetailedSummary) throws ClientException {
        return send(HttpMethod.POST, newRelyingPartyDetailedSummary);
    }

    /**
     * Creates a RelyingPartyDetailedSummary with a new object
     *
     * @param newRelyingPartyDetailedSummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final RelyingPartyDetailedSummary newRelyingPartyDetailedSummary, final ICallback<? super RelyingPartyDetailedSummary> callback) {
        send(HttpMethod.PUT, callback, newRelyingPartyDetailedSummary);
    }

    /**
     * Creates a RelyingPartyDetailedSummary with a new object
     *
     * @param newRelyingPartyDetailedSummary the object to create/update
     * @return the created RelyingPartyDetailedSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RelyingPartyDetailedSummary put(final RelyingPartyDetailedSummary newRelyingPartyDetailedSummary) throws ClientException {
        return send(HttpMethod.PUT, newRelyingPartyDetailedSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IRelyingPartyDetailedSummaryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (RelyingPartyDetailedSummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IRelyingPartyDetailedSummaryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (RelyingPartyDetailedSummaryRequest)this;
     }

}

