// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PermissionRevokeGrantsBody;
import com.microsoft.graph.models.extensions.Permission;
import com.microsoft.graph.requests.extensions.IPermissionRevokeGrantsRequest;
import com.microsoft.graph.requests.extensions.PermissionRevokeGrantsRequest;

import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Revoke Grants Request.
 */
public class PermissionRevokeGrantsRequest extends BaseRequest implements IPermissionRevokeGrantsRequest {
    protected final PermissionRevokeGrantsBody body;

    /**
     * The request for this PermissionRevokeGrants
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PermissionRevokeGrantsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Permission.class);
        body = new PermissionRevokeGrantsBody();
    }

    public void post(final ICallback<? super Permission> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public Permission post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPermissionRevokeGrantsRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PermissionRevokeGrantsRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPermissionRevokeGrantsRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (PermissionRevokeGrantsRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPermissionRevokeGrantsRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PermissionRevokeGrantsRequest)this;
    }

}