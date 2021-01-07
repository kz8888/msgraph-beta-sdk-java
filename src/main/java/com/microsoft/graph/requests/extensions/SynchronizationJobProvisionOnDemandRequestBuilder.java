// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.SynchronizationJobProvisionOnDemandRequest;
import com.microsoft.graph.models.extensions.SynchronizationJob;
import com.microsoft.graph.models.extensions.SynchronizationJobApplicationParameters;
import com.microsoft.graph.models.extensions.StringKeyStringValuePair;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.SynchronizationJobProvisionOnDemandParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Job Provision On Demand Request Builder.
 */
public class SynchronizationJobProvisionOnDemandRequestBuilder extends BaseActionRequestBuilder<StringKeyStringValuePair> {

    private SynchronizationJobProvisionOnDemandParameterSet body;
    /**
     * The request builder for this SynchronizationJobProvisionOnDemand
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public SynchronizationJobProvisionOnDemandRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final SynchronizationJobProvisionOnDemandParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the SynchronizationJobProvisionOnDemandRequest
     *
     * @param requestOptions the options for the request
     * @return the SynchronizationJobProvisionOnDemandRequest instance
     */
    @Nonnull
    public SynchronizationJobProvisionOnDemandRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the SynchronizationJobProvisionOnDemandRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the SynchronizationJobProvisionOnDemandRequest instance
     */
    @Nonnull
    public SynchronizationJobProvisionOnDemandRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        SynchronizationJobProvisionOnDemandRequest request = new SynchronizationJobProvisionOnDemandRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
