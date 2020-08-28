// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AppScope;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Scope Request.
 */
public class AppScopeRequest extends BaseRequest implements IAppScopeRequest {
	
    /**
     * The request for the AppScope
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppScopeRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AppScope.class);
    }

    /**
     * Gets the AppScope from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AppScope> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AppScope from the service
     *
     * @return the AppScope from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AppScope get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AppScope> callback) {
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
     * Patches this AppScope with a source
     *
     * @param sourceAppScope the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AppScope sourceAppScope, final ICallback<AppScope> callback) {
        send(HttpMethod.PATCH, callback, sourceAppScope);
    }

    /**
     * Patches this AppScope with a source
     *
     * @param sourceAppScope the source object with updates
     * @return the updated AppScope
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AppScope patch(final AppScope sourceAppScope) throws ClientException {
        return send(HttpMethod.PATCH, sourceAppScope);
    }

    /**
     * Creates a AppScope with a new object
     *
     * @param newAppScope the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AppScope newAppScope, final ICallback<AppScope> callback) {
        send(HttpMethod.POST, callback, newAppScope);
    }

    /**
     * Creates a AppScope with a new object
     *
     * @param newAppScope the new object to create
     * @return the created AppScope
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AppScope post(final AppScope newAppScope) throws ClientException {
        return send(HttpMethod.POST, newAppScope);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAppScopeRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AppScopeRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAppScopeRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AppScopeRequest)this;
     }

}
