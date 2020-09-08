// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SensitivityPolicySettings;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Sensitivity Policy Settings Request.
 */
public interface ISensitivityPolicySettingsRequest extends IHttpRequest {

    /**
     * Gets the SensitivityPolicySettings from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<SensitivityPolicySettings> callback);

    /**
     * Gets the SensitivityPolicySettings from the service
     *
     * @return the SensitivityPolicySettings from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SensitivityPolicySettings get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<SensitivityPolicySettings> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SensitivityPolicySettings with a source
     *
     * @param sourceSensitivityPolicySettings the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SensitivityPolicySettings sourceSensitivityPolicySettings, final ICallback<SensitivityPolicySettings> callback);

    /**
     * Patches this SensitivityPolicySettings with a source
     *
     * @param sourceSensitivityPolicySettings the source object with updates
     * @return the updated SensitivityPolicySettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SensitivityPolicySettings patch(final SensitivityPolicySettings sourceSensitivityPolicySettings) throws ClientException;

    /**
     * Posts a SensitivityPolicySettings with a new object
     *
     * @param newSensitivityPolicySettings the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SensitivityPolicySettings newSensitivityPolicySettings, final ICallback<SensitivityPolicySettings> callback);

    /**
     * Posts a SensitivityPolicySettings with a new object
     *
     * @param newSensitivityPolicySettings the new object to create
     * @return the created SensitivityPolicySettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SensitivityPolicySettings post(final SensitivityPolicySettings newSensitivityPolicySettings) throws ClientException;

    /**
     * Posts a SensitivityPolicySettings with a new object
     *
     * @param newSensitivityPolicySettings the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SensitivityPolicySettings newSensitivityPolicySettings, final ICallback<SensitivityPolicySettings> callback);

    /**
     * Posts a SensitivityPolicySettings with a new object
     *
     * @param newSensitivityPolicySettings the object to create/update
     * @return the created SensitivityPolicySettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SensitivityPolicySettings put(final SensitivityPolicySettings newSensitivityPolicySettings) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISensitivityPolicySettingsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISensitivityPolicySettingsRequest expand(final String value);

}

