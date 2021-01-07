// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Ediscovery;
import com.microsoft.graph.requests.extensions.CaseCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CaseRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Request.
 */
public class EdiscoveryRequest extends BaseRequest<Ediscovery> {
	
    /**
     * The request for the Ediscovery
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EdiscoveryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Ediscovery.class);
    }

    /**
     * Gets the Ediscovery from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super Ediscovery> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Ediscovery from the service
     *
     * @return the Ediscovery from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Ediscovery get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super Ediscovery> callback) {
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
     * Patches this Ediscovery with a source
     *
     * @param sourceEdiscovery the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final Ediscovery sourceEdiscovery, @Nonnull final ICallback<? super Ediscovery> callback) {
        send(HttpMethod.PATCH, callback, sourceEdiscovery);
    }

    /**
     * Patches this Ediscovery with a source
     *
     * @param sourceEdiscovery the source object with updates
     * @return the updated Ediscovery
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Ediscovery patch(@Nonnull final Ediscovery sourceEdiscovery) throws ClientException {
        return send(HttpMethod.PATCH, sourceEdiscovery);
    }

    /**
     * Creates a Ediscovery with a new object
     *
     * @param newEdiscovery the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final Ediscovery newEdiscovery, @Nonnull final ICallback<? super Ediscovery> callback) {
        send(HttpMethod.POST, callback, newEdiscovery);
    }

    /**
     * Creates a Ediscovery with a new object
     *
     * @param newEdiscovery the new object to create
     * @return the created Ediscovery
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Ediscovery post(@Nonnull final Ediscovery newEdiscovery) throws ClientException {
        return send(HttpMethod.POST, newEdiscovery);
    }

    /**
     * Creates a Ediscovery with a new object
     *
     * @param newEdiscovery the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final Ediscovery newEdiscovery, @Nonnull final ICallback<? super Ediscovery> callback) {
        send(HttpMethod.PUT, callback, newEdiscovery);
    }

    /**
     * Creates a Ediscovery with a new object
     *
     * @param newEdiscovery the object to create/update
     * @return the created Ediscovery
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Ediscovery put(@Nonnull final Ediscovery newEdiscovery) throws ClientException {
        return send(HttpMethod.PUT, newEdiscovery);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EdiscoveryRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public EdiscoveryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

