// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PersonResponsibility;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Person Responsibility Request.
 */
public interface IPersonResponsibilityRequest extends IHttpRequest {

    /**
     * Gets the PersonResponsibility from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super PersonResponsibility> callback);

    /**
     * Gets the PersonResponsibility from the service
     *
     * @return the PersonResponsibility from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PersonResponsibility get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super PersonResponsibility> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PersonResponsibility with a source
     *
     * @param sourcePersonResponsibility the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PersonResponsibility sourcePersonResponsibility, final ICallback<? super PersonResponsibility> callback);

    /**
     * Patches this PersonResponsibility with a source
     *
     * @param sourcePersonResponsibility the source object with updates
     * @return the updated PersonResponsibility
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PersonResponsibility patch(final PersonResponsibility sourcePersonResponsibility) throws ClientException;

    /**
     * Posts a PersonResponsibility with a new object
     *
     * @param newPersonResponsibility the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PersonResponsibility newPersonResponsibility, final ICallback<? super PersonResponsibility> callback);

    /**
     * Posts a PersonResponsibility with a new object
     *
     * @param newPersonResponsibility the new object to create
     * @return the created PersonResponsibility
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PersonResponsibility post(final PersonResponsibility newPersonResponsibility) throws ClientException;

    /**
     * Posts a PersonResponsibility with a new object
     *
     * @param newPersonResponsibility the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PersonResponsibility newPersonResponsibility, final ICallback<? super PersonResponsibility> callback);

    /**
     * Posts a PersonResponsibility with a new object
     *
     * @param newPersonResponsibility the object to create/update
     * @return the created PersonResponsibility
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PersonResponsibility put(final PersonResponsibility newPersonResponsibility) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPersonResponsibilityRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPersonResponsibilityRequest expand(final String value);

}

