// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Vendor;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Vendor Request.
 */
public interface IVendorRequest extends IHttpRequest {

    /**
     * Gets the Vendor from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Vendor> callback);

    /**
     * Gets the Vendor from the service
     *
     * @return the Vendor from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Vendor get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Vendor> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Vendor with a source
     *
     * @param sourceVendor the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Vendor sourceVendor, final ICallback<? super Vendor> callback);

    /**
     * Patches this Vendor with a source
     *
     * @param sourceVendor the source object with updates
     * @return the updated Vendor
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Vendor patch(final Vendor sourceVendor) throws ClientException;

    /**
     * Posts a Vendor with a new object
     *
     * @param newVendor the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Vendor newVendor, final ICallback<? super Vendor> callback);

    /**
     * Posts a Vendor with a new object
     *
     * @param newVendor the new object to create
     * @return the created Vendor
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Vendor post(final Vendor newVendor) throws ClientException;

    /**
     * Posts a Vendor with a new object
     *
     * @param newVendor the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Vendor newVendor, final ICallback<? super Vendor> callback);

    /**
     * Posts a Vendor with a new object
     *
     * @param newVendor the object to create/update
     * @return the created Vendor
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Vendor put(final Vendor newVendor) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IVendorRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IVendorRequest expand(final String value);

}

