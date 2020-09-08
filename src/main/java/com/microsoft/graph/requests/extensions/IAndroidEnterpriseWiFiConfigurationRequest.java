// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidEnterpriseWiFiConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Enterprise Wi Fi Configuration Request.
 */
public interface IAndroidEnterpriseWiFiConfigurationRequest extends IHttpRequest {

    /**
     * Gets the AndroidEnterpriseWiFiConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AndroidEnterpriseWiFiConfiguration> callback);

    /**
     * Gets the AndroidEnterpriseWiFiConfiguration from the service
     *
     * @return the AndroidEnterpriseWiFiConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidEnterpriseWiFiConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AndroidEnterpriseWiFiConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidEnterpriseWiFiConfiguration with a source
     *
     * @param sourceAndroidEnterpriseWiFiConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidEnterpriseWiFiConfiguration sourceAndroidEnterpriseWiFiConfiguration, final ICallback<AndroidEnterpriseWiFiConfiguration> callback);

    /**
     * Patches this AndroidEnterpriseWiFiConfiguration with a source
     *
     * @param sourceAndroidEnterpriseWiFiConfiguration the source object with updates
     * @return the updated AndroidEnterpriseWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidEnterpriseWiFiConfiguration patch(final AndroidEnterpriseWiFiConfiguration sourceAndroidEnterpriseWiFiConfiguration) throws ClientException;

    /**
     * Posts a AndroidEnterpriseWiFiConfiguration with a new object
     *
     * @param newAndroidEnterpriseWiFiConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidEnterpriseWiFiConfiguration newAndroidEnterpriseWiFiConfiguration, final ICallback<AndroidEnterpriseWiFiConfiguration> callback);

    /**
     * Posts a AndroidEnterpriseWiFiConfiguration with a new object
     *
     * @param newAndroidEnterpriseWiFiConfiguration the new object to create
     * @return the created AndroidEnterpriseWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidEnterpriseWiFiConfiguration post(final AndroidEnterpriseWiFiConfiguration newAndroidEnterpriseWiFiConfiguration) throws ClientException;

    /**
     * Posts a AndroidEnterpriseWiFiConfiguration with a new object
     *
     * @param newAndroidEnterpriseWiFiConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AndroidEnterpriseWiFiConfiguration newAndroidEnterpriseWiFiConfiguration, final ICallback<AndroidEnterpriseWiFiConfiguration> callback);

    /**
     * Posts a AndroidEnterpriseWiFiConfiguration with a new object
     *
     * @param newAndroidEnterpriseWiFiConfiguration the object to create/update
     * @return the created AndroidEnterpriseWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidEnterpriseWiFiConfiguration put(final AndroidEnterpriseWiFiConfiguration newAndroidEnterpriseWiFiConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidEnterpriseWiFiConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidEnterpriseWiFiConfigurationRequest expand(final String value);

}

