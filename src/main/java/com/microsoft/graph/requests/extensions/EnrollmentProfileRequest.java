// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EnrollmentProfile;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Enrollment Profile Request.
 */
public class EnrollmentProfileRequest extends BaseRequest implements IEnrollmentProfileRequest {
	
    /**
     * The request for the EnrollmentProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public EnrollmentProfileRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends EnrollmentProfile> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the EnrollmentProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EnrollmentProfileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EnrollmentProfile.class);
    }

    /**
     * Gets the EnrollmentProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super EnrollmentProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EnrollmentProfile from the service
     *
     * @return the EnrollmentProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EnrollmentProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super EnrollmentProfile> callback) {
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
     * Patches this EnrollmentProfile with a source
     *
     * @param sourceEnrollmentProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EnrollmentProfile sourceEnrollmentProfile, final ICallback<? super EnrollmentProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceEnrollmentProfile);
    }

    /**
     * Patches this EnrollmentProfile with a source
     *
     * @param sourceEnrollmentProfile the source object with updates
     * @return the updated EnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EnrollmentProfile patch(final EnrollmentProfile sourceEnrollmentProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceEnrollmentProfile);
    }

    /**
     * Creates a EnrollmentProfile with a new object
     *
     * @param newEnrollmentProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EnrollmentProfile newEnrollmentProfile, final ICallback<? super EnrollmentProfile> callback) {
        send(HttpMethod.POST, callback, newEnrollmentProfile);
    }

    /**
     * Creates a EnrollmentProfile with a new object
     *
     * @param newEnrollmentProfile the new object to create
     * @return the created EnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EnrollmentProfile post(final EnrollmentProfile newEnrollmentProfile) throws ClientException {
        return send(HttpMethod.POST, newEnrollmentProfile);
    }

    /**
     * Creates a EnrollmentProfile with a new object
     *
     * @param newEnrollmentProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final EnrollmentProfile newEnrollmentProfile, final ICallback<? super EnrollmentProfile> callback) {
        send(HttpMethod.PUT, callback, newEnrollmentProfile);
    }

    /**
     * Creates a EnrollmentProfile with a new object
     *
     * @param newEnrollmentProfile the object to create/update
     * @return the created EnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EnrollmentProfile put(final EnrollmentProfile newEnrollmentProfile) throws ClientException {
        return send(HttpMethod.PUT, newEnrollmentProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEnrollmentProfileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EnrollmentProfileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEnrollmentProfileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EnrollmentProfileRequest)this;
     }

}

