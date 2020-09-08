// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EducationCategory;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education Category Request.
 */
public interface IEducationCategoryRequest extends IHttpRequest {

    /**
     * Gets the EducationCategory from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<EducationCategory> callback);

    /**
     * Gets the EducationCategory from the service
     *
     * @return the EducationCategory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationCategory get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<EducationCategory> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EducationCategory with a source
     *
     * @param sourceEducationCategory the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EducationCategory sourceEducationCategory, final ICallback<EducationCategory> callback);

    /**
     * Patches this EducationCategory with a source
     *
     * @param sourceEducationCategory the source object with updates
     * @return the updated EducationCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationCategory patch(final EducationCategory sourceEducationCategory) throws ClientException;

    /**
     * Posts a EducationCategory with a new object
     *
     * @param newEducationCategory the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EducationCategory newEducationCategory, final ICallback<EducationCategory> callback);

    /**
     * Posts a EducationCategory with a new object
     *
     * @param newEducationCategory the new object to create
     * @return the created EducationCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationCategory post(final EducationCategory newEducationCategory) throws ClientException;

    /**
     * Posts a EducationCategory with a new object
     *
     * @param newEducationCategory the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final EducationCategory newEducationCategory, final ICallback<EducationCategory> callback);

    /**
     * Posts a EducationCategory with a new object
     *
     * @param newEducationCategory the object to create/update
     * @return the created EducationCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationCategory put(final EducationCategory newEducationCategory) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEducationCategoryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEducationCategoryRequest expand(final String value);

}

