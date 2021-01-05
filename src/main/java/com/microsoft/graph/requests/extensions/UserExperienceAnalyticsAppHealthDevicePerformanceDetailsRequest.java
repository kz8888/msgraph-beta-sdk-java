// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthDevicePerformanceDetails;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics App Health Device Performance Details Request.
 */
public class UserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequest extends BaseRequest implements IUserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequest {
	
    /**
     * The request for the UserExperienceAnalyticsAppHealthDevicePerformanceDetails
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsAppHealthDevicePerformanceDetails.class);
    }

    /**
     * Gets the UserExperienceAnalyticsAppHealthDevicePerformanceDetails from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super UserExperienceAnalyticsAppHealthDevicePerformanceDetails> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UserExperienceAnalyticsAppHealthDevicePerformanceDetails from the service
     *
     * @return the UserExperienceAnalyticsAppHealthDevicePerformanceDetails from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsAppHealthDevicePerformanceDetails get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super UserExperienceAnalyticsAppHealthDevicePerformanceDetails> callback) {
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
     * Patches this UserExperienceAnalyticsAppHealthDevicePerformanceDetails with a source
     *
     * @param sourceUserExperienceAnalyticsAppHealthDevicePerformanceDetails the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UserExperienceAnalyticsAppHealthDevicePerformanceDetails sourceUserExperienceAnalyticsAppHealthDevicePerformanceDetails, final ICallback<? super UserExperienceAnalyticsAppHealthDevicePerformanceDetails> callback) {
        send(HttpMethod.PATCH, callback, sourceUserExperienceAnalyticsAppHealthDevicePerformanceDetails);
    }

    /**
     * Patches this UserExperienceAnalyticsAppHealthDevicePerformanceDetails with a source
     *
     * @param sourceUserExperienceAnalyticsAppHealthDevicePerformanceDetails the source object with updates
     * @return the updated UserExperienceAnalyticsAppHealthDevicePerformanceDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsAppHealthDevicePerformanceDetails patch(final UserExperienceAnalyticsAppHealthDevicePerformanceDetails sourceUserExperienceAnalyticsAppHealthDevicePerformanceDetails) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserExperienceAnalyticsAppHealthDevicePerformanceDetails);
    }

    /**
     * Creates a UserExperienceAnalyticsAppHealthDevicePerformanceDetails with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDevicePerformanceDetails the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UserExperienceAnalyticsAppHealthDevicePerformanceDetails newUserExperienceAnalyticsAppHealthDevicePerformanceDetails, final ICallback<? super UserExperienceAnalyticsAppHealthDevicePerformanceDetails> callback) {
        send(HttpMethod.POST, callback, newUserExperienceAnalyticsAppHealthDevicePerformanceDetails);
    }

    /**
     * Creates a UserExperienceAnalyticsAppHealthDevicePerformanceDetails with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDevicePerformanceDetails the new object to create
     * @return the created UserExperienceAnalyticsAppHealthDevicePerformanceDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsAppHealthDevicePerformanceDetails post(final UserExperienceAnalyticsAppHealthDevicePerformanceDetails newUserExperienceAnalyticsAppHealthDevicePerformanceDetails) throws ClientException {
        return send(HttpMethod.POST, newUserExperienceAnalyticsAppHealthDevicePerformanceDetails);
    }

    /**
     * Creates a UserExperienceAnalyticsAppHealthDevicePerformanceDetails with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDevicePerformanceDetails the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UserExperienceAnalyticsAppHealthDevicePerformanceDetails newUserExperienceAnalyticsAppHealthDevicePerformanceDetails, final ICallback<? super UserExperienceAnalyticsAppHealthDevicePerformanceDetails> callback) {
        send(HttpMethod.PUT, callback, newUserExperienceAnalyticsAppHealthDevicePerformanceDetails);
    }

    /**
     * Creates a UserExperienceAnalyticsAppHealthDevicePerformanceDetails with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDevicePerformanceDetails the object to create/update
     * @return the created UserExperienceAnalyticsAppHealthDevicePerformanceDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsAppHealthDevicePerformanceDetails put(final UserExperienceAnalyticsAppHealthDevicePerformanceDetails newUserExperienceAnalyticsAppHealthDevicePerformanceDetails) throws ClientException {
        return send(HttpMethod.PUT, newUserExperienceAnalyticsAppHealthDevicePerformanceDetails);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequest)this;
     }

}

