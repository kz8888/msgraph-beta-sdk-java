// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerPlan;
import com.microsoft.graph.requests.extensions.IPlannerBucketCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerBucketRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerBucketCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerBucketRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerPlanDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanDetailsRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Plan With Reference Request.
 */
public class PlannerPlanWithReferenceRequest extends BaseRequest implements IPlannerPlanWithReferenceRequest {

    /**
     * The request for the PlannerPlan
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerPlanWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlannerPlan.class);
    }

    public void post(final PlannerPlan newPlannerPlan, final IJsonBackedObject payload, final ICallback<PlannerPlan> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public PlannerPlan post(final PlannerPlan newPlannerPlan, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newPlannerPlan;
        }
        return null;
    }

    public void get(final ICallback<PlannerPlan> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public PlannerPlan get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<PlannerPlan> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final PlannerPlan sourcePlannerPlan, final ICallback<PlannerPlan> callback) {
		send(HttpMethod.PATCH, callback, sourcePlannerPlan);
	}

	public PlannerPlan patch(final PlannerPlan sourcePlannerPlan) throws ClientException {
		return send(HttpMethod.PATCH, sourcePlannerPlan);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPlannerPlanWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IPlannerPlanWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPlannerPlanWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PlannerPlanWithReferenceRequest)this;
    }
}
