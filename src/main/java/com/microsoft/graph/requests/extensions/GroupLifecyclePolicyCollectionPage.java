// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupLifecyclePolicy;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Lifecycle Policy Collection Page.
 */
public class GroupLifecyclePolicyCollectionPage extends BaseCollectionPage<GroupLifecyclePolicy, GroupLifecyclePolicyCollectionRequestBuilder> {

    /**
     * A collection page for GroupLifecyclePolicy
     *
     * @param response the serialized GroupLifecyclePolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GroupLifecyclePolicyCollectionPage(@Nonnull final GroupLifecyclePolicyCollectionResponse response, @Nonnull final GroupLifecyclePolicyCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for GroupLifecyclePolicy
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public GroupLifecyclePolicyCollectionPage(@Nonnull final java.util.List<GroupLifecyclePolicy> pageContents, @Nullable final GroupLifecyclePolicyCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
