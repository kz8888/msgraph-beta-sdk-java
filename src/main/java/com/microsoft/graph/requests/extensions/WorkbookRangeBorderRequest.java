// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookRangeBorder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Border Request.
 */
public class WorkbookRangeBorderRequest extends BaseRequest<WorkbookRangeBorder> {
	
    /**
     * The request for the WorkbookRangeBorder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeBorderRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookRangeBorder.class);
    }

    /**
     * Gets the WorkbookRangeBorder from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super WorkbookRangeBorder> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookRangeBorder from the service
     *
     * @return the WorkbookRangeBorder from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookRangeBorder get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super WorkbookRangeBorder> callback) {
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
     * Patches this WorkbookRangeBorder with a source
     *
     * @param sourceWorkbookRangeBorder the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final WorkbookRangeBorder sourceWorkbookRangeBorder, @Nonnull final ICallback<? super WorkbookRangeBorder> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookRangeBorder);
    }

    /**
     * Patches this WorkbookRangeBorder with a source
     *
     * @param sourceWorkbookRangeBorder the source object with updates
     * @return the updated WorkbookRangeBorder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookRangeBorder patch(@Nonnull final WorkbookRangeBorder sourceWorkbookRangeBorder) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookRangeBorder);
    }

    /**
     * Creates a WorkbookRangeBorder with a new object
     *
     * @param newWorkbookRangeBorder the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final WorkbookRangeBorder newWorkbookRangeBorder, @Nonnull final ICallback<? super WorkbookRangeBorder> callback) {
        send(HttpMethod.POST, callback, newWorkbookRangeBorder);
    }

    /**
     * Creates a WorkbookRangeBorder with a new object
     *
     * @param newWorkbookRangeBorder the new object to create
     * @return the created WorkbookRangeBorder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookRangeBorder post(@Nonnull final WorkbookRangeBorder newWorkbookRangeBorder) throws ClientException {
        return send(HttpMethod.POST, newWorkbookRangeBorder);
    }

    /**
     * Creates a WorkbookRangeBorder with a new object
     *
     * @param newWorkbookRangeBorder the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final WorkbookRangeBorder newWorkbookRangeBorder, @Nonnull final ICallback<? super WorkbookRangeBorder> callback) {
        send(HttpMethod.PUT, callback, newWorkbookRangeBorder);
    }

    /**
     * Creates a WorkbookRangeBorder with a new object
     *
     * @param newWorkbookRangeBorder the object to create/update
     * @return the created WorkbookRangeBorder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookRangeBorder put(@Nonnull final WorkbookRangeBorder newWorkbookRangeBorder) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookRangeBorder);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookRangeBorderRequest select(@Nonnull final String value) {
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
     public WorkbookRangeBorderRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

