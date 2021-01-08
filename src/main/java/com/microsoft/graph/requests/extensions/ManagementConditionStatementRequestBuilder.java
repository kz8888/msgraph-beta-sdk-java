// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagementConditionStatement;
import com.microsoft.graph.models.extensions.ManagementConditionExpressionString;
import com.microsoft.graph.models.generated.DevicePlatformType;
import com.microsoft.graph.requests.extensions.ManagementConditionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Condition Statement Request Builder.
 */
public class ManagementConditionStatementRequestBuilder extends BaseRequestBuilder<ManagementConditionStatement> {

    /**
     * The request builder for the ManagementConditionStatement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagementConditionStatementRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ManagementConditionStatementRequest instance
     */
    @Nonnull
    public ManagementConditionStatementRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ManagementConditionStatementRequest instance
     */
    @Nonnull
    public ManagementConditionStatementRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ManagementConditionStatementRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the ManagementCondition collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagementConditionCollectionWithReferencesRequestBuilder managementConditions() {
        return new ManagementConditionCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("managementConditions"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagementCondition item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagementConditionWithReferenceRequestBuilder managementConditions(@Nonnull final String id) {
        return new ManagementConditionWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("managementConditions") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ManagementConditionStatementGetManagementConditionStatementExpressionStringRequestBuilder getManagementConditionStatementExpressionString() {
        return new ManagementConditionStatementGetManagementConditionStatementExpressionStringRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getManagementConditionStatementExpressionString"), getClient(), null);
    }
}
