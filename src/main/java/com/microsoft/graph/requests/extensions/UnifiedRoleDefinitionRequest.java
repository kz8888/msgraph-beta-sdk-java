// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleDefinition;
import com.microsoft.graph.requests.extensions.IUnifiedRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRoleDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Definition Request.
 */
public class UnifiedRoleDefinitionRequest extends BaseRequest implements IUnifiedRoleDefinitionRequest {
	
    /**
     * The request for the UnifiedRoleDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleDefinitionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleDefinition.class);
    }

    /**
     * Gets the UnifiedRoleDefinition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<UnifiedRoleDefinition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UnifiedRoleDefinition from the service
     *
     * @return the UnifiedRoleDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<UnifiedRoleDefinition> callback) {
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
     * Patches this UnifiedRoleDefinition with a source
     *
     * @param sourceUnifiedRoleDefinition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UnifiedRoleDefinition sourceUnifiedRoleDefinition, final ICallback<UnifiedRoleDefinition> callback) {
        send(HttpMethod.PATCH, callback, sourceUnifiedRoleDefinition);
    }

    /**
     * Patches this UnifiedRoleDefinition with a source
     *
     * @param sourceUnifiedRoleDefinition the source object with updates
     * @return the updated UnifiedRoleDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleDefinition patch(final UnifiedRoleDefinition sourceUnifiedRoleDefinition) throws ClientException {
        return send(HttpMethod.PATCH, sourceUnifiedRoleDefinition);
    }

    /**
     * Creates a UnifiedRoleDefinition with a new object
     *
     * @param newUnifiedRoleDefinition the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UnifiedRoleDefinition newUnifiedRoleDefinition, final ICallback<UnifiedRoleDefinition> callback) {
        send(HttpMethod.POST, callback, newUnifiedRoleDefinition);
    }

    /**
     * Creates a UnifiedRoleDefinition with a new object
     *
     * @param newUnifiedRoleDefinition the new object to create
     * @return the created UnifiedRoleDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleDefinition post(final UnifiedRoleDefinition newUnifiedRoleDefinition) throws ClientException {
        return send(HttpMethod.POST, newUnifiedRoleDefinition);
    }

    /**
     * Creates a UnifiedRoleDefinition with a new object
     *
     * @param newUnifiedRoleDefinition the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UnifiedRoleDefinition newUnifiedRoleDefinition, final ICallback<UnifiedRoleDefinition> callback) {
        send(HttpMethod.PUT, callback, newUnifiedRoleDefinition);
    }

    /**
     * Creates a UnifiedRoleDefinition with a new object
     *
     * @param newUnifiedRoleDefinition the object to create/update
     * @return the created UnifiedRoleDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleDefinition put(final UnifiedRoleDefinition newUnifiedRoleDefinition) throws ClientException {
        return send(HttpMethod.PUT, newUnifiedRoleDefinition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUnifiedRoleDefinitionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UnifiedRoleDefinitionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUnifiedRoleDefinitionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UnifiedRoleDefinitionRequest)this;
     }

}

