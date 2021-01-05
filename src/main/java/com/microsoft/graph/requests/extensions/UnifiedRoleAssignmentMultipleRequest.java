// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleAssignmentMultiple;
import com.microsoft.graph.requests.extensions.IAppScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.AppScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRoleDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Multiple Request.
 */
public class UnifiedRoleAssignmentMultipleRequest extends BaseRequest implements IUnifiedRoleAssignmentMultipleRequest {
	
    /**
     * The request for the UnifiedRoleAssignmentMultiple
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleAssignmentMultipleRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleAssignmentMultiple.class);
    }

    /**
     * Gets the UnifiedRoleAssignmentMultiple from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super UnifiedRoleAssignmentMultiple> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UnifiedRoleAssignmentMultiple from the service
     *
     * @return the UnifiedRoleAssignmentMultiple from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleAssignmentMultiple get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super UnifiedRoleAssignmentMultiple> callback) {
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
     * Patches this UnifiedRoleAssignmentMultiple with a source
     *
     * @param sourceUnifiedRoleAssignmentMultiple the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UnifiedRoleAssignmentMultiple sourceUnifiedRoleAssignmentMultiple, final ICallback<? super UnifiedRoleAssignmentMultiple> callback) {
        send(HttpMethod.PATCH, callback, sourceUnifiedRoleAssignmentMultiple);
    }

    /**
     * Patches this UnifiedRoleAssignmentMultiple with a source
     *
     * @param sourceUnifiedRoleAssignmentMultiple the source object with updates
     * @return the updated UnifiedRoleAssignmentMultiple
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleAssignmentMultiple patch(final UnifiedRoleAssignmentMultiple sourceUnifiedRoleAssignmentMultiple) throws ClientException {
        return send(HttpMethod.PATCH, sourceUnifiedRoleAssignmentMultiple);
    }

    /**
     * Creates a UnifiedRoleAssignmentMultiple with a new object
     *
     * @param newUnifiedRoleAssignmentMultiple the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UnifiedRoleAssignmentMultiple newUnifiedRoleAssignmentMultiple, final ICallback<? super UnifiedRoleAssignmentMultiple> callback) {
        send(HttpMethod.POST, callback, newUnifiedRoleAssignmentMultiple);
    }

    /**
     * Creates a UnifiedRoleAssignmentMultiple with a new object
     *
     * @param newUnifiedRoleAssignmentMultiple the new object to create
     * @return the created UnifiedRoleAssignmentMultiple
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleAssignmentMultiple post(final UnifiedRoleAssignmentMultiple newUnifiedRoleAssignmentMultiple) throws ClientException {
        return send(HttpMethod.POST, newUnifiedRoleAssignmentMultiple);
    }

    /**
     * Creates a UnifiedRoleAssignmentMultiple with a new object
     *
     * @param newUnifiedRoleAssignmentMultiple the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UnifiedRoleAssignmentMultiple newUnifiedRoleAssignmentMultiple, final ICallback<? super UnifiedRoleAssignmentMultiple> callback) {
        send(HttpMethod.PUT, callback, newUnifiedRoleAssignmentMultiple);
    }

    /**
     * Creates a UnifiedRoleAssignmentMultiple with a new object
     *
     * @param newUnifiedRoleAssignmentMultiple the object to create/update
     * @return the created UnifiedRoleAssignmentMultiple
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleAssignmentMultiple put(final UnifiedRoleAssignmentMultiple newUnifiedRoleAssignmentMultiple) throws ClientException {
        return send(HttpMethod.PUT, newUnifiedRoleAssignmentMultiple);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUnifiedRoleAssignmentMultipleRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UnifiedRoleAssignmentMultipleRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUnifiedRoleAssignmentMultipleRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UnifiedRoleAssignmentMultipleRequest)this;
     }

}

