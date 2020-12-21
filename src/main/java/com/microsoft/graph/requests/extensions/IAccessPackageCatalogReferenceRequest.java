// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageCatalog;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.AccessPackageCatalog;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Package Catalog Reference Request.
 */
public interface IAccessPackageCatalogReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super AccessPackageCatalog> callback);

    AccessPackageCatalog delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAccessPackageCatalogReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAccessPackageCatalogReferenceRequest expand(final String value);

    /**
     * Puts the AccessPackageCatalog
     *
     * @param srcAccessPackageCatalog the AccessPackageCatalog to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(AccessPackageCatalog srcAccessPackageCatalog, final ICallback<? super AccessPackageCatalog> callback);

    /**
     * Puts the AccessPackageCatalog
     *
     * @param srcAccessPackageCatalog the AccessPackageCatalog to PUT
     * @return the AccessPackageCatalog
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    AccessPackageCatalog put(AccessPackageCatalog srcAccessPackageCatalog) throws ClientException;
}
