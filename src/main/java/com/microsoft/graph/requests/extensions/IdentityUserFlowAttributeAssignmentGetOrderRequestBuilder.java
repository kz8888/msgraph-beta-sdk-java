// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IIdentityUserFlowAttributeAssignmentGetOrderRequest;
import com.microsoft.graph.requests.extensions.IdentityUserFlowAttributeAssignmentGetOrderRequest;
import com.microsoft.graph.models.extensions.AssignmentOrder;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity User Flow Attribute Assignment Get Order Request Builder.
 */
public class IdentityUserFlowAttributeAssignmentGetOrderRequestBuilder extends BaseFunctionRequestBuilder implements IIdentityUserFlowAttributeAssignmentGetOrderRequestBuilder {

    /**
     * The request builder for this IdentityUserFlowAttributeAssignmentGetOrder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityUserFlowAttributeAssignmentGetOrderRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IIdentityUserFlowAttributeAssignmentGetOrderRequest
     *
     * @param requestOptions the options for the request
     * @return the IIdentityUserFlowAttributeAssignmentGetOrderRequest instance
     */
    public IIdentityUserFlowAttributeAssignmentGetOrderRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IIdentityUserFlowAttributeAssignmentGetOrderRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IIdentityUserFlowAttributeAssignmentGetOrderRequest instance
     */
    public IIdentityUserFlowAttributeAssignmentGetOrderRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        IdentityUserFlowAttributeAssignmentGetOrderRequest request = new IdentityUserFlowAttributeAssignmentGetOrderRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}