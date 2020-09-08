// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SkypeForBusinessPeerToPeerActivityUserCounts;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Skype For Business Peer To Peer Activity User Counts Request.
 */
public interface ISkypeForBusinessPeerToPeerActivityUserCountsRequest extends IHttpRequest {

    /**
     * Gets the SkypeForBusinessPeerToPeerActivityUserCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<SkypeForBusinessPeerToPeerActivityUserCounts> callback);

    /**
     * Gets the SkypeForBusinessPeerToPeerActivityUserCounts from the service
     *
     * @return the SkypeForBusinessPeerToPeerActivityUserCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessPeerToPeerActivityUserCounts get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<SkypeForBusinessPeerToPeerActivityUserCounts> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SkypeForBusinessPeerToPeerActivityUserCounts with a source
     *
     * @param sourceSkypeForBusinessPeerToPeerActivityUserCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SkypeForBusinessPeerToPeerActivityUserCounts sourceSkypeForBusinessPeerToPeerActivityUserCounts, final ICallback<SkypeForBusinessPeerToPeerActivityUserCounts> callback);

    /**
     * Patches this SkypeForBusinessPeerToPeerActivityUserCounts with a source
     *
     * @param sourceSkypeForBusinessPeerToPeerActivityUserCounts the source object with updates
     * @return the updated SkypeForBusinessPeerToPeerActivityUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessPeerToPeerActivityUserCounts patch(final SkypeForBusinessPeerToPeerActivityUserCounts sourceSkypeForBusinessPeerToPeerActivityUserCounts) throws ClientException;

    /**
     * Posts a SkypeForBusinessPeerToPeerActivityUserCounts with a new object
     *
     * @param newSkypeForBusinessPeerToPeerActivityUserCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SkypeForBusinessPeerToPeerActivityUserCounts newSkypeForBusinessPeerToPeerActivityUserCounts, final ICallback<SkypeForBusinessPeerToPeerActivityUserCounts> callback);

    /**
     * Posts a SkypeForBusinessPeerToPeerActivityUserCounts with a new object
     *
     * @param newSkypeForBusinessPeerToPeerActivityUserCounts the new object to create
     * @return the created SkypeForBusinessPeerToPeerActivityUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessPeerToPeerActivityUserCounts post(final SkypeForBusinessPeerToPeerActivityUserCounts newSkypeForBusinessPeerToPeerActivityUserCounts) throws ClientException;

    /**
     * Posts a SkypeForBusinessPeerToPeerActivityUserCounts with a new object
     *
     * @param newSkypeForBusinessPeerToPeerActivityUserCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SkypeForBusinessPeerToPeerActivityUserCounts newSkypeForBusinessPeerToPeerActivityUserCounts, final ICallback<SkypeForBusinessPeerToPeerActivityUserCounts> callback);

    /**
     * Posts a SkypeForBusinessPeerToPeerActivityUserCounts with a new object
     *
     * @param newSkypeForBusinessPeerToPeerActivityUserCounts the object to create/update
     * @return the created SkypeForBusinessPeerToPeerActivityUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessPeerToPeerActivityUserCounts put(final SkypeForBusinessPeerToPeerActivityUserCounts newSkypeForBusinessPeerToPeerActivityUserCounts) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISkypeForBusinessPeerToPeerActivityUserCountsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISkypeForBusinessPeerToPeerActivityUserCountsRequest expand(final String value);

}

