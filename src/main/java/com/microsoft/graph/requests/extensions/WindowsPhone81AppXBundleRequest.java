// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsPhone81AppXBundle;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Phone81App XBundle Request.
 */
public class WindowsPhone81AppXBundleRequest extends BaseRequest implements IWindowsPhone81AppXBundleRequest {
	
    /**
     * The request for the WindowsPhone81AppXBundle
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsPhone81AppXBundleRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsPhone81AppXBundle.class);
    }

    /**
     * Gets the WindowsPhone81AppXBundle from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WindowsPhone81AppXBundle> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsPhone81AppXBundle from the service
     *
     * @return the WindowsPhone81AppXBundle from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81AppXBundle get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WindowsPhone81AppXBundle> callback) {
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
     * Patches this WindowsPhone81AppXBundle with a source
     *
     * @param sourceWindowsPhone81AppXBundle the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsPhone81AppXBundle sourceWindowsPhone81AppXBundle, final ICallback<WindowsPhone81AppXBundle> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsPhone81AppXBundle);
    }

    /**
     * Patches this WindowsPhone81AppXBundle with a source
     *
     * @param sourceWindowsPhone81AppXBundle the source object with updates
     * @return the updated WindowsPhone81AppXBundle
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81AppXBundle patch(final WindowsPhone81AppXBundle sourceWindowsPhone81AppXBundle) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsPhone81AppXBundle);
    }

    /**
     * Creates a WindowsPhone81AppXBundle with a new object
     *
     * @param newWindowsPhone81AppXBundle the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsPhone81AppXBundle newWindowsPhone81AppXBundle, final ICallback<WindowsPhone81AppXBundle> callback) {
        send(HttpMethod.POST, callback, newWindowsPhone81AppXBundle);
    }

    /**
     * Creates a WindowsPhone81AppXBundle with a new object
     *
     * @param newWindowsPhone81AppXBundle the new object to create
     * @return the created WindowsPhone81AppXBundle
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81AppXBundle post(final WindowsPhone81AppXBundle newWindowsPhone81AppXBundle) throws ClientException {
        return send(HttpMethod.POST, newWindowsPhone81AppXBundle);
    }

    /**
     * Creates a WindowsPhone81AppXBundle with a new object
     *
     * @param newWindowsPhone81AppXBundle the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsPhone81AppXBundle newWindowsPhone81AppXBundle, final ICallback<WindowsPhone81AppXBundle> callback) {
        send(HttpMethod.PUT, callback, newWindowsPhone81AppXBundle);
    }

    /**
     * Creates a WindowsPhone81AppXBundle with a new object
     *
     * @param newWindowsPhone81AppXBundle the object to create/update
     * @return the created WindowsPhone81AppXBundle
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81AppXBundle put(final WindowsPhone81AppXBundle newWindowsPhone81AppXBundle) throws ClientException {
        return send(HttpMethod.PUT, newWindowsPhone81AppXBundle);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsPhone81AppXBundleRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsPhone81AppXBundleRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsPhone81AppXBundleRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsPhone81AppXBundleRequest)this;
     }

}

