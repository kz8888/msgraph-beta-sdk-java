// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SkypeForBusinessOrganizerActivityCounts;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Skype For Business Organizer Activity Counts Request.
 */
public class SkypeForBusinessOrganizerActivityCountsRequest extends BaseRequest implements ISkypeForBusinessOrganizerActivityCountsRequest {
	
    /**
     * The request for the SkypeForBusinessOrganizerActivityCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SkypeForBusinessOrganizerActivityCountsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SkypeForBusinessOrganizerActivityCounts.class);
    }

    /**
     * Gets the SkypeForBusinessOrganizerActivityCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super SkypeForBusinessOrganizerActivityCounts> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SkypeForBusinessOrganizerActivityCounts from the service
     *
     * @return the SkypeForBusinessOrganizerActivityCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessOrganizerActivityCounts get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super SkypeForBusinessOrganizerActivityCounts> callback) {
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
     * Patches this SkypeForBusinessOrganizerActivityCounts with a source
     *
     * @param sourceSkypeForBusinessOrganizerActivityCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SkypeForBusinessOrganizerActivityCounts sourceSkypeForBusinessOrganizerActivityCounts, final ICallback<? super SkypeForBusinessOrganizerActivityCounts> callback) {
        send(HttpMethod.PATCH, callback, sourceSkypeForBusinessOrganizerActivityCounts);
    }

    /**
     * Patches this SkypeForBusinessOrganizerActivityCounts with a source
     *
     * @param sourceSkypeForBusinessOrganizerActivityCounts the source object with updates
     * @return the updated SkypeForBusinessOrganizerActivityCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessOrganizerActivityCounts patch(final SkypeForBusinessOrganizerActivityCounts sourceSkypeForBusinessOrganizerActivityCounts) throws ClientException {
        return send(HttpMethod.PATCH, sourceSkypeForBusinessOrganizerActivityCounts);
    }

    /**
     * Creates a SkypeForBusinessOrganizerActivityCounts with a new object
     *
     * @param newSkypeForBusinessOrganizerActivityCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SkypeForBusinessOrganizerActivityCounts newSkypeForBusinessOrganizerActivityCounts, final ICallback<? super SkypeForBusinessOrganizerActivityCounts> callback) {
        send(HttpMethod.POST, callback, newSkypeForBusinessOrganizerActivityCounts);
    }

    /**
     * Creates a SkypeForBusinessOrganizerActivityCounts with a new object
     *
     * @param newSkypeForBusinessOrganizerActivityCounts the new object to create
     * @return the created SkypeForBusinessOrganizerActivityCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessOrganizerActivityCounts post(final SkypeForBusinessOrganizerActivityCounts newSkypeForBusinessOrganizerActivityCounts) throws ClientException {
        return send(HttpMethod.POST, newSkypeForBusinessOrganizerActivityCounts);
    }

    /**
     * Creates a SkypeForBusinessOrganizerActivityCounts with a new object
     *
     * @param newSkypeForBusinessOrganizerActivityCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SkypeForBusinessOrganizerActivityCounts newSkypeForBusinessOrganizerActivityCounts, final ICallback<? super SkypeForBusinessOrganizerActivityCounts> callback) {
        send(HttpMethod.PUT, callback, newSkypeForBusinessOrganizerActivityCounts);
    }

    /**
     * Creates a SkypeForBusinessOrganizerActivityCounts with a new object
     *
     * @param newSkypeForBusinessOrganizerActivityCounts the object to create/update
     * @return the created SkypeForBusinessOrganizerActivityCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessOrganizerActivityCounts put(final SkypeForBusinessOrganizerActivityCounts newSkypeForBusinessOrganizerActivityCounts) throws ClientException {
        return send(HttpMethod.PUT, newSkypeForBusinessOrganizerActivityCounts);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISkypeForBusinessOrganizerActivityCountsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SkypeForBusinessOrganizerActivityCountsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISkypeForBusinessOrganizerActivityCountsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SkypeForBusinessOrganizerActivityCountsRequest)this;
     }

}

