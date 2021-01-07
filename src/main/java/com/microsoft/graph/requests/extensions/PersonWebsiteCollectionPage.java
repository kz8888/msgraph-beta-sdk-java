// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PersonWebsite;
import com.microsoft.graph.requests.extensions.PersonWebsiteCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.PersonWebsiteCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Website Collection Page.
 */
public class PersonWebsiteCollectionPage extends BaseCollectionPage<PersonWebsite, PersonWebsiteCollectionRequestBuilder> {

    /**
     * A collection page for PersonWebsite
     *
     * @param response the serialized PersonWebsiteCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PersonWebsiteCollectionPage(@Nonnull final PersonWebsiteCollectionResponse response, @Nonnull final PersonWebsiteCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for PersonWebsite
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PersonWebsiteCollectionPage(@Nonnull final java.util.List<PersonWebsite> pageContents, @Nullable final PersonWebsiteCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
