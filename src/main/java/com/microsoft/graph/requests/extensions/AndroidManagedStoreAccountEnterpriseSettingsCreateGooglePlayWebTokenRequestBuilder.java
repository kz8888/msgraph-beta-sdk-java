// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest;
import com.microsoft.graph.models.extensions.AndroidManagedStoreAccountEnterpriseSettings;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Managed Store Account Enterprise Settings Create Google Play Web Token Request Builder.
 */
public class AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequestBuilder extends BaseActionRequestBuilder<String> {

    private AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenParameterSet body;
    /**
     * The request builder for this AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebToken
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest
     *
     * @param requestOptions the options for the request
     * @return the AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest instance
     */
    @Nonnull
    public AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest instance
     */
    @Nonnull
    public AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest request = new AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
