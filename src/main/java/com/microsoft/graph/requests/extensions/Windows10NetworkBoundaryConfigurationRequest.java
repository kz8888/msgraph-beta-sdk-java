// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Windows10NetworkBoundaryConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Network Boundary Configuration Request.
 */
public class Windows10NetworkBoundaryConfigurationRequest extends BaseRequest<Windows10NetworkBoundaryConfiguration> {
	
    /**
     * The request for the Windows10NetworkBoundaryConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10NetworkBoundaryConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows10NetworkBoundaryConfiguration.class);
    }

    /**
     * Gets the Windows10NetworkBoundaryConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super Windows10NetworkBoundaryConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Windows10NetworkBoundaryConfiguration from the service
     *
     * @return the Windows10NetworkBoundaryConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10NetworkBoundaryConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super Windows10NetworkBoundaryConfiguration> callback) {
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
     * Patches this Windows10NetworkBoundaryConfiguration with a source
     *
     * @param sourceWindows10NetworkBoundaryConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final Windows10NetworkBoundaryConfiguration sourceWindows10NetworkBoundaryConfiguration, @Nonnull final ICallback<? super Windows10NetworkBoundaryConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceWindows10NetworkBoundaryConfiguration);
    }

    /**
     * Patches this Windows10NetworkBoundaryConfiguration with a source
     *
     * @param sourceWindows10NetworkBoundaryConfiguration the source object with updates
     * @return the updated Windows10NetworkBoundaryConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10NetworkBoundaryConfiguration patch(@Nonnull final Windows10NetworkBoundaryConfiguration sourceWindows10NetworkBoundaryConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows10NetworkBoundaryConfiguration);
    }

    /**
     * Creates a Windows10NetworkBoundaryConfiguration with a new object
     *
     * @param newWindows10NetworkBoundaryConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final Windows10NetworkBoundaryConfiguration newWindows10NetworkBoundaryConfiguration, @Nonnull final ICallback<? super Windows10NetworkBoundaryConfiguration> callback) {
        send(HttpMethod.POST, callback, newWindows10NetworkBoundaryConfiguration);
    }

    /**
     * Creates a Windows10NetworkBoundaryConfiguration with a new object
     *
     * @param newWindows10NetworkBoundaryConfiguration the new object to create
     * @return the created Windows10NetworkBoundaryConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10NetworkBoundaryConfiguration post(@Nonnull final Windows10NetworkBoundaryConfiguration newWindows10NetworkBoundaryConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindows10NetworkBoundaryConfiguration);
    }

    /**
     * Creates a Windows10NetworkBoundaryConfiguration with a new object
     *
     * @param newWindows10NetworkBoundaryConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final Windows10NetworkBoundaryConfiguration newWindows10NetworkBoundaryConfiguration, @Nonnull final ICallback<? super Windows10NetworkBoundaryConfiguration> callback) {
        send(HttpMethod.PUT, callback, newWindows10NetworkBoundaryConfiguration);
    }

    /**
     * Creates a Windows10NetworkBoundaryConfiguration with a new object
     *
     * @param newWindows10NetworkBoundaryConfiguration the object to create/update
     * @return the created Windows10NetworkBoundaryConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10NetworkBoundaryConfiguration put(@Nonnull final Windows10NetworkBoundaryConfiguration newWindows10NetworkBoundaryConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindows10NetworkBoundaryConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public Windows10NetworkBoundaryConfigurationRequest select(@Nonnull final String value) {
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
     public Windows10NetworkBoundaryConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

