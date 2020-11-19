// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CloudPC;
import com.microsoft.graph.requests.extensions.ICloudPCCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.CloudPCCollectionPage;
import com.microsoft.graph.requests.extensions.CloudPCCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud PCCollection Page.
 */
public class CloudPCCollectionPage extends BaseCollectionPage<CloudPC, ICloudPCCollectionRequestBuilder> implements ICloudPCCollectionPage {

    /**
     * A collection page for CloudPC
     *
     * @param response the serialized CloudPCCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CloudPCCollectionPage(final CloudPCCollectionResponse response, final ICloudPCCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
