// Template Source: BaseEntityRequest.java.tt
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
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Settings Request.
 */
public class PrivilegedRoleSettingsRequest extends BaseRequest<PrivilegedRoleSettings> {
	
    /**
     * The request for the PrivilegedRoleSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedRoleSettingsRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrivilegedRoleSettings.class);
    }

    /**
     * Gets the PrivilegedRoleSettings from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super PrivilegedRoleSettings> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PrivilegedRoleSettings from the service
     *
     * @return the PrivilegedRoleSettings from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrivilegedRoleSettings get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super PrivilegedRoleSettings> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PrivilegedRoleSettings with a source
     *
     * @param sourcePrivilegedRoleSettings the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final PrivilegedRoleSettings sourcePrivilegedRoleSettings, @Nonnull final ICallback<? super PrivilegedRoleSettings> callback) {
        send(HttpMethod.PATCH, callback, sourcePrivilegedRoleSettings);
    }

    /**
     * Patches this PrivilegedRoleSettings with a source
     *
     * @param sourcePrivilegedRoleSettings the source object with updates
     * @return the updated PrivilegedRoleSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrivilegedRoleSettings patch(@Nonnull final PrivilegedRoleSettings sourcePrivilegedRoleSettings) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrivilegedRoleSettings);
    }

    /**
     * Creates a PrivilegedRoleSettings with a new object
     *
     * @param newPrivilegedRoleSettings the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final PrivilegedRoleSettings newPrivilegedRoleSettings, @Nonnull final ICallback<? super PrivilegedRoleSettings> callback) {
        send(HttpMethod.POST, callback, newPrivilegedRoleSettings);
    }

    /**
     * Creates a PrivilegedRoleSettings with a new object
     *
     * @param newPrivilegedRoleSettings the new object to create
     * @return the created PrivilegedRoleSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrivilegedRoleSettings post(@Nonnull final PrivilegedRoleSettings newPrivilegedRoleSettings) throws ClientException {
        return send(HttpMethod.POST, newPrivilegedRoleSettings);
    }

    /**
     * Creates a PrivilegedRoleSettings with a new object
     *
     * @param newPrivilegedRoleSettings the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final PrivilegedRoleSettings newPrivilegedRoleSettings, @Nonnull final ICallback<? super PrivilegedRoleSettings> callback) {
        send(HttpMethod.PUT, callback, newPrivilegedRoleSettings);
    }

    /**
     * Creates a PrivilegedRoleSettings with a new object
     *
     * @param newPrivilegedRoleSettings the object to create/update
     * @return the created PrivilegedRoleSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrivilegedRoleSettings put(@Nonnull final PrivilegedRoleSettings newPrivilegedRoleSettings) throws ClientException {
        return send(HttpMethod.PUT, newPrivilegedRoleSettings);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PrivilegedRoleSettingsRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public PrivilegedRoleSettingsRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

