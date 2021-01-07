// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.DeviceConfigurationWindowsPrivacyAccessControlsRequest;
import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.models.extensions.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.DeviceConfigurationWindowsPrivacyAccessControlsParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Windows Privacy Access Controls Request Builder.
 */
public class DeviceConfigurationWindowsPrivacyAccessControlsRequestBuilder extends BaseActionRequestBuilder<DeviceConfiguration> {

    private DeviceConfigurationWindowsPrivacyAccessControlsParameterSet body;
    /**
     * The request builder for this DeviceConfigurationWindowsPrivacyAccessControls
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DeviceConfigurationWindowsPrivacyAccessControlsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DeviceConfigurationWindowsPrivacyAccessControlsParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the DeviceConfigurationWindowsPrivacyAccessControlsRequest
     *
     * @param requestOptions the options for the request
     * @return the DeviceConfigurationWindowsPrivacyAccessControlsRequest instance
     */
    @Nonnull
    public DeviceConfigurationWindowsPrivacyAccessControlsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DeviceConfigurationWindowsPrivacyAccessControlsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DeviceConfigurationWindowsPrivacyAccessControlsRequest instance
     */
    @Nonnull
    public DeviceConfigurationWindowsPrivacyAccessControlsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceConfigurationWindowsPrivacyAccessControlsRequest request = new DeviceConfigurationWindowsPrivacyAccessControlsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
