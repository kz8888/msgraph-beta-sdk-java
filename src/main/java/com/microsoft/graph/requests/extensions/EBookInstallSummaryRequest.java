// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EBookInstallSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the EBook Install Summary Request.
 */
public class EBookInstallSummaryRequest extends BaseRequest<EBookInstallSummary> {
	
    /**
     * The request for the EBookInstallSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EBookInstallSummaryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EBookInstallSummary.class);
    }

    /**
     * Gets the EBookInstallSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super EBookInstallSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EBookInstallSummary from the service
     *
     * @return the EBookInstallSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EBookInstallSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super EBookInstallSummary> callback) {
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
     * Patches this EBookInstallSummary with a source
     *
     * @param sourceEBookInstallSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final EBookInstallSummary sourceEBookInstallSummary, @Nonnull final ICallback<? super EBookInstallSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceEBookInstallSummary);
    }

    /**
     * Patches this EBookInstallSummary with a source
     *
     * @param sourceEBookInstallSummary the source object with updates
     * @return the updated EBookInstallSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EBookInstallSummary patch(@Nonnull final EBookInstallSummary sourceEBookInstallSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceEBookInstallSummary);
    }

    /**
     * Creates a EBookInstallSummary with a new object
     *
     * @param newEBookInstallSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final EBookInstallSummary newEBookInstallSummary, @Nonnull final ICallback<? super EBookInstallSummary> callback) {
        send(HttpMethod.POST, callback, newEBookInstallSummary);
    }

    /**
     * Creates a EBookInstallSummary with a new object
     *
     * @param newEBookInstallSummary the new object to create
     * @return the created EBookInstallSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EBookInstallSummary post(@Nonnull final EBookInstallSummary newEBookInstallSummary) throws ClientException {
        return send(HttpMethod.POST, newEBookInstallSummary);
    }

    /**
     * Creates a EBookInstallSummary with a new object
     *
     * @param newEBookInstallSummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final EBookInstallSummary newEBookInstallSummary, @Nonnull final ICallback<? super EBookInstallSummary> callback) {
        send(HttpMethod.PUT, callback, newEBookInstallSummary);
    }

    /**
     * Creates a EBookInstallSummary with a new object
     *
     * @param newEBookInstallSummary the object to create/update
     * @return the created EBookInstallSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EBookInstallSummary put(@Nonnull final EBookInstallSummary newEBookInstallSummary) throws ClientException {
        return send(HttpMethod.PUT, newEBookInstallSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EBookInstallSummaryRequest select(@Nonnull final String value) {
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
     public EBookInstallSummaryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

