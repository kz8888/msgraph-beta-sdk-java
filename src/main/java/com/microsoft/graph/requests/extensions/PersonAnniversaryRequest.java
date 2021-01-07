// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PersonAnniversary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Anniversary Request.
 */
public class PersonAnniversaryRequest extends BaseRequest<PersonAnniversary> {
	
    /**
     * The request for the PersonAnniversary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PersonAnniversaryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PersonAnniversary.class);
    }

    /**
     * Gets the PersonAnniversary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super PersonAnniversary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PersonAnniversary from the service
     *
     * @return the PersonAnniversary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PersonAnniversary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super PersonAnniversary> callback) {
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
     * Patches this PersonAnniversary with a source
     *
     * @param sourcePersonAnniversary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final PersonAnniversary sourcePersonAnniversary, @Nonnull final ICallback<? super PersonAnniversary> callback) {
        send(HttpMethod.PATCH, callback, sourcePersonAnniversary);
    }

    /**
     * Patches this PersonAnniversary with a source
     *
     * @param sourcePersonAnniversary the source object with updates
     * @return the updated PersonAnniversary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PersonAnniversary patch(@Nonnull final PersonAnniversary sourcePersonAnniversary) throws ClientException {
        return send(HttpMethod.PATCH, sourcePersonAnniversary);
    }

    /**
     * Creates a PersonAnniversary with a new object
     *
     * @param newPersonAnniversary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final PersonAnniversary newPersonAnniversary, @Nonnull final ICallback<? super PersonAnniversary> callback) {
        send(HttpMethod.POST, callback, newPersonAnniversary);
    }

    /**
     * Creates a PersonAnniversary with a new object
     *
     * @param newPersonAnniversary the new object to create
     * @return the created PersonAnniversary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PersonAnniversary post(@Nonnull final PersonAnniversary newPersonAnniversary) throws ClientException {
        return send(HttpMethod.POST, newPersonAnniversary);
    }

    /**
     * Creates a PersonAnniversary with a new object
     *
     * @param newPersonAnniversary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final PersonAnniversary newPersonAnniversary, @Nonnull final ICallback<? super PersonAnniversary> callback) {
        send(HttpMethod.PUT, callback, newPersonAnniversary);
    }

    /**
     * Creates a PersonAnniversary with a new object
     *
     * @param newPersonAnniversary the object to create/update
     * @return the created PersonAnniversary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PersonAnniversary put(@Nonnull final PersonAnniversary newPersonAnniversary) throws ClientException {
        return send(HttpMethod.PUT, newPersonAnniversary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PersonAnniversaryRequest select(@Nonnull final String value) {
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
     public PersonAnniversaryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

