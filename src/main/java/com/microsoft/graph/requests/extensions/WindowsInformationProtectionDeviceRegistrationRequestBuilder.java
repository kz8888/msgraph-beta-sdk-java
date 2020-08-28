// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionDeviceRegistration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Device Registration Request Builder.
 */
public class WindowsInformationProtectionDeviceRegistrationRequestBuilder extends BaseRequestBuilder implements IWindowsInformationProtectionDeviceRegistrationRequestBuilder {

    /**
     * The request builder for the WindowsInformationProtectionDeviceRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsInformationProtectionDeviceRegistrationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWindowsInformationProtectionDeviceRegistrationRequest instance
     */
    public IWindowsInformationProtectionDeviceRegistrationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWindowsInformationProtectionDeviceRegistrationRequest instance
     */
    public IWindowsInformationProtectionDeviceRegistrationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WindowsInformationProtectionDeviceRegistrationRequest(getRequestUrl(), getClient(), requestOptions);
    }



    public IWindowsInformationProtectionDeviceRegistrationWipeRequestBuilder wipe() {
        return new WindowsInformationProtectionDeviceRegistrationWipeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.wipe"), getClient(), null);
    }
}