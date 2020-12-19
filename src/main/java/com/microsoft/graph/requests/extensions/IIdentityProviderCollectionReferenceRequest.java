// Template Source: IBaseEntityCollectionReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.B2xIdentityUserFlow;
import com.microsoft.graph.models.extensions.IdentityProvider;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.IdentityProvider;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Identity Provider Collection Reference Request.
 */
public interface IIdentityProviderCollectionReferenceRequest {

    void post(final IdentityProvider newIdentityProvider, final ICallback<? super IdentityProvider> callback);

    IdentityProvider post(final IdentityProvider newIdentityProvider) throws ClientException;

    IIdentityProviderCollectionReferenceRequest select(final String value);

    IIdentityProviderCollectionReferenceRequest top(final int value);

}
