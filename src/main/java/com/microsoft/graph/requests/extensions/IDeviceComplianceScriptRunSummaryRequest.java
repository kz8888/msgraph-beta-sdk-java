// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceComplianceScriptRunSummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Compliance Script Run Summary Request.
 */
public interface IDeviceComplianceScriptRunSummaryRequest extends IHttpRequest {

    /**
     * Gets the DeviceComplianceScriptRunSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceComplianceScriptRunSummary> callback);

    /**
     * Gets the DeviceComplianceScriptRunSummary from the service
     *
     * @return the DeviceComplianceScriptRunSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceScriptRunSummary get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DeviceComplianceScriptRunSummary> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceComplianceScriptRunSummary with a source
     *
     * @param sourceDeviceComplianceScriptRunSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceComplianceScriptRunSummary sourceDeviceComplianceScriptRunSummary, final ICallback<DeviceComplianceScriptRunSummary> callback);

    /**
     * Patches this DeviceComplianceScriptRunSummary with a source
     *
     * @param sourceDeviceComplianceScriptRunSummary the source object with updates
     * @return the updated DeviceComplianceScriptRunSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceScriptRunSummary patch(final DeviceComplianceScriptRunSummary sourceDeviceComplianceScriptRunSummary) throws ClientException;

    /**
     * Posts a DeviceComplianceScriptRunSummary with a new object
     *
     * @param newDeviceComplianceScriptRunSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceComplianceScriptRunSummary newDeviceComplianceScriptRunSummary, final ICallback<DeviceComplianceScriptRunSummary> callback);

    /**
     * Posts a DeviceComplianceScriptRunSummary with a new object
     *
     * @param newDeviceComplianceScriptRunSummary the new object to create
     * @return the created DeviceComplianceScriptRunSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceScriptRunSummary post(final DeviceComplianceScriptRunSummary newDeviceComplianceScriptRunSummary) throws ClientException;

    /**
     * Posts a DeviceComplianceScriptRunSummary with a new object
     *
     * @param newDeviceComplianceScriptRunSummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceComplianceScriptRunSummary newDeviceComplianceScriptRunSummary, final ICallback<DeviceComplianceScriptRunSummary> callback);

    /**
     * Posts a DeviceComplianceScriptRunSummary with a new object
     *
     * @param newDeviceComplianceScriptRunSummary the object to create/update
     * @return the created DeviceComplianceScriptRunSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceScriptRunSummary put(final DeviceComplianceScriptRunSummary newDeviceComplianceScriptRunSummary) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceComplianceScriptRunSummaryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceComplianceScriptRunSummaryRequest expand(final String value);

}

