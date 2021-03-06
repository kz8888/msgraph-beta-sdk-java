// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosLobAppProvisioningConfiguration;
import com.microsoft.graph.models.extensions.MobileAppProvisioningConfigGroupAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IMobileAppProvisioningConfigGroupAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.MobileAppProvisioningConfigGroupAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.IMobileAppProvisioningConfigGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppProvisioningConfigGroupAssignmentCollectionRequest;
import com.microsoft.graph.requests.extensions.MobileAppProvisioningConfigGroupAssignmentCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Provisioning Config Group Assignment Collection Request.
 */
public class MobileAppProvisioningConfigGroupAssignmentCollectionRequest extends BaseCollectionRequest<MobileAppProvisioningConfigGroupAssignmentCollectionResponse, IMobileAppProvisioningConfigGroupAssignmentCollectionPage> implements IMobileAppProvisioningConfigGroupAssignmentCollectionRequest {

    /**
     * The request builder for this collection of MobileAppProvisioningConfigGroupAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppProvisioningConfigGroupAssignmentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppProvisioningConfigGroupAssignmentCollectionResponse.class, IMobileAppProvisioningConfigGroupAssignmentCollectionPage.class);
    }

    public void get(final ICallback<? super IMobileAppProvisioningConfigGroupAssignmentCollectionPage> callback) {
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

    public IMobileAppProvisioningConfigGroupAssignmentCollectionPage get() throws ClientException {
        final MobileAppProvisioningConfigGroupAssignmentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final MobileAppProvisioningConfigGroupAssignment newMobileAppProvisioningConfigGroupAssignment, final ICallback<? super MobileAppProvisioningConfigGroupAssignment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new MobileAppProvisioningConfigGroupAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newMobileAppProvisioningConfigGroupAssignment, callback);
    }

    public MobileAppProvisioningConfigGroupAssignment post(final MobileAppProvisioningConfigGroupAssignment newMobileAppProvisioningConfigGroupAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new MobileAppProvisioningConfigGroupAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newMobileAppProvisioningConfigGroupAssignment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IMobileAppProvisioningConfigGroupAssignmentCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (MobileAppProvisioningConfigGroupAssignmentCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IMobileAppProvisioningConfigGroupAssignmentCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (MobileAppProvisioningConfigGroupAssignmentCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IMobileAppProvisioningConfigGroupAssignmentCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (MobileAppProvisioningConfigGroupAssignmentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IMobileAppProvisioningConfigGroupAssignmentCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (MobileAppProvisioningConfigGroupAssignmentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IMobileAppProvisioningConfigGroupAssignmentCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (MobileAppProvisioningConfigGroupAssignmentCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IMobileAppProvisioningConfigGroupAssignmentCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (MobileAppProvisioningConfigGroupAssignmentCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IMobileAppProvisioningConfigGroupAssignmentCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IMobileAppProvisioningConfigGroupAssignmentCollectionRequest)this;
    }
    public IMobileAppProvisioningConfigGroupAssignmentCollectionPage buildFromResponse(final MobileAppProvisioningConfigGroupAssignmentCollectionResponse response) {
        final IMobileAppProvisioningConfigGroupAssignmentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new MobileAppProvisioningConfigGroupAssignmentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final MobileAppProvisioningConfigGroupAssignmentCollectionPage page = new MobileAppProvisioningConfigGroupAssignmentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
