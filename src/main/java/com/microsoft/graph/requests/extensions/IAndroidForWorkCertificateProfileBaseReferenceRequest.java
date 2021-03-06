// Template Source: IBaseEntityReferenceRequest.java.tt
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
 * The interface for the Android For Work Certificate Profile Base Reference Request.
 */
public interface IAndroidForWorkCertificateProfileBaseReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super AndroidForWorkCertificateProfileBase> callback);

    AndroidForWorkCertificateProfileBase delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidForWorkCertificateProfileBaseReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidForWorkCertificateProfileBaseReferenceRequest expand(final String value);

    /**
     * Puts the AndroidForWorkCertificateProfileBase
     *
     * @param srcAndroidForWorkCertificateProfileBase the AndroidForWorkCertificateProfileBase to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(AndroidForWorkCertificateProfileBase srcAndroidForWorkCertificateProfileBase, final ICallback<? super AndroidForWorkCertificateProfileBase> callback);

    /**
     * Puts the AndroidForWorkCertificateProfileBase
     *
     * @param srcAndroidForWorkCertificateProfileBase the AndroidForWorkCertificateProfileBase to PUT
     * @return the AndroidForWorkCertificateProfileBase
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    AndroidForWorkCertificateProfileBase put(AndroidForWorkCertificateProfileBase srcAndroidForWorkCertificateProfileBase) throws ClientException;
}
