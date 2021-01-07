// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OfficeSuiteApp;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office Suite App Request.
 */
public class OfficeSuiteAppRequest extends BaseRequest<OfficeSuiteApp> {
	
    /**
     * The request for the OfficeSuiteApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OfficeSuiteAppRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OfficeSuiteApp.class);
    }

    /**
     * Gets the OfficeSuiteApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super OfficeSuiteApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OfficeSuiteApp from the service
     *
     * @return the OfficeSuiteApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OfficeSuiteApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super OfficeSuiteApp> callback) {
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
     * Patches this OfficeSuiteApp with a source
     *
     * @param sourceOfficeSuiteApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final OfficeSuiteApp sourceOfficeSuiteApp, @Nonnull final ICallback<? super OfficeSuiteApp> callback) {
        send(HttpMethod.PATCH, callback, sourceOfficeSuiteApp);
    }

    /**
     * Patches this OfficeSuiteApp with a source
     *
     * @param sourceOfficeSuiteApp the source object with updates
     * @return the updated OfficeSuiteApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OfficeSuiteApp patch(@Nonnull final OfficeSuiteApp sourceOfficeSuiteApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceOfficeSuiteApp);
    }

    /**
     * Creates a OfficeSuiteApp with a new object
     *
     * @param newOfficeSuiteApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final OfficeSuiteApp newOfficeSuiteApp, @Nonnull final ICallback<? super OfficeSuiteApp> callback) {
        send(HttpMethod.POST, callback, newOfficeSuiteApp);
    }

    /**
     * Creates a OfficeSuiteApp with a new object
     *
     * @param newOfficeSuiteApp the new object to create
     * @return the created OfficeSuiteApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OfficeSuiteApp post(@Nonnull final OfficeSuiteApp newOfficeSuiteApp) throws ClientException {
        return send(HttpMethod.POST, newOfficeSuiteApp);
    }

    /**
     * Creates a OfficeSuiteApp with a new object
     *
     * @param newOfficeSuiteApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final OfficeSuiteApp newOfficeSuiteApp, @Nonnull final ICallback<? super OfficeSuiteApp> callback) {
        send(HttpMethod.PUT, callback, newOfficeSuiteApp);
    }

    /**
     * Creates a OfficeSuiteApp with a new object
     *
     * @param newOfficeSuiteApp the object to create/update
     * @return the created OfficeSuiteApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OfficeSuiteApp put(@Nonnull final OfficeSuiteApp newOfficeSuiteApp) throws ClientException {
        return send(HttpMethod.PUT, newOfficeSuiteApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OfficeSuiteAppRequest select(@Nonnull final String value) {
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
     public OfficeSuiteAppRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

