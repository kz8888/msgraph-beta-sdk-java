// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SecurityBaselineTemplate;
import com.microsoft.graph.requests.extensions.ISecurityBaselineCategoryStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityBaselineCategoryStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityBaselineCategoryStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityBaselineCategoryStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityBaselineDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityBaselineDeviceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityBaselineDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityBaselineDeviceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityBaselineStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityBaselineStateSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Baseline Template Request.
 */
public class SecurityBaselineTemplateRequest extends BaseRequest implements ISecurityBaselineTemplateRequest {
	
    /**
     * The request for the SecurityBaselineTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SecurityBaselineTemplateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SecurityBaselineTemplate.class);
    }

    /**
     * Gets the SecurityBaselineTemplate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super SecurityBaselineTemplate> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SecurityBaselineTemplate from the service
     *
     * @return the SecurityBaselineTemplate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecurityBaselineTemplate get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super SecurityBaselineTemplate> callback) {
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
     * Patches this SecurityBaselineTemplate with a source
     *
     * @param sourceSecurityBaselineTemplate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SecurityBaselineTemplate sourceSecurityBaselineTemplate, final ICallback<? super SecurityBaselineTemplate> callback) {
        send(HttpMethod.PATCH, callback, sourceSecurityBaselineTemplate);
    }

    /**
     * Patches this SecurityBaselineTemplate with a source
     *
     * @param sourceSecurityBaselineTemplate the source object with updates
     * @return the updated SecurityBaselineTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecurityBaselineTemplate patch(final SecurityBaselineTemplate sourceSecurityBaselineTemplate) throws ClientException {
        return send(HttpMethod.PATCH, sourceSecurityBaselineTemplate);
    }

    /**
     * Creates a SecurityBaselineTemplate with a new object
     *
     * @param newSecurityBaselineTemplate the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SecurityBaselineTemplate newSecurityBaselineTemplate, final ICallback<? super SecurityBaselineTemplate> callback) {
        send(HttpMethod.POST, callback, newSecurityBaselineTemplate);
    }

    /**
     * Creates a SecurityBaselineTemplate with a new object
     *
     * @param newSecurityBaselineTemplate the new object to create
     * @return the created SecurityBaselineTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecurityBaselineTemplate post(final SecurityBaselineTemplate newSecurityBaselineTemplate) throws ClientException {
        return send(HttpMethod.POST, newSecurityBaselineTemplate);
    }

    /**
     * Creates a SecurityBaselineTemplate with a new object
     *
     * @param newSecurityBaselineTemplate the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SecurityBaselineTemplate newSecurityBaselineTemplate, final ICallback<? super SecurityBaselineTemplate> callback) {
        send(HttpMethod.PUT, callback, newSecurityBaselineTemplate);
    }

    /**
     * Creates a SecurityBaselineTemplate with a new object
     *
     * @param newSecurityBaselineTemplate the object to create/update
     * @return the created SecurityBaselineTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecurityBaselineTemplate put(final SecurityBaselineTemplate newSecurityBaselineTemplate) throws ClientException {
        return send(HttpMethod.PUT, newSecurityBaselineTemplate);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISecurityBaselineTemplateRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SecurityBaselineTemplateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISecurityBaselineTemplateRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SecurityBaselineTemplateRequest)this;
     }

}

