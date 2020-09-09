// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsManagementAppHealthSummary;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Management App Health Summary Request.
 */
public class WindowsManagementAppHealthSummaryRequest extends BaseRequest implements IWindowsManagementAppHealthSummaryRequest {
	
    /**
     * The request for the WindowsManagementAppHealthSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsManagementAppHealthSummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsManagementAppHealthSummary.class);
    }

    /**
     * Gets the WindowsManagementAppHealthSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WindowsManagementAppHealthSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsManagementAppHealthSummary from the service
     *
     * @return the WindowsManagementAppHealthSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsManagementAppHealthSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WindowsManagementAppHealthSummary> callback) {
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
     * Patches this WindowsManagementAppHealthSummary with a source
     *
     * @param sourceWindowsManagementAppHealthSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsManagementAppHealthSummary sourceWindowsManagementAppHealthSummary, final ICallback<WindowsManagementAppHealthSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsManagementAppHealthSummary);
    }

    /**
     * Patches this WindowsManagementAppHealthSummary with a source
     *
     * @param sourceWindowsManagementAppHealthSummary the source object with updates
     * @return the updated WindowsManagementAppHealthSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsManagementAppHealthSummary patch(final WindowsManagementAppHealthSummary sourceWindowsManagementAppHealthSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsManagementAppHealthSummary);
    }

    /**
     * Creates a WindowsManagementAppHealthSummary with a new object
     *
     * @param newWindowsManagementAppHealthSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsManagementAppHealthSummary newWindowsManagementAppHealthSummary, final ICallback<WindowsManagementAppHealthSummary> callback) {
        send(HttpMethod.POST, callback, newWindowsManagementAppHealthSummary);
    }

    /**
     * Creates a WindowsManagementAppHealthSummary with a new object
     *
     * @param newWindowsManagementAppHealthSummary the new object to create
     * @return the created WindowsManagementAppHealthSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsManagementAppHealthSummary post(final WindowsManagementAppHealthSummary newWindowsManagementAppHealthSummary) throws ClientException {
        return send(HttpMethod.POST, newWindowsManagementAppHealthSummary);
    }

    /**
     * Creates a WindowsManagementAppHealthSummary with a new object
     *
     * @param newWindowsManagementAppHealthSummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsManagementAppHealthSummary newWindowsManagementAppHealthSummary, final ICallback<WindowsManagementAppHealthSummary> callback) {
        send(HttpMethod.PUT, callback, newWindowsManagementAppHealthSummary);
    }

    /**
     * Creates a WindowsManagementAppHealthSummary with a new object
     *
     * @param newWindowsManagementAppHealthSummary the object to create/update
     * @return the created WindowsManagementAppHealthSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsManagementAppHealthSummary put(final WindowsManagementAppHealthSummary newWindowsManagementAppHealthSummary) throws ClientException {
        return send(HttpMethod.PUT, newWindowsManagementAppHealthSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsManagementAppHealthSummaryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsManagementAppHealthSummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsManagementAppHealthSummaryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsManagementAppHealthSummaryRequest)this;
     }

}

