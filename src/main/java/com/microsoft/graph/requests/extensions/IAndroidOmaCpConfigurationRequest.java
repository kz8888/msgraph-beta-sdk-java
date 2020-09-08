// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidOmaCpConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Oma Cp Configuration Request.
 */
public interface IAndroidOmaCpConfigurationRequest extends IHttpRequest {

    /**
     * Gets the AndroidOmaCpConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AndroidOmaCpConfiguration> callback);

    /**
     * Gets the AndroidOmaCpConfiguration from the service
     *
     * @return the AndroidOmaCpConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidOmaCpConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AndroidOmaCpConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidOmaCpConfiguration with a source
     *
     * @param sourceAndroidOmaCpConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidOmaCpConfiguration sourceAndroidOmaCpConfiguration, final ICallback<AndroidOmaCpConfiguration> callback);

    /**
     * Patches this AndroidOmaCpConfiguration with a source
     *
     * @param sourceAndroidOmaCpConfiguration the source object with updates
     * @return the updated AndroidOmaCpConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidOmaCpConfiguration patch(final AndroidOmaCpConfiguration sourceAndroidOmaCpConfiguration) throws ClientException;

    /**
     * Posts a AndroidOmaCpConfiguration with a new object
     *
     * @param newAndroidOmaCpConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidOmaCpConfiguration newAndroidOmaCpConfiguration, final ICallback<AndroidOmaCpConfiguration> callback);

    /**
     * Posts a AndroidOmaCpConfiguration with a new object
     *
     * @param newAndroidOmaCpConfiguration the new object to create
     * @return the created AndroidOmaCpConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidOmaCpConfiguration post(final AndroidOmaCpConfiguration newAndroidOmaCpConfiguration) throws ClientException;

    /**
     * Posts a AndroidOmaCpConfiguration with a new object
     *
     * @param newAndroidOmaCpConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AndroidOmaCpConfiguration newAndroidOmaCpConfiguration, final ICallback<AndroidOmaCpConfiguration> callback);

    /**
     * Posts a AndroidOmaCpConfiguration with a new object
     *
     * @param newAndroidOmaCpConfiguration the object to create/update
     * @return the created AndroidOmaCpConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidOmaCpConfiguration put(final AndroidOmaCpConfiguration newAndroidOmaCpConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidOmaCpConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidOmaCpConfigurationRequest expand(final String value);

}

