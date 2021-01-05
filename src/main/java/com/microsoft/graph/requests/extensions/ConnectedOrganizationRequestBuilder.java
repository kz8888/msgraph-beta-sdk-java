// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ConnectedOrganization;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Connected Organization Request Builder.
 */
public class ConnectedOrganizationRequestBuilder extends BaseRequestBuilder implements IConnectedOrganizationRequestBuilder {

    /**
     * The request builder for the ConnectedOrganization
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConnectedOrganizationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IConnectedOrganizationRequest instance
     */
    public IConnectedOrganizationRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IConnectedOrganizationRequest instance
     */
    public IConnectedOrganizationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ConnectedOrganizationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDirectoryObjectCollectionRequestBuilder externalSponsors() {
        return new DirectoryObjectCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("externalSponsors"), getClient(), null);
    }

    public IDirectoryObjectRequestBuilder externalSponsors(final String id) {
        return new DirectoryObjectRequestBuilder(getRequestUrlWithAdditionalSegment("externalSponsors") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionRequestBuilder internalSponsors() {
        return new DirectoryObjectCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("internalSponsors"), getClient(), null);
    }

    public IDirectoryObjectRequestBuilder internalSponsors(final String id) {
        return new DirectoryObjectRequestBuilder(getRequestUrlWithAdditionalSegment("internalSponsors") + "/" + id, getClient(), null);
    }
}
