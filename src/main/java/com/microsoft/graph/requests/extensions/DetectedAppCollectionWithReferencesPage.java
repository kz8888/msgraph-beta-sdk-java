// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.extensions.DetectedApp;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.DetectedAppCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.DetectedAppCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.DetectedAppCollectionResponse;
import com.microsoft.graph.models.extensions.DetectedApp;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Detected App Collection With References Page.
 */
public class DetectedAppCollectionWithReferencesPage extends BaseCollectionPage<DetectedApp, DetectedAppCollectionWithReferencesRequestBuilder> {

    /**
     * A collection page for DetectedApp
     *
     * @param response the serialized DetectedAppCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DetectedAppCollectionWithReferencesPage(@Nonnull final DetectedAppCollectionResponse response, @Nullable final DetectedAppCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }

    /**
     * Creates the collection page for DetectedApp
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DetectedAppCollectionWithReferencesPage(@Nonnull final java.util.List<DetectedApp> pageContents, @Nullable final DetectedAppCollectionWithReferencesRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
