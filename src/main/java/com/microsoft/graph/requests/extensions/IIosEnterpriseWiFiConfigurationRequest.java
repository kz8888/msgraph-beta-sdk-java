// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IosEnterpriseWiFiConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Ios Enterprise Wi Fi Configuration Request.
 */
public interface IIosEnterpriseWiFiConfigurationRequest extends IHttpRequest {

    /**
     * Gets the IosEnterpriseWiFiConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<IosEnterpriseWiFiConfiguration> callback);

    /**
     * Gets the IosEnterpriseWiFiConfiguration from the service
     *
     * @return the IosEnterpriseWiFiConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosEnterpriseWiFiConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<IosEnterpriseWiFiConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this IosEnterpriseWiFiConfiguration with a source
     *
     * @param sourceIosEnterpriseWiFiConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final IosEnterpriseWiFiConfiguration sourceIosEnterpriseWiFiConfiguration, final ICallback<IosEnterpriseWiFiConfiguration> callback);

    /**
     * Patches this IosEnterpriseWiFiConfiguration with a source
     *
     * @param sourceIosEnterpriseWiFiConfiguration the source object with updates
     * @return the updated IosEnterpriseWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosEnterpriseWiFiConfiguration patch(final IosEnterpriseWiFiConfiguration sourceIosEnterpriseWiFiConfiguration) throws ClientException;

    /**
     * Posts a IosEnterpriseWiFiConfiguration with a new object
     *
     * @param newIosEnterpriseWiFiConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final IosEnterpriseWiFiConfiguration newIosEnterpriseWiFiConfiguration, final ICallback<IosEnterpriseWiFiConfiguration> callback);

    /**
     * Posts a IosEnterpriseWiFiConfiguration with a new object
     *
     * @param newIosEnterpriseWiFiConfiguration the new object to create
     * @return the created IosEnterpriseWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosEnterpriseWiFiConfiguration post(final IosEnterpriseWiFiConfiguration newIosEnterpriseWiFiConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IIosEnterpriseWiFiConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IIosEnterpriseWiFiConfigurationRequest expand(final String value);

}
