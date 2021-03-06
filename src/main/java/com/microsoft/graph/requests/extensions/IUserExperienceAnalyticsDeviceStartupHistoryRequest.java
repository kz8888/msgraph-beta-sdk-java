// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDeviceStartupHistory;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics Device Startup History Request.
 */
public interface IUserExperienceAnalyticsDeviceStartupHistoryRequest extends IHttpRequest {

    /**
     * Gets the UserExperienceAnalyticsDeviceStartupHistory from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UserExperienceAnalyticsDeviceStartupHistory> callback);

    /**
     * Gets the UserExperienceAnalyticsDeviceStartupHistory from the service
     *
     * @return the UserExperienceAnalyticsDeviceStartupHistory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsDeviceStartupHistory get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UserExperienceAnalyticsDeviceStartupHistory> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UserExperienceAnalyticsDeviceStartupHistory with a source
     *
     * @param sourceUserExperienceAnalyticsDeviceStartupHistory the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UserExperienceAnalyticsDeviceStartupHistory sourceUserExperienceAnalyticsDeviceStartupHistory, final ICallback<? super UserExperienceAnalyticsDeviceStartupHistory> callback);

    /**
     * Patches this UserExperienceAnalyticsDeviceStartupHistory with a source
     *
     * @param sourceUserExperienceAnalyticsDeviceStartupHistory the source object with updates
     * @return the updated UserExperienceAnalyticsDeviceStartupHistory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsDeviceStartupHistory patch(final UserExperienceAnalyticsDeviceStartupHistory sourceUserExperienceAnalyticsDeviceStartupHistory) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsDeviceStartupHistory with a new object
     *
     * @param newUserExperienceAnalyticsDeviceStartupHistory the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UserExperienceAnalyticsDeviceStartupHistory newUserExperienceAnalyticsDeviceStartupHistory, final ICallback<? super UserExperienceAnalyticsDeviceStartupHistory> callback);

    /**
     * Posts a UserExperienceAnalyticsDeviceStartupHistory with a new object
     *
     * @param newUserExperienceAnalyticsDeviceStartupHistory the new object to create
     * @return the created UserExperienceAnalyticsDeviceStartupHistory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsDeviceStartupHistory post(final UserExperienceAnalyticsDeviceStartupHistory newUserExperienceAnalyticsDeviceStartupHistory) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsDeviceStartupHistory with a new object
     *
     * @param newUserExperienceAnalyticsDeviceStartupHistory the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UserExperienceAnalyticsDeviceStartupHistory newUserExperienceAnalyticsDeviceStartupHistory, final ICallback<? super UserExperienceAnalyticsDeviceStartupHistory> callback);

    /**
     * Posts a UserExperienceAnalyticsDeviceStartupHistory with a new object
     *
     * @param newUserExperienceAnalyticsDeviceStartupHistory the object to create/update
     * @return the created UserExperienceAnalyticsDeviceStartupHistory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsDeviceStartupHistory put(final UserExperienceAnalyticsDeviceStartupHistory newUserExperienceAnalyticsDeviceStartupHistory) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserExperienceAnalyticsDeviceStartupHistoryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserExperienceAnalyticsDeviceStartupHistoryRequest expand(final String value);

}

