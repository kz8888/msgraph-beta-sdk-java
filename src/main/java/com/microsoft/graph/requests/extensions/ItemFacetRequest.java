// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemFacet;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Facet Request.
 */
public class ItemFacetRequest extends BaseRequest<ItemFacet> {
	
    /**
     * The request for the ItemFacet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ItemFacetRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends ItemFacet> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ItemFacet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemFacetRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemFacet.class);
    }

    /**
     * Gets the ItemFacet from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ItemFacet> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ItemFacet from the service
     *
     * @return the ItemFacet from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemFacet get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ItemFacet> callback) {
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
     * Patches this ItemFacet with a source
     *
     * @param sourceItemFacet the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ItemFacet sourceItemFacet, @Nonnull final ICallback<? super ItemFacet> callback) {
        send(HttpMethod.PATCH, callback, sourceItemFacet);
    }

    /**
     * Patches this ItemFacet with a source
     *
     * @param sourceItemFacet the source object with updates
     * @return the updated ItemFacet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemFacet patch(@Nonnull final ItemFacet sourceItemFacet) throws ClientException {
        return send(HttpMethod.PATCH, sourceItemFacet);
    }

    /**
     * Creates a ItemFacet with a new object
     *
     * @param newItemFacet the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ItemFacet newItemFacet, @Nonnull final ICallback<? super ItemFacet> callback) {
        send(HttpMethod.POST, callback, newItemFacet);
    }

    /**
     * Creates a ItemFacet with a new object
     *
     * @param newItemFacet the new object to create
     * @return the created ItemFacet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemFacet post(@Nonnull final ItemFacet newItemFacet) throws ClientException {
        return send(HttpMethod.POST, newItemFacet);
    }

    /**
     * Creates a ItemFacet with a new object
     *
     * @param newItemFacet the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ItemFacet newItemFacet, @Nonnull final ICallback<? super ItemFacet> callback) {
        send(HttpMethod.PUT, callback, newItemFacet);
    }

    /**
     * Creates a ItemFacet with a new object
     *
     * @param newItemFacet the object to create/update
     * @return the created ItemFacet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemFacet put(@Nonnull final ItemFacet newItemFacet) throws ClientException {
        return send(HttpMethod.PUT, newItemFacet);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ItemFacetRequest select(@Nonnull final String value) {
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
     public ItemFacetRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

