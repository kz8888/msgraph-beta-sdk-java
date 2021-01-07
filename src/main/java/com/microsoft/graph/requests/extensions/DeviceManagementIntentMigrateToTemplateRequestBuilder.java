// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentMigrateToTemplateRequest;
import com.microsoft.graph.models.extensions.DeviceManagementIntent;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.DeviceManagementIntentMigrateToTemplateParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent Migrate To Template Request Builder.
 */
public class DeviceManagementIntentMigrateToTemplateRequestBuilder extends BaseActionRequestBuilder<DeviceManagementIntent> {

    private DeviceManagementIntentMigrateToTemplateParameterSet body;
    /**
     * The request builder for this DeviceManagementIntentMigrateToTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DeviceManagementIntentMigrateToTemplateRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DeviceManagementIntentMigrateToTemplateParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the DeviceManagementIntentMigrateToTemplateRequest
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementIntentMigrateToTemplateRequest instance
     */
    @Nonnull
    public DeviceManagementIntentMigrateToTemplateRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DeviceManagementIntentMigrateToTemplateRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementIntentMigrateToTemplateRequest instance
     */
    @Nonnull
    public DeviceManagementIntentMigrateToTemplateRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceManagementIntentMigrateToTemplateRequest request = new DeviceManagementIntentMigrateToTemplateRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
