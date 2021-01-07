// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DirectorySetting;
import com.microsoft.graph.requests.extensions.DirectorySettingCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.DirectorySettingCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Setting Collection Page.
 */
public class DirectorySettingCollectionPage extends BaseCollectionPage<DirectorySetting, DirectorySettingCollectionRequestBuilder> {

    /**
     * A collection page for DirectorySetting
     *
     * @param response the serialized DirectorySettingCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DirectorySettingCollectionPage(@Nonnull final DirectorySettingCollectionResponse response, @Nonnull final DirectorySettingCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DirectorySetting
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DirectorySettingCollectionPage(@Nonnull final java.util.List<DirectorySetting> pageContents, @Nullable final DirectorySettingCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
