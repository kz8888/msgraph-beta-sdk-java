// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagedDeviceRotateFileVaultKeyRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceRotateFileVaultKeyRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Rotate File Vault Key Request Builder.
 */
public class ManagedDeviceRotateFileVaultKeyRequestBuilder extends BaseActionRequestBuilder implements IManagedDeviceRotateFileVaultKeyRequestBuilder {

    /**
     * The request builder for this ManagedDeviceRotateFileVaultKey
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceRotateFileVaultKeyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IManagedDeviceRotateFileVaultKeyRequest
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceRotateFileVaultKeyRequest instance
     */
    public IManagedDeviceRotateFileVaultKeyRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IManagedDeviceRotateFileVaultKeyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceRotateFileVaultKeyRequest instance
     */
    public IManagedDeviceRotateFileVaultKeyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ManagedDeviceRotateFileVaultKeyRequest request = new ManagedDeviceRotateFileVaultKeyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
