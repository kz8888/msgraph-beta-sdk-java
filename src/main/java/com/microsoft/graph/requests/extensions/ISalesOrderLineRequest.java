// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SalesOrderLine;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Sales Order Line Request.
 */
public interface ISalesOrderLineRequest extends IHttpRequest {

    /**
     * Gets the SalesOrderLine from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<SalesOrderLine> callback);

    /**
     * Gets the SalesOrderLine from the service
     *
     * @return the SalesOrderLine from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SalesOrderLine get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<SalesOrderLine> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SalesOrderLine with a source
     *
     * @param sourceSalesOrderLine the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SalesOrderLine sourceSalesOrderLine, final ICallback<SalesOrderLine> callback);

    /**
     * Patches this SalesOrderLine with a source
     *
     * @param sourceSalesOrderLine the source object with updates
     * @return the updated SalesOrderLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SalesOrderLine patch(final SalesOrderLine sourceSalesOrderLine) throws ClientException;

    /**
     * Posts a SalesOrderLine with a new object
     *
     * @param newSalesOrderLine the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SalesOrderLine newSalesOrderLine, final ICallback<SalesOrderLine> callback);

    /**
     * Posts a SalesOrderLine with a new object
     *
     * @param newSalesOrderLine the new object to create
     * @return the created SalesOrderLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SalesOrderLine post(final SalesOrderLine newSalesOrderLine) throws ClientException;

    /**
     * Posts a SalesOrderLine with a new object
     *
     * @param newSalesOrderLine the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SalesOrderLine newSalesOrderLine, final ICallback<SalesOrderLine> callback);

    /**
     * Posts a SalesOrderLine with a new object
     *
     * @param newSalesOrderLine the object to create/update
     * @return the created SalesOrderLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SalesOrderLine put(final SalesOrderLine newSalesOrderLine) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISalesOrderLineRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISalesOrderLineRequest expand(final String value);

}

