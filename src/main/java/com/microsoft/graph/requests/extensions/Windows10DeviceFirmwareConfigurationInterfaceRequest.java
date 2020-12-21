// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Windows10DeviceFirmwareConfigurationInterface;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Device Firmware Configuration Interface Request.
 */
public class Windows10DeviceFirmwareConfigurationInterfaceRequest extends BaseRequest implements IWindows10DeviceFirmwareConfigurationInterfaceRequest {
	
    /**
     * The request for the Windows10DeviceFirmwareConfigurationInterface
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10DeviceFirmwareConfigurationInterfaceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows10DeviceFirmwareConfigurationInterface.class);
    }

    /**
     * Gets the Windows10DeviceFirmwareConfigurationInterface from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Windows10DeviceFirmwareConfigurationInterface> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Windows10DeviceFirmwareConfigurationInterface from the service
     *
     * @return the Windows10DeviceFirmwareConfigurationInterface from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10DeviceFirmwareConfigurationInterface get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Windows10DeviceFirmwareConfigurationInterface> callback) {
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
     * Patches this Windows10DeviceFirmwareConfigurationInterface with a source
     *
     * @param sourceWindows10DeviceFirmwareConfigurationInterface the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Windows10DeviceFirmwareConfigurationInterface sourceWindows10DeviceFirmwareConfigurationInterface, final ICallback<? super Windows10DeviceFirmwareConfigurationInterface> callback) {
        send(HttpMethod.PATCH, callback, sourceWindows10DeviceFirmwareConfigurationInterface);
    }

    /**
     * Patches this Windows10DeviceFirmwareConfigurationInterface with a source
     *
     * @param sourceWindows10DeviceFirmwareConfigurationInterface the source object with updates
     * @return the updated Windows10DeviceFirmwareConfigurationInterface
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10DeviceFirmwareConfigurationInterface patch(final Windows10DeviceFirmwareConfigurationInterface sourceWindows10DeviceFirmwareConfigurationInterface) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows10DeviceFirmwareConfigurationInterface);
    }

    /**
     * Creates a Windows10DeviceFirmwareConfigurationInterface with a new object
     *
     * @param newWindows10DeviceFirmwareConfigurationInterface the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Windows10DeviceFirmwareConfigurationInterface newWindows10DeviceFirmwareConfigurationInterface, final ICallback<? super Windows10DeviceFirmwareConfigurationInterface> callback) {
        send(HttpMethod.POST, callback, newWindows10DeviceFirmwareConfigurationInterface);
    }

    /**
     * Creates a Windows10DeviceFirmwareConfigurationInterface with a new object
     *
     * @param newWindows10DeviceFirmwareConfigurationInterface the new object to create
     * @return the created Windows10DeviceFirmwareConfigurationInterface
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10DeviceFirmwareConfigurationInterface post(final Windows10DeviceFirmwareConfigurationInterface newWindows10DeviceFirmwareConfigurationInterface) throws ClientException {
        return send(HttpMethod.POST, newWindows10DeviceFirmwareConfigurationInterface);
    }

    /**
     * Creates a Windows10DeviceFirmwareConfigurationInterface with a new object
     *
     * @param newWindows10DeviceFirmwareConfigurationInterface the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Windows10DeviceFirmwareConfigurationInterface newWindows10DeviceFirmwareConfigurationInterface, final ICallback<? super Windows10DeviceFirmwareConfigurationInterface> callback) {
        send(HttpMethod.PUT, callback, newWindows10DeviceFirmwareConfigurationInterface);
    }

    /**
     * Creates a Windows10DeviceFirmwareConfigurationInterface with a new object
     *
     * @param newWindows10DeviceFirmwareConfigurationInterface the object to create/update
     * @return the created Windows10DeviceFirmwareConfigurationInterface
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10DeviceFirmwareConfigurationInterface put(final Windows10DeviceFirmwareConfigurationInterface newWindows10DeviceFirmwareConfigurationInterface) throws ClientException {
        return send(HttpMethod.PUT, newWindows10DeviceFirmwareConfigurationInterface);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindows10DeviceFirmwareConfigurationInterfaceRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (Windows10DeviceFirmwareConfigurationInterfaceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindows10DeviceFirmwareConfigurationInterfaceRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (Windows10DeviceFirmwareConfigurationInterfaceRequest)this;
     }

}

