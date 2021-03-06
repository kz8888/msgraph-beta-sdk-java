// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TextClassificationRequest;
import com.microsoft.graph.requests.extensions.ITextClassificationRequestCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.TextClassificationRequestCollectionPage;
import com.microsoft.graph.requests.extensions.TextClassificationRequestCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Text Classification Request Collection Page.
 */
public class TextClassificationRequestCollectionPage extends BaseCollectionPage<TextClassificationRequest, ITextClassificationRequestCollectionRequestBuilder> implements ITextClassificationRequestCollectionPage {

    /**
     * A collection page for TextClassificationRequest
     *
     * @param response the serialized TextClassificationRequestCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TextClassificationRequestCollectionPage(final TextClassificationRequestCollectionResponse response, final ITextClassificationRequestCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
