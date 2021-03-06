// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SalesInvoice;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Sales Invoice Request.
 */
public interface ISalesInvoiceRequest extends IHttpRequest {

    /**
     * Gets the SalesInvoice from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super SalesInvoice> callback);

    /**
     * Gets the SalesInvoice from the service
     *
     * @return the SalesInvoice from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SalesInvoice get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super SalesInvoice> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SalesInvoice with a source
     *
     * @param sourceSalesInvoice the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SalesInvoice sourceSalesInvoice, final ICallback<? super SalesInvoice> callback);

    /**
     * Patches this SalesInvoice with a source
     *
     * @param sourceSalesInvoice the source object with updates
     * @return the updated SalesInvoice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SalesInvoice patch(final SalesInvoice sourceSalesInvoice) throws ClientException;

    /**
     * Posts a SalesInvoice with a new object
     *
     * @param newSalesInvoice the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SalesInvoice newSalesInvoice, final ICallback<? super SalesInvoice> callback);

    /**
     * Posts a SalesInvoice with a new object
     *
     * @param newSalesInvoice the new object to create
     * @return the created SalesInvoice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SalesInvoice post(final SalesInvoice newSalesInvoice) throws ClientException;

    /**
     * Posts a SalesInvoice with a new object
     *
     * @param newSalesInvoice the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SalesInvoice newSalesInvoice, final ICallback<? super SalesInvoice> callback);

    /**
     * Posts a SalesInvoice with a new object
     *
     * @param newSalesInvoice the object to create/update
     * @return the created SalesInvoice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SalesInvoice put(final SalesInvoice newSalesInvoice) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISalesInvoiceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISalesInvoiceRequest expand(final String value);

}

