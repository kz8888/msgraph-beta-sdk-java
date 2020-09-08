// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ItemCategory;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Item Category Request.
 */
public interface IItemCategoryRequest extends IHttpRequest {

    /**
     * Gets the ItemCategory from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ItemCategory> callback);

    /**
     * Gets the ItemCategory from the service
     *
     * @return the ItemCategory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemCategory get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ItemCategory> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ItemCategory with a source
     *
     * @param sourceItemCategory the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ItemCategory sourceItemCategory, final ICallback<ItemCategory> callback);

    /**
     * Patches this ItemCategory with a source
     *
     * @param sourceItemCategory the source object with updates
     * @return the updated ItemCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemCategory patch(final ItemCategory sourceItemCategory) throws ClientException;

    /**
     * Posts a ItemCategory with a new object
     *
     * @param newItemCategory the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ItemCategory newItemCategory, final ICallback<ItemCategory> callback);

    /**
     * Posts a ItemCategory with a new object
     *
     * @param newItemCategory the new object to create
     * @return the created ItemCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemCategory post(final ItemCategory newItemCategory) throws ClientException;

    /**
     * Posts a ItemCategory with a new object
     *
     * @param newItemCategory the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ItemCategory newItemCategory, final ICallback<ItemCategory> callback);

    /**
     * Posts a ItemCategory with a new object
     *
     * @param newItemCategory the object to create/update
     * @return the created ItemCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemCategory put(final ItemCategory newItemCategory) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IItemCategoryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IItemCategoryRequest expand(final String value);

}

