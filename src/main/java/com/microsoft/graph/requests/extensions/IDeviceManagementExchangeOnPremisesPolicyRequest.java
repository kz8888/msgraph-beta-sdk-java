// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementExchangeOnPremisesPolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Exchange On Premises Policy Request.
 */
public interface IDeviceManagementExchangeOnPremisesPolicyRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementExchangeOnPremisesPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceManagementExchangeOnPremisesPolicy> callback);

    /**
     * Gets the DeviceManagementExchangeOnPremisesPolicy from the service
     *
     * @return the DeviceManagementExchangeOnPremisesPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementExchangeOnPremisesPolicy get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DeviceManagementExchangeOnPremisesPolicy> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementExchangeOnPremisesPolicy with a source
     *
     * @param sourceDeviceManagementExchangeOnPremisesPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementExchangeOnPremisesPolicy sourceDeviceManagementExchangeOnPremisesPolicy, final ICallback<DeviceManagementExchangeOnPremisesPolicy> callback);

    /**
     * Patches this DeviceManagementExchangeOnPremisesPolicy with a source
     *
     * @param sourceDeviceManagementExchangeOnPremisesPolicy the source object with updates
     * @return the updated DeviceManagementExchangeOnPremisesPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementExchangeOnPremisesPolicy patch(final DeviceManagementExchangeOnPremisesPolicy sourceDeviceManagementExchangeOnPremisesPolicy) throws ClientException;

    /**
     * Posts a DeviceManagementExchangeOnPremisesPolicy with a new object
     *
     * @param newDeviceManagementExchangeOnPremisesPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementExchangeOnPremisesPolicy newDeviceManagementExchangeOnPremisesPolicy, final ICallback<DeviceManagementExchangeOnPremisesPolicy> callback);

    /**
     * Posts a DeviceManagementExchangeOnPremisesPolicy with a new object
     *
     * @param newDeviceManagementExchangeOnPremisesPolicy the new object to create
     * @return the created DeviceManagementExchangeOnPremisesPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementExchangeOnPremisesPolicy post(final DeviceManagementExchangeOnPremisesPolicy newDeviceManagementExchangeOnPremisesPolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementExchangeOnPremisesPolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementExchangeOnPremisesPolicyRequest expand(final String value);

}
