// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.AndroidDeviceOwnerEnrollmentProfile;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidDeviceOwnerEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidDeviceOwnerEnrollmentProfileCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner Enrollment Profile Collection Request Builder.
 */
public class AndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder extends BaseRequestBuilder implements IAndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IAndroidDeviceOwnerEnrollmentProfileCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IAndroidDeviceOwnerEnrollmentProfileCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new AndroidDeviceOwnerEnrollmentProfileCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IAndroidDeviceOwnerEnrollmentProfileRequestBuilder byId(final String id) {
        return new AndroidDeviceOwnerEnrollmentProfileRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}