// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Apple Push Notification Certificate Generate Apple Push Notification Certificate Signing Request Request Builder.
 */
public interface IApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest
     *
     * @param requestOptions the options for the request
     * @return the IApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest instance
     */
    IApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest instance
     */
    IApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
