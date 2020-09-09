// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SharePointActivityPages;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Share Point Activity Pages Request.
 */
public class SharePointActivityPagesRequest extends BaseRequest implements ISharePointActivityPagesRequest {
	
    /**
     * The request for the SharePointActivityPages
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SharePointActivityPagesRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SharePointActivityPages.class);
    }

    /**
     * Gets the SharePointActivityPages from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<SharePointActivityPages> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SharePointActivityPages from the service
     *
     * @return the SharePointActivityPages from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SharePointActivityPages get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<SharePointActivityPages> callback) {
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
     * Patches this SharePointActivityPages with a source
     *
     * @param sourceSharePointActivityPages the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SharePointActivityPages sourceSharePointActivityPages, final ICallback<SharePointActivityPages> callback) {
        send(HttpMethod.PATCH, callback, sourceSharePointActivityPages);
    }

    /**
     * Patches this SharePointActivityPages with a source
     *
     * @param sourceSharePointActivityPages the source object with updates
     * @return the updated SharePointActivityPages
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SharePointActivityPages patch(final SharePointActivityPages sourceSharePointActivityPages) throws ClientException {
        return send(HttpMethod.PATCH, sourceSharePointActivityPages);
    }

    /**
     * Creates a SharePointActivityPages with a new object
     *
     * @param newSharePointActivityPages the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SharePointActivityPages newSharePointActivityPages, final ICallback<SharePointActivityPages> callback) {
        send(HttpMethod.POST, callback, newSharePointActivityPages);
    }

    /**
     * Creates a SharePointActivityPages with a new object
     *
     * @param newSharePointActivityPages the new object to create
     * @return the created SharePointActivityPages
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SharePointActivityPages post(final SharePointActivityPages newSharePointActivityPages) throws ClientException {
        return send(HttpMethod.POST, newSharePointActivityPages);
    }

    /**
     * Creates a SharePointActivityPages with a new object
     *
     * @param newSharePointActivityPages the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SharePointActivityPages newSharePointActivityPages, final ICallback<SharePointActivityPages> callback) {
        send(HttpMethod.PUT, callback, newSharePointActivityPages);
    }

    /**
     * Creates a SharePointActivityPages with a new object
     *
     * @param newSharePointActivityPages the object to create/update
     * @return the created SharePointActivityPages
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SharePointActivityPages put(final SharePointActivityPages newSharePointActivityPages) throws ClientException {
        return send(HttpMethod.PUT, newSharePointActivityPages);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISharePointActivityPagesRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SharePointActivityPagesRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISharePointActivityPagesRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SharePointActivityPagesRequest)this;
     }

}

