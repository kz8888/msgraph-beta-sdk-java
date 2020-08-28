// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsWifiEnterpriseEAPConfiguration;
import com.microsoft.graph.models.extensions.Windows81TrustedRootCertificate;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows81Trusted Root Certificate Collection Request.
 */
public interface IWindows81TrustedRootCertificateCollectionRequest {

    void get(final ICallback<IWindows81TrustedRootCertificateCollectionPage> callback);

    IWindows81TrustedRootCertificateCollectionPage get() throws ClientException;

    void post(final Windows81TrustedRootCertificate newWindows81TrustedRootCertificate, final ICallback<Windows81TrustedRootCertificate> callback);

    Windows81TrustedRootCertificate post(final Windows81TrustedRootCertificate newWindows81TrustedRootCertificate) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindows81TrustedRootCertificateCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindows81TrustedRootCertificateCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IWindows81TrustedRootCertificateCollectionRequest top(final int value);

}