// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsUserActivityUserCounts;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams User Activity User Counts Request.
 */
public class TeamsUserActivityUserCountsRequest extends BaseRequest<TeamsUserActivityUserCounts> {
	
    /**
     * The request for the TeamsUserActivityUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsUserActivityUserCountsRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsUserActivityUserCounts.class);
    }

    /**
     * Gets the TeamsUserActivityUserCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super TeamsUserActivityUserCounts> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TeamsUserActivityUserCounts from the service
     *
     * @return the TeamsUserActivityUserCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsUserActivityUserCounts get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super TeamsUserActivityUserCounts> callback) {
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
     * Patches this TeamsUserActivityUserCounts with a source
     *
     * @param sourceTeamsUserActivityUserCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final TeamsUserActivityUserCounts sourceTeamsUserActivityUserCounts, @Nonnull final ICallback<? super TeamsUserActivityUserCounts> callback) {
        send(HttpMethod.PATCH, callback, sourceTeamsUserActivityUserCounts);
    }

    /**
     * Patches this TeamsUserActivityUserCounts with a source
     *
     * @param sourceTeamsUserActivityUserCounts the source object with updates
     * @return the updated TeamsUserActivityUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsUserActivityUserCounts patch(@Nonnull final TeamsUserActivityUserCounts sourceTeamsUserActivityUserCounts) throws ClientException {
        return send(HttpMethod.PATCH, sourceTeamsUserActivityUserCounts);
    }

    /**
     * Creates a TeamsUserActivityUserCounts with a new object
     *
     * @param newTeamsUserActivityUserCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final TeamsUserActivityUserCounts newTeamsUserActivityUserCounts, @Nonnull final ICallback<? super TeamsUserActivityUserCounts> callback) {
        send(HttpMethod.POST, callback, newTeamsUserActivityUserCounts);
    }

    /**
     * Creates a TeamsUserActivityUserCounts with a new object
     *
     * @param newTeamsUserActivityUserCounts the new object to create
     * @return the created TeamsUserActivityUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsUserActivityUserCounts post(@Nonnull final TeamsUserActivityUserCounts newTeamsUserActivityUserCounts) throws ClientException {
        return send(HttpMethod.POST, newTeamsUserActivityUserCounts);
    }

    /**
     * Creates a TeamsUserActivityUserCounts with a new object
     *
     * @param newTeamsUserActivityUserCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final TeamsUserActivityUserCounts newTeamsUserActivityUserCounts, @Nonnull final ICallback<? super TeamsUserActivityUserCounts> callback) {
        send(HttpMethod.PUT, callback, newTeamsUserActivityUserCounts);
    }

    /**
     * Creates a TeamsUserActivityUserCounts with a new object
     *
     * @param newTeamsUserActivityUserCounts the object to create/update
     * @return the created TeamsUserActivityUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsUserActivityUserCounts put(@Nonnull final TeamsUserActivityUserCounts newTeamsUserActivityUserCounts) throws ClientException {
        return send(HttpMethod.PUT, newTeamsUserActivityUserCounts);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TeamsUserActivityUserCountsRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public TeamsUserActivityUserCountsRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

