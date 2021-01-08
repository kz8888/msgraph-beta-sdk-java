// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.StsPolicy;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sts Policy Request.
 */
public class StsPolicyRequest extends BaseRequest<StsPolicy> {
	
    /**
     * The request for the StsPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public StsPolicyRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends StsPolicy> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the StsPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public StsPolicyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, StsPolicy.class);
    }

    /**
     * Gets the StsPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super StsPolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the StsPolicy from the service
     *
     * @return the StsPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public StsPolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super StsPolicy> callback) {
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
     * Patches this StsPolicy with a source
     *
     * @param sourceStsPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final StsPolicy sourceStsPolicy, @Nonnull final ICallback<? super StsPolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceStsPolicy);
    }

    /**
     * Patches this StsPolicy with a source
     *
     * @param sourceStsPolicy the source object with updates
     * @return the updated StsPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public StsPolicy patch(@Nonnull final StsPolicy sourceStsPolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceStsPolicy);
    }

    /**
     * Creates a StsPolicy with a new object
     *
     * @param newStsPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final StsPolicy newStsPolicy, @Nonnull final ICallback<? super StsPolicy> callback) {
        send(HttpMethod.POST, callback, newStsPolicy);
    }

    /**
     * Creates a StsPolicy with a new object
     *
     * @param newStsPolicy the new object to create
     * @return the created StsPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public StsPolicy post(@Nonnull final StsPolicy newStsPolicy) throws ClientException {
        return send(HttpMethod.POST, newStsPolicy);
    }

    /**
     * Creates a StsPolicy with a new object
     *
     * @param newStsPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final StsPolicy newStsPolicy, @Nonnull final ICallback<? super StsPolicy> callback) {
        send(HttpMethod.PUT, callback, newStsPolicy);
    }

    /**
     * Creates a StsPolicy with a new object
     *
     * @param newStsPolicy the object to create/update
     * @return the created StsPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public StsPolicy put(@Nonnull final StsPolicy newStsPolicy) throws ClientException {
        return send(HttpMethod.PUT, newStsPolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public StsPolicyRequest select(@Nonnull final String value) {
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
     public StsPolicyRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

