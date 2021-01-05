// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ICallRedirectRequest;
import com.microsoft.graph.requests.extensions.CallRedirectRequest;
import com.microsoft.graph.models.extensions.InvitationParticipantInfo;
import com.microsoft.graph.models.generated.CallDisposition;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Redirect Request Builder.
 */
public class CallRedirectRequestBuilder extends BaseActionRequestBuilder implements ICallRedirectRequestBuilder {

    /**
     * The request builder for this CallRedirect
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param targets the targets
     * @param targetDisposition the targetDisposition
     * @param timeout the timeout
     * @param maskCallee the maskCallee
     * @param maskCaller the maskCaller
     * @param callbackUri the callbackUri
     */
    public CallRedirectRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<InvitationParticipantInfo> targets, final CallDisposition targetDisposition, final Integer timeout, final Boolean maskCallee, final Boolean maskCaller, final String callbackUri) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("targets", targets);
        bodyParams.put("targetDisposition", targetDisposition);
        bodyParams.put("timeout", timeout);
        bodyParams.put("maskCallee", maskCallee);
        bodyParams.put("maskCaller", maskCaller);
        bodyParams.put("callbackUri", callbackUri);
    }

    /**
     * Creates the ICallRedirectRequest
     *
     * @param requestOptions the options for the request
     * @return the ICallRedirectRequest instance
     */
    public ICallRedirectRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ICallRedirectRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ICallRedirectRequest instance
     */
    public ICallRedirectRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        CallRedirectRequest request = new CallRedirectRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("targets")) {
            request.body.targets = getParameter("targets");
        }

        if (hasParameter("targetDisposition")) {
            request.body.targetDisposition = getParameter("targetDisposition");
        }

        if (hasParameter("timeout")) {
            request.body.timeout = getParameter("timeout");
        }

        if (hasParameter("maskCallee")) {
            request.body.maskCallee = getParameter("maskCallee");
        }

        if (hasParameter("maskCaller")) {
            request.body.maskCaller = getParameter("maskCaller");
        }

        if (hasParameter("callbackUri")) {
            request.body.callbackUri = getParameter("callbackUri");
        }

        return request;
    }
}
