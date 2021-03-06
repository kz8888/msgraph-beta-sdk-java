// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackage;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageCatalogRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageCatalogRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Reference Request.
 */
public class AccessPackageReferenceRequest extends BaseRequest implements IAccessPackageReferenceRequest {

    /**
     * The request for the AccessPackage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackage.class);
    }

    public void delete(final ICallback<? super AccessPackage> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public AccessPackage delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAccessPackageReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AccessPackageReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAccessPackageReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AccessPackageReferenceRequest)this;
    }
    /**
     * Puts the AccessPackage
     *
     * @param srcAccessPackage the AccessPackage reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(AccessPackage srcAccessPackage, final ICallback<? super AccessPackage> callback) {
        send(HttpMethod.PUT, callback, srcAccessPackage);
    }

    /**
     * Puts the AccessPackage
     *
     * @param srcAccessPackage the AccessPackage reference to PUT
     * @return the AccessPackage
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public AccessPackage put(AccessPackage srcAccessPackage) throws ClientException {
        return send(HttpMethod.PUT, srcAccessPackage);
    }
}
