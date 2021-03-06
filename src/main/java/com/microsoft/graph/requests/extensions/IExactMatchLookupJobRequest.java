// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ExactMatchLookupJob;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Exact Match Lookup Job Request.
 */
public interface IExactMatchLookupJobRequest extends IHttpRequest {

    /**
     * Gets the ExactMatchLookupJob from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ExactMatchLookupJob> callback);

    /**
     * Gets the ExactMatchLookupJob from the service
     *
     * @return the ExactMatchLookupJob from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExactMatchLookupJob get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ExactMatchLookupJob> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ExactMatchLookupJob with a source
     *
     * @param sourceExactMatchLookupJob the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ExactMatchLookupJob sourceExactMatchLookupJob, final ICallback<? super ExactMatchLookupJob> callback);

    /**
     * Patches this ExactMatchLookupJob with a source
     *
     * @param sourceExactMatchLookupJob the source object with updates
     * @return the updated ExactMatchLookupJob
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExactMatchLookupJob patch(final ExactMatchLookupJob sourceExactMatchLookupJob) throws ClientException;

    /**
     * Posts a ExactMatchLookupJob with a new object
     *
     * @param newExactMatchLookupJob the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ExactMatchLookupJob newExactMatchLookupJob, final ICallback<? super ExactMatchLookupJob> callback);

    /**
     * Posts a ExactMatchLookupJob with a new object
     *
     * @param newExactMatchLookupJob the new object to create
     * @return the created ExactMatchLookupJob
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExactMatchLookupJob post(final ExactMatchLookupJob newExactMatchLookupJob) throws ClientException;

    /**
     * Posts a ExactMatchLookupJob with a new object
     *
     * @param newExactMatchLookupJob the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ExactMatchLookupJob newExactMatchLookupJob, final ICallback<? super ExactMatchLookupJob> callback);

    /**
     * Posts a ExactMatchLookupJob with a new object
     *
     * @param newExactMatchLookupJob the object to create/update
     * @return the created ExactMatchLookupJob
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExactMatchLookupJob put(final ExactMatchLookupJob newExactMatchLookupJob) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IExactMatchLookupJobRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IExactMatchLookupJobRequest expand(final String value);

}

