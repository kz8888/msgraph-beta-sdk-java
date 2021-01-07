// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.BitlockerRecoveryKey;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Bitlocker Recovery Key Request.
 */
public class BitlockerRecoveryKeyRequest extends BaseRequest<BitlockerRecoveryKey> {
	
    /**
     * The request for the BitlockerRecoveryKey
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BitlockerRecoveryKeyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, BitlockerRecoveryKey.class);
    }

    /**
     * Gets the BitlockerRecoveryKey from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super BitlockerRecoveryKey> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the BitlockerRecoveryKey from the service
     *
     * @return the BitlockerRecoveryKey from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public BitlockerRecoveryKey get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super BitlockerRecoveryKey> callback) {
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
     * Patches this BitlockerRecoveryKey with a source
     *
     * @param sourceBitlockerRecoveryKey the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final BitlockerRecoveryKey sourceBitlockerRecoveryKey, @Nonnull final ICallback<? super BitlockerRecoveryKey> callback) {
        send(HttpMethod.PATCH, callback, sourceBitlockerRecoveryKey);
    }

    /**
     * Patches this BitlockerRecoveryKey with a source
     *
     * @param sourceBitlockerRecoveryKey the source object with updates
     * @return the updated BitlockerRecoveryKey
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public BitlockerRecoveryKey patch(@Nonnull final BitlockerRecoveryKey sourceBitlockerRecoveryKey) throws ClientException {
        return send(HttpMethod.PATCH, sourceBitlockerRecoveryKey);
    }

    /**
     * Creates a BitlockerRecoveryKey with a new object
     *
     * @param newBitlockerRecoveryKey the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final BitlockerRecoveryKey newBitlockerRecoveryKey, @Nonnull final ICallback<? super BitlockerRecoveryKey> callback) {
        send(HttpMethod.POST, callback, newBitlockerRecoveryKey);
    }

    /**
     * Creates a BitlockerRecoveryKey with a new object
     *
     * @param newBitlockerRecoveryKey the new object to create
     * @return the created BitlockerRecoveryKey
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public BitlockerRecoveryKey post(@Nonnull final BitlockerRecoveryKey newBitlockerRecoveryKey) throws ClientException {
        return send(HttpMethod.POST, newBitlockerRecoveryKey);
    }

    /**
     * Creates a BitlockerRecoveryKey with a new object
     *
     * @param newBitlockerRecoveryKey the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final BitlockerRecoveryKey newBitlockerRecoveryKey, @Nonnull final ICallback<? super BitlockerRecoveryKey> callback) {
        send(HttpMethod.PUT, callback, newBitlockerRecoveryKey);
    }

    /**
     * Creates a BitlockerRecoveryKey with a new object
     *
     * @param newBitlockerRecoveryKey the object to create/update
     * @return the created BitlockerRecoveryKey
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public BitlockerRecoveryKey put(@Nonnull final BitlockerRecoveryKey newBitlockerRecoveryKey) throws ClientException {
        return send(HttpMethod.PUT, newBitlockerRecoveryKey);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public BitlockerRecoveryKeyRequest select(@Nonnull final String value) {
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
     public BitlockerRecoveryKeyRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

