// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAndroidDeviceOwnerEnrollmentProfileCreateTokenRequest;
import com.microsoft.graph.requests.extensions.AndroidDeviceOwnerEnrollmentProfileCreateTokenRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner Enrollment Profile Create Token Request Builder.
 */
public class AndroidDeviceOwnerEnrollmentProfileCreateTokenRequestBuilder extends BaseActionRequestBuilder implements IAndroidDeviceOwnerEnrollmentProfileCreateTokenRequestBuilder {

    /**
     * The request builder for this AndroidDeviceOwnerEnrollmentProfileCreateToken
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param tokenValidityInSeconds the tokenValidityInSeconds
     */
    public AndroidDeviceOwnerEnrollmentProfileCreateTokenRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final Integer tokenValidityInSeconds) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("tokenValidityInSeconds", tokenValidityInSeconds);
    }

    /**
     * Creates the IAndroidDeviceOwnerEnrollmentProfileCreateTokenRequest
     *
     * @return the IAndroidDeviceOwnerEnrollmentProfileCreateTokenRequest instance
     */
    public IAndroidDeviceOwnerEnrollmentProfileCreateTokenRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IAndroidDeviceOwnerEnrollmentProfileCreateTokenRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IAndroidDeviceOwnerEnrollmentProfileCreateTokenRequest instance
     */
    public IAndroidDeviceOwnerEnrollmentProfileCreateTokenRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        AndroidDeviceOwnerEnrollmentProfileCreateTokenRequest request = new AndroidDeviceOwnerEnrollmentProfileCreateTokenRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("tokenValidityInSeconds")) {
            request.body.tokenValidityInSeconds = getParameter("tokenValidityInSeconds");
        }

        return request;
    }
}