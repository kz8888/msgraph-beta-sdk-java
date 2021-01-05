// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrivilegedSignupStatus;
import com.microsoft.graph.requests.extensions.IPrivilegedSignupStatusCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PrivilegedSignupStatusCollectionPage;
import com.microsoft.graph.requests.extensions.PrivilegedSignupStatusCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Signup Status Collection Page.
 */
public class PrivilegedSignupStatusCollectionPage extends BaseCollectionPage<PrivilegedSignupStatus, IPrivilegedSignupStatusCollectionRequestBuilder> implements IPrivilegedSignupStatusCollectionPage {

    /**
     * A collection page for PrivilegedSignupStatus
     *
     * @param response the serialized PrivilegedSignupStatusCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PrivilegedSignupStatusCollectionPage(final PrivilegedSignupStatusCollectionResponse response, final IPrivilegedSignupStatusCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
