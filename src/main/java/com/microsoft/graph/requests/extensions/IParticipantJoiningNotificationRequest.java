// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ParticipantJoiningNotification;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Participant Joining Notification Request.
 */
public interface IParticipantJoiningNotificationRequest extends IHttpRequest {

    /**
     * Gets the ParticipantJoiningNotification from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ParticipantJoiningNotification> callback);

    /**
     * Gets the ParticipantJoiningNotification from the service
     *
     * @return the ParticipantJoiningNotification from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ParticipantJoiningNotification get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ParticipantJoiningNotification> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ParticipantJoiningNotification with a source
     *
     * @param sourceParticipantJoiningNotification the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ParticipantJoiningNotification sourceParticipantJoiningNotification, final ICallback<? super ParticipantJoiningNotification> callback);

    /**
     * Patches this ParticipantJoiningNotification with a source
     *
     * @param sourceParticipantJoiningNotification the source object with updates
     * @return the updated ParticipantJoiningNotification
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ParticipantJoiningNotification patch(final ParticipantJoiningNotification sourceParticipantJoiningNotification) throws ClientException;

    /**
     * Posts a ParticipantJoiningNotification with a new object
     *
     * @param newParticipantJoiningNotification the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ParticipantJoiningNotification newParticipantJoiningNotification, final ICallback<? super ParticipantJoiningNotification> callback);

    /**
     * Posts a ParticipantJoiningNotification with a new object
     *
     * @param newParticipantJoiningNotification the new object to create
     * @return the created ParticipantJoiningNotification
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ParticipantJoiningNotification post(final ParticipantJoiningNotification newParticipantJoiningNotification) throws ClientException;

    /**
     * Posts a ParticipantJoiningNotification with a new object
     *
     * @param newParticipantJoiningNotification the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ParticipantJoiningNotification newParticipantJoiningNotification, final ICallback<? super ParticipantJoiningNotification> callback);

    /**
     * Posts a ParticipantJoiningNotification with a new object
     *
     * @param newParticipantJoiningNotification the object to create/update
     * @return the created ParticipantJoiningNotification
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ParticipantJoiningNotification put(final ParticipantJoiningNotification newParticipantJoiningNotification) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IParticipantJoiningNotificationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IParticipantJoiningNotificationRequest expand(final String value);

}

