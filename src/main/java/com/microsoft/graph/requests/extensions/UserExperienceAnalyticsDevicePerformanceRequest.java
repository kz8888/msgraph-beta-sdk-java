// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDevicePerformance;
import com.microsoft.graph.models.generated.UserExperienceAnalyticsSummarizedBy;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Device Performance Request.
 */
public class UserExperienceAnalyticsDevicePerformanceRequest extends BaseRequest implements IUserExperienceAnalyticsDevicePerformanceRequest {
	
    /**
     * The request for the UserExperienceAnalyticsDevicePerformance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsDevicePerformanceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsDevicePerformance.class);
    }

    /**
     * Gets the UserExperienceAnalyticsDevicePerformance from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super UserExperienceAnalyticsDevicePerformance> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UserExperienceAnalyticsDevicePerformance from the service
     *
     * @return the UserExperienceAnalyticsDevicePerformance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsDevicePerformance get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super UserExperienceAnalyticsDevicePerformance> callback) {
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
     * Patches this UserExperienceAnalyticsDevicePerformance with a source
     *
     * @param sourceUserExperienceAnalyticsDevicePerformance the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UserExperienceAnalyticsDevicePerformance sourceUserExperienceAnalyticsDevicePerformance, final ICallback<? super UserExperienceAnalyticsDevicePerformance> callback) {
        send(HttpMethod.PATCH, callback, sourceUserExperienceAnalyticsDevicePerformance);
    }

    /**
     * Patches this UserExperienceAnalyticsDevicePerformance with a source
     *
     * @param sourceUserExperienceAnalyticsDevicePerformance the source object with updates
     * @return the updated UserExperienceAnalyticsDevicePerformance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsDevicePerformance patch(final UserExperienceAnalyticsDevicePerformance sourceUserExperienceAnalyticsDevicePerformance) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserExperienceAnalyticsDevicePerformance);
    }

    /**
     * Creates a UserExperienceAnalyticsDevicePerformance with a new object
     *
     * @param newUserExperienceAnalyticsDevicePerformance the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UserExperienceAnalyticsDevicePerformance newUserExperienceAnalyticsDevicePerformance, final ICallback<? super UserExperienceAnalyticsDevicePerformance> callback) {
        send(HttpMethod.POST, callback, newUserExperienceAnalyticsDevicePerformance);
    }

    /**
     * Creates a UserExperienceAnalyticsDevicePerformance with a new object
     *
     * @param newUserExperienceAnalyticsDevicePerformance the new object to create
     * @return the created UserExperienceAnalyticsDevicePerformance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsDevicePerformance post(final UserExperienceAnalyticsDevicePerformance newUserExperienceAnalyticsDevicePerformance) throws ClientException {
        return send(HttpMethod.POST, newUserExperienceAnalyticsDevicePerformance);
    }

    /**
     * Creates a UserExperienceAnalyticsDevicePerformance with a new object
     *
     * @param newUserExperienceAnalyticsDevicePerformance the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UserExperienceAnalyticsDevicePerformance newUserExperienceAnalyticsDevicePerformance, final ICallback<? super UserExperienceAnalyticsDevicePerformance> callback) {
        send(HttpMethod.PUT, callback, newUserExperienceAnalyticsDevicePerformance);
    }

    /**
     * Creates a UserExperienceAnalyticsDevicePerformance with a new object
     *
     * @param newUserExperienceAnalyticsDevicePerformance the object to create/update
     * @return the created UserExperienceAnalyticsDevicePerformance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsDevicePerformance put(final UserExperienceAnalyticsDevicePerformance newUserExperienceAnalyticsDevicePerformance) throws ClientException {
        return send(HttpMethod.PUT, newUserExperienceAnalyticsDevicePerformance);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUserExperienceAnalyticsDevicePerformanceRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UserExperienceAnalyticsDevicePerformanceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUserExperienceAnalyticsDevicePerformanceRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UserExperienceAnalyticsDevicePerformanceRequest)this;
     }

}

