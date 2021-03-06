// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsPhone81CertificateProfileBase;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Phone81Certificate Profile Base Reference Request.
 */
public class WindowsPhone81CertificateProfileBaseReferenceRequest extends BaseRequest implements IWindowsPhone81CertificateProfileBaseReferenceRequest {

    /**
     * The request for the WindowsPhone81CertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsPhone81CertificateProfileBaseReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsPhone81CertificateProfileBase.class);
    }

    public void delete(final ICallback<? super WindowsPhone81CertificateProfileBase> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public WindowsPhone81CertificateProfileBase delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWindowsPhone81CertificateProfileBaseReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WindowsPhone81CertificateProfileBaseReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWindowsPhone81CertificateProfileBaseReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WindowsPhone81CertificateProfileBaseReferenceRequest)this;
    }
    /**
     * Puts the WindowsPhone81CertificateProfileBase
     *
     * @param srcWindowsPhone81CertificateProfileBase the WindowsPhone81CertificateProfileBase reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(WindowsPhone81CertificateProfileBase srcWindowsPhone81CertificateProfileBase, final ICallback<? super WindowsPhone81CertificateProfileBase> callback) {
        send(HttpMethod.PUT, callback, srcWindowsPhone81CertificateProfileBase);
    }

    /**
     * Puts the WindowsPhone81CertificateProfileBase
     *
     * @param srcWindowsPhone81CertificateProfileBase the WindowsPhone81CertificateProfileBase reference to PUT
     * @return the WindowsPhone81CertificateProfileBase
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public WindowsPhone81CertificateProfileBase put(WindowsPhone81CertificateProfileBase srcWindowsPhone81CertificateProfileBase) throws ClientException {
        return send(HttpMethod.PUT, srcWindowsPhone81CertificateProfileBase);
    }
}
