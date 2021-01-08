// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupPolicyDefinitionValue;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionValueCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionValueCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Definition Value Collection Page.
 */
public class GroupPolicyDefinitionValueCollectionPage extends BaseCollectionPage<GroupPolicyDefinitionValue, GroupPolicyDefinitionValueCollectionRequestBuilder> {

    /**
     * A collection page for GroupPolicyDefinitionValue
     *
     * @param response the serialized GroupPolicyDefinitionValueCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GroupPolicyDefinitionValueCollectionPage(@Nonnull final GroupPolicyDefinitionValueCollectionResponse response, @Nonnull final GroupPolicyDefinitionValueCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for GroupPolicyDefinitionValue
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public GroupPolicyDefinitionValueCollectionPage(@Nonnull final java.util.List<GroupPolicyDefinitionValue> pageContents, @Nullable final GroupPolicyDefinitionValueCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
