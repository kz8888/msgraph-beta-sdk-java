// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ParticipantJoiningNotification;
import com.microsoft.graph.requests.extensions.ICallRequestBuilder;
import com.microsoft.graph.requests.extensions.CallRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Participant Joining Notification Request.
 */
public class ParticipantJoiningNotificationRequest extends BaseRequest implements IParticipantJoiningNotificationRequest {
	
    /**
     * The request for the ParticipantJoiningNotification
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ParticipantJoiningNotificationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ParticipantJoiningNotification.class);
    }

    /**
     * Gets the ParticipantJoiningNotification from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ParticipantJoiningNotification> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ParticipantJoiningNotification from the service
     *
     * @return the ParticipantJoiningNotification from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ParticipantJoiningNotification get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ParticipantJoiningNotification> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ParticipantJoiningNotification with a source
     *
     * @param sourceParticipantJoiningNotification the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ParticipantJoiningNotification sourceParticipantJoiningNotification, final ICallback<? super ParticipantJoiningNotification> callback) {
        send(HttpMethod.PATCH, callback, sourceParticipantJoiningNotification);
    }

    /**
     * Patches this ParticipantJoiningNotification with a source
     *
     * @param sourceParticipantJoiningNotification the source object with updates
     * @return the updated ParticipantJoiningNotification
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ParticipantJoiningNotification patch(final ParticipantJoiningNotification sourceParticipantJoiningNotification) throws ClientException {
        return send(HttpMethod.PATCH, sourceParticipantJoiningNotification);
    }

    /**
     * Creates a ParticipantJoiningNotification with a new object
     *
     * @param newParticipantJoiningNotification the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ParticipantJoiningNotification newParticipantJoiningNotification, final ICallback<? super ParticipantJoiningNotification> callback) {
        send(HttpMethod.POST, callback, newParticipantJoiningNotification);
    }

    /**
     * Creates a ParticipantJoiningNotification with a new object
     *
     * @param newParticipantJoiningNotification the new object to create
     * @return the created ParticipantJoiningNotification
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ParticipantJoiningNotification post(final ParticipantJoiningNotification newParticipantJoiningNotification) throws ClientException {
        return send(HttpMethod.POST, newParticipantJoiningNotification);
    }

    /**
     * Creates a ParticipantJoiningNotification with a new object
     *
     * @param newParticipantJoiningNotification the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ParticipantJoiningNotification newParticipantJoiningNotification, final ICallback<? super ParticipantJoiningNotification> callback) {
        send(HttpMethod.PUT, callback, newParticipantJoiningNotification);
    }

    /**
     * Creates a ParticipantJoiningNotification with a new object
     *
     * @param newParticipantJoiningNotification the object to create/update
     * @return the created ParticipantJoiningNotification
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ParticipantJoiningNotification put(final ParticipantJoiningNotification newParticipantJoiningNotification) throws ClientException {
        return send(HttpMethod.PUT, newParticipantJoiningNotification);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IParticipantJoiningNotificationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ParticipantJoiningNotificationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IParticipantJoiningNotificationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ParticipantJoiningNotificationRequest)this;
     }

}

