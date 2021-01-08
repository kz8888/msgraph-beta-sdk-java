// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TelecomExpenseManagementPartner;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Telecom Expense Management Partner Request.
 */
public class TelecomExpenseManagementPartnerRequest extends BaseRequest<TelecomExpenseManagementPartner> {
	
    /**
     * The request for the TelecomExpenseManagementPartner
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TelecomExpenseManagementPartnerRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TelecomExpenseManagementPartner.class);
    }

    /**
     * Gets the TelecomExpenseManagementPartner from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super TelecomExpenseManagementPartner> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TelecomExpenseManagementPartner from the service
     *
     * @return the TelecomExpenseManagementPartner from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TelecomExpenseManagementPartner get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super TelecomExpenseManagementPartner> callback) {
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
     * Patches this TelecomExpenseManagementPartner with a source
     *
     * @param sourceTelecomExpenseManagementPartner the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final TelecomExpenseManagementPartner sourceTelecomExpenseManagementPartner, @Nonnull final ICallback<? super TelecomExpenseManagementPartner> callback) {
        send(HttpMethod.PATCH, callback, sourceTelecomExpenseManagementPartner);
    }

    /**
     * Patches this TelecomExpenseManagementPartner with a source
     *
     * @param sourceTelecomExpenseManagementPartner the source object with updates
     * @return the updated TelecomExpenseManagementPartner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TelecomExpenseManagementPartner patch(@Nonnull final TelecomExpenseManagementPartner sourceTelecomExpenseManagementPartner) throws ClientException {
        return send(HttpMethod.PATCH, sourceTelecomExpenseManagementPartner);
    }

    /**
     * Creates a TelecomExpenseManagementPartner with a new object
     *
     * @param newTelecomExpenseManagementPartner the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final TelecomExpenseManagementPartner newTelecomExpenseManagementPartner, @Nonnull final ICallback<? super TelecomExpenseManagementPartner> callback) {
        send(HttpMethod.POST, callback, newTelecomExpenseManagementPartner);
    }

    /**
     * Creates a TelecomExpenseManagementPartner with a new object
     *
     * @param newTelecomExpenseManagementPartner the new object to create
     * @return the created TelecomExpenseManagementPartner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TelecomExpenseManagementPartner post(@Nonnull final TelecomExpenseManagementPartner newTelecomExpenseManagementPartner) throws ClientException {
        return send(HttpMethod.POST, newTelecomExpenseManagementPartner);
    }

    /**
     * Creates a TelecomExpenseManagementPartner with a new object
     *
     * @param newTelecomExpenseManagementPartner the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final TelecomExpenseManagementPartner newTelecomExpenseManagementPartner, @Nonnull final ICallback<? super TelecomExpenseManagementPartner> callback) {
        send(HttpMethod.PUT, callback, newTelecomExpenseManagementPartner);
    }

    /**
     * Creates a TelecomExpenseManagementPartner with a new object
     *
     * @param newTelecomExpenseManagementPartner the object to create/update
     * @return the created TelecomExpenseManagementPartner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TelecomExpenseManagementPartner put(@Nonnull final TelecomExpenseManagementPartner newTelecomExpenseManagementPartner) throws ClientException {
        return send(HttpMethod.PUT, newTelecomExpenseManagementPartner);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TelecomExpenseManagementPartnerRequest select(@Nonnull final String value) {
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
     public TelecomExpenseManagementPartnerRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

