// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.B2xIdentityUserFlow;
import com.microsoft.graph.models.extensions.IdentityProvider;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.IdentityProviderCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityProviderCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.IdentityProviderCollectionResponse;
import com.microsoft.graph.models.extensions.IdentityProvider;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Provider Collection With References Page.
 */
public class IdentityProviderCollectionWithReferencesPage extends BaseCollectionPage<IdentityProvider, IdentityProviderCollectionWithReferencesRequestBuilder> {

    /**
     * A collection page for IdentityProvider
     *
     * @param response the serialized IdentityProviderCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public IdentityProviderCollectionWithReferencesPage(@Nonnull final IdentityProviderCollectionResponse response, @Nullable final IdentityProviderCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }

    /**
     * Creates the collection page for IdentityProvider
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public IdentityProviderCollectionWithReferencesPage(@Nonnull final java.util.List<IdentityProvider> pageContents, @Nullable final IdentityProviderCollectionWithReferencesRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
