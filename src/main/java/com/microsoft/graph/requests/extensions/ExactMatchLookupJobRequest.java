// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ExactMatchLookupJob;
import com.microsoft.graph.requests.extensions.ILookupResultRowCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ILookupResultRowRequestBuilder;
import com.microsoft.graph.requests.extensions.LookupResultRowCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.LookupResultRowRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Exact Match Lookup Job Request.
 */
public class ExactMatchLookupJobRequest extends BaseRequest implements IExactMatchLookupJobRequest {
	
    /**
     * The request for the ExactMatchLookupJob
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExactMatchLookupJobRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ExactMatchLookupJob.class);
    }

    /**
     * Gets the ExactMatchLookupJob from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ExactMatchLookupJob> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ExactMatchLookupJob from the service
     *
     * @return the ExactMatchLookupJob from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ExactMatchLookupJob get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ExactMatchLookupJob> callback) {
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
     * Patches this ExactMatchLookupJob with a source
     *
     * @param sourceExactMatchLookupJob the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ExactMatchLookupJob sourceExactMatchLookupJob, final ICallback<ExactMatchLookupJob> callback) {
        send(HttpMethod.PATCH, callback, sourceExactMatchLookupJob);
    }

    /**
     * Patches this ExactMatchLookupJob with a source
     *
     * @param sourceExactMatchLookupJob the source object with updates
     * @return the updated ExactMatchLookupJob
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ExactMatchLookupJob patch(final ExactMatchLookupJob sourceExactMatchLookupJob) throws ClientException {
        return send(HttpMethod.PATCH, sourceExactMatchLookupJob);
    }

    /**
     * Creates a ExactMatchLookupJob with a new object
     *
     * @param newExactMatchLookupJob the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ExactMatchLookupJob newExactMatchLookupJob, final ICallback<ExactMatchLookupJob> callback) {
        send(HttpMethod.POST, callback, newExactMatchLookupJob);
    }

    /**
     * Creates a ExactMatchLookupJob with a new object
     *
     * @param newExactMatchLookupJob the new object to create
     * @return the created ExactMatchLookupJob
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ExactMatchLookupJob post(final ExactMatchLookupJob newExactMatchLookupJob) throws ClientException {
        return send(HttpMethod.POST, newExactMatchLookupJob);
    }

    /**
     * Creates a ExactMatchLookupJob with a new object
     *
     * @param newExactMatchLookupJob the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ExactMatchLookupJob newExactMatchLookupJob, final ICallback<ExactMatchLookupJob> callback) {
        send(HttpMethod.PUT, callback, newExactMatchLookupJob);
    }

    /**
     * Creates a ExactMatchLookupJob with a new object
     *
     * @param newExactMatchLookupJob the object to create/update
     * @return the created ExactMatchLookupJob
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ExactMatchLookupJob put(final ExactMatchLookupJob newExactMatchLookupJob) throws ClientException {
        return send(HttpMethod.PUT, newExactMatchLookupJob);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IExactMatchLookupJobRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ExactMatchLookupJobRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IExactMatchLookupJobRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ExactMatchLookupJobRequest)this;
     }

}

