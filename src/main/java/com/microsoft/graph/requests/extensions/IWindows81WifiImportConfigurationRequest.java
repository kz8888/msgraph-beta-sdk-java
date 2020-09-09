// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Windows81WifiImportConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows81Wifi Import Configuration Request.
 */
public interface IWindows81WifiImportConfigurationRequest extends IHttpRequest {

    /**
     * Gets the Windows81WifiImportConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Windows81WifiImportConfiguration> callback);

    /**
     * Gets the Windows81WifiImportConfiguration from the service
     *
     * @return the Windows81WifiImportConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows81WifiImportConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Windows81WifiImportConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Windows81WifiImportConfiguration with a source
     *
     * @param sourceWindows81WifiImportConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Windows81WifiImportConfiguration sourceWindows81WifiImportConfiguration, final ICallback<Windows81WifiImportConfiguration> callback);

    /**
     * Patches this Windows81WifiImportConfiguration with a source
     *
     * @param sourceWindows81WifiImportConfiguration the source object with updates
     * @return the updated Windows81WifiImportConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows81WifiImportConfiguration patch(final Windows81WifiImportConfiguration sourceWindows81WifiImportConfiguration) throws ClientException;

    /**
     * Posts a Windows81WifiImportConfiguration with a new object
     *
     * @param newWindows81WifiImportConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Windows81WifiImportConfiguration newWindows81WifiImportConfiguration, final ICallback<Windows81WifiImportConfiguration> callback);

    /**
     * Posts a Windows81WifiImportConfiguration with a new object
     *
     * @param newWindows81WifiImportConfiguration the new object to create
     * @return the created Windows81WifiImportConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows81WifiImportConfiguration post(final Windows81WifiImportConfiguration newWindows81WifiImportConfiguration) throws ClientException;

    /**
     * Posts a Windows81WifiImportConfiguration with a new object
     *
     * @param newWindows81WifiImportConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Windows81WifiImportConfiguration newWindows81WifiImportConfiguration, final ICallback<Windows81WifiImportConfiguration> callback);

    /**
     * Posts a Windows81WifiImportConfiguration with a new object
     *
     * @param newWindows81WifiImportConfiguration the object to create/update
     * @return the created Windows81WifiImportConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows81WifiImportConfiguration put(final Windows81WifiImportConfiguration newWindows81WifiImportConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindows81WifiImportConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindows81WifiImportConfigurationRequest expand(final String value);

}

