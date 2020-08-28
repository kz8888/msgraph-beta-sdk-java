// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Application;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.requests.extensions.IExtensionPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IHomeRealmDiscoveryPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IHomeRealmDiscoveryPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.ISynchronizationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Application Request Builder.
 */
public interface IApplicationRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IApplicationRequest instance
     */
    IApplicationRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IApplicationRequest instance
     */
    IApplicationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IExtensionPropertyCollectionRequestBuilder extensionProperties();

    IExtensionPropertyRequestBuilder extensionProperties(final String id);

    /**
     * Gets the request builder for DirectoryObject
     *
     * @return the IDirectoryObjectWithReferenceRequestBuilder instance
     */
    IDirectoryObjectWithReferenceRequestBuilder createdOnBehalfOf();

    IDirectoryObjectCollectionWithReferencesRequestBuilder owners();

    IDirectoryObjectWithReferenceRequestBuilder owners(final String id);

    IHomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder homeRealmDiscoveryPolicies();

    IHomeRealmDiscoveryPolicyWithReferenceRequestBuilder homeRealmDiscoveryPolicies(final String id);

    ITokenIssuancePolicyCollectionWithReferencesRequestBuilder tokenIssuancePolicies();

    ITokenIssuancePolicyWithReferenceRequestBuilder tokenIssuancePolicies(final String id);

    ITokenLifetimePolicyCollectionWithReferencesRequestBuilder tokenLifetimePolicies();

    ITokenLifetimePolicyWithReferenceRequestBuilder tokenLifetimePolicies(final String id);

    /**
     * Gets the request builder for ConnectorGroup
     *
     * @return the IConnectorGroupWithReferenceRequestBuilder instance
     */
    IConnectorGroupWithReferenceRequestBuilder connectorGroup();

    /**
     * Gets the request builder for Synchronization
     *
     * @return the ISynchronizationRequestBuilder instance
     */
    ISynchronizationRequestBuilder synchronization();

    IApplicationLogoStreamRequestBuilder logo();
    IApplicationAddKeyRequestBuilder addKey(final KeyCredential keyCredential, final PasswordCredential passwordCredential, final String proof);
    IApplicationAddPasswordRequestBuilder addPassword(final PasswordCredential passwordCredential);
    IApplicationRemoveKeyRequestBuilder removeKey(final java.util.UUID keyId, final String proof);
    IApplicationRemovePasswordRequestBuilder removePassword(final java.util.UUID keyId);

}