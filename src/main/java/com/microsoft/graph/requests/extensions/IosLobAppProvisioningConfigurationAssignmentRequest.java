// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosLobAppProvisioningConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Lob App Provisioning Configuration Assignment Request.
 */
public class IosLobAppProvisioningConfigurationAssignmentRequest extends BaseRequest implements IIosLobAppProvisioningConfigurationAssignmentRequest {
	
    /**
     * The request for the IosLobAppProvisioningConfigurationAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosLobAppProvisioningConfigurationAssignmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosLobAppProvisioningConfigurationAssignment.class);
    }

    /**
     * Gets the IosLobAppProvisioningConfigurationAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<IosLobAppProvisioningConfigurationAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosLobAppProvisioningConfigurationAssignment from the service
     *
     * @return the IosLobAppProvisioningConfigurationAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosLobAppProvisioningConfigurationAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<IosLobAppProvisioningConfigurationAssignment> callback) {
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
     * Patches this IosLobAppProvisioningConfigurationAssignment with a source
     *
     * @param sourceIosLobAppProvisioningConfigurationAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IosLobAppProvisioningConfigurationAssignment sourceIosLobAppProvisioningConfigurationAssignment, final ICallback<IosLobAppProvisioningConfigurationAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceIosLobAppProvisioningConfigurationAssignment);
    }

    /**
     * Patches this IosLobAppProvisioningConfigurationAssignment with a source
     *
     * @param sourceIosLobAppProvisioningConfigurationAssignment the source object with updates
     * @return the updated IosLobAppProvisioningConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosLobAppProvisioningConfigurationAssignment patch(final IosLobAppProvisioningConfigurationAssignment sourceIosLobAppProvisioningConfigurationAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosLobAppProvisioningConfigurationAssignment);
    }

    /**
     * Creates a IosLobAppProvisioningConfigurationAssignment with a new object
     *
     * @param newIosLobAppProvisioningConfigurationAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IosLobAppProvisioningConfigurationAssignment newIosLobAppProvisioningConfigurationAssignment, final ICallback<IosLobAppProvisioningConfigurationAssignment> callback) {
        send(HttpMethod.POST, callback, newIosLobAppProvisioningConfigurationAssignment);
    }

    /**
     * Creates a IosLobAppProvisioningConfigurationAssignment with a new object
     *
     * @param newIosLobAppProvisioningConfigurationAssignment the new object to create
     * @return the created IosLobAppProvisioningConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosLobAppProvisioningConfigurationAssignment post(final IosLobAppProvisioningConfigurationAssignment newIosLobAppProvisioningConfigurationAssignment) throws ClientException {
        return send(HttpMethod.POST, newIosLobAppProvisioningConfigurationAssignment);
    }

    /**
     * Creates a IosLobAppProvisioningConfigurationAssignment with a new object
     *
     * @param newIosLobAppProvisioningConfigurationAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final IosLobAppProvisioningConfigurationAssignment newIosLobAppProvisioningConfigurationAssignment, final ICallback<IosLobAppProvisioningConfigurationAssignment> callback) {
        send(HttpMethod.PUT, callback, newIosLobAppProvisioningConfigurationAssignment);
    }

    /**
     * Creates a IosLobAppProvisioningConfigurationAssignment with a new object
     *
     * @param newIosLobAppProvisioningConfigurationAssignment the object to create/update
     * @return the created IosLobAppProvisioningConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosLobAppProvisioningConfigurationAssignment put(final IosLobAppProvisioningConfigurationAssignment newIosLobAppProvisioningConfigurationAssignment) throws ClientException {
        return send(HttpMethod.PUT, newIosLobAppProvisioningConfigurationAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIosLobAppProvisioningConfigurationAssignmentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (IosLobAppProvisioningConfigurationAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIosLobAppProvisioningConfigurationAssignmentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (IosLobAppProvisioningConfigurationAssignmentRequest)this;
     }

}

