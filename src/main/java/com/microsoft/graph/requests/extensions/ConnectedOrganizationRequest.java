// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ConnectedOrganization;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Connected Organization Request.
 */
public class ConnectedOrganizationRequest extends BaseRequest implements IConnectedOrganizationRequest {
	
    /**
     * The request for the ConnectedOrganization
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConnectedOrganizationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ConnectedOrganization.class);
    }

    /**
     * Gets the ConnectedOrganization from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ConnectedOrganization> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ConnectedOrganization from the service
     *
     * @return the ConnectedOrganization from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ConnectedOrganization get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ConnectedOrganization> callback) {
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
     * Patches this ConnectedOrganization with a source
     *
     * @param sourceConnectedOrganization the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ConnectedOrganization sourceConnectedOrganization, final ICallback<? super ConnectedOrganization> callback) {
        send(HttpMethod.PATCH, callback, sourceConnectedOrganization);
    }

    /**
     * Patches this ConnectedOrganization with a source
     *
     * @param sourceConnectedOrganization the source object with updates
     * @return the updated ConnectedOrganization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ConnectedOrganization patch(final ConnectedOrganization sourceConnectedOrganization) throws ClientException {
        return send(HttpMethod.PATCH, sourceConnectedOrganization);
    }

    /**
     * Creates a ConnectedOrganization with a new object
     *
     * @param newConnectedOrganization the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ConnectedOrganization newConnectedOrganization, final ICallback<? super ConnectedOrganization> callback) {
        send(HttpMethod.POST, callback, newConnectedOrganization);
    }

    /**
     * Creates a ConnectedOrganization with a new object
     *
     * @param newConnectedOrganization the new object to create
     * @return the created ConnectedOrganization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ConnectedOrganization post(final ConnectedOrganization newConnectedOrganization) throws ClientException {
        return send(HttpMethod.POST, newConnectedOrganization);
    }

    /**
     * Creates a ConnectedOrganization with a new object
     *
     * @param newConnectedOrganization the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ConnectedOrganization newConnectedOrganization, final ICallback<? super ConnectedOrganization> callback) {
        send(HttpMethod.PUT, callback, newConnectedOrganization);
    }

    /**
     * Creates a ConnectedOrganization with a new object
     *
     * @param newConnectedOrganization the object to create/update
     * @return the created ConnectedOrganization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ConnectedOrganization put(final ConnectedOrganization newConnectedOrganization) throws ClientException {
        return send(HttpMethod.PUT, newConnectedOrganization);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IConnectedOrganizationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ConnectedOrganizationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IConnectedOrganizationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ConnectedOrganizationRequest)this;
     }

}

