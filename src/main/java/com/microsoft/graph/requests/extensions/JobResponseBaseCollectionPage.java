// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.JobResponseBase;
import com.microsoft.graph.requests.extensions.JobResponseBaseCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.JobResponseBaseCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Job Response Base Collection Page.
 */
public class JobResponseBaseCollectionPage extends BaseCollectionPage<JobResponseBase, JobResponseBaseCollectionRequestBuilder> {

    /**
     * A collection page for JobResponseBase
     *
     * @param response the serialized JobResponseBaseCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public JobResponseBaseCollectionPage(@Nonnull final JobResponseBaseCollectionResponse response, @Nonnull final JobResponseBaseCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for JobResponseBase
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public JobResponseBaseCollectionPage(@Nonnull final java.util.List<JobResponseBase> pageContents, @Nullable final JobResponseBaseCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
