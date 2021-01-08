// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the OAuth2Permission Grant Collection Page.
 */
public class OAuth2PermissionGrantCollectionPage extends BaseCollectionPage<OAuth2PermissionGrant, OAuth2PermissionGrantCollectionRequestBuilder> {

    /**
     * A collection page for OAuth2PermissionGrant
     *
     * @param response the serialized OAuth2PermissionGrantCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OAuth2PermissionGrantCollectionPage(@Nonnull final OAuth2PermissionGrantCollectionResponse response, @Nonnull final OAuth2PermissionGrantCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for OAuth2PermissionGrant
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public OAuth2PermissionGrantCollectionPage(@Nonnull final java.util.List<OAuth2PermissionGrant> pageContents, @Nullable final OAuth2PermissionGrantCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
