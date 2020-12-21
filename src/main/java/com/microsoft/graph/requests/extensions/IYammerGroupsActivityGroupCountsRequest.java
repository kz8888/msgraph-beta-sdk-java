// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.YammerGroupsActivityGroupCounts;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Yammer Groups Activity Group Counts Request.
 */
public interface IYammerGroupsActivityGroupCountsRequest extends IHttpRequest {

    /**
     * Gets the YammerGroupsActivityGroupCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super YammerGroupsActivityGroupCounts> callback);

    /**
     * Gets the YammerGroupsActivityGroupCounts from the service
     *
     * @return the YammerGroupsActivityGroupCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    YammerGroupsActivityGroupCounts get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super YammerGroupsActivityGroupCounts> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this YammerGroupsActivityGroupCounts with a source
     *
     * @param sourceYammerGroupsActivityGroupCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final YammerGroupsActivityGroupCounts sourceYammerGroupsActivityGroupCounts, final ICallback<? super YammerGroupsActivityGroupCounts> callback);

    /**
     * Patches this YammerGroupsActivityGroupCounts with a source
     *
     * @param sourceYammerGroupsActivityGroupCounts the source object with updates
     * @return the updated YammerGroupsActivityGroupCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    YammerGroupsActivityGroupCounts patch(final YammerGroupsActivityGroupCounts sourceYammerGroupsActivityGroupCounts) throws ClientException;

    /**
     * Posts a YammerGroupsActivityGroupCounts with a new object
     *
     * @param newYammerGroupsActivityGroupCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final YammerGroupsActivityGroupCounts newYammerGroupsActivityGroupCounts, final ICallback<? super YammerGroupsActivityGroupCounts> callback);

    /**
     * Posts a YammerGroupsActivityGroupCounts with a new object
     *
     * @param newYammerGroupsActivityGroupCounts the new object to create
     * @return the created YammerGroupsActivityGroupCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    YammerGroupsActivityGroupCounts post(final YammerGroupsActivityGroupCounts newYammerGroupsActivityGroupCounts) throws ClientException;

    /**
     * Posts a YammerGroupsActivityGroupCounts with a new object
     *
     * @param newYammerGroupsActivityGroupCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final YammerGroupsActivityGroupCounts newYammerGroupsActivityGroupCounts, final ICallback<? super YammerGroupsActivityGroupCounts> callback);

    /**
     * Posts a YammerGroupsActivityGroupCounts with a new object
     *
     * @param newYammerGroupsActivityGroupCounts the object to create/update
     * @return the created YammerGroupsActivityGroupCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    YammerGroupsActivityGroupCounts put(final YammerGroupsActivityGroupCounts newYammerGroupsActivityGroupCounts) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IYammerGroupsActivityGroupCountsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IYammerGroupsActivityGroupCountsRequest expand(final String value);

}

