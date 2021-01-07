// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ExactMatchUploadAgent;
import com.microsoft.graph.requests.extensions.ExactMatchUploadAgentCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.ExactMatchUploadAgentCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Exact Match Upload Agent Collection Page.
 */
public class ExactMatchUploadAgentCollectionPage extends BaseCollectionPage<ExactMatchUploadAgent, ExactMatchUploadAgentCollectionRequestBuilder> {

    /**
     * A collection page for ExactMatchUploadAgent
     *
     * @param response the serialized ExactMatchUploadAgentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ExactMatchUploadAgentCollectionPage(@Nonnull final ExactMatchUploadAgentCollectionResponse response, @Nonnull final ExactMatchUploadAgentCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ExactMatchUploadAgent
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ExactMatchUploadAgentCollectionPage(@Nonnull final java.util.List<ExactMatchUploadAgent> pageContents, @Nullable final ExactMatchUploadAgentCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
