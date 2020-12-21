// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsPhoneXAP;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Phone XAPRequest.
 */
public class WindowsPhoneXAPRequest extends BaseRequest implements IWindowsPhoneXAPRequest {
	
    /**
     * The request for the WindowsPhoneXAP
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsPhoneXAPRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsPhoneXAP.class);
    }

    /**
     * Gets the WindowsPhoneXAP from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WindowsPhoneXAP> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsPhoneXAP from the service
     *
     * @return the WindowsPhoneXAP from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhoneXAP get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WindowsPhoneXAP> callback) {
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
     * Patches this WindowsPhoneXAP with a source
     *
     * @param sourceWindowsPhoneXAP the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsPhoneXAP sourceWindowsPhoneXAP, final ICallback<? super WindowsPhoneXAP> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsPhoneXAP);
    }

    /**
     * Patches this WindowsPhoneXAP with a source
     *
     * @param sourceWindowsPhoneXAP the source object with updates
     * @return the updated WindowsPhoneXAP
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhoneXAP patch(final WindowsPhoneXAP sourceWindowsPhoneXAP) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsPhoneXAP);
    }

    /**
     * Creates a WindowsPhoneXAP with a new object
     *
     * @param newWindowsPhoneXAP the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsPhoneXAP newWindowsPhoneXAP, final ICallback<? super WindowsPhoneXAP> callback) {
        send(HttpMethod.POST, callback, newWindowsPhoneXAP);
    }

    /**
     * Creates a WindowsPhoneXAP with a new object
     *
     * @param newWindowsPhoneXAP the new object to create
     * @return the created WindowsPhoneXAP
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhoneXAP post(final WindowsPhoneXAP newWindowsPhoneXAP) throws ClientException {
        return send(HttpMethod.POST, newWindowsPhoneXAP);
    }

    /**
     * Creates a WindowsPhoneXAP with a new object
     *
     * @param newWindowsPhoneXAP the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsPhoneXAP newWindowsPhoneXAP, final ICallback<? super WindowsPhoneXAP> callback) {
        send(HttpMethod.PUT, callback, newWindowsPhoneXAP);
    }

    /**
     * Creates a WindowsPhoneXAP with a new object
     *
     * @param newWindowsPhoneXAP the object to create/update
     * @return the created WindowsPhoneXAP
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhoneXAP put(final WindowsPhoneXAP newWindowsPhoneXAP) throws ClientException {
        return send(HttpMethod.PUT, newWindowsPhoneXAP);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsPhoneXAPRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsPhoneXAPRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsPhoneXAPRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsPhoneXAPRequest)this;
     }

}

