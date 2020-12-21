// Template Source: IBaseEntityCollectionReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.TokenIssuancePolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.TokenIssuancePolicy;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Token Issuance Policy Collection Reference Request.
 */
public interface ITokenIssuancePolicyCollectionReferenceRequest {

    void post(final TokenIssuancePolicy newTokenIssuancePolicy, final ICallback<? super TokenIssuancePolicy> callback);

    TokenIssuancePolicy post(final TokenIssuancePolicy newTokenIssuancePolicy) throws ClientException;

    ITokenIssuancePolicyCollectionReferenceRequest select(final String value);

    ITokenIssuancePolicyCollectionReferenceRequest top(final int value);

}
