// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WebAccount;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Web Account Request.
 */
public class WebAccountRequest extends BaseRequest implements IWebAccountRequest {
	
    /**
     * The request for the WebAccount
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WebAccountRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WebAccount.class);
    }

    /**
     * Gets the WebAccount from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WebAccount> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WebAccount from the service
     *
     * @return the WebAccount from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WebAccount get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WebAccount> callback) {
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
     * Patches this WebAccount with a source
     *
     * @param sourceWebAccount the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WebAccount sourceWebAccount, final ICallback<WebAccount> callback) {
        send(HttpMethod.PATCH, callback, sourceWebAccount);
    }

    /**
     * Patches this WebAccount with a source
     *
     * @param sourceWebAccount the source object with updates
     * @return the updated WebAccount
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WebAccount patch(final WebAccount sourceWebAccount) throws ClientException {
        return send(HttpMethod.PATCH, sourceWebAccount);
    }

    /**
     * Creates a WebAccount with a new object
     *
     * @param newWebAccount the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WebAccount newWebAccount, final ICallback<WebAccount> callback) {
        send(HttpMethod.POST, callback, newWebAccount);
    }

    /**
     * Creates a WebAccount with a new object
     *
     * @param newWebAccount the new object to create
     * @return the created WebAccount
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WebAccount post(final WebAccount newWebAccount) throws ClientException {
        return send(HttpMethod.POST, newWebAccount);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWebAccountRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WebAccountRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWebAccountRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WebAccountRequest)this;
     }

}
