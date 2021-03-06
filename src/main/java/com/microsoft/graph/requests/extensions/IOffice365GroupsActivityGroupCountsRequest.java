// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Office365GroupsActivityGroupCounts;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Office365Groups Activity Group Counts Request.
 */
public interface IOffice365GroupsActivityGroupCountsRequest extends IHttpRequest {

    /**
     * Gets the Office365GroupsActivityGroupCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Office365GroupsActivityGroupCounts> callback);

    /**
     * Gets the Office365GroupsActivityGroupCounts from the service
     *
     * @return the Office365GroupsActivityGroupCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Office365GroupsActivityGroupCounts get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Office365GroupsActivityGroupCounts> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Office365GroupsActivityGroupCounts with a source
     *
     * @param sourceOffice365GroupsActivityGroupCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Office365GroupsActivityGroupCounts sourceOffice365GroupsActivityGroupCounts, final ICallback<? super Office365GroupsActivityGroupCounts> callback);

    /**
     * Patches this Office365GroupsActivityGroupCounts with a source
     *
     * @param sourceOffice365GroupsActivityGroupCounts the source object with updates
     * @return the updated Office365GroupsActivityGroupCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Office365GroupsActivityGroupCounts patch(final Office365GroupsActivityGroupCounts sourceOffice365GroupsActivityGroupCounts) throws ClientException;

    /**
     * Posts a Office365GroupsActivityGroupCounts with a new object
     *
     * @param newOffice365GroupsActivityGroupCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Office365GroupsActivityGroupCounts newOffice365GroupsActivityGroupCounts, final ICallback<? super Office365GroupsActivityGroupCounts> callback);

    /**
     * Posts a Office365GroupsActivityGroupCounts with a new object
     *
     * @param newOffice365GroupsActivityGroupCounts the new object to create
     * @return the created Office365GroupsActivityGroupCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Office365GroupsActivityGroupCounts post(final Office365GroupsActivityGroupCounts newOffice365GroupsActivityGroupCounts) throws ClientException;

    /**
     * Posts a Office365GroupsActivityGroupCounts with a new object
     *
     * @param newOffice365GroupsActivityGroupCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Office365GroupsActivityGroupCounts newOffice365GroupsActivityGroupCounts, final ICallback<? super Office365GroupsActivityGroupCounts> callback);

    /**
     * Posts a Office365GroupsActivityGroupCounts with a new object
     *
     * @param newOffice365GroupsActivityGroupCounts the object to create/update
     * @return the created Office365GroupsActivityGroupCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Office365GroupsActivityGroupCounts put(final Office365GroupsActivityGroupCounts newOffice365GroupsActivityGroupCounts) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOffice365GroupsActivityGroupCountsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOffice365GroupsActivityGroupCountsRequest expand(final String value);

}

