// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedRole;
import com.microsoft.graph.models.extensions.PrivilegedRoleAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentCollectionResponse;
import com.microsoft.graph.models.extensions.PrivilegedRoleAssignment;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Assignment Collection With References Page.
 */
public class PrivilegedRoleAssignmentCollectionWithReferencesPage extends BaseCollectionPage<PrivilegedRoleAssignment, PrivilegedRoleAssignmentCollectionWithReferencesRequestBuilder> {

    /**
     * A collection page for PrivilegedRoleAssignment
     *
     * @param response the serialized PrivilegedRoleAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PrivilegedRoleAssignmentCollectionWithReferencesPage(@Nonnull final PrivilegedRoleAssignmentCollectionResponse response, @Nullable final PrivilegedRoleAssignmentCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }

    /**
     * Creates the collection page for PrivilegedRoleAssignment
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PrivilegedRoleAssignmentCollectionWithReferencesPage(@Nonnull final java.util.List<PrivilegedRoleAssignment> pageContents, @Nullable final PrivilegedRoleAssignmentCollectionWithReferencesRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
