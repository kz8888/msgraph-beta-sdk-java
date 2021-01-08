// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AzureADFeatureUsage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Azure ADFeature Usage Request.
 */
public class AzureADFeatureUsageRequest extends BaseRequest<AzureADFeatureUsage> {
	
    /**
     * The request for the AzureADFeatureUsage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AzureADFeatureUsageRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AzureADFeatureUsage.class);
    }

    /**
     * Gets the AzureADFeatureUsage from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super AzureADFeatureUsage> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AzureADFeatureUsage from the service
     *
     * @return the AzureADFeatureUsage from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AzureADFeatureUsage get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super AzureADFeatureUsage> callback) {
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
     * Patches this AzureADFeatureUsage with a source
     *
     * @param sourceAzureADFeatureUsage the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final AzureADFeatureUsage sourceAzureADFeatureUsage, @Nonnull final ICallback<? super AzureADFeatureUsage> callback) {
        send(HttpMethod.PATCH, callback, sourceAzureADFeatureUsage);
    }

    /**
     * Patches this AzureADFeatureUsage with a source
     *
     * @param sourceAzureADFeatureUsage the source object with updates
     * @return the updated AzureADFeatureUsage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AzureADFeatureUsage patch(@Nonnull final AzureADFeatureUsage sourceAzureADFeatureUsage) throws ClientException {
        return send(HttpMethod.PATCH, sourceAzureADFeatureUsage);
    }

    /**
     * Creates a AzureADFeatureUsage with a new object
     *
     * @param newAzureADFeatureUsage the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final AzureADFeatureUsage newAzureADFeatureUsage, @Nonnull final ICallback<? super AzureADFeatureUsage> callback) {
        send(HttpMethod.POST, callback, newAzureADFeatureUsage);
    }

    /**
     * Creates a AzureADFeatureUsage with a new object
     *
     * @param newAzureADFeatureUsage the new object to create
     * @return the created AzureADFeatureUsage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AzureADFeatureUsage post(@Nonnull final AzureADFeatureUsage newAzureADFeatureUsage) throws ClientException {
        return send(HttpMethod.POST, newAzureADFeatureUsage);
    }

    /**
     * Creates a AzureADFeatureUsage with a new object
     *
     * @param newAzureADFeatureUsage the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final AzureADFeatureUsage newAzureADFeatureUsage, @Nonnull final ICallback<? super AzureADFeatureUsage> callback) {
        send(HttpMethod.PUT, callback, newAzureADFeatureUsage);
    }

    /**
     * Creates a AzureADFeatureUsage with a new object
     *
     * @param newAzureADFeatureUsage the object to create/update
     * @return the created AzureADFeatureUsage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AzureADFeatureUsage put(@Nonnull final AzureADFeatureUsage newAzureADFeatureUsage) throws ClientException {
        return send(HttpMethod.PUT, newAzureADFeatureUsage);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AzureADFeatureUsageRequest select(@Nonnull final String value) {
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
     public AzureADFeatureUsageRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

