// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ClassificationJobResponse;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Classification Job Response Request.
 */
public class ClassificationJobResponseRequest extends BaseRequest implements IClassificationJobResponseRequest {
	
    /**
     * The request for the ClassificationJobResponse
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ClassificationJobResponseRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ClassificationJobResponse.class);
    }

    /**
     * Gets the ClassificationJobResponse from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ClassificationJobResponse> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ClassificationJobResponse from the service
     *
     * @return the ClassificationJobResponse from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ClassificationJobResponse get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ClassificationJobResponse> callback) {
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
     * Patches this ClassificationJobResponse with a source
     *
     * @param sourceClassificationJobResponse the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ClassificationJobResponse sourceClassificationJobResponse, final ICallback<? super ClassificationJobResponse> callback) {
        send(HttpMethod.PATCH, callback, sourceClassificationJobResponse);
    }

    /**
     * Patches this ClassificationJobResponse with a source
     *
     * @param sourceClassificationJobResponse the source object with updates
     * @return the updated ClassificationJobResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ClassificationJobResponse patch(final ClassificationJobResponse sourceClassificationJobResponse) throws ClientException {
        return send(HttpMethod.PATCH, sourceClassificationJobResponse);
    }

    /**
     * Creates a ClassificationJobResponse with a new object
     *
     * @param newClassificationJobResponse the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ClassificationJobResponse newClassificationJobResponse, final ICallback<? super ClassificationJobResponse> callback) {
        send(HttpMethod.POST, callback, newClassificationJobResponse);
    }

    /**
     * Creates a ClassificationJobResponse with a new object
     *
     * @param newClassificationJobResponse the new object to create
     * @return the created ClassificationJobResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ClassificationJobResponse post(final ClassificationJobResponse newClassificationJobResponse) throws ClientException {
        return send(HttpMethod.POST, newClassificationJobResponse);
    }

    /**
     * Creates a ClassificationJobResponse with a new object
     *
     * @param newClassificationJobResponse the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ClassificationJobResponse newClassificationJobResponse, final ICallback<? super ClassificationJobResponse> callback) {
        send(HttpMethod.PUT, callback, newClassificationJobResponse);
    }

    /**
     * Creates a ClassificationJobResponse with a new object
     *
     * @param newClassificationJobResponse the object to create/update
     * @return the created ClassificationJobResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ClassificationJobResponse put(final ClassificationJobResponse newClassificationJobResponse) throws ClientException {
        return send(HttpMethod.PUT, newClassificationJobResponse);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IClassificationJobResponseRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ClassificationJobResponseRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IClassificationJobResponseRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ClassificationJobResponseRequest)this;
     }

}

