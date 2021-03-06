// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrintTask;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Print Task Request.
 */
public interface IPrintTaskRequest extends IHttpRequest {

    /**
     * Gets the PrintTask from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super PrintTask> callback);

    /**
     * Gets the PrintTask from the service
     *
     * @return the PrintTask from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintTask get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super PrintTask> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PrintTask with a source
     *
     * @param sourcePrintTask the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PrintTask sourcePrintTask, final ICallback<? super PrintTask> callback);

    /**
     * Patches this PrintTask with a source
     *
     * @param sourcePrintTask the source object with updates
     * @return the updated PrintTask
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintTask patch(final PrintTask sourcePrintTask) throws ClientException;

    /**
     * Posts a PrintTask with a new object
     *
     * @param newPrintTask the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PrintTask newPrintTask, final ICallback<? super PrintTask> callback);

    /**
     * Posts a PrintTask with a new object
     *
     * @param newPrintTask the new object to create
     * @return the created PrintTask
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintTask post(final PrintTask newPrintTask) throws ClientException;

    /**
     * Posts a PrintTask with a new object
     *
     * @param newPrintTask the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PrintTask newPrintTask, final ICallback<? super PrintTask> callback);

    /**
     * Posts a PrintTask with a new object
     *
     * @param newPrintTask the object to create/update
     * @return the created PrintTask
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintTask put(final PrintTask newPrintTask) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPrintTaskRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPrintTaskRequest expand(final String value);

}

