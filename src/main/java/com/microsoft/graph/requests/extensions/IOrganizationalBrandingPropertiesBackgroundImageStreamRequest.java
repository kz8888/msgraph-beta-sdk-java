// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OrganizationalBrandingProperties;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.http.IHttpStreamRequest;

import java.io.InputStream;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Organizational Branding Properties Background Image Stream Request.
 */
public interface IOrganizationalBrandingPropertiesBackgroundImageStreamRequest extends IHttpStreamRequest {

    /**
     * Gets the contents of this stream
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<InputStream> callback);

    /**
     * Gets the contents of this stream
     *
     * @return the stream that the caller needs to close
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    InputStream get() throws ClientException;

    /**
     * Uploads to the stream
     *
     * @param fileContents the contents of the stream to upload
     * @param callback the callback to be called after success or failure
     */
    void put(final byte[] fileContents, final ICallback<OrganizationalBrandingProperties> callback);

    /**
     * Uploads to the stream
     *
     * @param fileContents the contents of the stream to upload
     * @return the result of the upload
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    OrganizationalBrandingProperties put(final byte[] fileContents) throws ClientException;
}