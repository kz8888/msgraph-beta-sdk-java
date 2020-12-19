// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAndroidForWorkSettingsCompleteSignupRequest;
import com.microsoft.graph.requests.extensions.AndroidForWorkSettingsCompleteSignupRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Settings Complete Signup Request Builder.
 */
public class AndroidForWorkSettingsCompleteSignupRequestBuilder extends BaseActionRequestBuilder implements IAndroidForWorkSettingsCompleteSignupRequestBuilder {

    /**
     * The request builder for this AndroidForWorkSettingsCompleteSignup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param enterpriseToken the enterpriseToken
     */
    public AndroidForWorkSettingsCompleteSignupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String enterpriseToken) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("enterpriseToken", enterpriseToken);
    }

    /**
     * Creates the IAndroidForWorkSettingsCompleteSignupRequest
     *
     * @param requestOptions the options for the request
     * @return the IAndroidForWorkSettingsCompleteSignupRequest instance
     */
    public IAndroidForWorkSettingsCompleteSignupRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IAndroidForWorkSettingsCompleteSignupRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IAndroidForWorkSettingsCompleteSignupRequest instance
     */
    public IAndroidForWorkSettingsCompleteSignupRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        AndroidForWorkSettingsCompleteSignupRequest request = new AndroidForWorkSettingsCompleteSignupRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("enterpriseToken")) {
            request.body.enterpriseToken = getParameter("enterpriseToken");
        }

        return request;
    }
}
