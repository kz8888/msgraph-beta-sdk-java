// Template Source: IBaseEntityWithReferenceRequest.java.tt
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
 * The interface for the Access Package Catalog With Reference Request.
 */
public interface IAccessPackageCatalogWithReferenceRequest extends IHttpRequest {

    void post(final AccessPackageCatalog newAccessPackageCatalog, final IJsonBackedObject payload, final ICallback<? super AccessPackageCatalog> callback);

    AccessPackageCatalog post(final AccessPackageCatalog newAccessPackageCatalog, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super AccessPackageCatalog> callback);

    AccessPackageCatalog get() throws ClientException;

	void delete(final ICallback<? super AccessPackageCatalog> callback);

	void delete() throws ClientException;

	void patch(final AccessPackageCatalog sourceAccessPackageCatalog, final ICallback<? super AccessPackageCatalog> callback);

	AccessPackageCatalog patch(final AccessPackageCatalog sourceAccessPackageCatalog) throws ClientException;

    IAccessPackageCatalogWithReferenceRequest select(final String value);

    IAccessPackageCatalogWithReferenceRequest expand(final String value);

}
