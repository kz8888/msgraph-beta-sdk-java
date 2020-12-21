// Template Source: BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest;
import com.microsoft.graph.requests.extensions.ApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Apple Push Notification Certificate Generate Apple Push Notification Certificate Signing Request Request.
 */
public class ApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest extends BaseRequest implements IApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest {

    /**
     * The request for this ApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, String.class);
    }

    /**
     * Creates the ApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequest
     *
     * @param callback the callback to be called after success or failure
     */
    public void post(final ICallback<? super String> callback) {
        send(HttpMethod.POST, callback, null);
    }

    /**
     * Creates the ApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequest
     *
     * @return the String
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public String post() throws ClientException {
       return send(HttpMethod.POST, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest)this;
    }

}
