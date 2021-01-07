// Template Source: BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DlpEvaluatePoliciesJobResponse;
import com.microsoft.graph.models.extensions.DataLossPreventionPolicy;
import com.microsoft.graph.requests.extensions.DataLossPreventionPolicyEvaluateRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.DataLossPreventionPolicyEvaluateParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Loss Prevention Policy Evaluate Request.
 */
public class DataLossPreventionPolicyEvaluateRequest extends BaseRequest<DlpEvaluatePoliciesJobResponse> {
    /**
     * The request for this DataLossPreventionPolicyEvaluate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DataLossPreventionPolicyEvaluateRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DataLossPreventionPolicyEvaluateParameterSet parameters) {
        super(requestUrl, client, requestOptions, DlpEvaluatePoliciesJobResponse.class);
        body = parameters;
    }

	/** The body for the method */
    @Nullable
    protected DataLossPreventionPolicyEvaluateParameterSet body;
    /**
     * Invokes the method and invokes the callback with the result
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ICallback<? super DlpEvaluatePoliciesJobResponse> callback) {
        send(HttpMethod.POST, callback, body);
    }

    /**
     * Invokes the method and returns the result
     * @return result of the method invocation
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public DlpEvaluatePoliciesJobResponse post() throws ClientException {
       return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public DataLossPreventionPolicyEvaluateRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public DataLossPreventionPolicyEvaluateRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

}
