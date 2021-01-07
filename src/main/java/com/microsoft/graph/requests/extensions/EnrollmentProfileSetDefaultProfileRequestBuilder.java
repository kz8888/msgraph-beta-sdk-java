// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.EnrollmentProfileSetDefaultProfileRequest;
import com.microsoft.graph.models.extensions.EnrollmentProfile;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Enrollment Profile Set Default Profile Request Builder.
 */
public class EnrollmentProfileSetDefaultProfileRequestBuilder extends BaseActionRequestBuilder<EnrollmentProfile> {

    /**
     * The request builder for this EnrollmentProfileSetDefaultProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EnrollmentProfileSetDefaultProfileRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the EnrollmentProfileSetDefaultProfileRequest
     *
     * @param requestOptions the options for the request
     * @return the EnrollmentProfileSetDefaultProfileRequest instance
     */
    @Nonnull
    public EnrollmentProfileSetDefaultProfileRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the EnrollmentProfileSetDefaultProfileRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the EnrollmentProfileSetDefaultProfileRequest instance
     */
    @Nonnull
    public EnrollmentProfileSetDefaultProfileRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        EnrollmentProfileSetDefaultProfileRequest request = new EnrollmentProfileSetDefaultProfileRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
