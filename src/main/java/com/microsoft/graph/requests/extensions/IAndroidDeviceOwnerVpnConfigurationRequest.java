// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidDeviceOwnerVpnConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Device Owner Vpn Configuration Request.
 */
public interface IAndroidDeviceOwnerVpnConfigurationRequest extends IHttpRequest {

    /**
     * Gets the AndroidDeviceOwnerVpnConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AndroidDeviceOwnerVpnConfiguration> callback);

    /**
     * Gets the AndroidDeviceOwnerVpnConfiguration from the service
     *
     * @return the AndroidDeviceOwnerVpnConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidDeviceOwnerVpnConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AndroidDeviceOwnerVpnConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidDeviceOwnerVpnConfiguration with a source
     *
     * @param sourceAndroidDeviceOwnerVpnConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidDeviceOwnerVpnConfiguration sourceAndroidDeviceOwnerVpnConfiguration, final ICallback<? super AndroidDeviceOwnerVpnConfiguration> callback);

    /**
     * Patches this AndroidDeviceOwnerVpnConfiguration with a source
     *
     * @param sourceAndroidDeviceOwnerVpnConfiguration the source object with updates
     * @return the updated AndroidDeviceOwnerVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidDeviceOwnerVpnConfiguration patch(final AndroidDeviceOwnerVpnConfiguration sourceAndroidDeviceOwnerVpnConfiguration) throws ClientException;

    /**
     * Posts a AndroidDeviceOwnerVpnConfiguration with a new object
     *
     * @param newAndroidDeviceOwnerVpnConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidDeviceOwnerVpnConfiguration newAndroidDeviceOwnerVpnConfiguration, final ICallback<? super AndroidDeviceOwnerVpnConfiguration> callback);

    /**
     * Posts a AndroidDeviceOwnerVpnConfiguration with a new object
     *
     * @param newAndroidDeviceOwnerVpnConfiguration the new object to create
     * @return the created AndroidDeviceOwnerVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidDeviceOwnerVpnConfiguration post(final AndroidDeviceOwnerVpnConfiguration newAndroidDeviceOwnerVpnConfiguration) throws ClientException;

    /**
     * Posts a AndroidDeviceOwnerVpnConfiguration with a new object
     *
     * @param newAndroidDeviceOwnerVpnConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AndroidDeviceOwnerVpnConfiguration newAndroidDeviceOwnerVpnConfiguration, final ICallback<? super AndroidDeviceOwnerVpnConfiguration> callback);

    /**
     * Posts a AndroidDeviceOwnerVpnConfiguration with a new object
     *
     * @param newAndroidDeviceOwnerVpnConfiguration the object to create/update
     * @return the created AndroidDeviceOwnerVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidDeviceOwnerVpnConfiguration put(final AndroidDeviceOwnerVpnConfiguration newAndroidDeviceOwnerVpnConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidDeviceOwnerVpnConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidDeviceOwnerVpnConfigurationRequest expand(final String value);

}

