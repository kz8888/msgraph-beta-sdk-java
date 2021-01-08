// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidDeviceOwnerEnrollmentProfile;
import com.microsoft.graph.requests.extensions.AndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.AndroidDeviceOwnerEnrollmentProfileCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner Enrollment Profile Collection Page.
 */
public class AndroidDeviceOwnerEnrollmentProfileCollectionPage extends BaseCollectionPage<AndroidDeviceOwnerEnrollmentProfile, AndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder> {

    /**
     * A collection page for AndroidDeviceOwnerEnrollmentProfile
     *
     * @param response the serialized AndroidDeviceOwnerEnrollmentProfileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AndroidDeviceOwnerEnrollmentProfileCollectionPage(@Nonnull final AndroidDeviceOwnerEnrollmentProfileCollectionResponse response, @Nonnull final AndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AndroidDeviceOwnerEnrollmentProfile
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AndroidDeviceOwnerEnrollmentProfileCollectionPage(@Nonnull final java.util.List<AndroidDeviceOwnerEnrollmentProfile> pageContents, @Nullable final AndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
