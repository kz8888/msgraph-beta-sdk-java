// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedRoleSettings;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.PrivilegedRoleSettings;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Privileged Role Settings Reference Request.
 */
public interface IPrivilegedRoleSettingsReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super PrivilegedRoleSettings> callback);

    PrivilegedRoleSettings delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPrivilegedRoleSettingsReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPrivilegedRoleSettingsReferenceRequest expand(final String value);

    /**
     * Puts the PrivilegedRoleSettings
     *
     * @param srcPrivilegedRoleSettings the PrivilegedRoleSettings to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(PrivilegedRoleSettings srcPrivilegedRoleSettings, final ICallback<? super PrivilegedRoleSettings> callback);

    /**
     * Puts the PrivilegedRoleSettings
     *
     * @param srcPrivilegedRoleSettings the PrivilegedRoleSettings to PUT
     * @return the PrivilegedRoleSettings
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    PrivilegedRoleSettings put(PrivilegedRoleSettings srcPrivilegedRoleSettings) throws ClientException;
}
