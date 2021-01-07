// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartAxisTitleFormat;
import com.microsoft.graph.requests.extensions.WorkbookChartFontRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Axis Title Format Request.
 */
public class WorkbookChartAxisTitleFormatRequest extends BaseRequest<WorkbookChartAxisTitleFormat> {
	
    /**
     * The request for the WorkbookChartAxisTitleFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartAxisTitleFormatRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartAxisTitleFormat.class);
    }

    /**
     * Gets the WorkbookChartAxisTitleFormat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super WorkbookChartAxisTitleFormat> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartAxisTitleFormat from the service
     *
     * @return the WorkbookChartAxisTitleFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartAxisTitleFormat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super WorkbookChartAxisTitleFormat> callback) {
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
     * Patches this WorkbookChartAxisTitleFormat with a source
     *
     * @param sourceWorkbookChartAxisTitleFormat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final WorkbookChartAxisTitleFormat sourceWorkbookChartAxisTitleFormat, @Nonnull final ICallback<? super WorkbookChartAxisTitleFormat> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartAxisTitleFormat);
    }

    /**
     * Patches this WorkbookChartAxisTitleFormat with a source
     *
     * @param sourceWorkbookChartAxisTitleFormat the source object with updates
     * @return the updated WorkbookChartAxisTitleFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartAxisTitleFormat patch(@Nonnull final WorkbookChartAxisTitleFormat sourceWorkbookChartAxisTitleFormat) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartAxisTitleFormat);
    }

    /**
     * Creates a WorkbookChartAxisTitleFormat with a new object
     *
     * @param newWorkbookChartAxisTitleFormat the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final WorkbookChartAxisTitleFormat newWorkbookChartAxisTitleFormat, @Nonnull final ICallback<? super WorkbookChartAxisTitleFormat> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartAxisTitleFormat);
    }

    /**
     * Creates a WorkbookChartAxisTitleFormat with a new object
     *
     * @param newWorkbookChartAxisTitleFormat the new object to create
     * @return the created WorkbookChartAxisTitleFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartAxisTitleFormat post(@Nonnull final WorkbookChartAxisTitleFormat newWorkbookChartAxisTitleFormat) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartAxisTitleFormat);
    }

    /**
     * Creates a WorkbookChartAxisTitleFormat with a new object
     *
     * @param newWorkbookChartAxisTitleFormat the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final WorkbookChartAxisTitleFormat newWorkbookChartAxisTitleFormat, @Nonnull final ICallback<? super WorkbookChartAxisTitleFormat> callback) {
        send(HttpMethod.PUT, callback, newWorkbookChartAxisTitleFormat);
    }

    /**
     * Creates a WorkbookChartAxisTitleFormat with a new object
     *
     * @param newWorkbookChartAxisTitleFormat the object to create/update
     * @return the created WorkbookChartAxisTitleFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartAxisTitleFormat put(@Nonnull final WorkbookChartAxisTitleFormat newWorkbookChartAxisTitleFormat) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartAxisTitleFormat);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookChartAxisTitleFormatRequest select(@Nonnull final String value) {
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
     public WorkbookChartAxisTitleFormatRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

