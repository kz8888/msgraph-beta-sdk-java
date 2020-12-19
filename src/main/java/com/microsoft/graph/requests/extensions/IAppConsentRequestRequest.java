// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AppConsentRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the App Consent Request Request.
 */
public interface IAppConsentRequestRequest extends IHttpRequest {

    /**
     * Gets the AppConsentRequest from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AppConsentRequest> callback);

    /**
     * Gets the AppConsentRequest from the service
     *
     * @return the AppConsentRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppConsentRequest get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AppConsentRequest> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AppConsentRequest with a source
     *
     * @param sourceAppConsentRequest the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AppConsentRequest sourceAppConsentRequest, final ICallback<? super AppConsentRequest> callback);

    /**
     * Patches this AppConsentRequest with a source
     *
     * @param sourceAppConsentRequest the source object with updates
     * @return the updated AppConsentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppConsentRequest patch(final AppConsentRequest sourceAppConsentRequest) throws ClientException;

    /**
     * Posts a AppConsentRequest with a new object
     *
     * @param newAppConsentRequest the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AppConsentRequest newAppConsentRequest, final ICallback<? super AppConsentRequest> callback);

    /**
     * Posts a AppConsentRequest with a new object
     *
     * @param newAppConsentRequest the new object to create
     * @return the created AppConsentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppConsentRequest post(final AppConsentRequest newAppConsentRequest) throws ClientException;

    /**
     * Posts a AppConsentRequest with a new object
     *
     * @param newAppConsentRequest the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AppConsentRequest newAppConsentRequest, final ICallback<? super AppConsentRequest> callback);

    /**
     * Posts a AppConsentRequest with a new object
     *
     * @param newAppConsentRequest the object to create/update
     * @return the created AppConsentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppConsentRequest put(final AppConsentRequest newAppConsentRequest) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAppConsentRequestRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAppConsentRequestRequest expand(final String value);

}

