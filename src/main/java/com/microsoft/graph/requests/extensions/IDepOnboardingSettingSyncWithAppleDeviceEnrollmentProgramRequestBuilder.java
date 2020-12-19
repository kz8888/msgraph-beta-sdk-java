// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Dep Onboarding Setting Sync With Apple Device Enrollment Program Request Builder.
 */
public interface IDepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequest
     *
     * @param requestOptions the options for the request
     * @return the IDepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequest instance
     */
    IDepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IDepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequest instance
     */
    IDepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
