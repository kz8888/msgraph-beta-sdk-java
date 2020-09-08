// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceLogCollectionResponse;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Log Collection Response Request.
 */
public interface IDeviceLogCollectionResponseRequest extends IHttpRequest {

    /**
     * Gets the DeviceLogCollectionResponse from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceLogCollectionResponse> callback);

    /**
     * Gets the DeviceLogCollectionResponse from the service
     *
     * @return the DeviceLogCollectionResponse from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceLogCollectionResponse get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DeviceLogCollectionResponse> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceLogCollectionResponse with a source
     *
     * @param sourceDeviceLogCollectionResponse the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceLogCollectionResponse sourceDeviceLogCollectionResponse, final ICallback<DeviceLogCollectionResponse> callback);

    /**
     * Patches this DeviceLogCollectionResponse with a source
     *
     * @param sourceDeviceLogCollectionResponse the source object with updates
     * @return the updated DeviceLogCollectionResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceLogCollectionResponse patch(final DeviceLogCollectionResponse sourceDeviceLogCollectionResponse) throws ClientException;

    /**
     * Posts a DeviceLogCollectionResponse with a new object
     *
     * @param newDeviceLogCollectionResponse the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceLogCollectionResponse newDeviceLogCollectionResponse, final ICallback<DeviceLogCollectionResponse> callback);

    /**
     * Posts a DeviceLogCollectionResponse with a new object
     *
     * @param newDeviceLogCollectionResponse the new object to create
     * @return the created DeviceLogCollectionResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceLogCollectionResponse post(final DeviceLogCollectionResponse newDeviceLogCollectionResponse) throws ClientException;

    /**
     * Posts a DeviceLogCollectionResponse with a new object
     *
     * @param newDeviceLogCollectionResponse the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceLogCollectionResponse newDeviceLogCollectionResponse, final ICallback<DeviceLogCollectionResponse> callback);

    /**
     * Posts a DeviceLogCollectionResponse with a new object
     *
     * @param newDeviceLogCollectionResponse the object to create/update
     * @return the created DeviceLogCollectionResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceLogCollectionResponse put(final DeviceLogCollectionResponse newDeviceLogCollectionResponse) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceLogCollectionResponseRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceLogCollectionResponseRequest expand(final String value);

}

