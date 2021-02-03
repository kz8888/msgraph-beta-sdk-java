// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.ediscovery.models.extensions.Tag;
import com.microsoft.graph.ediscovery.requests.extensions.ITagCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.ITagRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.ediscovery.models.extensions.Tag;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Tag Reference Request.
 */
public interface ITagReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super Tag> callback);

    Tag delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITagReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITagReferenceRequest expand(final String value);

    /**
     * Puts the Tag
     *
     * @param srcTag the Tag to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(Tag srcTag, final ICallback<? super Tag> callback);

    /**
     * Puts the Tag
     *
     * @param srcTag the Tag to PUT
     * @return the Tag
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    Tag put(Tag srcTag) throws ClientException;
}
