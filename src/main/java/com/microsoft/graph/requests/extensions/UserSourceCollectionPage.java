// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserSource;
import com.microsoft.graph.requests.extensions.IUserSourceCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserSourceCollectionPage;
import com.microsoft.graph.requests.extensions.UserSourceCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Source Collection Page.
 */
public class UserSourceCollectionPage extends BaseCollectionPage<UserSource, IUserSourceCollectionRequestBuilder> implements IUserSourceCollectionPage {

    /**
     * A collection page for UserSource
     *
     * @param response the serialized UserSourceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserSourceCollectionPage(final UserSourceCollectionResponse response, final IUserSourceCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
