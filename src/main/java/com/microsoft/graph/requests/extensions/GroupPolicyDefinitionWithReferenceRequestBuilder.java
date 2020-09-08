// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyDefinition;
import com.microsoft.graph.requests.extensions.IGroupPolicyPresentationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyPresentationRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyPresentationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyPresentationRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionFileRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionFileRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Definition With Reference Request Builder.
 */
public class GroupPolicyDefinitionWithReferenceRequestBuilder extends BaseRequestBuilder implements IGroupPolicyDefinitionWithReferenceRequestBuilder {

    /**
     * The request builder for the GroupPolicyDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyDefinitionWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IGroupPolicyDefinitionWithReferenceRequest instance
     */
    public IGroupPolicyDefinitionWithReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IGroupPolicyDefinitionWithReferenceRequest instance
     */
    public IGroupPolicyDefinitionWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new GroupPolicyDefinitionWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IGroupPolicyDefinitionReferenceRequestBuilder reference(){
        return new GroupPolicyDefinitionReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
