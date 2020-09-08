// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.YammerGroupsActivityGroupCounts;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Yammer Groups Activity Group Counts Request.
 */
public class YammerGroupsActivityGroupCountsRequest extends BaseRequest implements IYammerGroupsActivityGroupCountsRequest {
	
    /**
     * The request for the YammerGroupsActivityGroupCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public YammerGroupsActivityGroupCountsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, YammerGroupsActivityGroupCounts.class);
    }

    /**
     * Gets the YammerGroupsActivityGroupCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<YammerGroupsActivityGroupCounts> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the YammerGroupsActivityGroupCounts from the service
     *
     * @return the YammerGroupsActivityGroupCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public YammerGroupsActivityGroupCounts get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<YammerGroupsActivityGroupCounts> callback) {
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
     * Patches this YammerGroupsActivityGroupCounts with a source
     *
     * @param sourceYammerGroupsActivityGroupCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final YammerGroupsActivityGroupCounts sourceYammerGroupsActivityGroupCounts, final ICallback<YammerGroupsActivityGroupCounts> callback) {
        send(HttpMethod.PATCH, callback, sourceYammerGroupsActivityGroupCounts);
    }

    /**
     * Patches this YammerGroupsActivityGroupCounts with a source
     *
     * @param sourceYammerGroupsActivityGroupCounts the source object with updates
     * @return the updated YammerGroupsActivityGroupCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public YammerGroupsActivityGroupCounts patch(final YammerGroupsActivityGroupCounts sourceYammerGroupsActivityGroupCounts) throws ClientException {
        return send(HttpMethod.PATCH, sourceYammerGroupsActivityGroupCounts);
    }

    /**
     * Creates a YammerGroupsActivityGroupCounts with a new object
     *
     * @param newYammerGroupsActivityGroupCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final YammerGroupsActivityGroupCounts newYammerGroupsActivityGroupCounts, final ICallback<YammerGroupsActivityGroupCounts> callback) {
        send(HttpMethod.POST, callback, newYammerGroupsActivityGroupCounts);
    }

    /**
     * Creates a YammerGroupsActivityGroupCounts with a new object
     *
     * @param newYammerGroupsActivityGroupCounts the new object to create
     * @return the created YammerGroupsActivityGroupCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public YammerGroupsActivityGroupCounts post(final YammerGroupsActivityGroupCounts newYammerGroupsActivityGroupCounts) throws ClientException {
        return send(HttpMethod.POST, newYammerGroupsActivityGroupCounts);
    }

    /**
     * Creates a YammerGroupsActivityGroupCounts with a new object
     *
     * @param newYammerGroupsActivityGroupCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final YammerGroupsActivityGroupCounts newYammerGroupsActivityGroupCounts, final ICallback<YammerGroupsActivityGroupCounts> callback) {
        send(HttpMethod.PUT, callback, newYammerGroupsActivityGroupCounts);
    }

    /**
     * Creates a YammerGroupsActivityGroupCounts with a new object
     *
     * @param newYammerGroupsActivityGroupCounts the object to create/update
     * @return the created YammerGroupsActivityGroupCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public YammerGroupsActivityGroupCounts put(final YammerGroupsActivityGroupCounts newYammerGroupsActivityGroupCounts) throws ClientException {
        return send(HttpMethod.PUT, newYammerGroupsActivityGroupCounts);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IYammerGroupsActivityGroupCountsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (YammerGroupsActivityGroupCountsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IYammerGroupsActivityGroupCountsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (YammerGroupsActivityGroupCountsRequest)this;
     }

}

