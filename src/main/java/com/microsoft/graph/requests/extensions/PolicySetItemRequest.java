// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PolicySetItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Set Item Request.
 */
public class PolicySetItemRequest extends BaseRequest<PolicySetItem> {
	
    /**
     * The request for the PolicySetItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public PolicySetItemRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends PolicySetItem> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the PolicySetItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PolicySetItemRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PolicySetItem.class);
    }

    /**
     * Gets the PolicySetItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super PolicySetItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PolicySetItem from the service
     *
     * @return the PolicySetItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PolicySetItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super PolicySetItem> callback) {
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
     * Patches this PolicySetItem with a source
     *
     * @param sourcePolicySetItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final PolicySetItem sourcePolicySetItem, @Nonnull final ICallback<? super PolicySetItem> callback) {
        send(HttpMethod.PATCH, callback, sourcePolicySetItem);
    }

    /**
     * Patches this PolicySetItem with a source
     *
     * @param sourcePolicySetItem the source object with updates
     * @return the updated PolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PolicySetItem patch(@Nonnull final PolicySetItem sourcePolicySetItem) throws ClientException {
        return send(HttpMethod.PATCH, sourcePolicySetItem);
    }

    /**
     * Creates a PolicySetItem with a new object
     *
     * @param newPolicySetItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final PolicySetItem newPolicySetItem, @Nonnull final ICallback<? super PolicySetItem> callback) {
        send(HttpMethod.POST, callback, newPolicySetItem);
    }

    /**
     * Creates a PolicySetItem with a new object
     *
     * @param newPolicySetItem the new object to create
     * @return the created PolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PolicySetItem post(@Nonnull final PolicySetItem newPolicySetItem) throws ClientException {
        return send(HttpMethod.POST, newPolicySetItem);
    }

    /**
     * Creates a PolicySetItem with a new object
     *
     * @param newPolicySetItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final PolicySetItem newPolicySetItem, @Nonnull final ICallback<? super PolicySetItem> callback) {
        send(HttpMethod.PUT, callback, newPolicySetItem);
    }

    /**
     * Creates a PolicySetItem with a new object
     *
     * @param newPolicySetItem the object to create/update
     * @return the created PolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PolicySetItem put(@Nonnull final PolicySetItem newPolicySetItem) throws ClientException {
        return send(HttpMethod.PUT, newPolicySetItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PolicySetItemRequest select(@Nonnull final String value) {
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
     public PolicySetItemRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

