// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CallActivityStatistics;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Call Activity Statistics Request.
 */
public interface ICallActivityStatisticsRequest extends IHttpRequest {

    /**
     * Gets the CallActivityStatistics from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super CallActivityStatistics> callback);

    /**
     * Gets the CallActivityStatistics from the service
     *
     * @return the CallActivityStatistics from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CallActivityStatistics get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super CallActivityStatistics> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this CallActivityStatistics with a source
     *
     * @param sourceCallActivityStatistics the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final CallActivityStatistics sourceCallActivityStatistics, final ICallback<? super CallActivityStatistics> callback);

    /**
     * Patches this CallActivityStatistics with a source
     *
     * @param sourceCallActivityStatistics the source object with updates
     * @return the updated CallActivityStatistics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CallActivityStatistics patch(final CallActivityStatistics sourceCallActivityStatistics) throws ClientException;

    /**
     * Posts a CallActivityStatistics with a new object
     *
     * @param newCallActivityStatistics the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final CallActivityStatistics newCallActivityStatistics, final ICallback<? super CallActivityStatistics> callback);

    /**
     * Posts a CallActivityStatistics with a new object
     *
     * @param newCallActivityStatistics the new object to create
     * @return the created CallActivityStatistics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CallActivityStatistics post(final CallActivityStatistics newCallActivityStatistics) throws ClientException;

    /**
     * Posts a CallActivityStatistics with a new object
     *
     * @param newCallActivityStatistics the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final CallActivityStatistics newCallActivityStatistics, final ICallback<? super CallActivityStatistics> callback);

    /**
     * Posts a CallActivityStatistics with a new object
     *
     * @param newCallActivityStatistics the object to create/update
     * @return the created CallActivityStatistics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CallActivityStatistics put(final CallActivityStatistics newCallActivityStatistics) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ICallActivityStatisticsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ICallActivityStatisticsRequest expand(final String value);

}

