// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.DeltaCollectionPage;
import com.microsoft.graph.requests.extensions.UserDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserDeltaCollectionPage;
import com.microsoft.graph.requests.extensions.UserDeltaCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Delta Collection Page.
 */
public class UserDeltaCollectionPage extends DeltaCollectionPage<User, UserDeltaCollectionRequestBuilder> {

    /**
     * A collection page for User.
     *
     * @param response The serialized UserDeltaCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public UserDeltaCollectionPage(@Nonnull final UserDeltaCollectionResponse response, @Nonnull final UserDeltaCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for UserDelta
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UserDeltaCollectionPage(@Nonnull final java.util.List<User> pageContents, @Nullable final UserDeltaCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
