// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.Credential;
import com.microsoft.graph.models.extensions.PasswordSingleSignOnCredentialSet;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IClaimsMappingPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IClaimsMappingPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IDelegatedPermissionClassificationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDelegatedPermissionClassificationRequestBuilder;
import com.microsoft.graph.requests.extensions.IEndpointCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEndpointRequestBuilder;
import com.microsoft.graph.requests.extensions.IHomeRealmDiscoveryPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IHomeRealmDiscoveryPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ILicenseDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ILicenseDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ISynchronizationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Service Principal With Reference Request.
 */
public interface IServicePrincipalWithReferenceRequest extends IHttpRequest {

    void post(final ServicePrincipal newServicePrincipal, final IJsonBackedObject payload, final ICallback<? super ServicePrincipal> callback);

    ServicePrincipal post(final ServicePrincipal newServicePrincipal, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super ServicePrincipal> callback);

    ServicePrincipal get() throws ClientException;

	void delete(final ICallback<? super ServicePrincipal> callback);

	void delete() throws ClientException;

	void patch(final ServicePrincipal sourceServicePrincipal, final ICallback<? super ServicePrincipal> callback);

	ServicePrincipal patch(final ServicePrincipal sourceServicePrincipal) throws ClientException;

    IServicePrincipalWithReferenceRequest select(final String value);

    IServicePrincipalWithReferenceRequest expand(final String value);

}
