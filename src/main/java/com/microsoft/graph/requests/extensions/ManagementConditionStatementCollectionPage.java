// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagementConditionStatement;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Condition Statement Collection Page.
 */
public class ManagementConditionStatementCollectionPage extends BaseCollectionPage<ManagementConditionStatement, ManagementConditionStatementCollectionRequestBuilder> {

    /**
     * A collection page for ManagementConditionStatement
     *
     * @param response the serialized ManagementConditionStatementCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagementConditionStatementCollectionPage(@Nonnull final ManagementConditionStatementCollectionResponse response, @Nonnull final ManagementConditionStatementCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ManagementConditionStatement
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ManagementConditionStatementCollectionPage(@Nonnull final java.util.List<ManagementConditionStatement> pageContents, @Nullable final ManagementConditionStatementCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
