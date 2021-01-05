// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MacOSSoftwareUpdateConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mac OSSoftware Update Configuration Request.
 */
public interface IMacOSSoftwareUpdateConfigurationRequest extends IHttpRequest {

    /**
     * Gets the MacOSSoftwareUpdateConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super MacOSSoftwareUpdateConfiguration> callback);

    /**
     * Gets the MacOSSoftwareUpdateConfiguration from the service
     *
     * @return the MacOSSoftwareUpdateConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSSoftwareUpdateConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super MacOSSoftwareUpdateConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MacOSSoftwareUpdateConfiguration with a source
     *
     * @param sourceMacOSSoftwareUpdateConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MacOSSoftwareUpdateConfiguration sourceMacOSSoftwareUpdateConfiguration, final ICallback<? super MacOSSoftwareUpdateConfiguration> callback);

    /**
     * Patches this MacOSSoftwareUpdateConfiguration with a source
     *
     * @param sourceMacOSSoftwareUpdateConfiguration the source object with updates
     * @return the updated MacOSSoftwareUpdateConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSSoftwareUpdateConfiguration patch(final MacOSSoftwareUpdateConfiguration sourceMacOSSoftwareUpdateConfiguration) throws ClientException;

    /**
     * Posts a MacOSSoftwareUpdateConfiguration with a new object
     *
     * @param newMacOSSoftwareUpdateConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MacOSSoftwareUpdateConfiguration newMacOSSoftwareUpdateConfiguration, final ICallback<? super MacOSSoftwareUpdateConfiguration> callback);

    /**
     * Posts a MacOSSoftwareUpdateConfiguration with a new object
     *
     * @param newMacOSSoftwareUpdateConfiguration the new object to create
     * @return the created MacOSSoftwareUpdateConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSSoftwareUpdateConfiguration post(final MacOSSoftwareUpdateConfiguration newMacOSSoftwareUpdateConfiguration) throws ClientException;

    /**
     * Posts a MacOSSoftwareUpdateConfiguration with a new object
     *
     * @param newMacOSSoftwareUpdateConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MacOSSoftwareUpdateConfiguration newMacOSSoftwareUpdateConfiguration, final ICallback<? super MacOSSoftwareUpdateConfiguration> callback);

    /**
     * Posts a MacOSSoftwareUpdateConfiguration with a new object
     *
     * @param newMacOSSoftwareUpdateConfiguration the object to create/update
     * @return the created MacOSSoftwareUpdateConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSSoftwareUpdateConfiguration put(final MacOSSoftwareUpdateConfiguration newMacOSSoftwareUpdateConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMacOSSoftwareUpdateConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMacOSSoftwareUpdateConfigurationRequest expand(final String value);

}

