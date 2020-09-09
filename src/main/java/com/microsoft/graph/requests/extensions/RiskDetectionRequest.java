// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RiskDetection;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Risk Detection Request.
 */
public class RiskDetectionRequest extends BaseRequest implements IRiskDetectionRequest {
	
    /**
     * The request for the RiskDetection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RiskDetectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RiskDetection.class);
    }

    /**
     * Gets the RiskDetection from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<RiskDetection> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the RiskDetection from the service
     *
     * @return the RiskDetection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RiskDetection get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<RiskDetection> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this RiskDetection with a source
     *
     * @param sourceRiskDetection the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final RiskDetection sourceRiskDetection, final ICallback<RiskDetection> callback) {
        send(HttpMethod.PATCH, callback, sourceRiskDetection);
    }

    /**
     * Patches this RiskDetection with a source
     *
     * @param sourceRiskDetection the source object with updates
     * @return the updated RiskDetection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RiskDetection patch(final RiskDetection sourceRiskDetection) throws ClientException {
        return send(HttpMethod.PATCH, sourceRiskDetection);
    }

    /**
     * Creates a RiskDetection with a new object
     *
     * @param newRiskDetection the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final RiskDetection newRiskDetection, final ICallback<RiskDetection> callback) {
        send(HttpMethod.POST, callback, newRiskDetection);
    }

    /**
     * Creates a RiskDetection with a new object
     *
     * @param newRiskDetection the new object to create
     * @return the created RiskDetection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RiskDetection post(final RiskDetection newRiskDetection) throws ClientException {
        return send(HttpMethod.POST, newRiskDetection);
    }

    /**
     * Creates a RiskDetection with a new object
     *
     * @param newRiskDetection the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final RiskDetection newRiskDetection, final ICallback<RiskDetection> callback) {
        send(HttpMethod.PUT, callback, newRiskDetection);
    }

    /**
     * Creates a RiskDetection with a new object
     *
     * @param newRiskDetection the object to create/update
     * @return the created RiskDetection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RiskDetection put(final RiskDetection newRiskDetection) throws ClientException {
        return send(HttpMethod.PUT, newRiskDetection);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IRiskDetectionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (RiskDetectionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IRiskDetectionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (RiskDetectionRequest)this;
     }

}

