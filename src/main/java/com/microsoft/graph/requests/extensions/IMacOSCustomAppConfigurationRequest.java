// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MacOSCustomAppConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mac OSCustom App Configuration Request.
 */
public interface IMacOSCustomAppConfigurationRequest extends IHttpRequest {

    /**
     * Gets the MacOSCustomAppConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super MacOSCustomAppConfiguration> callback);

    /**
     * Gets the MacOSCustomAppConfiguration from the service
     *
     * @return the MacOSCustomAppConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSCustomAppConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super MacOSCustomAppConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MacOSCustomAppConfiguration with a source
     *
     * @param sourceMacOSCustomAppConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MacOSCustomAppConfiguration sourceMacOSCustomAppConfiguration, final ICallback<? super MacOSCustomAppConfiguration> callback);

    /**
     * Patches this MacOSCustomAppConfiguration with a source
     *
     * @param sourceMacOSCustomAppConfiguration the source object with updates
     * @return the updated MacOSCustomAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSCustomAppConfiguration patch(final MacOSCustomAppConfiguration sourceMacOSCustomAppConfiguration) throws ClientException;

    /**
     * Posts a MacOSCustomAppConfiguration with a new object
     *
     * @param newMacOSCustomAppConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MacOSCustomAppConfiguration newMacOSCustomAppConfiguration, final ICallback<? super MacOSCustomAppConfiguration> callback);

    /**
     * Posts a MacOSCustomAppConfiguration with a new object
     *
     * @param newMacOSCustomAppConfiguration the new object to create
     * @return the created MacOSCustomAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSCustomAppConfiguration post(final MacOSCustomAppConfiguration newMacOSCustomAppConfiguration) throws ClientException;

    /**
     * Posts a MacOSCustomAppConfiguration with a new object
     *
     * @param newMacOSCustomAppConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MacOSCustomAppConfiguration newMacOSCustomAppConfiguration, final ICallback<? super MacOSCustomAppConfiguration> callback);

    /**
     * Posts a MacOSCustomAppConfiguration with a new object
     *
     * @param newMacOSCustomAppConfiguration the object to create/update
     * @return the created MacOSCustomAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSCustomAppConfiguration put(final MacOSCustomAppConfiguration newMacOSCustomAppConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMacOSCustomAppConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMacOSCustomAppConfigurationRequest expand(final String value);

}

