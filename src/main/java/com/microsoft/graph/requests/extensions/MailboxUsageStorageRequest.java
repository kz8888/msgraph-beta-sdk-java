// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MailboxUsageStorage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mailbox Usage Storage Request.
 */
public class MailboxUsageStorageRequest extends BaseRequest<MailboxUsageStorage> {
	
    /**
     * The request for the MailboxUsageStorage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MailboxUsageStorageRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MailboxUsageStorage.class);
    }

    /**
     * Gets the MailboxUsageStorage from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super MailboxUsageStorage> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MailboxUsageStorage from the service
     *
     * @return the MailboxUsageStorage from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MailboxUsageStorage get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super MailboxUsageStorage> callback) {
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
     * Patches this MailboxUsageStorage with a source
     *
     * @param sourceMailboxUsageStorage the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final MailboxUsageStorage sourceMailboxUsageStorage, @Nonnull final ICallback<? super MailboxUsageStorage> callback) {
        send(HttpMethod.PATCH, callback, sourceMailboxUsageStorage);
    }

    /**
     * Patches this MailboxUsageStorage with a source
     *
     * @param sourceMailboxUsageStorage the source object with updates
     * @return the updated MailboxUsageStorage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MailboxUsageStorage patch(@Nonnull final MailboxUsageStorage sourceMailboxUsageStorage) throws ClientException {
        return send(HttpMethod.PATCH, sourceMailboxUsageStorage);
    }

    /**
     * Creates a MailboxUsageStorage with a new object
     *
     * @param newMailboxUsageStorage the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final MailboxUsageStorage newMailboxUsageStorage, @Nonnull final ICallback<? super MailboxUsageStorage> callback) {
        send(HttpMethod.POST, callback, newMailboxUsageStorage);
    }

    /**
     * Creates a MailboxUsageStorage with a new object
     *
     * @param newMailboxUsageStorage the new object to create
     * @return the created MailboxUsageStorage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MailboxUsageStorage post(@Nonnull final MailboxUsageStorage newMailboxUsageStorage) throws ClientException {
        return send(HttpMethod.POST, newMailboxUsageStorage);
    }

    /**
     * Creates a MailboxUsageStorage with a new object
     *
     * @param newMailboxUsageStorage the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final MailboxUsageStorage newMailboxUsageStorage, @Nonnull final ICallback<? super MailboxUsageStorage> callback) {
        send(HttpMethod.PUT, callback, newMailboxUsageStorage);
    }

    /**
     * Creates a MailboxUsageStorage with a new object
     *
     * @param newMailboxUsageStorage the object to create/update
     * @return the created MailboxUsageStorage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MailboxUsageStorage put(@Nonnull final MailboxUsageStorage newMailboxUsageStorage) throws ClientException {
        return send(HttpMethod.PUT, newMailboxUsageStorage);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MailboxUsageStorageRequest select(@Nonnull final String value) {
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
     public MailboxUsageStorageRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

