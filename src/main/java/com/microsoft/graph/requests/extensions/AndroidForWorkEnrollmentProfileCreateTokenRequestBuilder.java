// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.AndroidForWorkEnrollmentProfileCreateTokenRequest;
import com.microsoft.graph.models.extensions.AndroidForWorkEnrollmentProfile;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.AndroidForWorkEnrollmentProfileCreateTokenParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Enrollment Profile Create Token Request Builder.
 */
public class AndroidForWorkEnrollmentProfileCreateTokenRequestBuilder extends BaseActionRequestBuilder<AndroidForWorkEnrollmentProfile> {

    private AndroidForWorkEnrollmentProfileCreateTokenParameterSet body;
    /**
     * The request builder for this AndroidForWorkEnrollmentProfileCreateToken
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public AndroidForWorkEnrollmentProfileCreateTokenRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final AndroidForWorkEnrollmentProfileCreateTokenParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the AndroidForWorkEnrollmentProfileCreateTokenRequest
     *
     * @param requestOptions the options for the request
     * @return the AndroidForWorkEnrollmentProfileCreateTokenRequest instance
     */
    @Nonnull
    public AndroidForWorkEnrollmentProfileCreateTokenRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the AndroidForWorkEnrollmentProfileCreateTokenRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the AndroidForWorkEnrollmentProfileCreateTokenRequest instance
     */
    @Nonnull
    public AndroidForWorkEnrollmentProfileCreateTokenRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        AndroidForWorkEnrollmentProfileCreateTokenRequest request = new AndroidForWorkEnrollmentProfileCreateTokenRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
