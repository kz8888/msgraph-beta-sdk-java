// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SkypeForBusinessActivityUserCounts;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Skype For Business Activity User Counts Request.
 */
public interface ISkypeForBusinessActivityUserCountsRequest extends IHttpRequest {

    /**
     * Gets the SkypeForBusinessActivityUserCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<SkypeForBusinessActivityUserCounts> callback);

    /**
     * Gets the SkypeForBusinessActivityUserCounts from the service
     *
     * @return the SkypeForBusinessActivityUserCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessActivityUserCounts get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<SkypeForBusinessActivityUserCounts> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SkypeForBusinessActivityUserCounts with a source
     *
     * @param sourceSkypeForBusinessActivityUserCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SkypeForBusinessActivityUserCounts sourceSkypeForBusinessActivityUserCounts, final ICallback<SkypeForBusinessActivityUserCounts> callback);

    /**
     * Patches this SkypeForBusinessActivityUserCounts with a source
     *
     * @param sourceSkypeForBusinessActivityUserCounts the source object with updates
     * @return the updated SkypeForBusinessActivityUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessActivityUserCounts patch(final SkypeForBusinessActivityUserCounts sourceSkypeForBusinessActivityUserCounts) throws ClientException;

    /**
     * Posts a SkypeForBusinessActivityUserCounts with a new object
     *
     * @param newSkypeForBusinessActivityUserCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SkypeForBusinessActivityUserCounts newSkypeForBusinessActivityUserCounts, final ICallback<SkypeForBusinessActivityUserCounts> callback);

    /**
     * Posts a SkypeForBusinessActivityUserCounts with a new object
     *
     * @param newSkypeForBusinessActivityUserCounts the new object to create
     * @return the created SkypeForBusinessActivityUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessActivityUserCounts post(final SkypeForBusinessActivityUserCounts newSkypeForBusinessActivityUserCounts) throws ClientException;

    /**
     * Posts a SkypeForBusinessActivityUserCounts with a new object
     *
     * @param newSkypeForBusinessActivityUserCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SkypeForBusinessActivityUserCounts newSkypeForBusinessActivityUserCounts, final ICallback<SkypeForBusinessActivityUserCounts> callback);

    /**
     * Posts a SkypeForBusinessActivityUserCounts with a new object
     *
     * @param newSkypeForBusinessActivityUserCounts the object to create/update
     * @return the created SkypeForBusinessActivityUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessActivityUserCounts put(final SkypeForBusinessActivityUserCounts newSkypeForBusinessActivityUserCounts) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISkypeForBusinessActivityUserCountsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISkypeForBusinessActivityUserCountsRequest expand(final String value);

}

