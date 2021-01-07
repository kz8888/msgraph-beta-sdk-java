// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementRoleAssignment;
import com.microsoft.graph.requests.extensions.RoleScopeTagCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleScopeTagRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device And App Management Role Assignment Request Builder.
 */
public class DeviceAndAppManagementRoleAssignmentRequestBuilder extends BaseRequestBuilder<DeviceAndAppManagementRoleAssignment> {

    /**
     * The request builder for the DeviceAndAppManagementRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAndAppManagementRoleAssignmentRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DeviceAndAppManagementRoleAssignmentRequest instance
     */
    @Nonnull
    public DeviceAndAppManagementRoleAssignmentRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the DeviceAndAppManagementRoleAssignmentRequest instance
     */
    @Nonnull
    public DeviceAndAppManagementRoleAssignmentRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for RoleDefinition
     *
     * @return the RoleDefinitionWithReferenceRequestBuilder instance
     */
    @Nonnull
    public RoleDefinitionWithReferenceRequestBuilder roleDefinition() {
        return new RoleDefinitionWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("roleDefinition"), getClient(), null);
    }
    /**
     *  Gets a request builder for the RoleScopeTag collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public RoleScopeTagCollectionWithReferencesRequestBuilder roleScopeTags() {
        return new RoleScopeTagCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("roleScopeTags"), getClient(), null);
    }

    /**
     * Gets a request builder for the RoleScopeTag item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public RoleScopeTagWithReferenceRequestBuilder roleScopeTags(@Nonnull final String id) {
        return new RoleScopeTagWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("roleScopeTags") + "/" + id, getClient(), null);
    }
}
