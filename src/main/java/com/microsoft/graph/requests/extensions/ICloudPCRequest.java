// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CloudPC;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Cloud PCRequest.
 */
public interface ICloudPCRequest extends IHttpRequest {

    /**
     * Gets the CloudPC from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super CloudPC> callback);

    /**
     * Gets the CloudPC from the service
     *
     * @return the CloudPC from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CloudPC get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super CloudPC> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this CloudPC with a source
     *
     * @param sourceCloudPC the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final CloudPC sourceCloudPC, final ICallback<? super CloudPC> callback);

    /**
     * Patches this CloudPC with a source
     *
     * @param sourceCloudPC the source object with updates
     * @return the updated CloudPC
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CloudPC patch(final CloudPC sourceCloudPC) throws ClientException;

    /**
     * Posts a CloudPC with a new object
     *
     * @param newCloudPC the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final CloudPC newCloudPC, final ICallback<? super CloudPC> callback);

    /**
     * Posts a CloudPC with a new object
     *
     * @param newCloudPC the new object to create
     * @return the created CloudPC
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CloudPC post(final CloudPC newCloudPC) throws ClientException;

    /**
     * Posts a CloudPC with a new object
     *
     * @param newCloudPC the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final CloudPC newCloudPC, final ICallback<? super CloudPC> callback);

    /**
     * Posts a CloudPC with a new object
     *
     * @param newCloudPC the object to create/update
     * @return the created CloudPC
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CloudPC put(final CloudPC newCloudPC) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ICloudPCRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ICloudPCRequest expand(final String value);

}

