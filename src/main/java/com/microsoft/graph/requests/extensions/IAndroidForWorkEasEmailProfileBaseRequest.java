// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidForWorkEasEmailProfileBase;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android For Work Eas Email Profile Base Request.
 */
public interface IAndroidForWorkEasEmailProfileBaseRequest extends IHttpRequest {

    /**
     * Gets the AndroidForWorkEasEmailProfileBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AndroidForWorkEasEmailProfileBase> callback);

    /**
     * Gets the AndroidForWorkEasEmailProfileBase from the service
     *
     * @return the AndroidForWorkEasEmailProfileBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkEasEmailProfileBase get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AndroidForWorkEasEmailProfileBase> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidForWorkEasEmailProfileBase with a source
     *
     * @param sourceAndroidForWorkEasEmailProfileBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidForWorkEasEmailProfileBase sourceAndroidForWorkEasEmailProfileBase, final ICallback<? super AndroidForWorkEasEmailProfileBase> callback);

    /**
     * Patches this AndroidForWorkEasEmailProfileBase with a source
     *
     * @param sourceAndroidForWorkEasEmailProfileBase the source object with updates
     * @return the updated AndroidForWorkEasEmailProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkEasEmailProfileBase patch(final AndroidForWorkEasEmailProfileBase sourceAndroidForWorkEasEmailProfileBase) throws ClientException;

    /**
     * Posts a AndroidForWorkEasEmailProfileBase with a new object
     *
     * @param newAndroidForWorkEasEmailProfileBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidForWorkEasEmailProfileBase newAndroidForWorkEasEmailProfileBase, final ICallback<? super AndroidForWorkEasEmailProfileBase> callback);

    /**
     * Posts a AndroidForWorkEasEmailProfileBase with a new object
     *
     * @param newAndroidForWorkEasEmailProfileBase the new object to create
     * @return the created AndroidForWorkEasEmailProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkEasEmailProfileBase post(final AndroidForWorkEasEmailProfileBase newAndroidForWorkEasEmailProfileBase) throws ClientException;

    /**
     * Posts a AndroidForWorkEasEmailProfileBase with a new object
     *
     * @param newAndroidForWorkEasEmailProfileBase the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AndroidForWorkEasEmailProfileBase newAndroidForWorkEasEmailProfileBase, final ICallback<? super AndroidForWorkEasEmailProfileBase> callback);

    /**
     * Posts a AndroidForWorkEasEmailProfileBase with a new object
     *
     * @param newAndroidForWorkEasEmailProfileBase the object to create/update
     * @return the created AndroidForWorkEasEmailProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkEasEmailProfileBase put(final AndroidForWorkEasEmailProfileBase newAndroidForWorkEasEmailProfileBase) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidForWorkEasEmailProfileBaseRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidForWorkEasEmailProfileBaseRequest expand(final String value);

}

