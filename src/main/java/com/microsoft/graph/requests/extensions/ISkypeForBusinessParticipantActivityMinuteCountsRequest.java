// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SkypeForBusinessParticipantActivityMinuteCounts;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Skype For Business Participant Activity Minute Counts Request.
 */
public interface ISkypeForBusinessParticipantActivityMinuteCountsRequest extends IHttpRequest {

    /**
     * Gets the SkypeForBusinessParticipantActivityMinuteCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<SkypeForBusinessParticipantActivityMinuteCounts> callback);

    /**
     * Gets the SkypeForBusinessParticipantActivityMinuteCounts from the service
     *
     * @return the SkypeForBusinessParticipantActivityMinuteCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessParticipantActivityMinuteCounts get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<SkypeForBusinessParticipantActivityMinuteCounts> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SkypeForBusinessParticipantActivityMinuteCounts with a source
     *
     * @param sourceSkypeForBusinessParticipantActivityMinuteCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SkypeForBusinessParticipantActivityMinuteCounts sourceSkypeForBusinessParticipantActivityMinuteCounts, final ICallback<SkypeForBusinessParticipantActivityMinuteCounts> callback);

    /**
     * Patches this SkypeForBusinessParticipantActivityMinuteCounts with a source
     *
     * @param sourceSkypeForBusinessParticipantActivityMinuteCounts the source object with updates
     * @return the updated SkypeForBusinessParticipantActivityMinuteCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessParticipantActivityMinuteCounts patch(final SkypeForBusinessParticipantActivityMinuteCounts sourceSkypeForBusinessParticipantActivityMinuteCounts) throws ClientException;

    /**
     * Posts a SkypeForBusinessParticipantActivityMinuteCounts with a new object
     *
     * @param newSkypeForBusinessParticipantActivityMinuteCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SkypeForBusinessParticipantActivityMinuteCounts newSkypeForBusinessParticipantActivityMinuteCounts, final ICallback<SkypeForBusinessParticipantActivityMinuteCounts> callback);

    /**
     * Posts a SkypeForBusinessParticipantActivityMinuteCounts with a new object
     *
     * @param newSkypeForBusinessParticipantActivityMinuteCounts the new object to create
     * @return the created SkypeForBusinessParticipantActivityMinuteCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessParticipantActivityMinuteCounts post(final SkypeForBusinessParticipantActivityMinuteCounts newSkypeForBusinessParticipantActivityMinuteCounts) throws ClientException;

    /**
     * Posts a SkypeForBusinessParticipantActivityMinuteCounts with a new object
     *
     * @param newSkypeForBusinessParticipantActivityMinuteCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SkypeForBusinessParticipantActivityMinuteCounts newSkypeForBusinessParticipantActivityMinuteCounts, final ICallback<SkypeForBusinessParticipantActivityMinuteCounts> callback);

    /**
     * Posts a SkypeForBusinessParticipantActivityMinuteCounts with a new object
     *
     * @param newSkypeForBusinessParticipantActivityMinuteCounts the object to create/update
     * @return the created SkypeForBusinessParticipantActivityMinuteCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessParticipantActivityMinuteCounts put(final SkypeForBusinessParticipantActivityMinuteCounts newSkypeForBusinessParticipantActivityMinuteCounts) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISkypeForBusinessParticipantActivityMinuteCountsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISkypeForBusinessParticipantActivityMinuteCountsRequest expand(final String value);

}

