// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrinterBase;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Printer Base Request.
 */
public interface IPrinterBaseRequest extends IHttpRequest {

    /**
     * Gets the PrinterBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<PrinterBase> callback);

    /**
     * Gets the PrinterBase from the service
     *
     * @return the PrinterBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrinterBase get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<PrinterBase> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PrinterBase with a source
     *
     * @param sourcePrinterBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PrinterBase sourcePrinterBase, final ICallback<PrinterBase> callback);

    /**
     * Patches this PrinterBase with a source
     *
     * @param sourcePrinterBase the source object with updates
     * @return the updated PrinterBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrinterBase patch(final PrinterBase sourcePrinterBase) throws ClientException;

    /**
     * Posts a PrinterBase with a new object
     *
     * @param newPrinterBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PrinterBase newPrinterBase, final ICallback<PrinterBase> callback);

    /**
     * Posts a PrinterBase with a new object
     *
     * @param newPrinterBase the new object to create
     * @return the created PrinterBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrinterBase post(final PrinterBase newPrinterBase) throws ClientException;

    /**
     * Posts a PrinterBase with a new object
     *
     * @param newPrinterBase the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PrinterBase newPrinterBase, final ICallback<PrinterBase> callback);

    /**
     * Posts a PrinterBase with a new object
     *
     * @param newPrinterBase the object to create/update
     * @return the created PrinterBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrinterBase put(final PrinterBase newPrinterBase) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPrinterBaseRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPrinterBaseRequest expand(final String value);

}

