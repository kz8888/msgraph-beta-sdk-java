// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SecurityBaselineDeviceState;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Security Baseline Device State Request.
 */
public interface ISecurityBaselineDeviceStateRequest extends IHttpRequest {

    /**
     * Gets the SecurityBaselineDeviceState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<SecurityBaselineDeviceState> callback);

    /**
     * Gets the SecurityBaselineDeviceState from the service
     *
     * @return the SecurityBaselineDeviceState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SecurityBaselineDeviceState get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<SecurityBaselineDeviceState> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SecurityBaselineDeviceState with a source
     *
     * @param sourceSecurityBaselineDeviceState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SecurityBaselineDeviceState sourceSecurityBaselineDeviceState, final ICallback<SecurityBaselineDeviceState> callback);

    /**
     * Patches this SecurityBaselineDeviceState with a source
     *
     * @param sourceSecurityBaselineDeviceState the source object with updates
     * @return the updated SecurityBaselineDeviceState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SecurityBaselineDeviceState patch(final SecurityBaselineDeviceState sourceSecurityBaselineDeviceState) throws ClientException;

    /**
     * Posts a SecurityBaselineDeviceState with a new object
     *
     * @param newSecurityBaselineDeviceState the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SecurityBaselineDeviceState newSecurityBaselineDeviceState, final ICallback<SecurityBaselineDeviceState> callback);

    /**
     * Posts a SecurityBaselineDeviceState with a new object
     *
     * @param newSecurityBaselineDeviceState the new object to create
     * @return the created SecurityBaselineDeviceState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SecurityBaselineDeviceState post(final SecurityBaselineDeviceState newSecurityBaselineDeviceState) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISecurityBaselineDeviceStateRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISecurityBaselineDeviceStateRequest expand(final String value);

}
