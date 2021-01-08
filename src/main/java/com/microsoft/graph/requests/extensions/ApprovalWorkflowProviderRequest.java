// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ApprovalWorkflowProvider;
import com.microsoft.graph.requests.extensions.BusinessFlowCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.BusinessFlowRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernancePolicyTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernancePolicyTemplateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Approval Workflow Provider Request.
 */
public class ApprovalWorkflowProviderRequest extends BaseRequest<ApprovalWorkflowProvider> {
	
    /**
     * The request for the ApprovalWorkflowProvider
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApprovalWorkflowProviderRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ApprovalWorkflowProvider.class);
    }

    /**
     * Gets the ApprovalWorkflowProvider from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ApprovalWorkflowProvider> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ApprovalWorkflowProvider from the service
     *
     * @return the ApprovalWorkflowProvider from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ApprovalWorkflowProvider get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ApprovalWorkflowProvider> callback) {
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
     * Patches this ApprovalWorkflowProvider with a source
     *
     * @param sourceApprovalWorkflowProvider the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ApprovalWorkflowProvider sourceApprovalWorkflowProvider, @Nonnull final ICallback<? super ApprovalWorkflowProvider> callback) {
        send(HttpMethod.PATCH, callback, sourceApprovalWorkflowProvider);
    }

    /**
     * Patches this ApprovalWorkflowProvider with a source
     *
     * @param sourceApprovalWorkflowProvider the source object with updates
     * @return the updated ApprovalWorkflowProvider
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ApprovalWorkflowProvider patch(@Nonnull final ApprovalWorkflowProvider sourceApprovalWorkflowProvider) throws ClientException {
        return send(HttpMethod.PATCH, sourceApprovalWorkflowProvider);
    }

    /**
     * Creates a ApprovalWorkflowProvider with a new object
     *
     * @param newApprovalWorkflowProvider the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ApprovalWorkflowProvider newApprovalWorkflowProvider, @Nonnull final ICallback<? super ApprovalWorkflowProvider> callback) {
        send(HttpMethod.POST, callback, newApprovalWorkflowProvider);
    }

    /**
     * Creates a ApprovalWorkflowProvider with a new object
     *
     * @param newApprovalWorkflowProvider the new object to create
     * @return the created ApprovalWorkflowProvider
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ApprovalWorkflowProvider post(@Nonnull final ApprovalWorkflowProvider newApprovalWorkflowProvider) throws ClientException {
        return send(HttpMethod.POST, newApprovalWorkflowProvider);
    }

    /**
     * Creates a ApprovalWorkflowProvider with a new object
     *
     * @param newApprovalWorkflowProvider the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ApprovalWorkflowProvider newApprovalWorkflowProvider, @Nonnull final ICallback<? super ApprovalWorkflowProvider> callback) {
        send(HttpMethod.PUT, callback, newApprovalWorkflowProvider);
    }

    /**
     * Creates a ApprovalWorkflowProvider with a new object
     *
     * @param newApprovalWorkflowProvider the object to create/update
     * @return the created ApprovalWorkflowProvider
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ApprovalWorkflowProvider put(@Nonnull final ApprovalWorkflowProvider newApprovalWorkflowProvider) throws ClientException {
        return send(HttpMethod.PUT, newApprovalWorkflowProvider);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ApprovalWorkflowProviderRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public ApprovalWorkflowProviderRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

