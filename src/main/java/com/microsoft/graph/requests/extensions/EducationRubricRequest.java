// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationRubric;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Rubric Request.
 */
public class EducationRubricRequest extends BaseRequest implements IEducationRubricRequest {
	
    /**
     * The request for the EducationRubric
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationRubricRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationRubric.class);
    }

    /**
     * Gets the EducationRubric from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<EducationRubric> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EducationRubric from the service
     *
     * @return the EducationRubric from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationRubric get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<EducationRubric> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EducationRubric with a source
     *
     * @param sourceEducationRubric the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EducationRubric sourceEducationRubric, final ICallback<EducationRubric> callback) {
        send(HttpMethod.PATCH, callback, sourceEducationRubric);
    }

    /**
     * Patches this EducationRubric with a source
     *
     * @param sourceEducationRubric the source object with updates
     * @return the updated EducationRubric
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationRubric patch(final EducationRubric sourceEducationRubric) throws ClientException {
        return send(HttpMethod.PATCH, sourceEducationRubric);
    }

    /**
     * Creates a EducationRubric with a new object
     *
     * @param newEducationRubric the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EducationRubric newEducationRubric, final ICallback<EducationRubric> callback) {
        send(HttpMethod.POST, callback, newEducationRubric);
    }

    /**
     * Creates a EducationRubric with a new object
     *
     * @param newEducationRubric the new object to create
     * @return the created EducationRubric
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationRubric post(final EducationRubric newEducationRubric) throws ClientException {
        return send(HttpMethod.POST, newEducationRubric);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEducationRubricRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EducationRubricRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEducationRubricRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EducationRubricRequest)this;
     }

}
