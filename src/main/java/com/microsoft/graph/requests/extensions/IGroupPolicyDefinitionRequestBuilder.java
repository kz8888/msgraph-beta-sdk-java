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
import com.microsoft.graph.requests.extensions.IGroupPolicyCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionFileRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Definition Request Builder.
 */
public interface IGroupPolicyDefinitionRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IGroupPolicyDefinitionRequest instance
     */
    IGroupPolicyDefinitionRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IGroupPolicyDefinitionRequest instance
     */
    IGroupPolicyDefinitionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for GroupPolicyCategory
     *
     * @return the IGroupPolicyCategoryWithReferenceRequestBuilder instance
     */
    IGroupPolicyCategoryWithReferenceRequestBuilder category();

    /**
     * Gets the request builder for GroupPolicyDefinitionFile
     *
     * @return the IGroupPolicyDefinitionFileWithReferenceRequestBuilder instance
     */
    IGroupPolicyDefinitionFileWithReferenceRequestBuilder definitionFile();

    IGroupPolicyPresentationCollectionRequestBuilder presentations();

    IGroupPolicyPresentationRequestBuilder presentations(final String id);

}