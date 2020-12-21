// Template Source: BaseEntityWithReferenceRequest.java.tt
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
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Catalog With Reference Request.
 */
public class AccessPackageCatalogWithReferenceRequest extends BaseRequest implements IAccessPackageCatalogWithReferenceRequest {

    /**
     * The request for the AccessPackageCatalog
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageCatalogWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageCatalog.class);
    }

    public void post(final AccessPackageCatalog newAccessPackageCatalog, final IJsonBackedObject payload, final ICallback<? super AccessPackageCatalog> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public AccessPackageCatalog post(final AccessPackageCatalog newAccessPackageCatalog, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newAccessPackageCatalog;
        }
        return null;
    }

    public void get(final ICallback<? super AccessPackageCatalog> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public AccessPackageCatalog get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super AccessPackageCatalog> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final AccessPackageCatalog sourceAccessPackageCatalog, final ICallback<? super AccessPackageCatalog> callback) {
		send(HttpMethod.PATCH, callback, sourceAccessPackageCatalog);
	}

	public AccessPackageCatalog patch(final AccessPackageCatalog sourceAccessPackageCatalog) throws ClientException {
		return send(HttpMethod.PATCH, sourceAccessPackageCatalog);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAccessPackageCatalogWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IAccessPackageCatalogWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAccessPackageCatalogWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AccessPackageCatalogWithReferenceRequest)this;
    }
}
