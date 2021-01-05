// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsProtectionState;
import com.microsoft.graph.requests.extensions.IWindowsDeviceMalwareStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsDeviceMalwareStateRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsDeviceMalwareStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsDeviceMalwareStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Protection State Request Builder.
 */
public class WindowsProtectionStateRequestBuilder extends BaseRequestBuilder implements IWindowsProtectionStateRequestBuilder {

    /**
     * The request builder for the WindowsProtectionState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsProtectionStateRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWindowsProtectionStateRequest instance
     */
    public IWindowsProtectionStateRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWindowsProtectionStateRequest instance
     */
    public IWindowsProtectionStateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WindowsProtectionStateRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IWindowsDeviceMalwareStateCollectionRequestBuilder detectedMalwareState() {
        return new WindowsDeviceMalwareStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("detectedMalwareState"), getClient(), null);
    }

    public IWindowsDeviceMalwareStateRequestBuilder detectedMalwareState(final String id) {
        return new WindowsDeviceMalwareStateRequestBuilder(getRequestUrlWithAdditionalSegment("detectedMalwareState") + "/" + id, getClient(), null);
    }
}
