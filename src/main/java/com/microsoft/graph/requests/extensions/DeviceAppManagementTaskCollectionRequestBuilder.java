// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.models.extensions.DeviceAppManagementTask;
import com.microsoft.graph.models.generated.DeviceAppManagementTaskStatus;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.DeviceAppManagementTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAppManagementTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAppManagementTaskCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.extensions.DeviceAppManagementTaskUpdateStatusParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device App Management Task Collection Request Builder.
 */
public class DeviceAppManagementTaskCollectionRequestBuilder extends BaseCollectionRequestBuilder<DeviceAppManagementTask, DeviceAppManagementTaskRequestBuilder, DeviceAppManagementTaskCollectionResponse, DeviceAppManagementTaskCollectionPage, DeviceAppManagementTaskCollectionRequest> {

    /**
     * The request builder for this collection of DeviceAppManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAppManagementTaskCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceAppManagementTaskRequestBuilder.class, DeviceAppManagementTaskCollectionRequest.class);
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
