// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementSendCustomNotificationToCompanyPortalRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Send Custom Notification To Company Portal Request Builder.
 */
public interface IDeviceManagementSendCustomNotificationToCompanyPortalRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDeviceManagementSendCustomNotificationToCompanyPortalRequest
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementSendCustomNotificationToCompanyPortalRequest instance
     */
    IDeviceManagementSendCustomNotificationToCompanyPortalRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IDeviceManagementSendCustomNotificationToCompanyPortalRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementSendCustomNotificationToCompanyPortalRequest instance
     */
    IDeviceManagementSendCustomNotificationToCompanyPortalRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
