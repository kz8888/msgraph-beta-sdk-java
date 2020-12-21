// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ConfigManagerCollection;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Config Manager Collection Request.
 */
public interface IConfigManagerCollectionRequest extends IHttpRequest {

    /**
     * Gets the ConfigManagerCollection from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ConfigManagerCollection> callback);

    /**
     * Gets the ConfigManagerCollection from the service
     *
     * @return the ConfigManagerCollection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ConfigManagerCollection get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ConfigManagerCollection> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ConfigManagerCollection with a source
     *
     * @param sourceConfigManagerCollection the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ConfigManagerCollection sourceConfigManagerCollection, final ICallback<? super ConfigManagerCollection> callback);

    /**
     * Patches this ConfigManagerCollection with a source
     *
     * @param sourceConfigManagerCollection the source object with updates
     * @return the updated ConfigManagerCollection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ConfigManagerCollection patch(final ConfigManagerCollection sourceConfigManagerCollection) throws ClientException;

    /**
     * Posts a ConfigManagerCollection with a new object
     *
     * @param newConfigManagerCollection the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ConfigManagerCollection newConfigManagerCollection, final ICallback<? super ConfigManagerCollection> callback);

    /**
     * Posts a ConfigManagerCollection with a new object
     *
     * @param newConfigManagerCollection the new object to create
     * @return the created ConfigManagerCollection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ConfigManagerCollection post(final ConfigManagerCollection newConfigManagerCollection) throws ClientException;

    /**
     * Posts a ConfigManagerCollection with a new object
     *
     * @param newConfigManagerCollection the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ConfigManagerCollection newConfigManagerCollection, final ICallback<? super ConfigManagerCollection> callback);

    /**
     * Posts a ConfigManagerCollection with a new object
     *
     * @param newConfigManagerCollection the object to create/update
     * @return the created ConfigManagerCollection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ConfigManagerCollection put(final ConfigManagerCollection newConfigManagerCollection) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IConfigManagerCollectionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IConfigManagerCollectionRequest expand(final String value);

}

