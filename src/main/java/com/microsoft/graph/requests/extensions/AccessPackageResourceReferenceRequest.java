// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageResource;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceScopeRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource Reference Request.
 */
public class AccessPackageResourceReferenceRequest extends BaseRequest implements IAccessPackageResourceReferenceRequest {

    /**
     * The request for the AccessPackageResource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageResourceReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageResource.class);
    }

    public void delete(final ICallback<AccessPackageResource> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public AccessPackageResource delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAccessPackageResourceReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AccessPackageResourceReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAccessPackageResourceReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AccessPackageResourceReferenceRequest)this;
    }
    /**
     * Puts the AccessPackageResource
     *
     * @param srcAccessPackageResource the AccessPackageResource reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(AccessPackageResource srcAccessPackageResource, final ICallback<AccessPackageResource> callback) {
        send(HttpMethod.PUT, callback, srcAccessPackageResource);
    }

    /**
     * Puts the AccessPackageResource
     *
     * @param srcAccessPackageResource the AccessPackageResource reference to PUT
     * @return the AccessPackageResource
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public AccessPackageResource put(AccessPackageResource srcAccessPackageResource) throws ClientException {
        return send(HttpMethod.PUT, srcAccessPackageResource);
    }
}
