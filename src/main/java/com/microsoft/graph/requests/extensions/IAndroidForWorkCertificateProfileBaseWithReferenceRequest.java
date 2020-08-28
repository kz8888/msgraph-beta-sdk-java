// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidForWorkCertificateProfileBase;
import com.microsoft.graph.requests.extensions.IAndroidForWorkTrustedRootCertificateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.AndroidForWorkCertificateProfileBase;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android For Work Certificate Profile Base With Reference Request.
 */
public interface IAndroidForWorkCertificateProfileBaseWithReferenceRequest extends IHttpRequest {

    void post(final AndroidForWorkCertificateProfileBase newAndroidForWorkCertificateProfileBase, final IJsonBackedObject payload, final ICallback<AndroidForWorkCertificateProfileBase> callback);

    AndroidForWorkCertificateProfileBase post(final AndroidForWorkCertificateProfileBase newAndroidForWorkCertificateProfileBase, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<AndroidForWorkCertificateProfileBase> callback);

    AndroidForWorkCertificateProfileBase get() throws ClientException;

	void delete(final ICallback<AndroidForWorkCertificateProfileBase> callback);

	void delete() throws ClientException;

	void patch(final AndroidForWorkCertificateProfileBase sourceAndroidForWorkCertificateProfileBase, final ICallback<AndroidForWorkCertificateProfileBase> callback);

	AndroidForWorkCertificateProfileBase patch(final AndroidForWorkCertificateProfileBase sourceAndroidForWorkCertificateProfileBase) throws ClientException;

    IAndroidForWorkCertificateProfileBaseWithReferenceRequest select(final String value);

    IAndroidForWorkCertificateProfileBaseWithReferenceRequest expand(final String value);

}