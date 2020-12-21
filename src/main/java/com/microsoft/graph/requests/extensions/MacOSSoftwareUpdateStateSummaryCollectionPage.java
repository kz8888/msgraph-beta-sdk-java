// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MacOSSoftwareUpdateStateSummary;
import com.microsoft.graph.requests.extensions.IMacOSSoftwareUpdateStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.MacOSSoftwareUpdateStateSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.MacOSSoftwareUpdateStateSummaryCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSSoftware Update State Summary Collection Page.
 */
public class MacOSSoftwareUpdateStateSummaryCollectionPage extends BaseCollectionPage<MacOSSoftwareUpdateStateSummary, IMacOSSoftwareUpdateStateSummaryCollectionRequestBuilder> implements IMacOSSoftwareUpdateStateSummaryCollectionPage {

    /**
     * A collection page for MacOSSoftwareUpdateStateSummary
     *
     * @param response the serialized MacOSSoftwareUpdateStateSummaryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MacOSSoftwareUpdateStateSummaryCollectionPage(final MacOSSoftwareUpdateStateSummaryCollectionResponse response, final IMacOSSoftwareUpdateStateSummaryCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
