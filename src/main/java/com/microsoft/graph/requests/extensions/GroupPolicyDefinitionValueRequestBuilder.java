// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyDefinitionValue;
import com.microsoft.graph.requests.extensions.IGroupPolicyPresentationValueCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyPresentationValueRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyPresentationValueCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyPresentationValueRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Definition Value Request Builder.
 */
public class GroupPolicyDefinitionValueRequestBuilder extends BaseRequestBuilder implements IGroupPolicyDefinitionValueRequestBuilder {

    /**
     * The request builder for the GroupPolicyDefinitionValue
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyDefinitionValueRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IGroupPolicyDefinitionValueRequest instance
     */
    public IGroupPolicyDefinitionValueRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IGroupPolicyDefinitionValueRequest instance
     */
    public IGroupPolicyDefinitionValueRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.GroupPolicyDefinitionValueRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for GroupPolicyDefinition
     *
     * @return the IGroupPolicyDefinitionWithReferenceRequestBuilder instance
     */
    public IGroupPolicyDefinitionWithReferenceRequestBuilder definition() {
        return new GroupPolicyDefinitionWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("definition"), getClient(), null);
    }
    public IGroupPolicyPresentationValueCollectionRequestBuilder presentationValues() {
        return new GroupPolicyPresentationValueCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("presentationValues"), getClient(), null);
    }

    public IGroupPolicyPresentationValueRequestBuilder presentationValues(final String id) {
        return new GroupPolicyPresentationValueRequestBuilder(getRequestUrlWithAdditionalSegment("presentationValues") + "/" + id, getClient(), null);
    }
}
