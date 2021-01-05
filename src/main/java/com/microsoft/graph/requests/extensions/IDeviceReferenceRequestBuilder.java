// Template Source: IBaseEntityReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Device;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommandCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommandRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.Device;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Reference Request Builder.
 */
public interface IDeviceReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDeviceReferenceRequest instance
     */
    IDeviceReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDeviceReferenceRequest instance
     */
    IDeviceReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
