// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignment;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Defender Application Control Supplemental Policy Assignment Collection Page.
 */
public class WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionPage extends BaseCollectionPage<WindowsDefenderApplicationControlSupplementalPolicyAssignment, WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequestBuilder> {

    /**
     * A collection page for WindowsDefenderApplicationControlSupplementalPolicyAssignment
     *
     * @param response the serialized WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionPage(@Nonnull final WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionResponse response, @Nonnull final WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for WindowsDefenderApplicationControlSupplementalPolicyAssignment
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionPage(@Nonnull final java.util.List<WindowsDefenderApplicationControlSupplementalPolicyAssignment> pageContents, @Nullable final WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
