// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AudioRoutingGroup;
import com.microsoft.graph.requests.extensions.IAudioRoutingGroupCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.AudioRoutingGroupCollectionPage;
import com.microsoft.graph.requests.extensions.AudioRoutingGroupCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Audio Routing Group Collection Page.
 */
public class AudioRoutingGroupCollectionPage extends BaseCollectionPage<AudioRoutingGroup, IAudioRoutingGroupCollectionRequestBuilder> implements IAudioRoutingGroupCollectionPage {

    /**
     * A collection page for AudioRoutingGroup
     *
     * @param response the serialized AudioRoutingGroupCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AudioRoutingGroupCollectionPage(final AudioRoutingGroupCollectionResponse response, final IAudioRoutingGroupCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
