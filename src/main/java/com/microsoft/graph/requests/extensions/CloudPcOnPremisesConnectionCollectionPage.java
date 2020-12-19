// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CloudPcOnPremisesConnection;
import com.microsoft.graph.requests.extensions.ICloudPcOnPremisesConnectionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.CloudPcOnPremisesConnectionCollectionPage;
import com.microsoft.graph.requests.extensions.CloudPcOnPremisesConnectionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Pc On Premises Connection Collection Page.
 */
public class CloudPcOnPremisesConnectionCollectionPage extends BaseCollectionPage<CloudPcOnPremisesConnection, ICloudPcOnPremisesConnectionCollectionRequestBuilder> implements ICloudPcOnPremisesConnectionCollectionPage {

    /**
     * A collection page for CloudPcOnPremisesConnection
     *
     * @param response the serialized CloudPcOnPremisesConnectionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CloudPcOnPremisesConnectionCollectionPage(final CloudPcOnPremisesConnectionCollectionResponse response, final ICloudPcOnPremisesConnectionCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
