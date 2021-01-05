// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleAssignmentMultiple;
import com.microsoft.graph.requests.extensions.IAppScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.AppScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRoleDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Multiple Request Builder.
 */
public class UnifiedRoleAssignmentMultipleRequestBuilder extends BaseRequestBuilder implements IUnifiedRoleAssignmentMultipleRequestBuilder {

    /**
     * The request builder for the UnifiedRoleAssignmentMultiple
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleAssignmentMultipleRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUnifiedRoleAssignmentMultipleRequest instance
     */
    public IUnifiedRoleAssignmentMultipleRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IUnifiedRoleAssignmentMultipleRequest instance
     */
    public IUnifiedRoleAssignmentMultipleRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.UnifiedRoleAssignmentMultipleRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IAppScopeCollectionRequestBuilder appScopes() {
        return new AppScopeCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("appScopes"), getClient(), null);
    }

    public IAppScopeRequestBuilder appScopes(final String id) {
        return new AppScopeRequestBuilder(getRequestUrlWithAdditionalSegment("appScopes") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder directoryScopes() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("directoryScopes"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder directoryScopes(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("directoryScopes") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder principals() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("principals"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder principals(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("principals") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for UnifiedRoleDefinition
     *
     * @return the IUnifiedRoleDefinitionWithReferenceRequestBuilder instance
     */
    public IUnifiedRoleDefinitionWithReferenceRequestBuilder roleDefinition() {
        return new UnifiedRoleDefinitionWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("roleDefinition"), getClient(), null);
    }
}
