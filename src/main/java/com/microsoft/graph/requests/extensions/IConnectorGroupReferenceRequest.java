// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ConnectorGroup;
import com.microsoft.graph.requests.extensions.IApplicationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ConnectorGroup;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Connector Group Reference Request.
 */
public interface IConnectorGroupReferenceRequest extends IHttpRequest {

    void delete(final ICallback<ConnectorGroup> callback);

    ConnectorGroup delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IConnectorGroupReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IConnectorGroupReferenceRequest expand(final String value);

    /**
     * Puts the ConnectorGroup
     *
     * @param srcConnectorGroup the ConnectorGroup to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(ConnectorGroup srcConnectorGroup, final ICallback<ConnectorGroup> callback);

    /**
     * Puts the ConnectorGroup
     *
     * @param srcConnectorGroup the ConnectorGroup to PUT
     * @return the ConnectorGroup
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    ConnectorGroup put(ConnectorGroup srcConnectorGroup) throws ClientException;
}
