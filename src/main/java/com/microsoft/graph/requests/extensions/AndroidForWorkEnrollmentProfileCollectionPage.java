// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidForWorkEnrollmentProfile;
import com.microsoft.graph.requests.extensions.AndroidForWorkEnrollmentProfileCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.AndroidForWorkEnrollmentProfileCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Enrollment Profile Collection Page.
 */
public class AndroidForWorkEnrollmentProfileCollectionPage extends BaseCollectionPage<AndroidForWorkEnrollmentProfile, AndroidForWorkEnrollmentProfileCollectionRequestBuilder> {

    /**
     * A collection page for AndroidForWorkEnrollmentProfile
     *
     * @param response the serialized AndroidForWorkEnrollmentProfileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AndroidForWorkEnrollmentProfileCollectionPage(@Nonnull final AndroidForWorkEnrollmentProfileCollectionResponse response, @Nonnull final AndroidForWorkEnrollmentProfileCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AndroidForWorkEnrollmentProfile
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AndroidForWorkEnrollmentProfileCollectionPage(@Nonnull final java.util.List<AndroidForWorkEnrollmentProfile> pageContents, @Nullable final AndroidForWorkEnrollmentProfileCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
