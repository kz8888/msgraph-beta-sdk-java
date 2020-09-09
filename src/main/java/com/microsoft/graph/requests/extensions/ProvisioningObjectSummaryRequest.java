// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ProvisioningObjectSummary;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Provisioning Object Summary Request.
 */
public class ProvisioningObjectSummaryRequest extends BaseRequest implements IProvisioningObjectSummaryRequest {
	
    /**
     * The request for the ProvisioningObjectSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ProvisioningObjectSummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ProvisioningObjectSummary.class);
    }

    /**
     * Gets the ProvisioningObjectSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ProvisioningObjectSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ProvisioningObjectSummary from the service
     *
     * @return the ProvisioningObjectSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ProvisioningObjectSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ProvisioningObjectSummary> callback) {
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
     * Patches this ProvisioningObjectSummary with a source
     *
     * @param sourceProvisioningObjectSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ProvisioningObjectSummary sourceProvisioningObjectSummary, final ICallback<ProvisioningObjectSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceProvisioningObjectSummary);
    }

    /**
     * Patches this ProvisioningObjectSummary with a source
     *
     * @param sourceProvisioningObjectSummary the source object with updates
     * @return the updated ProvisioningObjectSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ProvisioningObjectSummary patch(final ProvisioningObjectSummary sourceProvisioningObjectSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceProvisioningObjectSummary);
    }

    /**
     * Creates a ProvisioningObjectSummary with a new object
     *
     * @param newProvisioningObjectSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ProvisioningObjectSummary newProvisioningObjectSummary, final ICallback<ProvisioningObjectSummary> callback) {
        send(HttpMethod.POST, callback, newProvisioningObjectSummary);
    }

    /**
     * Creates a ProvisioningObjectSummary with a new object
     *
     * @param newProvisioningObjectSummary the new object to create
     * @return the created ProvisioningObjectSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ProvisioningObjectSummary post(final ProvisioningObjectSummary newProvisioningObjectSummary) throws ClientException {
        return send(HttpMethod.POST, newProvisioningObjectSummary);
    }

    /**
     * Creates a ProvisioningObjectSummary with a new object
     *
     * @param newProvisioningObjectSummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ProvisioningObjectSummary newProvisioningObjectSummary, final ICallback<ProvisioningObjectSummary> callback) {
        send(HttpMethod.PUT, callback, newProvisioningObjectSummary);
    }

    /**
     * Creates a ProvisioningObjectSummary with a new object
     *
     * @param newProvisioningObjectSummary the object to create/update
     * @return the created ProvisioningObjectSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ProvisioningObjectSummary put(final ProvisioningObjectSummary newProvisioningObjectSummary) throws ClientException {
        return send(HttpMethod.PUT, newProvisioningObjectSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IProvisioningObjectSummaryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ProvisioningObjectSummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IProvisioningObjectSummaryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ProvisioningObjectSummaryRequest)this;
     }

}

