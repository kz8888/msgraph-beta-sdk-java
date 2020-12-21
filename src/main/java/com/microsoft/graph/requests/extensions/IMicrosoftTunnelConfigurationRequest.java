// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MicrosoftTunnelConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Microsoft Tunnel Configuration Request.
 */
public interface IMicrosoftTunnelConfigurationRequest extends IHttpRequest {

    /**
     * Gets the MicrosoftTunnelConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super MicrosoftTunnelConfiguration> callback);

    /**
     * Gets the MicrosoftTunnelConfiguration from the service
     *
     * @return the MicrosoftTunnelConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MicrosoftTunnelConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super MicrosoftTunnelConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MicrosoftTunnelConfiguration with a source
     *
     * @param sourceMicrosoftTunnelConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MicrosoftTunnelConfiguration sourceMicrosoftTunnelConfiguration, final ICallback<? super MicrosoftTunnelConfiguration> callback);

    /**
     * Patches this MicrosoftTunnelConfiguration with a source
     *
     * @param sourceMicrosoftTunnelConfiguration the source object with updates
     * @return the updated MicrosoftTunnelConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MicrosoftTunnelConfiguration patch(final MicrosoftTunnelConfiguration sourceMicrosoftTunnelConfiguration) throws ClientException;

    /**
     * Posts a MicrosoftTunnelConfiguration with a new object
     *
     * @param newMicrosoftTunnelConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MicrosoftTunnelConfiguration newMicrosoftTunnelConfiguration, final ICallback<? super MicrosoftTunnelConfiguration> callback);

    /**
     * Posts a MicrosoftTunnelConfiguration with a new object
     *
     * @param newMicrosoftTunnelConfiguration the new object to create
     * @return the created MicrosoftTunnelConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MicrosoftTunnelConfiguration post(final MicrosoftTunnelConfiguration newMicrosoftTunnelConfiguration) throws ClientException;

    /**
     * Posts a MicrosoftTunnelConfiguration with a new object
     *
     * @param newMicrosoftTunnelConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MicrosoftTunnelConfiguration newMicrosoftTunnelConfiguration, final ICallback<? super MicrosoftTunnelConfiguration> callback);

    /**
     * Posts a MicrosoftTunnelConfiguration with a new object
     *
     * @param newMicrosoftTunnelConfiguration the object to create/update
     * @return the created MicrosoftTunnelConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MicrosoftTunnelConfiguration put(final MicrosoftTunnelConfiguration newMicrosoftTunnelConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMicrosoftTunnelConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMicrosoftTunnelConfigurationRequest expand(final String value);

}

