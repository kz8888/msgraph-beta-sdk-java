// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyPolicySetItem;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Compliance Policy Policy Set Item Request.
 */
public interface IDeviceCompliancePolicyPolicySetItemRequest extends IHttpRequest {

    /**
     * Gets the DeviceCompliancePolicyPolicySetItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceCompliancePolicyPolicySetItem> callback);

    /**
     * Gets the DeviceCompliancePolicyPolicySetItem from the service
     *
     * @return the DeviceCompliancePolicyPolicySetItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceCompliancePolicyPolicySetItem get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceCompliancePolicyPolicySetItem> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceCompliancePolicyPolicySetItem with a source
     *
     * @param sourceDeviceCompliancePolicyPolicySetItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceCompliancePolicyPolicySetItem sourceDeviceCompliancePolicyPolicySetItem, final ICallback<? super DeviceCompliancePolicyPolicySetItem> callback);

    /**
     * Patches this DeviceCompliancePolicyPolicySetItem with a source
     *
     * @param sourceDeviceCompliancePolicyPolicySetItem the source object with updates
     * @return the updated DeviceCompliancePolicyPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceCompliancePolicyPolicySetItem patch(final DeviceCompliancePolicyPolicySetItem sourceDeviceCompliancePolicyPolicySetItem) throws ClientException;

    /**
     * Posts a DeviceCompliancePolicyPolicySetItem with a new object
     *
     * @param newDeviceCompliancePolicyPolicySetItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceCompliancePolicyPolicySetItem newDeviceCompliancePolicyPolicySetItem, final ICallback<? super DeviceCompliancePolicyPolicySetItem> callback);

    /**
     * Posts a DeviceCompliancePolicyPolicySetItem with a new object
     *
     * @param newDeviceCompliancePolicyPolicySetItem the new object to create
     * @return the created DeviceCompliancePolicyPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceCompliancePolicyPolicySetItem post(final DeviceCompliancePolicyPolicySetItem newDeviceCompliancePolicyPolicySetItem) throws ClientException;

    /**
     * Posts a DeviceCompliancePolicyPolicySetItem with a new object
     *
     * @param newDeviceCompliancePolicyPolicySetItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceCompliancePolicyPolicySetItem newDeviceCompliancePolicyPolicySetItem, final ICallback<? super DeviceCompliancePolicyPolicySetItem> callback);

    /**
     * Posts a DeviceCompliancePolicyPolicySetItem with a new object
     *
     * @param newDeviceCompliancePolicyPolicySetItem the object to create/update
     * @return the created DeviceCompliancePolicyPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceCompliancePolicyPolicySetItem put(final DeviceCompliancePolicyPolicySetItem newDeviceCompliancePolicyPolicySetItem) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceCompliancePolicyPolicySetItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceCompliancePolicyPolicySetItemRequest expand(final String value);

}

