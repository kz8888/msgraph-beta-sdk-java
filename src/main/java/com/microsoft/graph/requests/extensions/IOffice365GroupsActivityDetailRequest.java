// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Office365GroupsActivityDetail;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Office365Groups Activity Detail Request.
 */
public interface IOffice365GroupsActivityDetailRequest extends IHttpRequest {

    /**
     * Gets the Office365GroupsActivityDetail from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Office365GroupsActivityDetail> callback);

    /**
     * Gets the Office365GroupsActivityDetail from the service
     *
     * @return the Office365GroupsActivityDetail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Office365GroupsActivityDetail get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Office365GroupsActivityDetail> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Office365GroupsActivityDetail with a source
     *
     * @param sourceOffice365GroupsActivityDetail the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Office365GroupsActivityDetail sourceOffice365GroupsActivityDetail, final ICallback<? super Office365GroupsActivityDetail> callback);

    /**
     * Patches this Office365GroupsActivityDetail with a source
     *
     * @param sourceOffice365GroupsActivityDetail the source object with updates
     * @return the updated Office365GroupsActivityDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Office365GroupsActivityDetail patch(final Office365GroupsActivityDetail sourceOffice365GroupsActivityDetail) throws ClientException;

    /**
     * Posts a Office365GroupsActivityDetail with a new object
     *
     * @param newOffice365GroupsActivityDetail the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Office365GroupsActivityDetail newOffice365GroupsActivityDetail, final ICallback<? super Office365GroupsActivityDetail> callback);

    /**
     * Posts a Office365GroupsActivityDetail with a new object
     *
     * @param newOffice365GroupsActivityDetail the new object to create
     * @return the created Office365GroupsActivityDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Office365GroupsActivityDetail post(final Office365GroupsActivityDetail newOffice365GroupsActivityDetail) throws ClientException;

    /**
     * Posts a Office365GroupsActivityDetail with a new object
     *
     * @param newOffice365GroupsActivityDetail the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Office365GroupsActivityDetail newOffice365GroupsActivityDetail, final ICallback<? super Office365GroupsActivityDetail> callback);

    /**
     * Posts a Office365GroupsActivityDetail with a new object
     *
     * @param newOffice365GroupsActivityDetail the object to create/update
     * @return the created Office365GroupsActivityDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Office365GroupsActivityDetail put(final Office365GroupsActivityDetail newOffice365GroupsActivityDetail) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOffice365GroupsActivityDetailRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOffice365GroupsActivityDetailRequest expand(final String value);

}

