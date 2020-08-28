// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Mention;
import com.microsoft.graph.requests.extensions.IMentionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.MentionCollectionPage;
import com.microsoft.graph.requests.extensions.MentionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mention Collection Page.
 */
public class MentionCollectionPage extends BaseCollectionPage<Mention, IMentionCollectionRequestBuilder> implements IMentionCollectionPage {

    /**
     * A collection page for Mention
     *
     * @param response the serialized MentionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MentionCollectionPage(final MentionCollectionResponse response, final IMentionCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}