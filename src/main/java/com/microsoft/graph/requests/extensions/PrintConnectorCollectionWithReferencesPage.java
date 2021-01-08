// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Printer;
import com.microsoft.graph.models.extensions.PrintConnector;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.PrintConnectorCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintConnectorCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.PrintConnectorCollectionResponse;
import com.microsoft.graph.models.extensions.PrintConnector;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Connector Collection With References Page.
 */
public class PrintConnectorCollectionWithReferencesPage extends BaseCollectionPage<PrintConnector, PrintConnectorCollectionWithReferencesRequestBuilder> {

    /**
     * A collection page for PrintConnector
     *
     * @param response the serialized PrintConnectorCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PrintConnectorCollectionWithReferencesPage(@Nonnull final PrintConnectorCollectionResponse response, @Nullable final PrintConnectorCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }

    /**
     * Creates the collection page for PrintConnector
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PrintConnectorCollectionWithReferencesPage(@Nonnull final java.util.List<PrintConnector> pageContents, @Nullable final PrintConnectorCollectionWithReferencesRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
