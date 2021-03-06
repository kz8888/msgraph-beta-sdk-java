// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDeviceStartupProcess;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics Device Startup Process Request.
 */
public interface IUserExperienceAnalyticsDeviceStartupProcessRequest extends IHttpRequest {

    /**
     * Gets the UserExperienceAnalyticsDeviceStartupProcess from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UserExperienceAnalyticsDeviceStartupProcess> callback);

    /**
     * Gets the UserExperienceAnalyticsDeviceStartupProcess from the service
     *
     * @return the UserExperienceAnalyticsDeviceStartupProcess from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsDeviceStartupProcess get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UserExperienceAnalyticsDeviceStartupProcess> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UserExperienceAnalyticsDeviceStartupProcess with a source
     *
     * @param sourceUserExperienceAnalyticsDeviceStartupProcess the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UserExperienceAnalyticsDeviceStartupProcess sourceUserExperienceAnalyticsDeviceStartupProcess, final ICallback<? super UserExperienceAnalyticsDeviceStartupProcess> callback);

    /**
     * Patches this UserExperienceAnalyticsDeviceStartupProcess with a source
     *
     * @param sourceUserExperienceAnalyticsDeviceStartupProcess the source object with updates
     * @return the updated UserExperienceAnalyticsDeviceStartupProcess
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsDeviceStartupProcess patch(final UserExperienceAnalyticsDeviceStartupProcess sourceUserExperienceAnalyticsDeviceStartupProcess) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsDeviceStartupProcess with a new object
     *
     * @param newUserExperienceAnalyticsDeviceStartupProcess the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UserExperienceAnalyticsDeviceStartupProcess newUserExperienceAnalyticsDeviceStartupProcess, final ICallback<? super UserExperienceAnalyticsDeviceStartupProcess> callback);

    /**
     * Posts a UserExperienceAnalyticsDeviceStartupProcess with a new object
     *
     * @param newUserExperienceAnalyticsDeviceStartupProcess the new object to create
     * @return the created UserExperienceAnalyticsDeviceStartupProcess
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsDeviceStartupProcess post(final UserExperienceAnalyticsDeviceStartupProcess newUserExperienceAnalyticsDeviceStartupProcess) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsDeviceStartupProcess with a new object
     *
     * @param newUserExperienceAnalyticsDeviceStartupProcess the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UserExperienceAnalyticsDeviceStartupProcess newUserExperienceAnalyticsDeviceStartupProcess, final ICallback<? super UserExperienceAnalyticsDeviceStartupProcess> callback);

    /**
     * Posts a UserExperienceAnalyticsDeviceStartupProcess with a new object
     *
     * @param newUserExperienceAnalyticsDeviceStartupProcess the object to create/update
     * @return the created UserExperienceAnalyticsDeviceStartupProcess
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsDeviceStartupProcess put(final UserExperienceAnalyticsDeviceStartupProcess newUserExperienceAnalyticsDeviceStartupProcess) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserExperienceAnalyticsDeviceStartupProcessRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserExperienceAnalyticsDeviceStartupProcessRequest expand(final String value);

}

