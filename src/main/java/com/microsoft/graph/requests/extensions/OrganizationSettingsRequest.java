// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OrganizationSettings;
import com.microsoft.graph.requests.extensions.IProfileCardPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProfileCardPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.ProfileCardPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ProfileCardPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemInsightsSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemInsightsSettingsRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Organization Settings Request.
 */
public class OrganizationSettingsRequest extends BaseRequest implements IOrganizationSettingsRequest {
	
    /**
     * The request for the OrganizationSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OrganizationSettingsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OrganizationSettings.class);
    }

    /**
     * Gets the OrganizationSettings from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super OrganizationSettings> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OrganizationSettings from the service
     *
     * @return the OrganizationSettings from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OrganizationSettings get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super OrganizationSettings> callback) {
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
     * Patches this OrganizationSettings with a source
     *
     * @param sourceOrganizationSettings the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final OrganizationSettings sourceOrganizationSettings, final ICallback<? super OrganizationSettings> callback) {
        send(HttpMethod.PATCH, callback, sourceOrganizationSettings);
    }

    /**
     * Patches this OrganizationSettings with a source
     *
     * @param sourceOrganizationSettings the source object with updates
     * @return the updated OrganizationSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OrganizationSettings patch(final OrganizationSettings sourceOrganizationSettings) throws ClientException {
        return send(HttpMethod.PATCH, sourceOrganizationSettings);
    }

    /**
     * Creates a OrganizationSettings with a new object
     *
     * @param newOrganizationSettings the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final OrganizationSettings newOrganizationSettings, final ICallback<? super OrganizationSettings> callback) {
        send(HttpMethod.POST, callback, newOrganizationSettings);
    }

    /**
     * Creates a OrganizationSettings with a new object
     *
     * @param newOrganizationSettings the new object to create
     * @return the created OrganizationSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OrganizationSettings post(final OrganizationSettings newOrganizationSettings) throws ClientException {
        return send(HttpMethod.POST, newOrganizationSettings);
    }

    /**
     * Creates a OrganizationSettings with a new object
     *
     * @param newOrganizationSettings the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final OrganizationSettings newOrganizationSettings, final ICallback<? super OrganizationSettings> callback) {
        send(HttpMethod.PUT, callback, newOrganizationSettings);
    }

    /**
     * Creates a OrganizationSettings with a new object
     *
     * @param newOrganizationSettings the object to create/update
     * @return the created OrganizationSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OrganizationSettings put(final OrganizationSettings newOrganizationSettings) throws ClientException {
        return send(HttpMethod.PUT, newOrganizationSettings);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IOrganizationSettingsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (OrganizationSettingsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IOrganizationSettingsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (OrganizationSettingsRequest)this;
     }

}

