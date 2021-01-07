// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedEBookCategory;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed EBook Category Request.
 */
public class ManagedEBookCategoryRequest extends BaseRequest<ManagedEBookCategory> {
	
    /**
     * The request for the ManagedEBookCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedEBookCategoryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedEBookCategory.class);
    }

    /**
     * Gets the ManagedEBookCategory from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ManagedEBookCategory> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedEBookCategory from the service
     *
     * @return the ManagedEBookCategory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedEBookCategory get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ManagedEBookCategory> callback) {
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
     * Patches this ManagedEBookCategory with a source
     *
     * @param sourceManagedEBookCategory the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ManagedEBookCategory sourceManagedEBookCategory, @Nonnull final ICallback<? super ManagedEBookCategory> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedEBookCategory);
    }

    /**
     * Patches this ManagedEBookCategory with a source
     *
     * @param sourceManagedEBookCategory the source object with updates
     * @return the updated ManagedEBookCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedEBookCategory patch(@Nonnull final ManagedEBookCategory sourceManagedEBookCategory) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedEBookCategory);
    }

    /**
     * Creates a ManagedEBookCategory with a new object
     *
     * @param newManagedEBookCategory the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ManagedEBookCategory newManagedEBookCategory, @Nonnull final ICallback<? super ManagedEBookCategory> callback) {
        send(HttpMethod.POST, callback, newManagedEBookCategory);
    }

    /**
     * Creates a ManagedEBookCategory with a new object
     *
     * @param newManagedEBookCategory the new object to create
     * @return the created ManagedEBookCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedEBookCategory post(@Nonnull final ManagedEBookCategory newManagedEBookCategory) throws ClientException {
        return send(HttpMethod.POST, newManagedEBookCategory);
    }

    /**
     * Creates a ManagedEBookCategory with a new object
     *
     * @param newManagedEBookCategory the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ManagedEBookCategory newManagedEBookCategory, @Nonnull final ICallback<? super ManagedEBookCategory> callback) {
        send(HttpMethod.PUT, callback, newManagedEBookCategory);
    }

    /**
     * Creates a ManagedEBookCategory with a new object
     *
     * @param newManagedEBookCategory the object to create/update
     * @return the created ManagedEBookCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedEBookCategory put(@Nonnull final ManagedEBookCategory newManagedEBookCategory) throws ClientException {
        return send(HttpMethod.PUT, newManagedEBookCategory);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedEBookCategoryRequest select(@Nonnull final String value) {
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
     public ManagedEBookCategoryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

