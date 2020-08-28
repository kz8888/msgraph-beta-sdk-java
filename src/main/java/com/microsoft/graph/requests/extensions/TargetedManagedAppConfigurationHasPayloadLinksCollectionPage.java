// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITargetedManagedAppConfigurationHasPayloadLinksCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TargetedManagedAppConfigurationHasPayloadLinksCollectionPage;
import com.microsoft.graph.requests.extensions.TargetedManagedAppConfigurationHasPayloadLinksCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Configuration Has Payload Links Collection Page.
 */
public class TargetedManagedAppConfigurationHasPayloadLinksCollectionPage extends BaseCollectionPage<HasPayloadLinkResultItem, ITargetedManagedAppConfigurationHasPayloadLinksCollectionRequestBuilder> implements ITargetedManagedAppConfigurationHasPayloadLinksCollectionPage {

    /**
     * A collection page for HasPayloadLinkResultItem.
     *
     * @param response The serialized TargetedManagedAppConfigurationHasPayloadLinksCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public TargetedManagedAppConfigurationHasPayloadLinksCollectionPage(final TargetedManagedAppConfigurationHasPayloadLinksCollectionResponse response, final ITargetedManagedAppConfigurationHasPayloadLinksCollectionRequestBuilder builder) {
       super(response.value, builder);
    }
}