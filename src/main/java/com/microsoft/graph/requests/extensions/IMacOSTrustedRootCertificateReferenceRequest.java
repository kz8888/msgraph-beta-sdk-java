// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSTrustedRootCertificate;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.MacOSTrustedRootCertificate;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mac OSTrusted Root Certificate Reference Request.
 */
public interface IMacOSTrustedRootCertificateReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super MacOSTrustedRootCertificate> callback);

    MacOSTrustedRootCertificate delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMacOSTrustedRootCertificateReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMacOSTrustedRootCertificateReferenceRequest expand(final String value);

    /**
     * Puts the MacOSTrustedRootCertificate
     *
     * @param srcMacOSTrustedRootCertificate the MacOSTrustedRootCertificate to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(MacOSTrustedRootCertificate srcMacOSTrustedRootCertificate, final ICallback<? super MacOSTrustedRootCertificate> callback);

    /**
     * Puts the MacOSTrustedRootCertificate
     *
     * @param srcMacOSTrustedRootCertificate the MacOSTrustedRootCertificate to PUT
     * @return the MacOSTrustedRootCertificate
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    MacOSTrustedRootCertificate put(MacOSTrustedRootCertificate srcMacOSTrustedRootCertificate) throws ClientException;
}
