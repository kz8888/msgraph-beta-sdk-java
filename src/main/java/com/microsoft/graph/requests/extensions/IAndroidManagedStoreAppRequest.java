// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidManagedStoreApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Managed Store App Request.
 */
public interface IAndroidManagedStoreAppRequest extends IHttpRequest {

    /**
     * Gets the AndroidManagedStoreApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AndroidManagedStoreApp> callback);

    /**
     * Gets the AndroidManagedStoreApp from the service
     *
     * @return the AndroidManagedStoreApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidManagedStoreApp get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AndroidManagedStoreApp> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidManagedStoreApp with a source
     *
     * @param sourceAndroidManagedStoreApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidManagedStoreApp sourceAndroidManagedStoreApp, final ICallback<? super AndroidManagedStoreApp> callback);

    /**
     * Patches this AndroidManagedStoreApp with a source
     *
     * @param sourceAndroidManagedStoreApp the source object with updates
     * @return the updated AndroidManagedStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidManagedStoreApp patch(final AndroidManagedStoreApp sourceAndroidManagedStoreApp) throws ClientException;

    /**
     * Posts a AndroidManagedStoreApp with a new object
     *
     * @param newAndroidManagedStoreApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidManagedStoreApp newAndroidManagedStoreApp, final ICallback<? super AndroidManagedStoreApp> callback);

    /**
     * Posts a AndroidManagedStoreApp with a new object
     *
     * @param newAndroidManagedStoreApp the new object to create
     * @return the created AndroidManagedStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidManagedStoreApp post(final AndroidManagedStoreApp newAndroidManagedStoreApp) throws ClientException;

    /**
     * Posts a AndroidManagedStoreApp with a new object
     *
     * @param newAndroidManagedStoreApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AndroidManagedStoreApp newAndroidManagedStoreApp, final ICallback<? super AndroidManagedStoreApp> callback);

    /**
     * Posts a AndroidManagedStoreApp with a new object
     *
     * @param newAndroidManagedStoreApp the object to create/update
     * @return the created AndroidManagedStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidManagedStoreApp put(final AndroidManagedStoreApp newAndroidManagedStoreApp) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidManagedStoreAppRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidManagedStoreAppRequest expand(final String value);

}

