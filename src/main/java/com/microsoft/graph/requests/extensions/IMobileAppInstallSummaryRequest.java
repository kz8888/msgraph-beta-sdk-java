// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileAppInstallSummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mobile App Install Summary Request.
 */
public interface IMobileAppInstallSummaryRequest extends IHttpRequest {

    /**
     * Gets the MobileAppInstallSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<MobileAppInstallSummary> callback);

    /**
     * Gets the MobileAppInstallSummary from the service
     *
     * @return the MobileAppInstallSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppInstallSummary get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<MobileAppInstallSummary> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MobileAppInstallSummary with a source
     *
     * @param sourceMobileAppInstallSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MobileAppInstallSummary sourceMobileAppInstallSummary, final ICallback<MobileAppInstallSummary> callback);

    /**
     * Patches this MobileAppInstallSummary with a source
     *
     * @param sourceMobileAppInstallSummary the source object with updates
     * @return the updated MobileAppInstallSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppInstallSummary patch(final MobileAppInstallSummary sourceMobileAppInstallSummary) throws ClientException;

    /**
     * Posts a MobileAppInstallSummary with a new object
     *
     * @param newMobileAppInstallSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MobileAppInstallSummary newMobileAppInstallSummary, final ICallback<MobileAppInstallSummary> callback);

    /**
     * Posts a MobileAppInstallSummary with a new object
     *
     * @param newMobileAppInstallSummary the new object to create
     * @return the created MobileAppInstallSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppInstallSummary post(final MobileAppInstallSummary newMobileAppInstallSummary) throws ClientException;

    /**
     * Posts a MobileAppInstallSummary with a new object
     *
     * @param newMobileAppInstallSummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MobileAppInstallSummary newMobileAppInstallSummary, final ICallback<MobileAppInstallSummary> callback);

    /**
     * Posts a MobileAppInstallSummary with a new object
     *
     * @param newMobileAppInstallSummary the object to create/update
     * @return the created MobileAppInstallSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppInstallSummary put(final MobileAppInstallSummary newMobileAppInstallSummary) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMobileAppInstallSummaryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMobileAppInstallSummaryRequest expand(final String value);

}

