// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OnPremisesPublishingProfile;
import com.microsoft.graph.requests.extensions.IOnPremisesAgentGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnPremisesAgentGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.OnPremisesAgentGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnPremisesAgentGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnPremisesAgentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnPremisesAgentRequestBuilder;
import com.microsoft.graph.requests.extensions.OnPremisesAgentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnPremisesAgentRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.ConnectorGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConnectorGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.ConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IPublishedResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPublishedResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.PublishedResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PublishedResourceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the On Premises Publishing Profile Request Builder.
 */
public class OnPremisesPublishingProfileRequestBuilder extends BaseRequestBuilder implements IOnPremisesPublishingProfileRequestBuilder {

    /**
     * The request builder for the OnPremisesPublishingProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnPremisesPublishingProfileRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IOnPremisesPublishingProfileRequest instance
     */
    public IOnPremisesPublishingProfileRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IOnPremisesPublishingProfileRequest instance
     */
    public IOnPremisesPublishingProfileRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.OnPremisesPublishingProfileRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IOnPremisesAgentGroupCollectionRequestBuilder agentGroups() {
        return new OnPremisesAgentGroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("agentGroups"), getClient(), null);
    }

    public IOnPremisesAgentGroupRequestBuilder agentGroups(final String id) {
        return new OnPremisesAgentGroupRequestBuilder(getRequestUrlWithAdditionalSegment("agentGroups") + "/" + id, getClient(), null);
    }
    public IOnPremisesAgentCollectionRequestBuilder agents() {
        return new OnPremisesAgentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("agents"), getClient(), null);
    }

    public IOnPremisesAgentRequestBuilder agents(final String id) {
        return new OnPremisesAgentRequestBuilder(getRequestUrlWithAdditionalSegment("agents") + "/" + id, getClient(), null);
    }
    public IConnectorGroupCollectionRequestBuilder connectorGroups() {
        return new ConnectorGroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("connectorGroups"), getClient(), null);
    }

    public IConnectorGroupRequestBuilder connectorGroups(final String id) {
        return new ConnectorGroupRequestBuilder(getRequestUrlWithAdditionalSegment("connectorGroups") + "/" + id, getClient(), null);
    }
    public IConnectorCollectionRequestBuilder connectors() {
        return new ConnectorCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("connectors"), getClient(), null);
    }

    public IConnectorRequestBuilder connectors(final String id) {
        return new ConnectorRequestBuilder(getRequestUrlWithAdditionalSegment("connectors") + "/" + id, getClient(), null);
    }
    public IPublishedResourceCollectionRequestBuilder publishedResources() {
        return new PublishedResourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("publishedResources"), getClient(), null);
    }

    public IPublishedResourceRequestBuilder publishedResources(final String id) {
        return new PublishedResourceRequestBuilder(getRequestUrlWithAdditionalSegment("publishedResources") + "/" + id, getClient(), null);
    }
}
