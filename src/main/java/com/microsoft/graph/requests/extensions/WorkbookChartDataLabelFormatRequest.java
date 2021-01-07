// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartDataLabelFormat;
import com.microsoft.graph.requests.extensions.WorkbookChartFillRequestBuilder;
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
 * The class for the Workbook Chart Data Label Format Request.
 */
public class WorkbookChartDataLabelFormatRequest extends BaseRequest<WorkbookChartDataLabelFormat> {
	
    /**
     * The request for the WorkbookChartDataLabelFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartDataLabelFormatRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartDataLabelFormat.class);
    }

    /**
     * Gets the WorkbookChartDataLabelFormat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super WorkbookChartDataLabelFormat> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartDataLabelFormat from the service
     *
     * @return the WorkbookChartDataLabelFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartDataLabelFormat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super WorkbookChartDataLabelFormat> callback) {
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
     * Patches this WorkbookChartDataLabelFormat with a source
     *
     * @param sourceWorkbookChartDataLabelFormat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final WorkbookChartDataLabelFormat sourceWorkbookChartDataLabelFormat, @Nonnull final ICallback<? super WorkbookChartDataLabelFormat> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartDataLabelFormat);
    }

    /**
     * Patches this WorkbookChartDataLabelFormat with a source
     *
     * @param sourceWorkbookChartDataLabelFormat the source object with updates
     * @return the updated WorkbookChartDataLabelFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartDataLabelFormat patch(@Nonnull final WorkbookChartDataLabelFormat sourceWorkbookChartDataLabelFormat) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartDataLabelFormat);
    }

    /**
     * Creates a WorkbookChartDataLabelFormat with a new object
     *
     * @param newWorkbookChartDataLabelFormat the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final WorkbookChartDataLabelFormat newWorkbookChartDataLabelFormat, @Nonnull final ICallback<? super WorkbookChartDataLabelFormat> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartDataLabelFormat);
    }

    /**
     * Creates a WorkbookChartDataLabelFormat with a new object
     *
     * @param newWorkbookChartDataLabelFormat the new object to create
     * @return the created WorkbookChartDataLabelFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartDataLabelFormat post(@Nonnull final WorkbookChartDataLabelFormat newWorkbookChartDataLabelFormat) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartDataLabelFormat);
    }

    /**
     * Creates a WorkbookChartDataLabelFormat with a new object
     *
     * @param newWorkbookChartDataLabelFormat the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final WorkbookChartDataLabelFormat newWorkbookChartDataLabelFormat, @Nonnull final ICallback<? super WorkbookChartDataLabelFormat> callback) {
        send(HttpMethod.PUT, callback, newWorkbookChartDataLabelFormat);
    }

    /**
     * Creates a WorkbookChartDataLabelFormat with a new object
     *
     * @param newWorkbookChartDataLabelFormat the object to create/update
     * @return the created WorkbookChartDataLabelFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartDataLabelFormat put(@Nonnull final WorkbookChartDataLabelFormat newWorkbookChartDataLabelFormat) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartDataLabelFormat);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookChartDataLabelFormatRequest select(@Nonnull final String value) {
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
     public WorkbookChartDataLabelFormatRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

