// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequest;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Autopilot Device Identity Unassign Resource Account From Device Request Builder.
 */
public class WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequestBuilder extends BaseActionRequestBuilder implements IWindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequestBuilder {

    /**
     * The request builder for this WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequest
     *
     * @param requestOptions the options for the request
     * @return the IWindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequest instance
     */
    public IWindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequest instance
     */
    public IWindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequest request = new WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
