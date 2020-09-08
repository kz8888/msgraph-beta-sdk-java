// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.InviteParticipantsOperation;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Invite Participants Operation Request.
 */
public class InviteParticipantsOperationRequest extends BaseRequest implements IInviteParticipantsOperationRequest {
	
    /**
     * The request for the InviteParticipantsOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public InviteParticipantsOperationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, InviteParticipantsOperation.class);
    }

    /**
     * Gets the InviteParticipantsOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<InviteParticipantsOperation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the InviteParticipantsOperation from the service
     *
     * @return the InviteParticipantsOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public InviteParticipantsOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<InviteParticipantsOperation> callback) {
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
     * Patches this InviteParticipantsOperation with a source
     *
     * @param sourceInviteParticipantsOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final InviteParticipantsOperation sourceInviteParticipantsOperation, final ICallback<InviteParticipantsOperation> callback) {
        send(HttpMethod.PATCH, callback, sourceInviteParticipantsOperation);
    }

    /**
     * Patches this InviteParticipantsOperation with a source
     *
     * @param sourceInviteParticipantsOperation the source object with updates
     * @return the updated InviteParticipantsOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public InviteParticipantsOperation patch(final InviteParticipantsOperation sourceInviteParticipantsOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceInviteParticipantsOperation);
    }

    /**
     * Creates a InviteParticipantsOperation with a new object
     *
     * @param newInviteParticipantsOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final InviteParticipantsOperation newInviteParticipantsOperation, final ICallback<InviteParticipantsOperation> callback) {
        send(HttpMethod.POST, callback, newInviteParticipantsOperation);
    }

    /**
     * Creates a InviteParticipantsOperation with a new object
     *
     * @param newInviteParticipantsOperation the new object to create
     * @return the created InviteParticipantsOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public InviteParticipantsOperation post(final InviteParticipantsOperation newInviteParticipantsOperation) throws ClientException {
        return send(HttpMethod.POST, newInviteParticipantsOperation);
    }

    /**
     * Creates a InviteParticipantsOperation with a new object
     *
     * @param newInviteParticipantsOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final InviteParticipantsOperation newInviteParticipantsOperation, final ICallback<InviteParticipantsOperation> callback) {
        send(HttpMethod.PUT, callback, newInviteParticipantsOperation);
    }

    /**
     * Creates a InviteParticipantsOperation with a new object
     *
     * @param newInviteParticipantsOperation the object to create/update
     * @return the created InviteParticipantsOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public InviteParticipantsOperation put(final InviteParticipantsOperation newInviteParticipantsOperation) throws ClientException {
        return send(HttpMethod.PUT, newInviteParticipantsOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IInviteParticipantsOperationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (InviteParticipantsOperationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IInviteParticipantsOperationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (InviteParticipantsOperationRequest)this;
     }

}

