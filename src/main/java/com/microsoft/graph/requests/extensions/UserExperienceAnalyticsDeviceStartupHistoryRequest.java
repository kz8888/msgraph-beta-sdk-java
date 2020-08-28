// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDeviceStartupHistory;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Device Startup History Request.
 */
public class UserExperienceAnalyticsDeviceStartupHistoryRequest extends BaseRequest implements IUserExperienceAnalyticsDeviceStartupHistoryRequest {
	
    /**
     * The request for the UserExperienceAnalyticsDeviceStartupHistory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsDeviceStartupHistoryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsDeviceStartupHistory.class);
    }

    /**
     * Gets the UserExperienceAnalyticsDeviceStartupHistory from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<UserExperienceAnalyticsDeviceStartupHistory> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UserExperienceAnalyticsDeviceStartupHistory from the service
     *
     * @return the UserExperienceAnalyticsDeviceStartupHistory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsDeviceStartupHistory get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<UserExperienceAnalyticsDeviceStartupHistory> callback) {
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
     * Patches this UserExperienceAnalyticsDeviceStartupHistory with a source
     *
     * @param sourceUserExperienceAnalyticsDeviceStartupHistory the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UserExperienceAnalyticsDeviceStartupHistory sourceUserExperienceAnalyticsDeviceStartupHistory, final ICallback<UserExperienceAnalyticsDeviceStartupHistory> callback) {
        send(HttpMethod.PATCH, callback, sourceUserExperienceAnalyticsDeviceStartupHistory);
    }

    /**
     * Patches this UserExperienceAnalyticsDeviceStartupHistory with a source
     *
     * @param sourceUserExperienceAnalyticsDeviceStartupHistory the source object with updates
     * @return the updated UserExperienceAnalyticsDeviceStartupHistory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsDeviceStartupHistory patch(final UserExperienceAnalyticsDeviceStartupHistory sourceUserExperienceAnalyticsDeviceStartupHistory) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserExperienceAnalyticsDeviceStartupHistory);
    }

    /**
     * Creates a UserExperienceAnalyticsDeviceStartupHistory with a new object
     *
     * @param newUserExperienceAnalyticsDeviceStartupHistory the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UserExperienceAnalyticsDeviceStartupHistory newUserExperienceAnalyticsDeviceStartupHistory, final ICallback<UserExperienceAnalyticsDeviceStartupHistory> callback) {
        send(HttpMethod.POST, callback, newUserExperienceAnalyticsDeviceStartupHistory);
    }

    /**
     * Creates a UserExperienceAnalyticsDeviceStartupHistory with a new object
     *
     * @param newUserExperienceAnalyticsDeviceStartupHistory the new object to create
     * @return the created UserExperienceAnalyticsDeviceStartupHistory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsDeviceStartupHistory post(final UserExperienceAnalyticsDeviceStartupHistory newUserExperienceAnalyticsDeviceStartupHistory) throws ClientException {
        return send(HttpMethod.POST, newUserExperienceAnalyticsDeviceStartupHistory);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUserExperienceAnalyticsDeviceStartupHistoryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UserExperienceAnalyticsDeviceStartupHistoryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUserExperienceAnalyticsDeviceStartupHistoryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UserExperienceAnalyticsDeviceStartupHistoryRequest)this;
     }

}
