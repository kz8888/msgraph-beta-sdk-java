// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MacOSSoftwareUpdateStateSummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mac OSSoftware Update State Summary Request.
 */
public interface IMacOSSoftwareUpdateStateSummaryRequest extends IHttpRequest {

    /**
     * Gets the MacOSSoftwareUpdateStateSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super MacOSSoftwareUpdateStateSummary> callback);

    /**
     * Gets the MacOSSoftwareUpdateStateSummary from the service
     *
     * @return the MacOSSoftwareUpdateStateSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSSoftwareUpdateStateSummary get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super MacOSSoftwareUpdateStateSummary> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MacOSSoftwareUpdateStateSummary with a source
     *
     * @param sourceMacOSSoftwareUpdateStateSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MacOSSoftwareUpdateStateSummary sourceMacOSSoftwareUpdateStateSummary, final ICallback<? super MacOSSoftwareUpdateStateSummary> callback);

    /**
     * Patches this MacOSSoftwareUpdateStateSummary with a source
     *
     * @param sourceMacOSSoftwareUpdateStateSummary the source object with updates
     * @return the updated MacOSSoftwareUpdateStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSSoftwareUpdateStateSummary patch(final MacOSSoftwareUpdateStateSummary sourceMacOSSoftwareUpdateStateSummary) throws ClientException;

    /**
     * Posts a MacOSSoftwareUpdateStateSummary with a new object
     *
     * @param newMacOSSoftwareUpdateStateSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MacOSSoftwareUpdateStateSummary newMacOSSoftwareUpdateStateSummary, final ICallback<? super MacOSSoftwareUpdateStateSummary> callback);

    /**
     * Posts a MacOSSoftwareUpdateStateSummary with a new object
     *
     * @param newMacOSSoftwareUpdateStateSummary the new object to create
     * @return the created MacOSSoftwareUpdateStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSSoftwareUpdateStateSummary post(final MacOSSoftwareUpdateStateSummary newMacOSSoftwareUpdateStateSummary) throws ClientException;

    /**
     * Posts a MacOSSoftwareUpdateStateSummary with a new object
     *
     * @param newMacOSSoftwareUpdateStateSummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MacOSSoftwareUpdateStateSummary newMacOSSoftwareUpdateStateSummary, final ICallback<? super MacOSSoftwareUpdateStateSummary> callback);

    /**
     * Posts a MacOSSoftwareUpdateStateSummary with a new object
     *
     * @param newMacOSSoftwareUpdateStateSummary the object to create/update
     * @return the created MacOSSoftwareUpdateStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSSoftwareUpdateStateSummary put(final MacOSSoftwareUpdateStateSummary newMacOSSoftwareUpdateStateSummary) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMacOSSoftwareUpdateStateSummaryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMacOSSoftwareUpdateStateSummaryRequest expand(final String value);

}

