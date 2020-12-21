// Template Source: BaseMethodCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AzureADLicenseUsage;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetAzureADLicenseUsageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetAzureADLicenseUsageCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetAzureADLicenseUsageCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Azure ADLicense Usage Collection Request.
 */
public class ReportRootGetAzureADLicenseUsageCollectionRequest extends BaseCollectionRequest<ReportRootGetAzureADLicenseUsageCollectionResponse, IReportRootGetAzureADLicenseUsageCollectionPage> implements IReportRootGetAzureADLicenseUsageCollectionRequest {


    /**
     * The request for this ReportRootGetAzureADLicenseUsage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetAzureADLicenseUsageCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetAzureADLicenseUsageCollectionResponse.class, IReportRootGetAzureADLicenseUsageCollectionPage.class);
    }


    public void get(final ICallback<? super IReportRootGetAzureADLicenseUsageCollectionPage> callback) {
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

    public IReportRootGetAzureADLicenseUsageCollectionPage get() throws ClientException {
        final ReportRootGetAzureADLicenseUsageCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IReportRootGetAzureADLicenseUsageCollectionPage buildFromResponse(final ReportRootGetAzureADLicenseUsageCollectionResponse response) {
        final IReportRootGetAzureADLicenseUsageCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ReportRootGetAzureADLicenseUsageCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (String) null);
        } else {
            builder = null;
        }
        final IReportRootGetAzureADLicenseUsageCollectionPage page = new ReportRootGetAzureADLicenseUsageCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetAzureADLicenseUsageCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IReportRootGetAzureADLicenseUsageCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IReportRootGetAzureADLicenseUsageCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IReportRootGetAzureADLicenseUsageCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetAzureADLicenseUsageCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IReportRootGetAzureADLicenseUsageCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IReportRootGetAzureADLicenseUsageCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IReportRootGetAzureADLicenseUsageCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IReportRootGetAzureADLicenseUsageCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IReportRootGetAzureADLicenseUsageCollectionRequest)this;
    }

}
