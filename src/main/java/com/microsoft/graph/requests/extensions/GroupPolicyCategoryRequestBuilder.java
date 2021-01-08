// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyCategory;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionFileRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Category Request Builder.
 */
public class GroupPolicyCategoryRequestBuilder extends BaseRequestBuilder<GroupPolicyCategory> {

    /**
     * The request builder for the GroupPolicyCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyCategoryRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the GroupPolicyCategoryRequest instance
     */
    @Nonnull
    public GroupPolicyCategoryRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the GroupPolicyCategoryRequest instance
     */
    @Nonnull
    public GroupPolicyCategoryRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.GroupPolicyCategoryRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the GroupPolicyCategory collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public GroupPolicyCategoryCollectionWithReferencesRequestBuilder children() {
        return new GroupPolicyCategoryCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("children"), getClient(), null);
    }

    /**
     * Gets a request builder for the GroupPolicyCategory item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public GroupPolicyCategoryWithReferenceRequestBuilder children(@Nonnull final String id) {
        return new GroupPolicyCategoryWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("children") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for GroupPolicyDefinitionFile
     *
     * @return the GroupPolicyDefinitionFileWithReferenceRequestBuilder instance
     */
    @Nonnull
    public GroupPolicyDefinitionFileWithReferenceRequestBuilder definitionFile() {
        return new GroupPolicyDefinitionFileWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("definitionFile"), getClient(), null);
    }
    /**
     *  Gets a request builder for the GroupPolicyDefinition collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public GroupPolicyDefinitionCollectionWithReferencesRequestBuilder definitions() {
        return new GroupPolicyDefinitionCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("definitions"), getClient(), null);
    }

    /**
     * Gets a request builder for the GroupPolicyDefinition item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public GroupPolicyDefinitionWithReferenceRequestBuilder definitions(@Nonnull final String id) {
        return new GroupPolicyDefinitionWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("definitions") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for GroupPolicyCategory
     *
     * @return the GroupPolicyCategoryWithReferenceRequestBuilder instance
     */
    @Nonnull
    public GroupPolicyCategoryWithReferenceRequestBuilder parent() {
        return new GroupPolicyCategoryWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("parent"), getClient(), null);
    }
}
