// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Office365ActivationCounts;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Office365Activation Counts Request.
 */
public interface IOffice365ActivationCountsRequest extends IHttpRequest {

    /**
     * Gets the Office365ActivationCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Office365ActivationCounts> callback);

    /**
     * Gets the Office365ActivationCounts from the service
     *
     * @return the Office365ActivationCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Office365ActivationCounts get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Office365ActivationCounts> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Office365ActivationCounts with a source
     *
     * @param sourceOffice365ActivationCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Office365ActivationCounts sourceOffice365ActivationCounts, final ICallback<? super Office365ActivationCounts> callback);

    /**
     * Patches this Office365ActivationCounts with a source
     *
     * @param sourceOffice365ActivationCounts the source object with updates
     * @return the updated Office365ActivationCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Office365ActivationCounts patch(final Office365ActivationCounts sourceOffice365ActivationCounts) throws ClientException;

    /**
     * Posts a Office365ActivationCounts with a new object
     *
     * @param newOffice365ActivationCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Office365ActivationCounts newOffice365ActivationCounts, final ICallback<? super Office365ActivationCounts> callback);

    /**
     * Posts a Office365ActivationCounts with a new object
     *
     * @param newOffice365ActivationCounts the new object to create
     * @return the created Office365ActivationCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Office365ActivationCounts post(final Office365ActivationCounts newOffice365ActivationCounts) throws ClientException;

    /**
     * Posts a Office365ActivationCounts with a new object
     *
     * @param newOffice365ActivationCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Office365ActivationCounts newOffice365ActivationCounts, final ICallback<? super Office365ActivationCounts> callback);

    /**
     * Posts a Office365ActivationCounts with a new object
     *
     * @param newOffice365ActivationCounts the object to create/update
     * @return the created Office365ActivationCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Office365ActivationCounts put(final Office365ActivationCounts newOffice365ActivationCounts) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOffice365ActivationCountsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOffice365ActivationCountsRequest expand(final String value);

}

