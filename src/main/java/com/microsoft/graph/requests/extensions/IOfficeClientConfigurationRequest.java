// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OfficeClientConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Office Client Configuration Request.
 */
public interface IOfficeClientConfigurationRequest extends IHttpRequest {

    /**
     * Gets the OfficeClientConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super OfficeClientConfiguration> callback);

    /**
     * Gets the OfficeClientConfiguration from the service
     *
     * @return the OfficeClientConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OfficeClientConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super OfficeClientConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OfficeClientConfiguration with a source
     *
     * @param sourceOfficeClientConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OfficeClientConfiguration sourceOfficeClientConfiguration, final ICallback<? super OfficeClientConfiguration> callback);

    /**
     * Patches this OfficeClientConfiguration with a source
     *
     * @param sourceOfficeClientConfiguration the source object with updates
     * @return the updated OfficeClientConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OfficeClientConfiguration patch(final OfficeClientConfiguration sourceOfficeClientConfiguration) throws ClientException;

    /**
     * Posts a OfficeClientConfiguration with a new object
     *
     * @param newOfficeClientConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final OfficeClientConfiguration newOfficeClientConfiguration, final ICallback<? super OfficeClientConfiguration> callback);

    /**
     * Posts a OfficeClientConfiguration with a new object
     *
     * @param newOfficeClientConfiguration the new object to create
     * @return the created OfficeClientConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OfficeClientConfiguration post(final OfficeClientConfiguration newOfficeClientConfiguration) throws ClientException;

    /**
     * Posts a OfficeClientConfiguration with a new object
     *
     * @param newOfficeClientConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final OfficeClientConfiguration newOfficeClientConfiguration, final ICallback<? super OfficeClientConfiguration> callback);

    /**
     * Posts a OfficeClientConfiguration with a new object
     *
     * @param newOfficeClientConfiguration the object to create/update
     * @return the created OfficeClientConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OfficeClientConfiguration put(final OfficeClientConfiguration newOfficeClientConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOfficeClientConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOfficeClientConfigurationRequest expand(final String value);

}

