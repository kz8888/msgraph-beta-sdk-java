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

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IWindows81TrustedRootCertificateCollectionPage;
import com.microsoft.graph.requests.extensions.Windows81TrustedRootCertificateCollectionResponse;
import com.microsoft.graph.requests.extensions.IWindows81TrustedRootCertificateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindows81TrustedRootCertificateCollectionRequest;
import com.microsoft.graph.requests.extensions.Windows81TrustedRootCertificateCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows81Trusted Root Certificate Collection Request.
 */
public class Windows81TrustedRootCertificateCollectionRequest extends BaseCollectionRequest<Windows81TrustedRootCertificateCollectionResponse, IWindows81TrustedRootCertificateCollectionPage> implements IWindows81TrustedRootCertificateCollectionRequest {

    /**
     * The request builder for this collection of Windows81TrustedRootCertificate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows81TrustedRootCertificateCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows81TrustedRootCertificateCollectionResponse.class, IWindows81TrustedRootCertificateCollectionPage.class);
    }

    public void get(final ICallback<IWindows81TrustedRootCertificateCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IWindows81TrustedRootCertificateCollectionPage get() throws ClientException {
        final Windows81TrustedRootCertificateCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Windows81TrustedRootCertificate newWindows81TrustedRootCertificate, final ICallback<Windows81TrustedRootCertificate> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new Windows81TrustedRootCertificateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWindows81TrustedRootCertificate, callback);
    }

    public Windows81TrustedRootCertificate post(final Windows81TrustedRootCertificate newWindows81TrustedRootCertificate) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new Windows81TrustedRootCertificateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWindows81TrustedRootCertificate);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWindows81TrustedRootCertificateCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (Windows81TrustedRootCertificateCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWindows81TrustedRootCertificateCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (Windows81TrustedRootCertificateCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWindows81TrustedRootCertificateCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (Windows81TrustedRootCertificateCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IWindows81TrustedRootCertificateCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (Windows81TrustedRootCertificateCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IWindows81TrustedRootCertificateCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IWindows81TrustedRootCertificateCollectionRequest)this;
    }
    public IWindows81TrustedRootCertificateCollectionPage buildFromResponse(final Windows81TrustedRootCertificateCollectionResponse response) {
        final IWindows81TrustedRootCertificateCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new Windows81TrustedRootCertificateCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final Windows81TrustedRootCertificateCollectionPage page = new Windows81TrustedRootCertificateCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
