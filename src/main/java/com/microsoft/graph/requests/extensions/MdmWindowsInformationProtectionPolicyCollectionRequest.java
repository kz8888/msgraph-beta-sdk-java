// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.models.extensions.MdmWindowsInformationProtectionPolicy;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IMdmWindowsInformationProtectionPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.MdmWindowsInformationProtectionPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.IMdmWindowsInformationProtectionPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMdmWindowsInformationProtectionPolicyCollectionRequest;
import com.microsoft.graph.requests.extensions.MdmWindowsInformationProtectionPolicyCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mdm Windows Information Protection Policy Collection Request.
 */
public class MdmWindowsInformationProtectionPolicyCollectionRequest extends BaseCollectionRequest<MdmWindowsInformationProtectionPolicyCollectionResponse, IMdmWindowsInformationProtectionPolicyCollectionPage> implements IMdmWindowsInformationProtectionPolicyCollectionRequest {

    /**
     * The request builder for this collection of MdmWindowsInformationProtectionPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MdmWindowsInformationProtectionPolicyCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MdmWindowsInformationProtectionPolicyCollectionResponse.class, IMdmWindowsInformationProtectionPolicyCollectionPage.class);
    }

    public void get(final ICallback<IMdmWindowsInformationProtectionPolicyCollectionPage> callback) {
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

    public IMdmWindowsInformationProtectionPolicyCollectionPage get() throws ClientException {
        final MdmWindowsInformationProtectionPolicyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final MdmWindowsInformationProtectionPolicy newMdmWindowsInformationProtectionPolicy, final ICallback<MdmWindowsInformationProtectionPolicy> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new MdmWindowsInformationProtectionPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newMdmWindowsInformationProtectionPolicy, callback);
    }

    public MdmWindowsInformationProtectionPolicy post(final MdmWindowsInformationProtectionPolicy newMdmWindowsInformationProtectionPolicy) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new MdmWindowsInformationProtectionPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newMdmWindowsInformationProtectionPolicy);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IMdmWindowsInformationProtectionPolicyCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (MdmWindowsInformationProtectionPolicyCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IMdmWindowsInformationProtectionPolicyCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (MdmWindowsInformationProtectionPolicyCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IMdmWindowsInformationProtectionPolicyCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (MdmWindowsInformationProtectionPolicyCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IMdmWindowsInformationProtectionPolicyCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (MdmWindowsInformationProtectionPolicyCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IMdmWindowsInformationProtectionPolicyCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IMdmWindowsInformationProtectionPolicyCollectionRequest)this;
    }
    public IMdmWindowsInformationProtectionPolicyCollectionPage buildFromResponse(final MdmWindowsInformationProtectionPolicyCollectionResponse response) {
        final IMdmWindowsInformationProtectionPolicyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new MdmWindowsInformationProtectionPolicyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final MdmWindowsInformationProtectionPolicyCollectionPage page = new MdmWindowsInformationProtectionPolicyCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
