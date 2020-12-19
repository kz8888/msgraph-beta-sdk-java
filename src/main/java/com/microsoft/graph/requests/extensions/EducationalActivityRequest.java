// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationalActivity;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Educational Activity Request.
 */
public class EducationalActivityRequest extends BaseRequest implements IEducationalActivityRequest {
	
    /**
     * The request for the EducationalActivity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationalActivityRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationalActivity.class);
    }

    /**
     * Gets the EducationalActivity from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super EducationalActivity> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EducationalActivity from the service
     *
     * @return the EducationalActivity from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationalActivity get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super EducationalActivity> callback) {
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
     * Patches this EducationalActivity with a source
     *
     * @param sourceEducationalActivity the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EducationalActivity sourceEducationalActivity, final ICallback<? super EducationalActivity> callback) {
        send(HttpMethod.PATCH, callback, sourceEducationalActivity);
    }

    /**
     * Patches this EducationalActivity with a source
     *
     * @param sourceEducationalActivity the source object with updates
     * @return the updated EducationalActivity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationalActivity patch(final EducationalActivity sourceEducationalActivity) throws ClientException {
        return send(HttpMethod.PATCH, sourceEducationalActivity);
    }

    /**
     * Creates a EducationalActivity with a new object
     *
     * @param newEducationalActivity the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EducationalActivity newEducationalActivity, final ICallback<? super EducationalActivity> callback) {
        send(HttpMethod.POST, callback, newEducationalActivity);
    }

    /**
     * Creates a EducationalActivity with a new object
     *
     * @param newEducationalActivity the new object to create
     * @return the created EducationalActivity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationalActivity post(final EducationalActivity newEducationalActivity) throws ClientException {
        return send(HttpMethod.POST, newEducationalActivity);
    }

    /**
     * Creates a EducationalActivity with a new object
     *
     * @param newEducationalActivity the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final EducationalActivity newEducationalActivity, final ICallback<? super EducationalActivity> callback) {
        send(HttpMethod.PUT, callback, newEducationalActivity);
    }

    /**
     * Creates a EducationalActivity with a new object
     *
     * @param newEducationalActivity the object to create/update
     * @return the created EducationalActivity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationalActivity put(final EducationalActivity newEducationalActivity) throws ClientException {
        return send(HttpMethod.PUT, newEducationalActivity);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEducationalActivityRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EducationalActivityRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEducationalActivityRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EducationalActivityRequest)this;
     }

}

