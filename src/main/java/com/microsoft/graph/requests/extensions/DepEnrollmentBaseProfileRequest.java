// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DepEnrollmentBaseProfile;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Dep Enrollment Base Profile Request.
 */
public class DepEnrollmentBaseProfileRequest extends BaseRequest implements IDepEnrollmentBaseProfileRequest {
	
    /**
     * The request for the DepEnrollmentBaseProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public DepEnrollmentBaseProfileRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends DepEnrollmentBaseProfile> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the DepEnrollmentBaseProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DepEnrollmentBaseProfileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DepEnrollmentBaseProfile.class);
    }

    /**
     * Gets the DepEnrollmentBaseProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DepEnrollmentBaseProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DepEnrollmentBaseProfile from the service
     *
     * @return the DepEnrollmentBaseProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DepEnrollmentBaseProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DepEnrollmentBaseProfile> callback) {
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
     * Patches this DepEnrollmentBaseProfile with a source
     *
     * @param sourceDepEnrollmentBaseProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DepEnrollmentBaseProfile sourceDepEnrollmentBaseProfile, final ICallback<DepEnrollmentBaseProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceDepEnrollmentBaseProfile);
    }

    /**
     * Patches this DepEnrollmentBaseProfile with a source
     *
     * @param sourceDepEnrollmentBaseProfile the source object with updates
     * @return the updated DepEnrollmentBaseProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DepEnrollmentBaseProfile patch(final DepEnrollmentBaseProfile sourceDepEnrollmentBaseProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceDepEnrollmentBaseProfile);
    }

    /**
     * Creates a DepEnrollmentBaseProfile with a new object
     *
     * @param newDepEnrollmentBaseProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DepEnrollmentBaseProfile newDepEnrollmentBaseProfile, final ICallback<DepEnrollmentBaseProfile> callback) {
        send(HttpMethod.POST, callback, newDepEnrollmentBaseProfile);
    }

    /**
     * Creates a DepEnrollmentBaseProfile with a new object
     *
     * @param newDepEnrollmentBaseProfile the new object to create
     * @return the created DepEnrollmentBaseProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DepEnrollmentBaseProfile post(final DepEnrollmentBaseProfile newDepEnrollmentBaseProfile) throws ClientException {
        return send(HttpMethod.POST, newDepEnrollmentBaseProfile);
    }

    /**
     * Creates a DepEnrollmentBaseProfile with a new object
     *
     * @param newDepEnrollmentBaseProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DepEnrollmentBaseProfile newDepEnrollmentBaseProfile, final ICallback<DepEnrollmentBaseProfile> callback) {
        send(HttpMethod.PUT, callback, newDepEnrollmentBaseProfile);
    }

    /**
     * Creates a DepEnrollmentBaseProfile with a new object
     *
     * @param newDepEnrollmentBaseProfile the object to create/update
     * @return the created DepEnrollmentBaseProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DepEnrollmentBaseProfile put(final DepEnrollmentBaseProfile newDepEnrollmentBaseProfile) throws ClientException {
        return send(HttpMethod.PUT, newDepEnrollmentBaseProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDepEnrollmentBaseProfileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DepEnrollmentBaseProfileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDepEnrollmentBaseProfileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DepEnrollmentBaseProfileRequest)this;
     }

}

