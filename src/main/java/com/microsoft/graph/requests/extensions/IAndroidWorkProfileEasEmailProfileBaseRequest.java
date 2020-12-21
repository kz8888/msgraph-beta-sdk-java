// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidWorkProfileEasEmailProfileBase;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Work Profile Eas Email Profile Base Request.
 */
public interface IAndroidWorkProfileEasEmailProfileBaseRequest extends IHttpRequest {

    /**
     * Gets the AndroidWorkProfileEasEmailProfileBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AndroidWorkProfileEasEmailProfileBase> callback);

    /**
     * Gets the AndroidWorkProfileEasEmailProfileBase from the service
     *
     * @return the AndroidWorkProfileEasEmailProfileBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileEasEmailProfileBase get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AndroidWorkProfileEasEmailProfileBase> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidWorkProfileEasEmailProfileBase with a source
     *
     * @param sourceAndroidWorkProfileEasEmailProfileBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidWorkProfileEasEmailProfileBase sourceAndroidWorkProfileEasEmailProfileBase, final ICallback<? super AndroidWorkProfileEasEmailProfileBase> callback);

    /**
     * Patches this AndroidWorkProfileEasEmailProfileBase with a source
     *
     * @param sourceAndroidWorkProfileEasEmailProfileBase the source object with updates
     * @return the updated AndroidWorkProfileEasEmailProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileEasEmailProfileBase patch(final AndroidWorkProfileEasEmailProfileBase sourceAndroidWorkProfileEasEmailProfileBase) throws ClientException;

    /**
     * Posts a AndroidWorkProfileEasEmailProfileBase with a new object
     *
     * @param newAndroidWorkProfileEasEmailProfileBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidWorkProfileEasEmailProfileBase newAndroidWorkProfileEasEmailProfileBase, final ICallback<? super AndroidWorkProfileEasEmailProfileBase> callback);

    /**
     * Posts a AndroidWorkProfileEasEmailProfileBase with a new object
     *
     * @param newAndroidWorkProfileEasEmailProfileBase the new object to create
     * @return the created AndroidWorkProfileEasEmailProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileEasEmailProfileBase post(final AndroidWorkProfileEasEmailProfileBase newAndroidWorkProfileEasEmailProfileBase) throws ClientException;

    /**
     * Posts a AndroidWorkProfileEasEmailProfileBase with a new object
     *
     * @param newAndroidWorkProfileEasEmailProfileBase the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AndroidWorkProfileEasEmailProfileBase newAndroidWorkProfileEasEmailProfileBase, final ICallback<? super AndroidWorkProfileEasEmailProfileBase> callback);

    /**
     * Posts a AndroidWorkProfileEasEmailProfileBase with a new object
     *
     * @param newAndroidWorkProfileEasEmailProfileBase the object to create/update
     * @return the created AndroidWorkProfileEasEmailProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileEasEmailProfileBase put(final AndroidWorkProfileEasEmailProfileBase newAndroidWorkProfileEasEmailProfileBase) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidWorkProfileEasEmailProfileBaseRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidWorkProfileEasEmailProfileBaseRequest expand(final String value);

}

