// Template Source: IBaseEntityRequestBuilder.java.tt
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
import com.microsoft.graph.requests.extensions.IProvisioningObjectSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProvisioningObjectSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IRestrictedSignInCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRestrictedSignInRequestBuilder;
import com.microsoft.graph.requests.extensions.ISignInCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISignInRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Audit Log Root Request Builder.
 */
public interface IAuditLogRootRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IAuditLogRootRequest instance
     */
    IAuditLogRootRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IAuditLogRootRequest instance
     */
    IAuditLogRootRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IDirectoryAuditCollectionRequestBuilder directoryAudits();

    IDirectoryAuditRequestBuilder directoryAudits(final String id);

    IProvisioningObjectSummaryCollectionRequestBuilder directoryProvisioning();

    IProvisioningObjectSummaryRequestBuilder directoryProvisioning(final String id);

    IProvisioningObjectSummaryCollectionRequestBuilder provisioning();

    IProvisioningObjectSummaryRequestBuilder provisioning(final String id);

    IRestrictedSignInCollectionRequestBuilder restrictedSignIns();

    IRestrictedSignInRequestBuilder restrictedSignIns(final String id);

    ISignInCollectionRequestBuilder signIns();

    ISignInRequestBuilder signIns(final String id);

}