// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidForWorkGeneralDeviceConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android For Work General Device Configuration Request.
 */
public interface IAndroidForWorkGeneralDeviceConfigurationRequest extends IHttpRequest {

    /**
     * Gets the AndroidForWorkGeneralDeviceConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AndroidForWorkGeneralDeviceConfiguration> callback);

    /**
     * Gets the AndroidForWorkGeneralDeviceConfiguration from the service
     *
     * @return the AndroidForWorkGeneralDeviceConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkGeneralDeviceConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AndroidForWorkGeneralDeviceConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidForWorkGeneralDeviceConfiguration with a source
     *
     * @param sourceAndroidForWorkGeneralDeviceConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidForWorkGeneralDeviceConfiguration sourceAndroidForWorkGeneralDeviceConfiguration, final ICallback<AndroidForWorkGeneralDeviceConfiguration> callback);

    /**
     * Patches this AndroidForWorkGeneralDeviceConfiguration with a source
     *
     * @param sourceAndroidForWorkGeneralDeviceConfiguration the source object with updates
     * @return the updated AndroidForWorkGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkGeneralDeviceConfiguration patch(final AndroidForWorkGeneralDeviceConfiguration sourceAndroidForWorkGeneralDeviceConfiguration) throws ClientException;

    /**
     * Posts a AndroidForWorkGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidForWorkGeneralDeviceConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidForWorkGeneralDeviceConfiguration newAndroidForWorkGeneralDeviceConfiguration, final ICallback<AndroidForWorkGeneralDeviceConfiguration> callback);

    /**
     * Posts a AndroidForWorkGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidForWorkGeneralDeviceConfiguration the new object to create
     * @return the created AndroidForWorkGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkGeneralDeviceConfiguration post(final AndroidForWorkGeneralDeviceConfiguration newAndroidForWorkGeneralDeviceConfiguration) throws ClientException;

    /**
     * Posts a AndroidForWorkGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidForWorkGeneralDeviceConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AndroidForWorkGeneralDeviceConfiguration newAndroidForWorkGeneralDeviceConfiguration, final ICallback<AndroidForWorkGeneralDeviceConfiguration> callback);

    /**
     * Posts a AndroidForWorkGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidForWorkGeneralDeviceConfiguration the object to create/update
     * @return the created AndroidForWorkGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkGeneralDeviceConfiguration put(final AndroidForWorkGeneralDeviceConfiguration newAndroidForWorkGeneralDeviceConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidForWorkGeneralDeviceConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidForWorkGeneralDeviceConfigurationRequest expand(final String value);

}

