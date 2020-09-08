// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsPhone81AppX;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Phone81App XRequest.
 */
public class WindowsPhone81AppXRequest extends BaseRequest implements IWindowsPhone81AppXRequest {
	
    /**
     * The request for the WindowsPhone81AppX
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public WindowsPhone81AppXRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends WindowsPhone81AppX> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the WindowsPhone81AppX
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsPhone81AppXRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsPhone81AppX.class);
    }

    /**
     * Gets the WindowsPhone81AppX from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WindowsPhone81AppX> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsPhone81AppX from the service
     *
     * @return the WindowsPhone81AppX from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81AppX get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WindowsPhone81AppX> callback) {
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
     * Patches this WindowsPhone81AppX with a source
     *
     * @param sourceWindowsPhone81AppX the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsPhone81AppX sourceWindowsPhone81AppX, final ICallback<WindowsPhone81AppX> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsPhone81AppX);
    }

    /**
     * Patches this WindowsPhone81AppX with a source
     *
     * @param sourceWindowsPhone81AppX the source object with updates
     * @return the updated WindowsPhone81AppX
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81AppX patch(final WindowsPhone81AppX sourceWindowsPhone81AppX) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsPhone81AppX);
    }

    /**
     * Creates a WindowsPhone81AppX with a new object
     *
     * @param newWindowsPhone81AppX the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsPhone81AppX newWindowsPhone81AppX, final ICallback<WindowsPhone81AppX> callback) {
        send(HttpMethod.POST, callback, newWindowsPhone81AppX);
    }

    /**
     * Creates a WindowsPhone81AppX with a new object
     *
     * @param newWindowsPhone81AppX the new object to create
     * @return the created WindowsPhone81AppX
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81AppX post(final WindowsPhone81AppX newWindowsPhone81AppX) throws ClientException {
        return send(HttpMethod.POST, newWindowsPhone81AppX);
    }

    /**
     * Creates a WindowsPhone81AppX with a new object
     *
     * @param newWindowsPhone81AppX the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsPhone81AppX newWindowsPhone81AppX, final ICallback<WindowsPhone81AppX> callback) {
        send(HttpMethod.PUT, callback, newWindowsPhone81AppX);
    }

    /**
     * Creates a WindowsPhone81AppX with a new object
     *
     * @param newWindowsPhone81AppX the object to create/update
     * @return the created WindowsPhone81AppX
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81AppX put(final WindowsPhone81AppX newWindowsPhone81AppX) throws ClientException {
        return send(HttpMethod.PUT, newWindowsPhone81AppX);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsPhone81AppXRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsPhone81AppXRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsPhone81AppXRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsPhone81AppXRequest)this;
     }

}

