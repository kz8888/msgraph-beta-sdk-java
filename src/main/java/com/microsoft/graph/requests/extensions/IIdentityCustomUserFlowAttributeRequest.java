// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IdentityCustomUserFlowAttribute;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Identity Custom User Flow Attribute Request.
 */
public interface IIdentityCustomUserFlowAttributeRequest extends IHttpRequest {

    /**
     * Gets the IdentityCustomUserFlowAttribute from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super IdentityCustomUserFlowAttribute> callback);

    /**
     * Gets the IdentityCustomUserFlowAttribute from the service
     *
     * @return the IdentityCustomUserFlowAttribute from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IdentityCustomUserFlowAttribute get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super IdentityCustomUserFlowAttribute> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this IdentityCustomUserFlowAttribute with a source
     *
     * @param sourceIdentityCustomUserFlowAttribute the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final IdentityCustomUserFlowAttribute sourceIdentityCustomUserFlowAttribute, final ICallback<? super IdentityCustomUserFlowAttribute> callback);

    /**
     * Patches this IdentityCustomUserFlowAttribute with a source
     *
     * @param sourceIdentityCustomUserFlowAttribute the source object with updates
     * @return the updated IdentityCustomUserFlowAttribute
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IdentityCustomUserFlowAttribute patch(final IdentityCustomUserFlowAttribute sourceIdentityCustomUserFlowAttribute) throws ClientException;

    /**
     * Posts a IdentityCustomUserFlowAttribute with a new object
     *
     * @param newIdentityCustomUserFlowAttribute the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final IdentityCustomUserFlowAttribute newIdentityCustomUserFlowAttribute, final ICallback<? super IdentityCustomUserFlowAttribute> callback);

    /**
     * Posts a IdentityCustomUserFlowAttribute with a new object
     *
     * @param newIdentityCustomUserFlowAttribute the new object to create
     * @return the created IdentityCustomUserFlowAttribute
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IdentityCustomUserFlowAttribute post(final IdentityCustomUserFlowAttribute newIdentityCustomUserFlowAttribute) throws ClientException;

    /**
     * Posts a IdentityCustomUserFlowAttribute with a new object
     *
     * @param newIdentityCustomUserFlowAttribute the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final IdentityCustomUserFlowAttribute newIdentityCustomUserFlowAttribute, final ICallback<? super IdentityCustomUserFlowAttribute> callback);

    /**
     * Posts a IdentityCustomUserFlowAttribute with a new object
     *
     * @param newIdentityCustomUserFlowAttribute the object to create/update
     * @return the created IdentityCustomUserFlowAttribute
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IdentityCustomUserFlowAttribute put(final IdentityCustomUserFlowAttribute newIdentityCustomUserFlowAttribute) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IIdentityCustomUserFlowAttributeRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IIdentityCustomUserFlowAttributeRequest expand(final String value);

}

