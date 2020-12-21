// Template Source: BaseEntityWithReferenceRequestBuilder.java.tt
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

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Definition Value With Reference Request Builder.
 */
public class GroupPolicyDefinitionValueWithReferenceRequestBuilder extends BaseRequestBuilder implements IGroupPolicyDefinitionValueWithReferenceRequestBuilder {

    /**
     * The request builder for the GroupPolicyDefinitionValue
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyDefinitionValueWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IGroupPolicyDefinitionValueWithReferenceRequest instance
     */
    public IGroupPolicyDefinitionValueWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IGroupPolicyDefinitionValueWithReferenceRequest instance
     */
    public IGroupPolicyDefinitionValueWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new GroupPolicyDefinitionValueWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IGroupPolicyDefinitionValueReferenceRequestBuilder reference(){
        return new GroupPolicyDefinitionValueReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
