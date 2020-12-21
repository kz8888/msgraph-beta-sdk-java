// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Windows10EasEmailProfileConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows10Eas Email Profile Configuration Request.
 */
public interface IWindows10EasEmailProfileConfigurationRequest extends IHttpRequest {

    /**
     * Gets the Windows10EasEmailProfileConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Windows10EasEmailProfileConfiguration> callback);

    /**
     * Gets the Windows10EasEmailProfileConfiguration from the service
     *
     * @return the Windows10EasEmailProfileConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10EasEmailProfileConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Windows10EasEmailProfileConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Windows10EasEmailProfileConfiguration with a source
     *
     * @param sourceWindows10EasEmailProfileConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Windows10EasEmailProfileConfiguration sourceWindows10EasEmailProfileConfiguration, final ICallback<? super Windows10EasEmailProfileConfiguration> callback);

    /**
     * Patches this Windows10EasEmailProfileConfiguration with a source
     *
     * @param sourceWindows10EasEmailProfileConfiguration the source object with updates
     * @return the updated Windows10EasEmailProfileConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10EasEmailProfileConfiguration patch(final Windows10EasEmailProfileConfiguration sourceWindows10EasEmailProfileConfiguration) throws ClientException;

    /**
     * Posts a Windows10EasEmailProfileConfiguration with a new object
     *
     * @param newWindows10EasEmailProfileConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Windows10EasEmailProfileConfiguration newWindows10EasEmailProfileConfiguration, final ICallback<? super Windows10EasEmailProfileConfiguration> callback);

    /**
     * Posts a Windows10EasEmailProfileConfiguration with a new object
     *
     * @param newWindows10EasEmailProfileConfiguration the new object to create
     * @return the created Windows10EasEmailProfileConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10EasEmailProfileConfiguration post(final Windows10EasEmailProfileConfiguration newWindows10EasEmailProfileConfiguration) throws ClientException;

    /**
     * Posts a Windows10EasEmailProfileConfiguration with a new object
     *
     * @param newWindows10EasEmailProfileConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Windows10EasEmailProfileConfiguration newWindows10EasEmailProfileConfiguration, final ICallback<? super Windows10EasEmailProfileConfiguration> callback);

    /**
     * Posts a Windows10EasEmailProfileConfiguration with a new object
     *
     * @param newWindows10EasEmailProfileConfiguration the object to create/update
     * @return the created Windows10EasEmailProfileConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10EasEmailProfileConfiguration put(final Windows10EasEmailProfileConfiguration newWindows10EasEmailProfileConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindows10EasEmailProfileConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindows10EasEmailProfileConfigurationRequest expand(final String value);

}

