// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SecurityBaselineSettingState;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Baseline Setting State Request.
 */
public class SecurityBaselineSettingStateRequest extends BaseRequest implements ISecurityBaselineSettingStateRequest {
	
    /**
     * The request for the SecurityBaselineSettingState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SecurityBaselineSettingStateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SecurityBaselineSettingState.class);
    }

    /**
     * Gets the SecurityBaselineSettingState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super SecurityBaselineSettingState> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SecurityBaselineSettingState from the service
     *
     * @return the SecurityBaselineSettingState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecurityBaselineSettingState get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super SecurityBaselineSettingState> callback) {
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
     * Patches this SecurityBaselineSettingState with a source
     *
     * @param sourceSecurityBaselineSettingState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SecurityBaselineSettingState sourceSecurityBaselineSettingState, final ICallback<? super SecurityBaselineSettingState> callback) {
        send(HttpMethod.PATCH, callback, sourceSecurityBaselineSettingState);
    }

    /**
     * Patches this SecurityBaselineSettingState with a source
     *
     * @param sourceSecurityBaselineSettingState the source object with updates
     * @return the updated SecurityBaselineSettingState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecurityBaselineSettingState patch(final SecurityBaselineSettingState sourceSecurityBaselineSettingState) throws ClientException {
        return send(HttpMethod.PATCH, sourceSecurityBaselineSettingState);
    }

    /**
     * Creates a SecurityBaselineSettingState with a new object
     *
     * @param newSecurityBaselineSettingState the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SecurityBaselineSettingState newSecurityBaselineSettingState, final ICallback<? super SecurityBaselineSettingState> callback) {
        send(HttpMethod.POST, callback, newSecurityBaselineSettingState);
    }

    /**
     * Creates a SecurityBaselineSettingState with a new object
     *
     * @param newSecurityBaselineSettingState the new object to create
     * @return the created SecurityBaselineSettingState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecurityBaselineSettingState post(final SecurityBaselineSettingState newSecurityBaselineSettingState) throws ClientException {
        return send(HttpMethod.POST, newSecurityBaselineSettingState);
    }

    /**
     * Creates a SecurityBaselineSettingState with a new object
     *
     * @param newSecurityBaselineSettingState the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SecurityBaselineSettingState newSecurityBaselineSettingState, final ICallback<? super SecurityBaselineSettingState> callback) {
        send(HttpMethod.PUT, callback, newSecurityBaselineSettingState);
    }

    /**
     * Creates a SecurityBaselineSettingState with a new object
     *
     * @param newSecurityBaselineSettingState the object to create/update
     * @return the created SecurityBaselineSettingState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecurityBaselineSettingState put(final SecurityBaselineSettingState newSecurityBaselineSettingState) throws ClientException {
        return send(HttpMethod.PUT, newSecurityBaselineSettingState);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISecurityBaselineSettingStateRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SecurityBaselineSettingStateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISecurityBaselineSettingStateRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SecurityBaselineSettingStateRequest)this;
     }

}

