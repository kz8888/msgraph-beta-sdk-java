// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SkypeForBusinessParticipantActivityUserCounts;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Skype For Business Participant Activity User Counts Request.
 */
public class SkypeForBusinessParticipantActivityUserCountsRequest extends BaseRequest implements ISkypeForBusinessParticipantActivityUserCountsRequest {
	
    /**
     * The request for the SkypeForBusinessParticipantActivityUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SkypeForBusinessParticipantActivityUserCountsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SkypeForBusinessParticipantActivityUserCounts.class);
    }

    /**
     * Gets the SkypeForBusinessParticipantActivityUserCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super SkypeForBusinessParticipantActivityUserCounts> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SkypeForBusinessParticipantActivityUserCounts from the service
     *
     * @return the SkypeForBusinessParticipantActivityUserCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessParticipantActivityUserCounts get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super SkypeForBusinessParticipantActivityUserCounts> callback) {
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
     * Patches this SkypeForBusinessParticipantActivityUserCounts with a source
     *
     * @param sourceSkypeForBusinessParticipantActivityUserCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SkypeForBusinessParticipantActivityUserCounts sourceSkypeForBusinessParticipantActivityUserCounts, final ICallback<? super SkypeForBusinessParticipantActivityUserCounts> callback) {
        send(HttpMethod.PATCH, callback, sourceSkypeForBusinessParticipantActivityUserCounts);
    }

    /**
     * Patches this SkypeForBusinessParticipantActivityUserCounts with a source
     *
     * @param sourceSkypeForBusinessParticipantActivityUserCounts the source object with updates
     * @return the updated SkypeForBusinessParticipantActivityUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessParticipantActivityUserCounts patch(final SkypeForBusinessParticipantActivityUserCounts sourceSkypeForBusinessParticipantActivityUserCounts) throws ClientException {
        return send(HttpMethod.PATCH, sourceSkypeForBusinessParticipantActivityUserCounts);
    }

    /**
     * Creates a SkypeForBusinessParticipantActivityUserCounts with a new object
     *
     * @param newSkypeForBusinessParticipantActivityUserCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SkypeForBusinessParticipantActivityUserCounts newSkypeForBusinessParticipantActivityUserCounts, final ICallback<? super SkypeForBusinessParticipantActivityUserCounts> callback) {
        send(HttpMethod.POST, callback, newSkypeForBusinessParticipantActivityUserCounts);
    }

    /**
     * Creates a SkypeForBusinessParticipantActivityUserCounts with a new object
     *
     * @param newSkypeForBusinessParticipantActivityUserCounts the new object to create
     * @return the created SkypeForBusinessParticipantActivityUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessParticipantActivityUserCounts post(final SkypeForBusinessParticipantActivityUserCounts newSkypeForBusinessParticipantActivityUserCounts) throws ClientException {
        return send(HttpMethod.POST, newSkypeForBusinessParticipantActivityUserCounts);
    }

    /**
     * Creates a SkypeForBusinessParticipantActivityUserCounts with a new object
     *
     * @param newSkypeForBusinessParticipantActivityUserCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SkypeForBusinessParticipantActivityUserCounts newSkypeForBusinessParticipantActivityUserCounts, final ICallback<? super SkypeForBusinessParticipantActivityUserCounts> callback) {
        send(HttpMethod.PUT, callback, newSkypeForBusinessParticipantActivityUserCounts);
    }

    /**
     * Creates a SkypeForBusinessParticipantActivityUserCounts with a new object
     *
     * @param newSkypeForBusinessParticipantActivityUserCounts the object to create/update
     * @return the created SkypeForBusinessParticipantActivityUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessParticipantActivityUserCounts put(final SkypeForBusinessParticipantActivityUserCounts newSkypeForBusinessParticipantActivityUserCounts) throws ClientException {
        return send(HttpMethod.PUT, newSkypeForBusinessParticipantActivityUserCounts);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISkypeForBusinessParticipantActivityUserCountsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SkypeForBusinessParticipantActivityUserCountsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISkypeForBusinessParticipantActivityUserCountsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SkypeForBusinessParticipantActivityUserCountsRequest)this;
     }

}

