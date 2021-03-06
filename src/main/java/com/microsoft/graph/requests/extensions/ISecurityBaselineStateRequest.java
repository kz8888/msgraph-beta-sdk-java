// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SecurityBaselineState;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Security Baseline State Request.
 */
public interface ISecurityBaselineStateRequest extends IHttpRequest {

    /**
     * Gets the SecurityBaselineState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super SecurityBaselineState> callback);

    /**
     * Gets the SecurityBaselineState from the service
     *
     * @return the SecurityBaselineState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SecurityBaselineState get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super SecurityBaselineState> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SecurityBaselineState with a source
     *
     * @param sourceSecurityBaselineState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SecurityBaselineState sourceSecurityBaselineState, final ICallback<? super SecurityBaselineState> callback);

    /**
     * Patches this SecurityBaselineState with a source
     *
     * @param sourceSecurityBaselineState the source object with updates
     * @return the updated SecurityBaselineState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SecurityBaselineState patch(final SecurityBaselineState sourceSecurityBaselineState) throws ClientException;

    /**
     * Posts a SecurityBaselineState with a new object
     *
     * @param newSecurityBaselineState the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SecurityBaselineState newSecurityBaselineState, final ICallback<? super SecurityBaselineState> callback);

    /**
     * Posts a SecurityBaselineState with a new object
     *
     * @param newSecurityBaselineState the new object to create
     * @return the created SecurityBaselineState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SecurityBaselineState post(final SecurityBaselineState newSecurityBaselineState) throws ClientException;

    /**
     * Posts a SecurityBaselineState with a new object
     *
     * @param newSecurityBaselineState the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SecurityBaselineState newSecurityBaselineState, final ICallback<? super SecurityBaselineState> callback);

    /**
     * Posts a SecurityBaselineState with a new object
     *
     * @param newSecurityBaselineState the object to create/update
     * @return the created SecurityBaselineState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SecurityBaselineState put(final SecurityBaselineState newSecurityBaselineState) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISecurityBaselineStateRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISecurityBaselineStateRequest expand(final String value);

}

