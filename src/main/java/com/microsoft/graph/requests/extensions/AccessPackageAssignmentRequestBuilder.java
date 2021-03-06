// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageAssignment;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentResourceRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentResourceRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageSubjectRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageSubjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Request Builder.
 */
public class AccessPackageAssignmentRequestBuilder extends BaseRequestBuilder implements IAccessPackageAssignmentRequestBuilder {

    /**
     * The request builder for the AccessPackageAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageAssignmentRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IAccessPackageAssignmentRequest instance
     */
    public IAccessPackageAssignmentRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IAccessPackageAssignmentRequest instance
     */
    public IAccessPackageAssignmentRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.AccessPackageAssignmentRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for AccessPackage
     *
     * @return the IAccessPackageRequestBuilder instance
     */
    public IAccessPackageRequestBuilder accessPackage() {
        return new AccessPackageRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackage"), getClient(), null);
    }

    /**
     * Gets the request builder for AccessPackageAssignmentPolicy
     *
     * @return the IAccessPackageAssignmentPolicyRequestBuilder instance
     */
    public IAccessPackageAssignmentPolicyRequestBuilder accessPackageAssignmentPolicy() {
        return new AccessPackageAssignmentPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageAssignmentPolicy"), getClient(), null);
    }
    public IAccessPackageAssignmentRequestCollectionRequestBuilder accessPackageAssignmentRequests() {
        return new AccessPackageAssignmentRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageAssignmentRequests"), getClient(), null);
    }

    public IAccessPackageAssignmentRequestRequestBuilder accessPackageAssignmentRequests(final String id) {
        return new AccessPackageAssignmentRequestRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageAssignmentRequests") + "/" + id, getClient(), null);
    }
    public IAccessPackageAssignmentResourceRoleCollectionRequestBuilder accessPackageAssignmentResourceRoles() {
        return new AccessPackageAssignmentResourceRoleCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageAssignmentResourceRoles"), getClient(), null);
    }

    public IAccessPackageAssignmentResourceRoleRequestBuilder accessPackageAssignmentResourceRoles(final String id) {
        return new AccessPackageAssignmentResourceRoleRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageAssignmentResourceRoles") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for AccessPackageSubject
     *
     * @return the IAccessPackageSubjectRequestBuilder instance
     */
    public IAccessPackageSubjectRequestBuilder target() {
        return new AccessPackageSubjectRequestBuilder(getRequestUrlWithAdditionalSegment("target"), getClient(), null);
    }
}
