// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Organization;
import com.microsoft.graph.requests.extensions.IOrganizationalBrandingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrganizationalBrandingRequestBuilder;
import com.microsoft.graph.requests.extensions.OrganizationalBrandingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OrganizationalBrandingRequestBuilder;
import com.microsoft.graph.requests.extensions.ICertificateBasedAuthConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICertificateBasedAuthConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrganizationSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.OrganizationSettingsRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Organization Request.
 */
public class OrganizationRequest extends BaseRequest implements IOrganizationRequest {
	
    /**
     * The request for the Organization
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OrganizationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Organization.class);
    }

    /**
     * Gets the Organization from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Organization> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Organization from the service
     *
     * @return the Organization from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Organization get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Organization> callback) {
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
     * Patches this Organization with a source
     *
     * @param sourceOrganization the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Organization sourceOrganization, final ICallback<Organization> callback) {
        send(HttpMethod.PATCH, callback, sourceOrganization);
    }

    /**
     * Patches this Organization with a source
     *
     * @param sourceOrganization the source object with updates
     * @return the updated Organization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Organization patch(final Organization sourceOrganization) throws ClientException {
        return send(HttpMethod.PATCH, sourceOrganization);
    }

    /**
     * Creates a Organization with a new object
     *
     * @param newOrganization the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Organization newOrganization, final ICallback<Organization> callback) {
        send(HttpMethod.POST, callback, newOrganization);
    }

    /**
     * Creates a Organization with a new object
     *
     * @param newOrganization the new object to create
     * @return the created Organization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Organization post(final Organization newOrganization) throws ClientException {
        return send(HttpMethod.POST, newOrganization);
    }

    /**
     * Creates a Organization with a new object
     *
     * @param newOrganization the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Organization newOrganization, final ICallback<Organization> callback) {
        send(HttpMethod.PUT, callback, newOrganization);
    }

    /**
     * Creates a Organization with a new object
     *
     * @param newOrganization the object to create/update
     * @return the created Organization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Organization put(final Organization newOrganization) throws ClientException {
        return send(HttpMethod.PUT, newOrganization);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IOrganizationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (OrganizationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IOrganizationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (OrganizationRequest)this;
     }

}

