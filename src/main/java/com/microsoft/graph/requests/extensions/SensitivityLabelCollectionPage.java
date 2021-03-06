// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SensitivityLabel;
import com.microsoft.graph.requests.extensions.ISensitivityLabelCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.SensitivityLabelCollectionPage;
import com.microsoft.graph.requests.extensions.SensitivityLabelCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sensitivity Label Collection Page.
 */
public class SensitivityLabelCollectionPage extends BaseCollectionPage<SensitivityLabel, ISensitivityLabelCollectionRequestBuilder> implements ISensitivityLabelCollectionPage {

    /**
     * A collection page for SensitivityLabel
     *
     * @param response the serialized SensitivityLabelCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SensitivityLabelCollectionPage(final SensitivityLabelCollectionResponse response, final ISensitivityLabelCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
