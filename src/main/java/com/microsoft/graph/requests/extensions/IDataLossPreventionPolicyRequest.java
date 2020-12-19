// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DataLossPreventionPolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Data Loss Prevention Policy Request.
 */
public interface IDataLossPreventionPolicyRequest extends IHttpRequest {

    /**
     * Gets the DataLossPreventionPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DataLossPreventionPolicy> callback);

    /**
     * Gets the DataLossPreventionPolicy from the service
     *
     * @return the DataLossPreventionPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DataLossPreventionPolicy get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DataLossPreventionPolicy> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DataLossPreventionPolicy with a source
     *
     * @param sourceDataLossPreventionPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DataLossPreventionPolicy sourceDataLossPreventionPolicy, final ICallback<? super DataLossPreventionPolicy> callback);

    /**
     * Patches this DataLossPreventionPolicy with a source
     *
     * @param sourceDataLossPreventionPolicy the source object with updates
     * @return the updated DataLossPreventionPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DataLossPreventionPolicy patch(final DataLossPreventionPolicy sourceDataLossPreventionPolicy) throws ClientException;

    /**
     * Posts a DataLossPreventionPolicy with a new object
     *
     * @param newDataLossPreventionPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DataLossPreventionPolicy newDataLossPreventionPolicy, final ICallback<? super DataLossPreventionPolicy> callback);

    /**
     * Posts a DataLossPreventionPolicy with a new object
     *
     * @param newDataLossPreventionPolicy the new object to create
     * @return the created DataLossPreventionPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DataLossPreventionPolicy post(final DataLossPreventionPolicy newDataLossPreventionPolicy) throws ClientException;

    /**
     * Posts a DataLossPreventionPolicy with a new object
     *
     * @param newDataLossPreventionPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DataLossPreventionPolicy newDataLossPreventionPolicy, final ICallback<? super DataLossPreventionPolicy> callback);

    /**
     * Posts a DataLossPreventionPolicy with a new object
     *
     * @param newDataLossPreventionPolicy the object to create/update
     * @return the created DataLossPreventionPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DataLossPreventionPolicy put(final DataLossPreventionPolicy newDataLossPreventionPolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDataLossPreventionPolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDataLossPreventionPolicyRequest expand(final String value);

}

