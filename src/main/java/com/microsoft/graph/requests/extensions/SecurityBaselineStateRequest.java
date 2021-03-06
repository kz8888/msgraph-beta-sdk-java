// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SecurityBaselineState;
import com.microsoft.graph.requests.extensions.ISecurityBaselineSettingStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityBaselineSettingStateRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityBaselineSettingStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityBaselineSettingStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Baseline State Request.
 */
public class SecurityBaselineStateRequest extends BaseRequest implements ISecurityBaselineStateRequest {
	
    /**
     * The request for the SecurityBaselineState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SecurityBaselineStateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SecurityBaselineState.class);
    }

    /**
     * Gets the SecurityBaselineState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super SecurityBaselineState> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SecurityBaselineState from the service
     *
     * @return the SecurityBaselineState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecurityBaselineState get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super SecurityBaselineState> callback) {
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
     * Patches this SecurityBaselineState with a source
     *
     * @param sourceSecurityBaselineState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SecurityBaselineState sourceSecurityBaselineState, final ICallback<? super SecurityBaselineState> callback) {
        send(HttpMethod.PATCH, callback, sourceSecurityBaselineState);
    }

    /**
     * Patches this SecurityBaselineState with a source
     *
     * @param sourceSecurityBaselineState the source object with updates
     * @return the updated SecurityBaselineState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecurityBaselineState patch(final SecurityBaselineState sourceSecurityBaselineState) throws ClientException {
        return send(HttpMethod.PATCH, sourceSecurityBaselineState);
    }

    /**
     * Creates a SecurityBaselineState with a new object
     *
     * @param newSecurityBaselineState the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SecurityBaselineState newSecurityBaselineState, final ICallback<? super SecurityBaselineState> callback) {
        send(HttpMethod.POST, callback, newSecurityBaselineState);
    }

    /**
     * Creates a SecurityBaselineState with a new object
     *
     * @param newSecurityBaselineState the new object to create
     * @return the created SecurityBaselineState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecurityBaselineState post(final SecurityBaselineState newSecurityBaselineState) throws ClientException {
        return send(HttpMethod.POST, newSecurityBaselineState);
    }

    /**
     * Creates a SecurityBaselineState with a new object
     *
     * @param newSecurityBaselineState the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SecurityBaselineState newSecurityBaselineState, final ICallback<? super SecurityBaselineState> callback) {
        send(HttpMethod.PUT, callback, newSecurityBaselineState);
    }

    /**
     * Creates a SecurityBaselineState with a new object
     *
     * @param newSecurityBaselineState the object to create/update
     * @return the created SecurityBaselineState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecurityBaselineState put(final SecurityBaselineState newSecurityBaselineState) throws ClientException {
        return send(HttpMethod.PUT, newSecurityBaselineState);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISecurityBaselineStateRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SecurityBaselineStateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISecurityBaselineStateRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SecurityBaselineStateRequest)this;
     }

}

