// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidForWorkWiFiConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android For Work Wi Fi Configuration Request.
 */
public interface IAndroidForWorkWiFiConfigurationRequest extends IHttpRequest {

    /**
     * Gets the AndroidForWorkWiFiConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AndroidForWorkWiFiConfiguration> callback);

    /**
     * Gets the AndroidForWorkWiFiConfiguration from the service
     *
     * @return the AndroidForWorkWiFiConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkWiFiConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AndroidForWorkWiFiConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidForWorkWiFiConfiguration with a source
     *
     * @param sourceAndroidForWorkWiFiConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidForWorkWiFiConfiguration sourceAndroidForWorkWiFiConfiguration, final ICallback<AndroidForWorkWiFiConfiguration> callback);

    /**
     * Patches this AndroidForWorkWiFiConfiguration with a source
     *
     * @param sourceAndroidForWorkWiFiConfiguration the source object with updates
     * @return the updated AndroidForWorkWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkWiFiConfiguration patch(final AndroidForWorkWiFiConfiguration sourceAndroidForWorkWiFiConfiguration) throws ClientException;

    /**
     * Posts a AndroidForWorkWiFiConfiguration with a new object
     *
     * @param newAndroidForWorkWiFiConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidForWorkWiFiConfiguration newAndroidForWorkWiFiConfiguration, final ICallback<AndroidForWorkWiFiConfiguration> callback);

    /**
     * Posts a AndroidForWorkWiFiConfiguration with a new object
     *
     * @param newAndroidForWorkWiFiConfiguration the new object to create
     * @return the created AndroidForWorkWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkWiFiConfiguration post(final AndroidForWorkWiFiConfiguration newAndroidForWorkWiFiConfiguration) throws ClientException;

    /**
     * Posts a AndroidForWorkWiFiConfiguration with a new object
     *
     * @param newAndroidForWorkWiFiConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AndroidForWorkWiFiConfiguration newAndroidForWorkWiFiConfiguration, final ICallback<AndroidForWorkWiFiConfiguration> callback);

    /**
     * Posts a AndroidForWorkWiFiConfiguration with a new object
     *
     * @param newAndroidForWorkWiFiConfiguration the object to create/update
     * @return the created AndroidForWorkWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkWiFiConfiguration put(final AndroidForWorkWiFiConfiguration newAndroidForWorkWiFiConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidForWorkWiFiConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidForWorkWiFiConfigurationRequest expand(final String value);

}

