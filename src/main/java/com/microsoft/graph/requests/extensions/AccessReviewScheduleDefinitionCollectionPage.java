// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AccessReviewScheduleDefinition;
import com.microsoft.graph.requests.extensions.IAccessReviewScheduleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.AccessReviewScheduleDefinitionCollectionPage;
import com.microsoft.graph.requests.extensions.AccessReviewScheduleDefinitionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Schedule Definition Collection Page.
 */
public class AccessReviewScheduleDefinitionCollectionPage extends BaseCollectionPage<AccessReviewScheduleDefinition, IAccessReviewScheduleDefinitionCollectionRequestBuilder> implements IAccessReviewScheduleDefinitionCollectionPage {

    /**
     * A collection page for AccessReviewScheduleDefinition
     *
     * @param response the serialized AccessReviewScheduleDefinitionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AccessReviewScheduleDefinitionCollectionPage(final AccessReviewScheduleDefinitionCollectionResponse response, final IAccessReviewScheduleDefinitionCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
