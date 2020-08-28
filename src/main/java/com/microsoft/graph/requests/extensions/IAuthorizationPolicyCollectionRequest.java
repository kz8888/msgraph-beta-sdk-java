// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PolicyRoot;
import com.microsoft.graph.models.extensions.AuthorizationPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Authorization Policy Collection Request.
 */
public interface IAuthorizationPolicyCollectionRequest {

    void get(final ICallback<IAuthorizationPolicyCollectionPage> callback);

    IAuthorizationPolicyCollectionPage get() throws ClientException;

    void post(final AuthorizationPolicy newAuthorizationPolicy, final ICallback<AuthorizationPolicy> callback);

    AuthorizationPolicy post(final AuthorizationPolicy newAuthorizationPolicy) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAuthorizationPolicyCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAuthorizationPolicyCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IAuthorizationPolicyCollectionRequest top(final int value);

}