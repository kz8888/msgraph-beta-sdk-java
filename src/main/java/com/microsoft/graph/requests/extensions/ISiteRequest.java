// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Site;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Site Request.
 */
public interface ISiteRequest extends IHttpRequest {

    /**
     * Gets the Site from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Site> callback);

    /**
     * Gets the Site from the service
     *
     * @return the Site from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Site get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Site> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Site with a source
     *
     * @param sourceSite the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Site sourceSite, final ICallback<Site> callback);

    /**
     * Patches this Site with a source
     *
     * @param sourceSite the source object with updates
     * @return the updated Site
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Site patch(final Site sourceSite) throws ClientException;

    /**
     * Posts a Site with a new object
     *
     * @param newSite the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Site newSite, final ICallback<Site> callback);

    /**
     * Posts a Site with a new object
     *
     * @param newSite the new object to create
     * @return the created Site
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Site post(final Site newSite) throws ClientException;

    /**
     * Posts a Site with a new object
     *
     * @param newSite the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Site newSite, final ICallback<Site> callback);

    /**
     * Posts a Site with a new object
     *
     * @param newSite the object to create/update
     * @return the created Site
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Site put(final Site newSite) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISiteRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISiteRequest expand(final String value);

}

