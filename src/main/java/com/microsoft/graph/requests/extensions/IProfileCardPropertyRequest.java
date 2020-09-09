// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ProfileCardProperty;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Profile Card Property Request.
 */
public interface IProfileCardPropertyRequest extends IHttpRequest {

    /**
     * Gets the ProfileCardProperty from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ProfileCardProperty> callback);

    /**
     * Gets the ProfileCardProperty from the service
     *
     * @return the ProfileCardProperty from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ProfileCardProperty get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ProfileCardProperty> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ProfileCardProperty with a source
     *
     * @param sourceProfileCardProperty the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ProfileCardProperty sourceProfileCardProperty, final ICallback<ProfileCardProperty> callback);

    /**
     * Patches this ProfileCardProperty with a source
     *
     * @param sourceProfileCardProperty the source object with updates
     * @return the updated ProfileCardProperty
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ProfileCardProperty patch(final ProfileCardProperty sourceProfileCardProperty) throws ClientException;

    /**
     * Posts a ProfileCardProperty with a new object
     *
     * @param newProfileCardProperty the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ProfileCardProperty newProfileCardProperty, final ICallback<ProfileCardProperty> callback);

    /**
     * Posts a ProfileCardProperty with a new object
     *
     * @param newProfileCardProperty the new object to create
     * @return the created ProfileCardProperty
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ProfileCardProperty post(final ProfileCardProperty newProfileCardProperty) throws ClientException;

    /**
     * Posts a ProfileCardProperty with a new object
     *
     * @param newProfileCardProperty the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ProfileCardProperty newProfileCardProperty, final ICallback<ProfileCardProperty> callback);

    /**
     * Posts a ProfileCardProperty with a new object
     *
     * @param newProfileCardProperty the object to create/update
     * @return the created ProfileCardProperty
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ProfileCardProperty put(final ProfileCardProperty newProfileCardProperty) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IProfileCardPropertyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IProfileCardPropertyRequest expand(final String value);

}

