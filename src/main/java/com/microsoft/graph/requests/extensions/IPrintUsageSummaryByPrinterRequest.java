// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrintUsageSummaryByPrinter;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Print Usage Summary By Printer Request.
 */
public interface IPrintUsageSummaryByPrinterRequest extends IHttpRequest {

    /**
     * Gets the PrintUsageSummaryByPrinter from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<PrintUsageSummaryByPrinter> callback);

    /**
     * Gets the PrintUsageSummaryByPrinter from the service
     *
     * @return the PrintUsageSummaryByPrinter from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintUsageSummaryByPrinter get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<PrintUsageSummaryByPrinter> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PrintUsageSummaryByPrinter with a source
     *
     * @param sourcePrintUsageSummaryByPrinter the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PrintUsageSummaryByPrinter sourcePrintUsageSummaryByPrinter, final ICallback<PrintUsageSummaryByPrinter> callback);

    /**
     * Patches this PrintUsageSummaryByPrinter with a source
     *
     * @param sourcePrintUsageSummaryByPrinter the source object with updates
     * @return the updated PrintUsageSummaryByPrinter
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintUsageSummaryByPrinter patch(final PrintUsageSummaryByPrinter sourcePrintUsageSummaryByPrinter) throws ClientException;

    /**
     * Posts a PrintUsageSummaryByPrinter with a new object
     *
     * @param newPrintUsageSummaryByPrinter the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PrintUsageSummaryByPrinter newPrintUsageSummaryByPrinter, final ICallback<PrintUsageSummaryByPrinter> callback);

    /**
     * Posts a PrintUsageSummaryByPrinter with a new object
     *
     * @param newPrintUsageSummaryByPrinter the new object to create
     * @return the created PrintUsageSummaryByPrinter
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintUsageSummaryByPrinter post(final PrintUsageSummaryByPrinter newPrintUsageSummaryByPrinter) throws ClientException;

    /**
     * Posts a PrintUsageSummaryByPrinter with a new object
     *
     * @param newPrintUsageSummaryByPrinter the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PrintUsageSummaryByPrinter newPrintUsageSummaryByPrinter, final ICallback<PrintUsageSummaryByPrinter> callback);

    /**
     * Posts a PrintUsageSummaryByPrinter with a new object
     *
     * @param newPrintUsageSummaryByPrinter the object to create/update
     * @return the created PrintUsageSummaryByPrinter
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintUsageSummaryByPrinter put(final PrintUsageSummaryByPrinter newPrintUsageSummaryByPrinter) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPrintUsageSummaryByPrinterRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPrintUsageSummaryByPrinterRequest expand(final String value);

}

