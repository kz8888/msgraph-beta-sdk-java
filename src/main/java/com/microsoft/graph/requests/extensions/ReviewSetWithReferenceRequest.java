// Template Source: BaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ReviewSet;
import com.microsoft.graph.models.generated.ExportOptions;
import com.microsoft.graph.models.generated.ExportFileStructure;
import java.util.EnumSet;
import com.microsoft.graph.requests.extensions.IReviewSetQueryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReviewSetQueryRequestBuilder;
import com.microsoft.graph.requests.extensions.ReviewSetQueryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReviewSetQueryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Review Set With Reference Request.
 */
public class ReviewSetWithReferenceRequest extends BaseRequest implements IReviewSetWithReferenceRequest {

    /**
     * The request for the ReviewSet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReviewSetWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReviewSet.class);
    }

    public void post(final ReviewSet newReviewSet, final IJsonBackedObject payload, final ICallback<? super ReviewSet> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public ReviewSet post(final ReviewSet newReviewSet, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newReviewSet;
        }
        return null;
    }

    public void get(final ICallback<? super ReviewSet> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public ReviewSet get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super ReviewSet> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final ReviewSet sourceReviewSet, final ICallback<? super ReviewSet> callback) {
		send(HttpMethod.PATCH, callback, sourceReviewSet);
	}

	public ReviewSet patch(final ReviewSet sourceReviewSet) throws ClientException {
		return send(HttpMethod.PATCH, sourceReviewSet);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReviewSetWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IReviewSetWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReviewSetWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ReviewSetWithReferenceRequest)this;
    }
}
