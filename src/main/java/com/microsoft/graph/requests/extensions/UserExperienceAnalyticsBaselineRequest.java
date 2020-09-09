// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsBaseline;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsCategoryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Baseline Request.
 */
public class UserExperienceAnalyticsBaselineRequest extends BaseRequest implements IUserExperienceAnalyticsBaselineRequest {
	
    /**
     * The request for the UserExperienceAnalyticsBaseline
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsBaselineRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsBaseline.class);
    }

    /**
     * Gets the UserExperienceAnalyticsBaseline from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<UserExperienceAnalyticsBaseline> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UserExperienceAnalyticsBaseline from the service
     *
     * @return the UserExperienceAnalyticsBaseline from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsBaseline get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<UserExperienceAnalyticsBaseline> callback) {
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
     * Patches this UserExperienceAnalyticsBaseline with a source
     *
     * @param sourceUserExperienceAnalyticsBaseline the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UserExperienceAnalyticsBaseline sourceUserExperienceAnalyticsBaseline, final ICallback<UserExperienceAnalyticsBaseline> callback) {
        send(HttpMethod.PATCH, callback, sourceUserExperienceAnalyticsBaseline);
    }

    /**
     * Patches this UserExperienceAnalyticsBaseline with a source
     *
     * @param sourceUserExperienceAnalyticsBaseline the source object with updates
     * @return the updated UserExperienceAnalyticsBaseline
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsBaseline patch(final UserExperienceAnalyticsBaseline sourceUserExperienceAnalyticsBaseline) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserExperienceAnalyticsBaseline);
    }

    /**
     * Creates a UserExperienceAnalyticsBaseline with a new object
     *
     * @param newUserExperienceAnalyticsBaseline the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UserExperienceAnalyticsBaseline newUserExperienceAnalyticsBaseline, final ICallback<UserExperienceAnalyticsBaseline> callback) {
        send(HttpMethod.POST, callback, newUserExperienceAnalyticsBaseline);
    }

    /**
     * Creates a UserExperienceAnalyticsBaseline with a new object
     *
     * @param newUserExperienceAnalyticsBaseline the new object to create
     * @return the created UserExperienceAnalyticsBaseline
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsBaseline post(final UserExperienceAnalyticsBaseline newUserExperienceAnalyticsBaseline) throws ClientException {
        return send(HttpMethod.POST, newUserExperienceAnalyticsBaseline);
    }

    /**
     * Creates a UserExperienceAnalyticsBaseline with a new object
     *
     * @param newUserExperienceAnalyticsBaseline the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UserExperienceAnalyticsBaseline newUserExperienceAnalyticsBaseline, final ICallback<UserExperienceAnalyticsBaseline> callback) {
        send(HttpMethod.PUT, callback, newUserExperienceAnalyticsBaseline);
    }

    /**
     * Creates a UserExperienceAnalyticsBaseline with a new object
     *
     * @param newUserExperienceAnalyticsBaseline the object to create/update
     * @return the created UserExperienceAnalyticsBaseline
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsBaseline put(final UserExperienceAnalyticsBaseline newUserExperienceAnalyticsBaseline) throws ClientException {
        return send(HttpMethod.PUT, newUserExperienceAnalyticsBaseline);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUserExperienceAnalyticsBaselineRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UserExperienceAnalyticsBaselineRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUserExperienceAnalyticsBaselineRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UserExperienceAnalyticsBaselineRequest)this;
     }

}

