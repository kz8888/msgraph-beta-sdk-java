// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.BitlockerRecoveryKey;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Bitlocker Recovery Key Request.
 */
public interface IBitlockerRecoveryKeyRequest extends IHttpRequest {

    /**
     * Gets the BitlockerRecoveryKey from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<BitlockerRecoveryKey> callback);

    /**
     * Gets the BitlockerRecoveryKey from the service
     *
     * @return the BitlockerRecoveryKey from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BitlockerRecoveryKey get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<BitlockerRecoveryKey> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this BitlockerRecoveryKey with a source
     *
     * @param sourceBitlockerRecoveryKey the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final BitlockerRecoveryKey sourceBitlockerRecoveryKey, final ICallback<BitlockerRecoveryKey> callback);

    /**
     * Patches this BitlockerRecoveryKey with a source
     *
     * @param sourceBitlockerRecoveryKey the source object with updates
     * @return the updated BitlockerRecoveryKey
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BitlockerRecoveryKey patch(final BitlockerRecoveryKey sourceBitlockerRecoveryKey) throws ClientException;

    /**
     * Posts a BitlockerRecoveryKey with a new object
     *
     * @param newBitlockerRecoveryKey the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final BitlockerRecoveryKey newBitlockerRecoveryKey, final ICallback<BitlockerRecoveryKey> callback);

    /**
     * Posts a BitlockerRecoveryKey with a new object
     *
     * @param newBitlockerRecoveryKey the new object to create
     * @return the created BitlockerRecoveryKey
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BitlockerRecoveryKey post(final BitlockerRecoveryKey newBitlockerRecoveryKey) throws ClientException;

    /**
     * Posts a BitlockerRecoveryKey with a new object
     *
     * @param newBitlockerRecoveryKey the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final BitlockerRecoveryKey newBitlockerRecoveryKey, final ICallback<BitlockerRecoveryKey> callback);

    /**
     * Posts a BitlockerRecoveryKey with a new object
     *
     * @param newBitlockerRecoveryKey the object to create/update
     * @return the created BitlockerRecoveryKey
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BitlockerRecoveryKey put(final BitlockerRecoveryKey newBitlockerRecoveryKey) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBitlockerRecoveryKeyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBitlockerRecoveryKeyRequest expand(final String value);

}

