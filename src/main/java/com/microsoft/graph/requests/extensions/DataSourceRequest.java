// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DataSource;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Source Request.
 */
public class DataSourceRequest extends BaseRequest<DataSource> {
	
    /**
     * The request for the DataSource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public DataSourceRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends DataSource> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the DataSource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DataSourceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DataSource.class);
    }

    /**
     * Gets the DataSource from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super DataSource> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DataSource from the service
     *
     * @return the DataSource from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DataSource get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super DataSource> callback) {
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
     * Patches this DataSource with a source
     *
     * @param sourceDataSource the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final DataSource sourceDataSource, @Nonnull final ICallback<? super DataSource> callback) {
        send(HttpMethod.PATCH, callback, sourceDataSource);
    }

    /**
     * Patches this DataSource with a source
     *
     * @param sourceDataSource the source object with updates
     * @return the updated DataSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DataSource patch(@Nonnull final DataSource sourceDataSource) throws ClientException {
        return send(HttpMethod.PATCH, sourceDataSource);
    }

    /**
     * Creates a DataSource with a new object
     *
     * @param newDataSource the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final DataSource newDataSource, @Nonnull final ICallback<? super DataSource> callback) {
        send(HttpMethod.POST, callback, newDataSource);
    }

    /**
     * Creates a DataSource with a new object
     *
     * @param newDataSource the new object to create
     * @return the created DataSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DataSource post(@Nonnull final DataSource newDataSource) throws ClientException {
        return send(HttpMethod.POST, newDataSource);
    }

    /**
     * Creates a DataSource with a new object
     *
     * @param newDataSource the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final DataSource newDataSource, @Nonnull final ICallback<? super DataSource> callback) {
        send(HttpMethod.PUT, callback, newDataSource);
    }

    /**
     * Creates a DataSource with a new object
     *
     * @param newDataSource the object to create/update
     * @return the created DataSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DataSource put(@Nonnull final DataSource newDataSource) throws ClientException {
        return send(HttpMethod.PUT, newDataSource);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DataSourceRequest select(@Nonnull final String value) {
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
     public DataSourceRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

