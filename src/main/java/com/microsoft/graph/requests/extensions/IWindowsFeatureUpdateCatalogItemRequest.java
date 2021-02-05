// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsFeatureUpdateCatalogItem;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Feature Update Catalog Item Request.
 */
public interface IWindowsFeatureUpdateCatalogItemRequest extends IHttpRequest {

    /**
     * Gets the WindowsFeatureUpdateCatalogItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WindowsFeatureUpdateCatalogItem> callback);

    /**
     * Gets the WindowsFeatureUpdateCatalogItem from the service
     *
     * @return the WindowsFeatureUpdateCatalogItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsFeatureUpdateCatalogItem get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WindowsFeatureUpdateCatalogItem> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsFeatureUpdateCatalogItem with a source
     *
     * @param sourceWindowsFeatureUpdateCatalogItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsFeatureUpdateCatalogItem sourceWindowsFeatureUpdateCatalogItem, final ICallback<? super WindowsFeatureUpdateCatalogItem> callback);

    /**
     * Patches this WindowsFeatureUpdateCatalogItem with a source
     *
     * @param sourceWindowsFeatureUpdateCatalogItem the source object with updates
     * @return the updated WindowsFeatureUpdateCatalogItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsFeatureUpdateCatalogItem patch(final WindowsFeatureUpdateCatalogItem sourceWindowsFeatureUpdateCatalogItem) throws ClientException;

    /**
     * Posts a WindowsFeatureUpdateCatalogItem with a new object
     *
     * @param newWindowsFeatureUpdateCatalogItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsFeatureUpdateCatalogItem newWindowsFeatureUpdateCatalogItem, final ICallback<? super WindowsFeatureUpdateCatalogItem> callback);

    /**
     * Posts a WindowsFeatureUpdateCatalogItem with a new object
     *
     * @param newWindowsFeatureUpdateCatalogItem the new object to create
     * @return the created WindowsFeatureUpdateCatalogItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsFeatureUpdateCatalogItem post(final WindowsFeatureUpdateCatalogItem newWindowsFeatureUpdateCatalogItem) throws ClientException;

    /**
     * Posts a WindowsFeatureUpdateCatalogItem with a new object
     *
     * @param newWindowsFeatureUpdateCatalogItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WindowsFeatureUpdateCatalogItem newWindowsFeatureUpdateCatalogItem, final ICallback<? super WindowsFeatureUpdateCatalogItem> callback);

    /**
     * Posts a WindowsFeatureUpdateCatalogItem with a new object
     *
     * @param newWindowsFeatureUpdateCatalogItem the object to create/update
     * @return the created WindowsFeatureUpdateCatalogItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsFeatureUpdateCatalogItem put(final WindowsFeatureUpdateCatalogItem newWindowsFeatureUpdateCatalogItem) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsFeatureUpdateCatalogItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsFeatureUpdateCatalogItemRequest expand(final String value);

}

