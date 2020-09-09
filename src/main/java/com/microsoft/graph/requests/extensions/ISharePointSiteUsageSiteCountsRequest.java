// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SharePointSiteUsageSiteCounts;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Share Point Site Usage Site Counts Request.
 */
public interface ISharePointSiteUsageSiteCountsRequest extends IHttpRequest {

    /**
     * Gets the SharePointSiteUsageSiteCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<SharePointSiteUsageSiteCounts> callback);

    /**
     * Gets the SharePointSiteUsageSiteCounts from the service
     *
     * @return the SharePointSiteUsageSiteCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharePointSiteUsageSiteCounts get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<SharePointSiteUsageSiteCounts> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SharePointSiteUsageSiteCounts with a source
     *
     * @param sourceSharePointSiteUsageSiteCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SharePointSiteUsageSiteCounts sourceSharePointSiteUsageSiteCounts, final ICallback<SharePointSiteUsageSiteCounts> callback);

    /**
     * Patches this SharePointSiteUsageSiteCounts with a source
     *
     * @param sourceSharePointSiteUsageSiteCounts the source object with updates
     * @return the updated SharePointSiteUsageSiteCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharePointSiteUsageSiteCounts patch(final SharePointSiteUsageSiteCounts sourceSharePointSiteUsageSiteCounts) throws ClientException;

    /**
     * Posts a SharePointSiteUsageSiteCounts with a new object
     *
     * @param newSharePointSiteUsageSiteCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SharePointSiteUsageSiteCounts newSharePointSiteUsageSiteCounts, final ICallback<SharePointSiteUsageSiteCounts> callback);

    /**
     * Posts a SharePointSiteUsageSiteCounts with a new object
     *
     * @param newSharePointSiteUsageSiteCounts the new object to create
     * @return the created SharePointSiteUsageSiteCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharePointSiteUsageSiteCounts post(final SharePointSiteUsageSiteCounts newSharePointSiteUsageSiteCounts) throws ClientException;

    /**
     * Posts a SharePointSiteUsageSiteCounts with a new object
     *
     * @param newSharePointSiteUsageSiteCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SharePointSiteUsageSiteCounts newSharePointSiteUsageSiteCounts, final ICallback<SharePointSiteUsageSiteCounts> callback);

    /**
     * Posts a SharePointSiteUsageSiteCounts with a new object
     *
     * @param newSharePointSiteUsageSiteCounts the object to create/update
     * @return the created SharePointSiteUsageSiteCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharePointSiteUsageSiteCounts put(final SharePointSiteUsageSiteCounts newSharePointSiteUsageSiteCounts) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISharePointSiteUsageSiteCountsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISharePointSiteUsageSiteCountsRequest expand(final String value);

}

