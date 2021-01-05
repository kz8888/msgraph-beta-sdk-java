// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CredentialUsageSummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Credential Usage Summary Request.
 */
public interface ICredentialUsageSummaryRequest extends IHttpRequest {

    /**
     * Gets the CredentialUsageSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super CredentialUsageSummary> callback);

    /**
     * Gets the CredentialUsageSummary from the service
     *
     * @return the CredentialUsageSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CredentialUsageSummary get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super CredentialUsageSummary> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this CredentialUsageSummary with a source
     *
     * @param sourceCredentialUsageSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final CredentialUsageSummary sourceCredentialUsageSummary, final ICallback<? super CredentialUsageSummary> callback);

    /**
     * Patches this CredentialUsageSummary with a source
     *
     * @param sourceCredentialUsageSummary the source object with updates
     * @return the updated CredentialUsageSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CredentialUsageSummary patch(final CredentialUsageSummary sourceCredentialUsageSummary) throws ClientException;

    /**
     * Posts a CredentialUsageSummary with a new object
     *
     * @param newCredentialUsageSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final CredentialUsageSummary newCredentialUsageSummary, final ICallback<? super CredentialUsageSummary> callback);

    /**
     * Posts a CredentialUsageSummary with a new object
     *
     * @param newCredentialUsageSummary the new object to create
     * @return the created CredentialUsageSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CredentialUsageSummary post(final CredentialUsageSummary newCredentialUsageSummary) throws ClientException;

    /**
     * Posts a CredentialUsageSummary with a new object
     *
     * @param newCredentialUsageSummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final CredentialUsageSummary newCredentialUsageSummary, final ICallback<? super CredentialUsageSummary> callback);

    /**
     * Posts a CredentialUsageSummary with a new object
     *
     * @param newCredentialUsageSummary the object to create/update
     * @return the created CredentialUsageSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CredentialUsageSummary put(final CredentialUsageSummary newCredentialUsageSummary) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ICredentialUsageSummaryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ICredentialUsageSummaryRequest expand(final String value);

}

