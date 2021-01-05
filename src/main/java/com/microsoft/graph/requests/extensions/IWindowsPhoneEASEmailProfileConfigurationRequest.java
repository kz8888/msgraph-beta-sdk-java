// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsPhoneEASEmailProfileConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Phone EASEmail Profile Configuration Request.
 */
public interface IWindowsPhoneEASEmailProfileConfigurationRequest extends IHttpRequest {

    /**
     * Gets the WindowsPhoneEASEmailProfileConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WindowsPhoneEASEmailProfileConfiguration> callback);

    /**
     * Gets the WindowsPhoneEASEmailProfileConfiguration from the service
     *
     * @return the WindowsPhoneEASEmailProfileConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhoneEASEmailProfileConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WindowsPhoneEASEmailProfileConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsPhoneEASEmailProfileConfiguration with a source
     *
     * @param sourceWindowsPhoneEASEmailProfileConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsPhoneEASEmailProfileConfiguration sourceWindowsPhoneEASEmailProfileConfiguration, final ICallback<? super WindowsPhoneEASEmailProfileConfiguration> callback);

    /**
     * Patches this WindowsPhoneEASEmailProfileConfiguration with a source
     *
     * @param sourceWindowsPhoneEASEmailProfileConfiguration the source object with updates
     * @return the updated WindowsPhoneEASEmailProfileConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhoneEASEmailProfileConfiguration patch(final WindowsPhoneEASEmailProfileConfiguration sourceWindowsPhoneEASEmailProfileConfiguration) throws ClientException;

    /**
     * Posts a WindowsPhoneEASEmailProfileConfiguration with a new object
     *
     * @param newWindowsPhoneEASEmailProfileConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsPhoneEASEmailProfileConfiguration newWindowsPhoneEASEmailProfileConfiguration, final ICallback<? super WindowsPhoneEASEmailProfileConfiguration> callback);

    /**
     * Posts a WindowsPhoneEASEmailProfileConfiguration with a new object
     *
     * @param newWindowsPhoneEASEmailProfileConfiguration the new object to create
     * @return the created WindowsPhoneEASEmailProfileConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhoneEASEmailProfileConfiguration post(final WindowsPhoneEASEmailProfileConfiguration newWindowsPhoneEASEmailProfileConfiguration) throws ClientException;

    /**
     * Posts a WindowsPhoneEASEmailProfileConfiguration with a new object
     *
     * @param newWindowsPhoneEASEmailProfileConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WindowsPhoneEASEmailProfileConfiguration newWindowsPhoneEASEmailProfileConfiguration, final ICallback<? super WindowsPhoneEASEmailProfileConfiguration> callback);

    /**
     * Posts a WindowsPhoneEASEmailProfileConfiguration with a new object
     *
     * @param newWindowsPhoneEASEmailProfileConfiguration the object to create/update
     * @return the created WindowsPhoneEASEmailProfileConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhoneEASEmailProfileConfiguration put(final WindowsPhoneEASEmailProfileConfiguration newWindowsPhoneEASEmailProfileConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsPhoneEASEmailProfileConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsPhoneEASEmailProfileConfigurationRequest expand(final String value);

}

