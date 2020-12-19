// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AuditLogRoot;
import com.microsoft.graph.requests.extensions.IDirectoryAuditCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryAuditRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryAuditCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryAuditRequestBuilder;
import com.microsoft.graph.requests.extensions.IProvisioningObjectSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProvisioningObjectSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ProvisioningObjectSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ProvisioningObjectSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IRestrictedSignInCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRestrictedSignInRequestBuilder;
import com.microsoft.graph.requests.extensions.RestrictedSignInCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RestrictedSignInRequestBuilder;
import com.microsoft.graph.requests.extensions.ISignInCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISignInRequestBuilder;
import com.microsoft.graph.requests.extensions.SignInCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SignInRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Audit Log Root Request Builder.
 */
public class AuditLogRootRequestBuilder extends BaseRequestBuilder implements IAuditLogRootRequestBuilder {

    /**
     * The request builder for the AuditLogRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuditLogRootRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IAuditLogRootRequest instance
     */
    public IAuditLogRootRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IAuditLogRootRequest instance
     */
    public IAuditLogRootRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.AuditLogRootRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDirectoryAuditCollectionRequestBuilder directoryAudits() {
        return new DirectoryAuditCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("directoryAudits"), getClient(), null);
    }

    public IDirectoryAuditRequestBuilder directoryAudits(final String id) {
        return new DirectoryAuditRequestBuilder(getRequestUrlWithAdditionalSegment("directoryAudits") + "/" + id, getClient(), null);
    }
    public IProvisioningObjectSummaryCollectionRequestBuilder directoryProvisioning() {
        return new ProvisioningObjectSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("directoryProvisioning"), getClient(), null);
    }

    public IProvisioningObjectSummaryRequestBuilder directoryProvisioning(final String id) {
        return new ProvisioningObjectSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("directoryProvisioning") + "/" + id, getClient(), null);
    }
    public IProvisioningObjectSummaryCollectionRequestBuilder provisioning() {
        return new ProvisioningObjectSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("provisioning"), getClient(), null);
    }

    public IProvisioningObjectSummaryRequestBuilder provisioning(final String id) {
        return new ProvisioningObjectSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("provisioning") + "/" + id, getClient(), null);
    }
    public IRestrictedSignInCollectionRequestBuilder restrictedSignIns() {
        return new RestrictedSignInCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("restrictedSignIns"), getClient(), null);
    }

    public IRestrictedSignInRequestBuilder restrictedSignIns(final String id) {
        return new RestrictedSignInRequestBuilder(getRequestUrlWithAdditionalSegment("restrictedSignIns") + "/" + id, getClient(), null);
    }
    public ISignInCollectionRequestBuilder signIns() {
        return new SignInCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("signIns"), getClient(), null);
    }

    public ISignInRequestBuilder signIns(final String id) {
        return new SignInRequestBuilder(getRequestUrlWithAdditionalSegment("signIns") + "/" + id, getClient(), null);
    }
}
