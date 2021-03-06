// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrintTaskDefinition;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Print Task Definition Request.
 */
public interface IPrintTaskDefinitionRequest extends IHttpRequest {

    /**
     * Gets the PrintTaskDefinition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super PrintTaskDefinition> callback);

    /**
     * Gets the PrintTaskDefinition from the service
     *
     * @return the PrintTaskDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintTaskDefinition get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super PrintTaskDefinition> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PrintTaskDefinition with a source
     *
     * @param sourcePrintTaskDefinition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PrintTaskDefinition sourcePrintTaskDefinition, final ICallback<? super PrintTaskDefinition> callback);

    /**
     * Patches this PrintTaskDefinition with a source
     *
     * @param sourcePrintTaskDefinition the source object with updates
     * @return the updated PrintTaskDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintTaskDefinition patch(final PrintTaskDefinition sourcePrintTaskDefinition) throws ClientException;

    /**
     * Posts a PrintTaskDefinition with a new object
     *
     * @param newPrintTaskDefinition the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PrintTaskDefinition newPrintTaskDefinition, final ICallback<? super PrintTaskDefinition> callback);

    /**
     * Posts a PrintTaskDefinition with a new object
     *
     * @param newPrintTaskDefinition the new object to create
     * @return the created PrintTaskDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintTaskDefinition post(final PrintTaskDefinition newPrintTaskDefinition) throws ClientException;

    /**
     * Posts a PrintTaskDefinition with a new object
     *
     * @param newPrintTaskDefinition the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PrintTaskDefinition newPrintTaskDefinition, final ICallback<? super PrintTaskDefinition> callback);

    /**
     * Posts a PrintTaskDefinition with a new object
     *
     * @param newPrintTaskDefinition the object to create/update
     * @return the created PrintTaskDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintTaskDefinition put(final PrintTaskDefinition newPrintTaskDefinition) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPrintTaskDefinitionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPrintTaskDefinitionRequest expand(final String value);

}

