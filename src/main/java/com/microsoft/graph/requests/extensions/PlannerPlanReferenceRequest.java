// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerPlan;
import com.microsoft.graph.requests.extensions.IPlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerBucketCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerBucketRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerBucketCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerBucketRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerPlanDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanDetailsRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Plan Reference Request.
 */
public class PlannerPlanReferenceRequest extends BaseRequest implements IPlannerPlanReferenceRequest {

    /**
     * The request for the PlannerPlan
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerPlanReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlannerPlan.class);
    }

    public void delete(final ICallback<PlannerPlan> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public PlannerPlan delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPlannerPlanReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PlannerPlanReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPlannerPlanReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PlannerPlanReferenceRequest)this;
    }
    /**
     * Puts the PlannerPlan
     *
     * @param srcPlannerPlan the PlannerPlan reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(PlannerPlan srcPlannerPlan, final ICallback<PlannerPlan> callback) {
        send(HttpMethod.PUT, callback, srcPlannerPlan);
    }

    /**
     * Puts the PlannerPlan
     *
     * @param srcPlannerPlan the PlannerPlan reference to PUT
     * @return the PlannerPlan
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public PlannerPlan put(PlannerPlan srcPlannerPlan) throws ClientException {
        return send(HttpMethod.PUT, srcPlannerPlan);
    }
}