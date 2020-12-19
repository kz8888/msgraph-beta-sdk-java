// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementCachedReportConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Cached Report Configuration Request.
 */
public interface IDeviceManagementCachedReportConfigurationRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementCachedReportConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceManagementCachedReportConfiguration> callback);

    /**
     * Gets the DeviceManagementCachedReportConfiguration from the service
     *
     * @return the DeviceManagementCachedReportConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementCachedReportConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceManagementCachedReportConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementCachedReportConfiguration with a source
     *
     * @param sourceDeviceManagementCachedReportConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementCachedReportConfiguration sourceDeviceManagementCachedReportConfiguration, final ICallback<? super DeviceManagementCachedReportConfiguration> callback);

    /**
     * Patches this DeviceManagementCachedReportConfiguration with a source
     *
     * @param sourceDeviceManagementCachedReportConfiguration the source object with updates
     * @return the updated DeviceManagementCachedReportConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementCachedReportConfiguration patch(final DeviceManagementCachedReportConfiguration sourceDeviceManagementCachedReportConfiguration) throws ClientException;

    /**
     * Posts a DeviceManagementCachedReportConfiguration with a new object
     *
     * @param newDeviceManagementCachedReportConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementCachedReportConfiguration newDeviceManagementCachedReportConfiguration, final ICallback<? super DeviceManagementCachedReportConfiguration> callback);

    /**
     * Posts a DeviceManagementCachedReportConfiguration with a new object
     *
     * @param newDeviceManagementCachedReportConfiguration the new object to create
     * @return the created DeviceManagementCachedReportConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementCachedReportConfiguration post(final DeviceManagementCachedReportConfiguration newDeviceManagementCachedReportConfiguration) throws ClientException;

    /**
     * Posts a DeviceManagementCachedReportConfiguration with a new object
     *
     * @param newDeviceManagementCachedReportConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceManagementCachedReportConfiguration newDeviceManagementCachedReportConfiguration, final ICallback<? super DeviceManagementCachedReportConfiguration> callback);

    /**
     * Posts a DeviceManagementCachedReportConfiguration with a new object
     *
     * @param newDeviceManagementCachedReportConfiguration the object to create/update
     * @return the created DeviceManagementCachedReportConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementCachedReportConfiguration put(final DeviceManagementCachedReportConfiguration newDeviceManagementCachedReportConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementCachedReportConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementCachedReportConfigurationRequest expand(final String value);

}

