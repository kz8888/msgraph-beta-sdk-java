// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookPivotTable;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Pivot Table Request.
 */
public interface IWorkbookPivotTableRequest extends IHttpRequest {

    /**
     * Gets the WorkbookPivotTable from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WorkbookPivotTable> callback);

    /**
     * Gets the WorkbookPivotTable from the service
     *
     * @return the WorkbookPivotTable from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookPivotTable get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WorkbookPivotTable> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookPivotTable with a source
     *
     * @param sourceWorkbookPivotTable the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookPivotTable sourceWorkbookPivotTable, final ICallback<? super WorkbookPivotTable> callback);

    /**
     * Patches this WorkbookPivotTable with a source
     *
     * @param sourceWorkbookPivotTable the source object with updates
     * @return the updated WorkbookPivotTable
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookPivotTable patch(final WorkbookPivotTable sourceWorkbookPivotTable) throws ClientException;

    /**
     * Posts a WorkbookPivotTable with a new object
     *
     * @param newWorkbookPivotTable the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookPivotTable newWorkbookPivotTable, final ICallback<? super WorkbookPivotTable> callback);

    /**
     * Posts a WorkbookPivotTable with a new object
     *
     * @param newWorkbookPivotTable the new object to create
     * @return the created WorkbookPivotTable
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookPivotTable post(final WorkbookPivotTable newWorkbookPivotTable) throws ClientException;

    /**
     * Posts a WorkbookPivotTable with a new object
     *
     * @param newWorkbookPivotTable the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WorkbookPivotTable newWorkbookPivotTable, final ICallback<? super WorkbookPivotTable> callback);

    /**
     * Posts a WorkbookPivotTable with a new object
     *
     * @param newWorkbookPivotTable the object to create/update
     * @return the created WorkbookPivotTable
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookPivotTable put(final WorkbookPivotTable newWorkbookPivotTable) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookPivotTableRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookPivotTableRequest expand(final String value);

}

