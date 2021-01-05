// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageCatalog;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAccessPackageCatalogSearchCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageCatalogSearchCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageCatalogSearchCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Catalog Search Collection Page.
 */
public class AccessPackageCatalogSearchCollectionPage extends BaseCollectionPage<AccessPackageCatalog, IAccessPackageCatalogSearchCollectionRequestBuilder> implements IAccessPackageCatalogSearchCollectionPage {

    /**
     * A collection page for AccessPackageCatalog.
     *
     * @param response The serialized AccessPackageCatalogSearchCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public AccessPackageCatalogSearchCollectionPage(final AccessPackageCatalogSearchCollectionResponse response, final IAccessPackageCatalogSearchCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
