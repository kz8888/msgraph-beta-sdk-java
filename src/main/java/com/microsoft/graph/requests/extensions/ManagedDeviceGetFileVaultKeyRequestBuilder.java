// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagedDeviceGetFileVaultKeyRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceGetFileVaultKeyRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Get File Vault Key Request Builder.
 */
public class ManagedDeviceGetFileVaultKeyRequestBuilder extends BaseFunctionRequestBuilder implements IManagedDeviceGetFileVaultKeyRequestBuilder {

    /**
     * The request builder for this ManagedDeviceGetFileVaultKey
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceGetFileVaultKeyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IManagedDeviceGetFileVaultKeyRequest
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceGetFileVaultKeyRequest instance
     */
    public IManagedDeviceGetFileVaultKeyRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IManagedDeviceGetFileVaultKeyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceGetFileVaultKeyRequest instance
     */
    public IManagedDeviceGetFileVaultKeyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ManagedDeviceGetFileVaultKeyRequest request = new ManagedDeviceGetFileVaultKeyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
