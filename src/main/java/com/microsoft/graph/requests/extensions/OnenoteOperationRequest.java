// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OnenoteOperation;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Operation Request.
 */
public class OnenoteOperationRequest extends BaseRequest<OnenoteOperation> {
	
    /**
     * The request for the OnenoteOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteOperationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OnenoteOperation.class);
    }

    /**
     * Gets the OnenoteOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super OnenoteOperation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OnenoteOperation from the service
     *
     * @return the OnenoteOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenoteOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super OnenoteOperation> callback) {
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
     * Patches this OnenoteOperation with a source
     *
     * @param sourceOnenoteOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final OnenoteOperation sourceOnenoteOperation, @Nonnull final ICallback<? super OnenoteOperation> callback) {
        send(HttpMethod.PATCH, callback, sourceOnenoteOperation);
    }

    /**
     * Patches this OnenoteOperation with a source
     *
     * @param sourceOnenoteOperation the source object with updates
     * @return the updated OnenoteOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenoteOperation patch(@Nonnull final OnenoteOperation sourceOnenoteOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceOnenoteOperation);
    }

    /**
     * Creates a OnenoteOperation with a new object
     *
     * @param newOnenoteOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final OnenoteOperation newOnenoteOperation, @Nonnull final ICallback<? super OnenoteOperation> callback) {
        send(HttpMethod.POST, callback, newOnenoteOperation);
    }

    /**
     * Creates a OnenoteOperation with a new object
     *
     * @param newOnenoteOperation the new object to create
     * @return the created OnenoteOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenoteOperation post(@Nonnull final OnenoteOperation newOnenoteOperation) throws ClientException {
        return send(HttpMethod.POST, newOnenoteOperation);
    }

    /**
     * Creates a OnenoteOperation with a new object
     *
     * @param newOnenoteOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final OnenoteOperation newOnenoteOperation, @Nonnull final ICallback<? super OnenoteOperation> callback) {
        send(HttpMethod.PUT, callback, newOnenoteOperation);
    }

    /**
     * Creates a OnenoteOperation with a new object
     *
     * @param newOnenoteOperation the object to create/update
     * @return the created OnenoteOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenoteOperation put(@Nonnull final OnenoteOperation newOnenoteOperation) throws ClientException {
        return send(HttpMethod.PUT, newOnenoteOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OnenoteOperationRequest select(@Nonnull final String value) {
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
     public OnenoteOperationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

