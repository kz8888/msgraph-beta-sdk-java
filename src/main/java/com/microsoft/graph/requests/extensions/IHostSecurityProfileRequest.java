// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.HostSecurityProfile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Host Security Profile Request.
 */
public interface IHostSecurityProfileRequest extends IHttpRequest {

    /**
     * Gets the HostSecurityProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super HostSecurityProfile> callback);

    /**
     * Gets the HostSecurityProfile from the service
     *
     * @return the HostSecurityProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    HostSecurityProfile get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super HostSecurityProfile> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this HostSecurityProfile with a source
     *
     * @param sourceHostSecurityProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final HostSecurityProfile sourceHostSecurityProfile, final ICallback<? super HostSecurityProfile> callback);

    /**
     * Patches this HostSecurityProfile with a source
     *
     * @param sourceHostSecurityProfile the source object with updates
     * @return the updated HostSecurityProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    HostSecurityProfile patch(final HostSecurityProfile sourceHostSecurityProfile) throws ClientException;

    /**
     * Posts a HostSecurityProfile with a new object
     *
     * @param newHostSecurityProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final HostSecurityProfile newHostSecurityProfile, final ICallback<? super HostSecurityProfile> callback);

    /**
     * Posts a HostSecurityProfile with a new object
     *
     * @param newHostSecurityProfile the new object to create
     * @return the created HostSecurityProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    HostSecurityProfile post(final HostSecurityProfile newHostSecurityProfile) throws ClientException;

    /**
     * Posts a HostSecurityProfile with a new object
     *
     * @param newHostSecurityProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final HostSecurityProfile newHostSecurityProfile, final ICallback<? super HostSecurityProfile> callback);

    /**
     * Posts a HostSecurityProfile with a new object
     *
     * @param newHostSecurityProfile the object to create/update
     * @return the created HostSecurityProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    HostSecurityProfile put(final HostSecurityProfile newHostSecurityProfile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IHostSecurityProfileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IHostSecurityProfileRequest expand(final String value);

}

