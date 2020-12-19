// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AzureADWindowsAutopilotDeploymentProfile;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Azure ADWindows Autopilot Deployment Profile Request Builder.
 */
public interface IAzureADWindowsAutopilotDeploymentProfileRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IAzureADWindowsAutopilotDeploymentProfileRequest instance
     */
    IAzureADWindowsAutopilotDeploymentProfileRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IAzureADWindowsAutopilotDeploymentProfileRequest instance
     */
    IAzureADWindowsAutopilotDeploymentProfileRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IWindowsAutopilotDeviceIdentityCollectionRequestBuilder assignedDevices();

    IWindowsAutopilotDeviceIdentityRequestBuilder assignedDevices(final String id);

    IWindowsAutopilotDeploymentProfileAssignmentCollectionRequestBuilder assignments();

    IWindowsAutopilotDeploymentProfileAssignmentRequestBuilder assignments(final String id);

}