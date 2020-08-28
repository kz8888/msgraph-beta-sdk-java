// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Office365ActivationsUserDetail;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActivationsUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationsUserDetailCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationsUserDetailCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Activations User Detail Collection Request.
 */
public class ReportRootGetOffice365ActivationsUserDetailCollectionRequest extends BaseCollectionRequest<ReportRootGetOffice365ActivationsUserDetailCollectionResponse, IReportRootGetOffice365ActivationsUserDetailCollectionPage> implements IReportRootGetOffice365ActivationsUserDetailCollectionRequest {


    /**
     * The request for this ReportRootGetOffice365ActivationsUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetOffice365ActivationsUserDetailCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetOffice365ActivationsUserDetailCollectionResponse.class, IReportRootGetOffice365ActivationsUserDetailCollectionPage.class);
    }


    public void get(final ICallback<IReportRootGetOffice365ActivationsUserDetailCollectionPage> callback) {
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

    public IReportRootGetOffice365ActivationsUserDetailCollectionPage get() throws ClientException {
        final ReportRootGetOffice365ActivationsUserDetailCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IReportRootGetOffice365ActivationsUserDetailCollectionPage buildFromResponse(final ReportRootGetOffice365ActivationsUserDetailCollectionResponse response) {
        final IReportRootGetOffice365ActivationsUserDetailCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ReportRootGetOffice365ActivationsUserDetailCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final IReportRootGetOffice365ActivationsUserDetailCollectionPage page = new ReportRootGetOffice365ActivationsUserDetailCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetOffice365ActivationsUserDetailCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IReportRootGetOffice365ActivationsUserDetailCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IReportRootGetOffice365ActivationsUserDetailCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IReportRootGetOffice365ActivationsUserDetailCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetOffice365ActivationsUserDetailCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IReportRootGetOffice365ActivationsUserDetailCollectionRequest)this;
    }

}