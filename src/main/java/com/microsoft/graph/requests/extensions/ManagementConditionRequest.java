// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagementCondition;
import com.microsoft.graph.models.generated.DevicePlatformType;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Condition Request.
 */
public class ManagementConditionRequest extends BaseRequest<ManagementCondition> {
	
    /**
     * The request for the ManagementCondition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ManagementConditionRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends ManagementCondition> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ManagementCondition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagementConditionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagementCondition.class);
    }

    /**
     * Gets the ManagementCondition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ManagementCondition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagementCondition from the service
     *
     * @return the ManagementCondition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagementCondition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ManagementCondition> callback) {
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
     * Patches this ManagementCondition with a source
     *
     * @param sourceManagementCondition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ManagementCondition sourceManagementCondition, @Nonnull final ICallback<? super ManagementCondition> callback) {
        send(HttpMethod.PATCH, callback, sourceManagementCondition);
    }

    /**
     * Patches this ManagementCondition with a source
     *
     * @param sourceManagementCondition the source object with updates
     * @return the updated ManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagementCondition patch(@Nonnull final ManagementCondition sourceManagementCondition) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagementCondition);
    }

    /**
     * Creates a ManagementCondition with a new object
     *
     * @param newManagementCondition the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ManagementCondition newManagementCondition, @Nonnull final ICallback<? super ManagementCondition> callback) {
        send(HttpMethod.POST, callback, newManagementCondition);
    }

    /**
     * Creates a ManagementCondition with a new object
     *
     * @param newManagementCondition the new object to create
     * @return the created ManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagementCondition post(@Nonnull final ManagementCondition newManagementCondition) throws ClientException {
        return send(HttpMethod.POST, newManagementCondition);
    }

    /**
     * Creates a ManagementCondition with a new object
     *
     * @param newManagementCondition the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ManagementCondition newManagementCondition, @Nonnull final ICallback<? super ManagementCondition> callback) {
        send(HttpMethod.PUT, callback, newManagementCondition);
    }

    /**
     * Creates a ManagementCondition with a new object
     *
     * @param newManagementCondition the object to create/update
     * @return the created ManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagementCondition put(@Nonnull final ManagementCondition newManagementCondition) throws ClientException {
        return send(HttpMethod.PUT, newManagementCondition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagementConditionRequest select(@Nonnull final String value) {
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
     public ManagementConditionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

