// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SkypeForBusinessActivityUserDetail;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Skype For Business Activity User Detail Request.
 */
public interface ISkypeForBusinessActivityUserDetailRequest extends IHttpRequest {

    /**
     * Gets the SkypeForBusinessActivityUserDetail from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super SkypeForBusinessActivityUserDetail> callback);

    /**
     * Gets the SkypeForBusinessActivityUserDetail from the service
     *
     * @return the SkypeForBusinessActivityUserDetail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessActivityUserDetail get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super SkypeForBusinessActivityUserDetail> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SkypeForBusinessActivityUserDetail with a source
     *
     * @param sourceSkypeForBusinessActivityUserDetail the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SkypeForBusinessActivityUserDetail sourceSkypeForBusinessActivityUserDetail, final ICallback<? super SkypeForBusinessActivityUserDetail> callback);

    /**
     * Patches this SkypeForBusinessActivityUserDetail with a source
     *
     * @param sourceSkypeForBusinessActivityUserDetail the source object with updates
     * @return the updated SkypeForBusinessActivityUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessActivityUserDetail patch(final SkypeForBusinessActivityUserDetail sourceSkypeForBusinessActivityUserDetail) throws ClientException;

    /**
     * Posts a SkypeForBusinessActivityUserDetail with a new object
     *
     * @param newSkypeForBusinessActivityUserDetail the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SkypeForBusinessActivityUserDetail newSkypeForBusinessActivityUserDetail, final ICallback<? super SkypeForBusinessActivityUserDetail> callback);

    /**
     * Posts a SkypeForBusinessActivityUserDetail with a new object
     *
     * @param newSkypeForBusinessActivityUserDetail the new object to create
     * @return the created SkypeForBusinessActivityUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessActivityUserDetail post(final SkypeForBusinessActivityUserDetail newSkypeForBusinessActivityUserDetail) throws ClientException;

    /**
     * Posts a SkypeForBusinessActivityUserDetail with a new object
     *
     * @param newSkypeForBusinessActivityUserDetail the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SkypeForBusinessActivityUserDetail newSkypeForBusinessActivityUserDetail, final ICallback<? super SkypeForBusinessActivityUserDetail> callback);

    /**
     * Posts a SkypeForBusinessActivityUserDetail with a new object
     *
     * @param newSkypeForBusinessActivityUserDetail the object to create/update
     * @return the created SkypeForBusinessActivityUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessActivityUserDetail put(final SkypeForBusinessActivityUserDetail newSkypeForBusinessActivityUserDetail) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISkypeForBusinessActivityUserDetailRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISkypeForBusinessActivityUserDetailRequest expand(final String value);

}

