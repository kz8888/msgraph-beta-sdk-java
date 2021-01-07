// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.generated.DevicePlatformType;
import com.microsoft.graph.models.extensions.ManagementCondition;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ManagementConditionGetManagementConditionsForPlatformCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionGetManagementConditionsForPlatformCollectionPage;
import com.microsoft.graph.requests.extensions.ManagementConditionGetManagementConditionsForPlatformCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Condition Get Management Conditions For Platform Collection Page.
 */
public class ManagementConditionGetManagementConditionsForPlatformCollectionPage extends BaseCollectionPage<ManagementCondition, ManagementConditionGetManagementConditionsForPlatformCollectionRequestBuilder> {

    /**
     * A collection page for ManagementCondition.
     *
     * @param response The serialized ManagementConditionGetManagementConditionsForPlatformCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ManagementConditionGetManagementConditionsForPlatformCollectionPage(@Nonnull final ManagementConditionGetManagementConditionsForPlatformCollectionResponse response, @Nonnull final ManagementConditionGetManagementConditionsForPlatformCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ManagementConditionGetManagementConditionsForPlatform
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ManagementConditionGetManagementConditionsForPlatformCollectionPage(@Nonnull final java.util.List<ManagementCondition> pageContents, @Nullable final ManagementConditionGetManagementConditionsForPlatformCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
