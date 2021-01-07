// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MdmWindowsInformationProtectionPolicy;
import com.microsoft.graph.requests.extensions.MdmWindowsInformationProtectionPolicyCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.MdmWindowsInformationProtectionPolicyCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mdm Windows Information Protection Policy Collection Page.
 */
public class MdmWindowsInformationProtectionPolicyCollectionPage extends BaseCollectionPage<MdmWindowsInformationProtectionPolicy, MdmWindowsInformationProtectionPolicyCollectionRequestBuilder> {

    /**
     * A collection page for MdmWindowsInformationProtectionPolicy
     *
     * @param response the serialized MdmWindowsInformationProtectionPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MdmWindowsInformationProtectionPolicyCollectionPage(@Nonnull final MdmWindowsInformationProtectionPolicyCollectionResponse response, @Nonnull final MdmWindowsInformationProtectionPolicyCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for MdmWindowsInformationProtectionPolicy
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public MdmWindowsInformationProtectionPolicyCollectionPage(@Nonnull final java.util.List<MdmWindowsInformationProtectionPolicy> pageContents, @Nullable final MdmWindowsInformationProtectionPolicyCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
