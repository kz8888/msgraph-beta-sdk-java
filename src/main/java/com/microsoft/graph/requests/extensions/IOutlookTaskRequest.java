// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OutlookTask;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Outlook Task Request.
 */
public interface IOutlookTaskRequest extends IHttpRequest {

    /**
     * Gets the OutlookTask from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<OutlookTask> callback);

    /**
     * Gets the OutlookTask from the service
     *
     * @return the OutlookTask from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OutlookTask get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<OutlookTask> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OutlookTask with a source
     *
     * @param sourceOutlookTask the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OutlookTask sourceOutlookTask, final ICallback<OutlookTask> callback);

    /**
     * Patches this OutlookTask with a source
     *
     * @param sourceOutlookTask the source object with updates
     * @return the updated OutlookTask
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OutlookTask patch(final OutlookTask sourceOutlookTask) throws ClientException;

    /**
     * Posts a OutlookTask with a new object
     *
     * @param newOutlookTask the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final OutlookTask newOutlookTask, final ICallback<OutlookTask> callback);

    /**
     * Posts a OutlookTask with a new object
     *
     * @param newOutlookTask the new object to create
     * @return the created OutlookTask
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OutlookTask post(final OutlookTask newOutlookTask) throws ClientException;

    /**
     * Posts a OutlookTask with a new object
     *
     * @param newOutlookTask the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final OutlookTask newOutlookTask, final ICallback<OutlookTask> callback);

    /**
     * Posts a OutlookTask with a new object
     *
     * @param newOutlookTask the object to create/update
     * @return the created OutlookTask
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OutlookTask put(final OutlookTask newOutlookTask) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOutlookTaskRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOutlookTaskRequest expand(final String value);

}

