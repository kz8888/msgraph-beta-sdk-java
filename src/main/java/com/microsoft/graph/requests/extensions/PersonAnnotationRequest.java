// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PersonAnnotation;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Annotation Request.
 */
public class PersonAnnotationRequest extends BaseRequest implements IPersonAnnotationRequest {
	
    /**
     * The request for the PersonAnnotation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PersonAnnotationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PersonAnnotation.class);
    }

    /**
     * Gets the PersonAnnotation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PersonAnnotation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PersonAnnotation from the service
     *
     * @return the PersonAnnotation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonAnnotation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PersonAnnotation> callback) {
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
     * Patches this PersonAnnotation with a source
     *
     * @param sourcePersonAnnotation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PersonAnnotation sourcePersonAnnotation, final ICallback<? super PersonAnnotation> callback) {
        send(HttpMethod.PATCH, callback, sourcePersonAnnotation);
    }

    /**
     * Patches this PersonAnnotation with a source
     *
     * @param sourcePersonAnnotation the source object with updates
     * @return the updated PersonAnnotation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonAnnotation patch(final PersonAnnotation sourcePersonAnnotation) throws ClientException {
        return send(HttpMethod.PATCH, sourcePersonAnnotation);
    }

    /**
     * Creates a PersonAnnotation with a new object
     *
     * @param newPersonAnnotation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PersonAnnotation newPersonAnnotation, final ICallback<? super PersonAnnotation> callback) {
        send(HttpMethod.POST, callback, newPersonAnnotation);
    }

    /**
     * Creates a PersonAnnotation with a new object
     *
     * @param newPersonAnnotation the new object to create
     * @return the created PersonAnnotation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonAnnotation post(final PersonAnnotation newPersonAnnotation) throws ClientException {
        return send(HttpMethod.POST, newPersonAnnotation);
    }

    /**
     * Creates a PersonAnnotation with a new object
     *
     * @param newPersonAnnotation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PersonAnnotation newPersonAnnotation, final ICallback<? super PersonAnnotation> callback) {
        send(HttpMethod.PUT, callback, newPersonAnnotation);
    }

    /**
     * Creates a PersonAnnotation with a new object
     *
     * @param newPersonAnnotation the object to create/update
     * @return the created PersonAnnotation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonAnnotation put(final PersonAnnotation newPersonAnnotation) throws ClientException {
        return send(HttpMethod.PUT, newPersonAnnotation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPersonAnnotationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PersonAnnotationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPersonAnnotationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PersonAnnotationRequest)this;
     }

}

