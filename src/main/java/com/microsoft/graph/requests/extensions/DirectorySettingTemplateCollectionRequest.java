// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DirectorySettingTemplate;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDirectorySettingTemplateCollectionPage;
import com.microsoft.graph.requests.extensions.DirectorySettingTemplateCollectionResponse;
import com.microsoft.graph.requests.extensions.IDirectorySettingTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectorySettingTemplateCollectionRequest;
import com.microsoft.graph.requests.extensions.DirectorySettingTemplateCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Setting Template Collection Request.
 */
public class DirectorySettingTemplateCollectionRequest extends BaseCollectionRequest<DirectorySettingTemplateCollectionResponse, IDirectorySettingTemplateCollectionPage> implements IDirectorySettingTemplateCollectionRequest {

    /**
     * The request builder for this collection of DirectorySettingTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectorySettingTemplateCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectorySettingTemplateCollectionResponse.class, IDirectorySettingTemplateCollectionPage.class);
    }

    public void get(final ICallback<IDirectorySettingTemplateCollectionPage> callback) {
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

    public IDirectorySettingTemplateCollectionPage get() throws ClientException {
        final DirectorySettingTemplateCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DirectorySettingTemplate newDirectorySettingTemplate, final ICallback<DirectorySettingTemplate> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DirectorySettingTemplateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDirectorySettingTemplate, callback);
    }

    public DirectorySettingTemplate post(final DirectorySettingTemplate newDirectorySettingTemplate) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DirectorySettingTemplateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDirectorySettingTemplate);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDirectorySettingTemplateCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DirectorySettingTemplateCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDirectorySettingTemplateCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DirectorySettingTemplateCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDirectorySettingTemplateCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DirectorySettingTemplateCollectionRequest)this;
    }

    public IDirectorySettingTemplateCollectionPage buildFromResponse(final DirectorySettingTemplateCollectionResponse response) {
        final IDirectorySettingTemplateCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DirectorySettingTemplateCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DirectorySettingTemplateCollectionPage page = new DirectorySettingTemplateCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}