// Template Source: IBaseEntityCollectionWithReferencesRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.Endpoint;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Endpoint Collection With References Request.
 */
public interface IEndpointCollectionWithReferencesRequest extends IHttpRequest {

    void get(final ICallback<? super IEndpointCollectionWithReferencesPage> callback);

    IEndpointCollectionWithReferencesPage get() throws ClientException;

    IEndpointCollectionWithReferencesRequest expand(final String value);
    
    IEndpointCollectionWithReferencesRequest select(final String value);

    IEndpointCollectionWithReferencesRequest top(final int value);

}
