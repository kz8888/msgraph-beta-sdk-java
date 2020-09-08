// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RbacApplication;
import com.microsoft.graph.requests.extensions.IUnifiedRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRoleDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Rbac Application Request Builder.
 */
public class RbacApplicationRequestBuilder extends BaseRequestBuilder implements IRbacApplicationRequestBuilder {

    /**
     * The request builder for the RbacApplication
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RbacApplicationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IRbacApplicationRequest instance
     */
    public IRbacApplicationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IRbacApplicationRequest instance
     */
    public IRbacApplicationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.RbacApplicationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IUnifiedRoleAssignmentCollectionRequestBuilder roleAssignments() {
        return new UnifiedRoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("roleAssignments"), getClient(), null);
    }

    public IUnifiedRoleAssignmentRequestBuilder roleAssignments(final String id) {
        return new UnifiedRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("roleAssignments") + "/" + id, getClient(), null);
    }
    public IUnifiedRoleDefinitionCollectionRequestBuilder roleDefinitions() {
        return new UnifiedRoleDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("roleDefinitions"), getClient(), null);
    }

    public IUnifiedRoleDefinitionRequestBuilder roleDefinitions(final String id) {
        return new UnifiedRoleDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("roleDefinitions") + "/" + id, getClient(), null);
    }
}
