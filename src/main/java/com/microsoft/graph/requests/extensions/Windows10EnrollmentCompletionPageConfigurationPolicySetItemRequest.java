// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Windows10EnrollmentCompletionPageConfigurationPolicySetItem;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Enrollment Completion Page Configuration Policy Set Item Request.
 */
public class Windows10EnrollmentCompletionPageConfigurationPolicySetItemRequest extends BaseRequest implements IWindows10EnrollmentCompletionPageConfigurationPolicySetItemRequest {
	
    /**
     * The request for the Windows10EnrollmentCompletionPageConfigurationPolicySetItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10EnrollmentCompletionPageConfigurationPolicySetItemRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows10EnrollmentCompletionPageConfigurationPolicySetItem.class);
    }

    /**
     * Gets the Windows10EnrollmentCompletionPageConfigurationPolicySetItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Windows10EnrollmentCompletionPageConfigurationPolicySetItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Windows10EnrollmentCompletionPageConfigurationPolicySetItem from the service
     *
     * @return the Windows10EnrollmentCompletionPageConfigurationPolicySetItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10EnrollmentCompletionPageConfigurationPolicySetItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Windows10EnrollmentCompletionPageConfigurationPolicySetItem> callback) {
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
     * Patches this Windows10EnrollmentCompletionPageConfigurationPolicySetItem with a source
     *
     * @param sourceWindows10EnrollmentCompletionPageConfigurationPolicySetItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Windows10EnrollmentCompletionPageConfigurationPolicySetItem sourceWindows10EnrollmentCompletionPageConfigurationPolicySetItem, final ICallback<? super Windows10EnrollmentCompletionPageConfigurationPolicySetItem> callback) {
        send(HttpMethod.PATCH, callback, sourceWindows10EnrollmentCompletionPageConfigurationPolicySetItem);
    }

    /**
     * Patches this Windows10EnrollmentCompletionPageConfigurationPolicySetItem with a source
     *
     * @param sourceWindows10EnrollmentCompletionPageConfigurationPolicySetItem the source object with updates
     * @return the updated Windows10EnrollmentCompletionPageConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10EnrollmentCompletionPageConfigurationPolicySetItem patch(final Windows10EnrollmentCompletionPageConfigurationPolicySetItem sourceWindows10EnrollmentCompletionPageConfigurationPolicySetItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows10EnrollmentCompletionPageConfigurationPolicySetItem);
    }

    /**
     * Creates a Windows10EnrollmentCompletionPageConfigurationPolicySetItem with a new object
     *
     * @param newWindows10EnrollmentCompletionPageConfigurationPolicySetItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Windows10EnrollmentCompletionPageConfigurationPolicySetItem newWindows10EnrollmentCompletionPageConfigurationPolicySetItem, final ICallback<? super Windows10EnrollmentCompletionPageConfigurationPolicySetItem> callback) {
        send(HttpMethod.POST, callback, newWindows10EnrollmentCompletionPageConfigurationPolicySetItem);
    }

    /**
     * Creates a Windows10EnrollmentCompletionPageConfigurationPolicySetItem with a new object
     *
     * @param newWindows10EnrollmentCompletionPageConfigurationPolicySetItem the new object to create
     * @return the created Windows10EnrollmentCompletionPageConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10EnrollmentCompletionPageConfigurationPolicySetItem post(final Windows10EnrollmentCompletionPageConfigurationPolicySetItem newWindows10EnrollmentCompletionPageConfigurationPolicySetItem) throws ClientException {
        return send(HttpMethod.POST, newWindows10EnrollmentCompletionPageConfigurationPolicySetItem);
    }

    /**
     * Creates a Windows10EnrollmentCompletionPageConfigurationPolicySetItem with a new object
     *
     * @param newWindows10EnrollmentCompletionPageConfigurationPolicySetItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Windows10EnrollmentCompletionPageConfigurationPolicySetItem newWindows10EnrollmentCompletionPageConfigurationPolicySetItem, final ICallback<? super Windows10EnrollmentCompletionPageConfigurationPolicySetItem> callback) {
        send(HttpMethod.PUT, callback, newWindows10EnrollmentCompletionPageConfigurationPolicySetItem);
    }

    /**
     * Creates a Windows10EnrollmentCompletionPageConfigurationPolicySetItem with a new object
     *
     * @param newWindows10EnrollmentCompletionPageConfigurationPolicySetItem the object to create/update
     * @return the created Windows10EnrollmentCompletionPageConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10EnrollmentCompletionPageConfigurationPolicySetItem put(final Windows10EnrollmentCompletionPageConfigurationPolicySetItem newWindows10EnrollmentCompletionPageConfigurationPolicySetItem) throws ClientException {
        return send(HttpMethod.PUT, newWindows10EnrollmentCompletionPageConfigurationPolicySetItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindows10EnrollmentCompletionPageConfigurationPolicySetItemRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (Windows10EnrollmentCompletionPageConfigurationPolicySetItemRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindows10EnrollmentCompletionPageConfigurationPolicySetItemRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (Windows10EnrollmentCompletionPageConfigurationPolicySetItemRequest)this;
     }

}

