// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EducationRubricOutcome;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education Rubric Outcome Request.
 */
public interface IEducationRubricOutcomeRequest extends IHttpRequest {

    /**
     * Gets the EducationRubricOutcome from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super EducationRubricOutcome> callback);

    /**
     * Gets the EducationRubricOutcome from the service
     *
     * @return the EducationRubricOutcome from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationRubricOutcome get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super EducationRubricOutcome> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EducationRubricOutcome with a source
     *
     * @param sourceEducationRubricOutcome the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EducationRubricOutcome sourceEducationRubricOutcome, final ICallback<? super EducationRubricOutcome> callback);

    /**
     * Patches this EducationRubricOutcome with a source
     *
     * @param sourceEducationRubricOutcome the source object with updates
     * @return the updated EducationRubricOutcome
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationRubricOutcome patch(final EducationRubricOutcome sourceEducationRubricOutcome) throws ClientException;

    /**
     * Posts a EducationRubricOutcome with a new object
     *
     * @param newEducationRubricOutcome the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EducationRubricOutcome newEducationRubricOutcome, final ICallback<? super EducationRubricOutcome> callback);

    /**
     * Posts a EducationRubricOutcome with a new object
     *
     * @param newEducationRubricOutcome the new object to create
     * @return the created EducationRubricOutcome
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationRubricOutcome post(final EducationRubricOutcome newEducationRubricOutcome) throws ClientException;

    /**
     * Posts a EducationRubricOutcome with a new object
     *
     * @param newEducationRubricOutcome the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final EducationRubricOutcome newEducationRubricOutcome, final ICallback<? super EducationRubricOutcome> callback);

    /**
     * Posts a EducationRubricOutcome with a new object
     *
     * @param newEducationRubricOutcome the object to create/update
     * @return the created EducationRubricOutcome
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationRubricOutcome put(final EducationRubricOutcome newEducationRubricOutcome) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEducationRubricOutcomeRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEducationRubricOutcomeRequest expand(final String value);

}

