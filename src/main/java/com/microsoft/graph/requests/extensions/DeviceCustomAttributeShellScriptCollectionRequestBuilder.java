// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DeviceCustomAttributeShellScript;
import com.microsoft.graph.models.extensions.DeviceManagementScriptGroupAssignment;
import com.microsoft.graph.models.extensions.DeviceManagementScriptAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.DeviceCustomAttributeShellScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCustomAttributeShellScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCustomAttributeShellScriptCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.extensions.DeviceCustomAttributeShellScriptAssignParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Custom Attribute Shell Script Collection Request Builder.
 */
public class DeviceCustomAttributeShellScriptCollectionRequestBuilder extends BaseCollectionRequestBuilder<DeviceCustomAttributeShellScript, DeviceCustomAttributeShellScriptRequestBuilder, DeviceCustomAttributeShellScriptCollectionResponse, DeviceCustomAttributeShellScriptCollectionPage, DeviceCustomAttributeShellScriptCollectionRequest> {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCustomAttributeShellScriptCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCustomAttributeShellScriptRequestBuilder.class, DeviceCustomAttributeShellScriptCollectionRequest.class);
    }



    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
