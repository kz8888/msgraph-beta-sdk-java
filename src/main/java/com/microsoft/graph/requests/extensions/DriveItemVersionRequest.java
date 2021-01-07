// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveItemVersion;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Version Request.
 */
public class DriveItemVersionRequest extends BaseRequest<DriveItemVersion> {
	
    /**
     * The request for the DriveItemVersion
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveItemVersionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DriveItemVersion.class);
    }

    /**
     * Gets the DriveItemVersion from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super DriveItemVersion> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DriveItemVersion from the service
     *
     * @return the DriveItemVersion from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DriveItemVersion get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super DriveItemVersion> callback) {
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
     * Patches this DriveItemVersion with a source
     *
     * @param sourceDriveItemVersion the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final DriveItemVersion sourceDriveItemVersion, @Nonnull final ICallback<? super DriveItemVersion> callback) {
        send(HttpMethod.PATCH, callback, sourceDriveItemVersion);
    }

    /**
     * Patches this DriveItemVersion with a source
     *
     * @param sourceDriveItemVersion the source object with updates
     * @return the updated DriveItemVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DriveItemVersion patch(@Nonnull final DriveItemVersion sourceDriveItemVersion) throws ClientException {
        return send(HttpMethod.PATCH, sourceDriveItemVersion);
    }

    /**
     * Creates a DriveItemVersion with a new object
     *
     * @param newDriveItemVersion the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final DriveItemVersion newDriveItemVersion, @Nonnull final ICallback<? super DriveItemVersion> callback) {
        send(HttpMethod.POST, callback, newDriveItemVersion);
    }

    /**
     * Creates a DriveItemVersion with a new object
     *
     * @param newDriveItemVersion the new object to create
     * @return the created DriveItemVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DriveItemVersion post(@Nonnull final DriveItemVersion newDriveItemVersion) throws ClientException {
        return send(HttpMethod.POST, newDriveItemVersion);
    }

    /**
     * Creates a DriveItemVersion with a new object
     *
     * @param newDriveItemVersion the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final DriveItemVersion newDriveItemVersion, @Nonnull final ICallback<? super DriveItemVersion> callback) {
        send(HttpMethod.PUT, callback, newDriveItemVersion);
    }

    /**
     * Creates a DriveItemVersion with a new object
     *
     * @param newDriveItemVersion the object to create/update
     * @return the created DriveItemVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DriveItemVersion put(@Nonnull final DriveItemVersion newDriveItemVersion) throws ClientException {
        return send(HttpMethod.PUT, newDriveItemVersion);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DriveItemVersionRequest select(@Nonnull final String value) {
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
     public DriveItemVersionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

