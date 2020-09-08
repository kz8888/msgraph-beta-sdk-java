// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SkypeForBusinessPeerToPeerActivityCounts;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Skype For Business Peer To Peer Activity Counts Request.
 */
public interface ISkypeForBusinessPeerToPeerActivityCountsRequest extends IHttpRequest {

    /**
     * Gets the SkypeForBusinessPeerToPeerActivityCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<SkypeForBusinessPeerToPeerActivityCounts> callback);

    /**
     * Gets the SkypeForBusinessPeerToPeerActivityCounts from the service
     *
     * @return the SkypeForBusinessPeerToPeerActivityCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessPeerToPeerActivityCounts get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<SkypeForBusinessPeerToPeerActivityCounts> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SkypeForBusinessPeerToPeerActivityCounts with a source
     *
     * @param sourceSkypeForBusinessPeerToPeerActivityCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SkypeForBusinessPeerToPeerActivityCounts sourceSkypeForBusinessPeerToPeerActivityCounts, final ICallback<SkypeForBusinessPeerToPeerActivityCounts> callback);

    /**
     * Patches this SkypeForBusinessPeerToPeerActivityCounts with a source
     *
     * @param sourceSkypeForBusinessPeerToPeerActivityCounts the source object with updates
     * @return the updated SkypeForBusinessPeerToPeerActivityCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessPeerToPeerActivityCounts patch(final SkypeForBusinessPeerToPeerActivityCounts sourceSkypeForBusinessPeerToPeerActivityCounts) throws ClientException;

    /**
     * Posts a SkypeForBusinessPeerToPeerActivityCounts with a new object
     *
     * @param newSkypeForBusinessPeerToPeerActivityCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SkypeForBusinessPeerToPeerActivityCounts newSkypeForBusinessPeerToPeerActivityCounts, final ICallback<SkypeForBusinessPeerToPeerActivityCounts> callback);

    /**
     * Posts a SkypeForBusinessPeerToPeerActivityCounts with a new object
     *
     * @param newSkypeForBusinessPeerToPeerActivityCounts the new object to create
     * @return the created SkypeForBusinessPeerToPeerActivityCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessPeerToPeerActivityCounts post(final SkypeForBusinessPeerToPeerActivityCounts newSkypeForBusinessPeerToPeerActivityCounts) throws ClientException;

    /**
     * Posts a SkypeForBusinessPeerToPeerActivityCounts with a new object
     *
     * @param newSkypeForBusinessPeerToPeerActivityCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SkypeForBusinessPeerToPeerActivityCounts newSkypeForBusinessPeerToPeerActivityCounts, final ICallback<SkypeForBusinessPeerToPeerActivityCounts> callback);

    /**
     * Posts a SkypeForBusinessPeerToPeerActivityCounts with a new object
     *
     * @param newSkypeForBusinessPeerToPeerActivityCounts the object to create/update
     * @return the created SkypeForBusinessPeerToPeerActivityCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessPeerToPeerActivityCounts put(final SkypeForBusinessPeerToPeerActivityCounts newSkypeForBusinessPeerToPeerActivityCounts) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISkypeForBusinessPeerToPeerActivityCountsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISkypeForBusinessPeerToPeerActivityCountsRequest expand(final String value);

}

