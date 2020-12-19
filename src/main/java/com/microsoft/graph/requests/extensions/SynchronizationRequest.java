// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Synchronization;
import com.microsoft.graph.models.extensions.SynchronizationSecretKeyStringValuePair;
import com.microsoft.graph.requests.extensions.ISynchronizationJobCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISynchronizationJobRequestBuilder;
import com.microsoft.graph.requests.extensions.SynchronizationJobCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SynchronizationJobRequestBuilder;
import com.microsoft.graph.requests.extensions.ISynchronizationTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISynchronizationTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.SynchronizationTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SynchronizationTemplateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Request.
 */
public class SynchronizationRequest extends BaseRequest implements ISynchronizationRequest {
	
    /**
     * The request for the Synchronization
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SynchronizationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Synchronization.class);
    }

    /**
     * Gets the Synchronization from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Synchronization> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Synchronization from the service
     *
     * @return the Synchronization from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Synchronization get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Synchronization> callback) {
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
     * Patches this Synchronization with a source
     *
     * @param sourceSynchronization the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Synchronization sourceSynchronization, final ICallback<? super Synchronization> callback) {
        send(HttpMethod.PATCH, callback, sourceSynchronization);
    }

    /**
     * Patches this Synchronization with a source
     *
     * @param sourceSynchronization the source object with updates
     * @return the updated Synchronization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Synchronization patch(final Synchronization sourceSynchronization) throws ClientException {
        return send(HttpMethod.PATCH, sourceSynchronization);
    }

    /**
     * Creates a Synchronization with a new object
     *
     * @param newSynchronization the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Synchronization newSynchronization, final ICallback<? super Synchronization> callback) {
        send(HttpMethod.POST, callback, newSynchronization);
    }

    /**
     * Creates a Synchronization with a new object
     *
     * @param newSynchronization the new object to create
     * @return the created Synchronization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Synchronization post(final Synchronization newSynchronization) throws ClientException {
        return send(HttpMethod.POST, newSynchronization);
    }

    /**
     * Creates a Synchronization with a new object
     *
     * @param newSynchronization the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Synchronization newSynchronization, final ICallback<? super Synchronization> callback) {
        send(HttpMethod.PUT, callback, newSynchronization);
    }

    /**
     * Creates a Synchronization with a new object
     *
     * @param newSynchronization the object to create/update
     * @return the created Synchronization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Synchronization put(final Synchronization newSynchronization) throws ClientException {
        return send(HttpMethod.PUT, newSynchronization);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISynchronizationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SynchronizationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISynchronizationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SynchronizationRequest)this;
     }

}

