// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupPolicyUploadedDefinitionFile;
import com.microsoft.graph.requests.extensions.GroupPolicyUploadedDefinitionFileCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.GroupPolicyUploadedDefinitionFileCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Uploaded Definition File Collection Page.
 */
public class GroupPolicyUploadedDefinitionFileCollectionPage extends BaseCollectionPage<GroupPolicyUploadedDefinitionFile, GroupPolicyUploadedDefinitionFileCollectionRequestBuilder> {

    /**
     * A collection page for GroupPolicyUploadedDefinitionFile
     *
     * @param response the serialized GroupPolicyUploadedDefinitionFileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GroupPolicyUploadedDefinitionFileCollectionPage(@Nonnull final GroupPolicyUploadedDefinitionFileCollectionResponse response, @Nonnull final GroupPolicyUploadedDefinitionFileCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for GroupPolicyUploadedDefinitionFile
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public GroupPolicyUploadedDefinitionFileCollectionPage(@Nonnull final java.util.List<GroupPolicyUploadedDefinitionFile> pageContents, @Nullable final GroupPolicyUploadedDefinitionFileCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
