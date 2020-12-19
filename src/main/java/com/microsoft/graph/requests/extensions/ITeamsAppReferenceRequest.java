// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsApp;
import com.microsoft.graph.requests.extensions.ITeamsAppDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.TeamsApp;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Teams App Reference Request.
 */
public interface ITeamsAppReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super TeamsApp> callback);

    TeamsApp delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITeamsAppReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITeamsAppReferenceRequest expand(final String value);

    /**
     * Puts the TeamsApp
     *
     * @param srcTeamsApp the TeamsApp to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(TeamsApp srcTeamsApp, final ICallback<? super TeamsApp> callback);

    /**
     * Puts the TeamsApp
     *
     * @param srcTeamsApp the TeamsApp to PUT
     * @return the TeamsApp
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    TeamsApp put(TeamsApp srcTeamsApp) throws ClientException;
}
