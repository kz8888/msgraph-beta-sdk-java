// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsMetricHistory;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsMetricRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsMetricRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Metric History Request.
 */
public class UserExperienceAnalyticsMetricHistoryRequest extends BaseRequest implements IUserExperienceAnalyticsMetricHistoryRequest {
	
    /**
     * The request for the UserExperienceAnalyticsMetricHistory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsMetricHistoryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsMetricHistory.class);
    }

    /**
     * Gets the UserExperienceAnalyticsMetricHistory from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super UserExperienceAnalyticsMetricHistory> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UserExperienceAnalyticsMetricHistory from the service
     *
     * @return the UserExperienceAnalyticsMetricHistory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsMetricHistory get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super UserExperienceAnalyticsMetricHistory> callback) {
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
     * Patches this UserExperienceAnalyticsMetricHistory with a source
     *
     * @param sourceUserExperienceAnalyticsMetricHistory the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UserExperienceAnalyticsMetricHistory sourceUserExperienceAnalyticsMetricHistory, final ICallback<? super UserExperienceAnalyticsMetricHistory> callback) {
        send(HttpMethod.PATCH, callback, sourceUserExperienceAnalyticsMetricHistory);
    }

    /**
     * Patches this UserExperienceAnalyticsMetricHistory with a source
     *
     * @param sourceUserExperienceAnalyticsMetricHistory the source object with updates
     * @return the updated UserExperienceAnalyticsMetricHistory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsMetricHistory patch(final UserExperienceAnalyticsMetricHistory sourceUserExperienceAnalyticsMetricHistory) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserExperienceAnalyticsMetricHistory);
    }

    /**
     * Creates a UserExperienceAnalyticsMetricHistory with a new object
     *
     * @param newUserExperienceAnalyticsMetricHistory the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UserExperienceAnalyticsMetricHistory newUserExperienceAnalyticsMetricHistory, final ICallback<? super UserExperienceAnalyticsMetricHistory> callback) {
        send(HttpMethod.POST, callback, newUserExperienceAnalyticsMetricHistory);
    }

    /**
     * Creates a UserExperienceAnalyticsMetricHistory with a new object
     *
     * @param newUserExperienceAnalyticsMetricHistory the new object to create
     * @return the created UserExperienceAnalyticsMetricHistory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsMetricHistory post(final UserExperienceAnalyticsMetricHistory newUserExperienceAnalyticsMetricHistory) throws ClientException {
        return send(HttpMethod.POST, newUserExperienceAnalyticsMetricHistory);
    }

    /**
     * Creates a UserExperienceAnalyticsMetricHistory with a new object
     *
     * @param newUserExperienceAnalyticsMetricHistory the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UserExperienceAnalyticsMetricHistory newUserExperienceAnalyticsMetricHistory, final ICallback<? super UserExperienceAnalyticsMetricHistory> callback) {
        send(HttpMethod.PUT, callback, newUserExperienceAnalyticsMetricHistory);
    }

    /**
     * Creates a UserExperienceAnalyticsMetricHistory with a new object
     *
     * @param newUserExperienceAnalyticsMetricHistory the object to create/update
     * @return the created UserExperienceAnalyticsMetricHistory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsMetricHistory put(final UserExperienceAnalyticsMetricHistory newUserExperienceAnalyticsMetricHistory) throws ClientException {
        return send(HttpMethod.PUT, newUserExperienceAnalyticsMetricHistory);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUserExperienceAnalyticsMetricHistoryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UserExperienceAnalyticsMetricHistoryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUserExperienceAnalyticsMetricHistoryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UserExperienceAnalyticsMetricHistoryRequest)this;
     }

}

