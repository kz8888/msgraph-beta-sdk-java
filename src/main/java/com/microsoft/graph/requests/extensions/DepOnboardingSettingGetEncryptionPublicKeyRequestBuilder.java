// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.DepOnboardingSettingGetEncryptionPublicKeyRequest;
import com.microsoft.graph.models.extensions.DepOnboardingSetting;

import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Dep Onboarding Setting Get Encryption Public Key Request Builder.
 */
public class DepOnboardingSettingGetEncryptionPublicKeyRequestBuilder extends BaseFunctionRequestBuilder<String> {

    /**
     * The request builder for this DepOnboardingSettingGetEncryptionPublicKey
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DepOnboardingSettingGetEncryptionPublicKeyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the DepOnboardingSettingGetEncryptionPublicKeyRequest
     *
     * @param requestOptions the options for the request
     * @return the DepOnboardingSettingGetEncryptionPublicKeyRequest instance
     */
    @Nonnull
    public DepOnboardingSettingGetEncryptionPublicKeyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DepOnboardingSettingGetEncryptionPublicKeyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DepOnboardingSettingGetEncryptionPublicKeyRequest instance
     */
    @Nonnull
    public DepOnboardingSettingGetEncryptionPublicKeyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DepOnboardingSettingGetEncryptionPublicKeyRequest request = new DepOnboardingSettingGetEncryptionPublicKeyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
