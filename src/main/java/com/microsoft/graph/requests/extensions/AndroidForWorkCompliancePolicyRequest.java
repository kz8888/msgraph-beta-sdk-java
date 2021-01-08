// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidForWorkCompliancePolicy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Compliance Policy Request.
 */
public class AndroidForWorkCompliancePolicyRequest extends BaseRequest<AndroidForWorkCompliancePolicy> {
	
    /**
     * The request for the AndroidForWorkCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkCompliancePolicyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidForWorkCompliancePolicy.class);
    }

    /**
     * Gets the AndroidForWorkCompliancePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super AndroidForWorkCompliancePolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidForWorkCompliancePolicy from the service
     *
     * @return the AndroidForWorkCompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkCompliancePolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super AndroidForWorkCompliancePolicy> callback) {
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
     * Patches this AndroidForWorkCompliancePolicy with a source
     *
     * @param sourceAndroidForWorkCompliancePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final AndroidForWorkCompliancePolicy sourceAndroidForWorkCompliancePolicy, @Nonnull final ICallback<? super AndroidForWorkCompliancePolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidForWorkCompliancePolicy);
    }

    /**
     * Patches this AndroidForWorkCompliancePolicy with a source
     *
     * @param sourceAndroidForWorkCompliancePolicy the source object with updates
     * @return the updated AndroidForWorkCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkCompliancePolicy patch(@Nonnull final AndroidForWorkCompliancePolicy sourceAndroidForWorkCompliancePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidForWorkCompliancePolicy);
    }

    /**
     * Creates a AndroidForWorkCompliancePolicy with a new object
     *
     * @param newAndroidForWorkCompliancePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final AndroidForWorkCompliancePolicy newAndroidForWorkCompliancePolicy, @Nonnull final ICallback<? super AndroidForWorkCompliancePolicy> callback) {
        send(HttpMethod.POST, callback, newAndroidForWorkCompliancePolicy);
    }

    /**
     * Creates a AndroidForWorkCompliancePolicy with a new object
     *
     * @param newAndroidForWorkCompliancePolicy the new object to create
     * @return the created AndroidForWorkCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkCompliancePolicy post(@Nonnull final AndroidForWorkCompliancePolicy newAndroidForWorkCompliancePolicy) throws ClientException {
        return send(HttpMethod.POST, newAndroidForWorkCompliancePolicy);
    }

    /**
     * Creates a AndroidForWorkCompliancePolicy with a new object
     *
     * @param newAndroidForWorkCompliancePolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final AndroidForWorkCompliancePolicy newAndroidForWorkCompliancePolicy, @Nonnull final ICallback<? super AndroidForWorkCompliancePolicy> callback) {
        send(HttpMethod.PUT, callback, newAndroidForWorkCompliancePolicy);
    }

    /**
     * Creates a AndroidForWorkCompliancePolicy with a new object
     *
     * @param newAndroidForWorkCompliancePolicy the object to create/update
     * @return the created AndroidForWorkCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkCompliancePolicy put(@Nonnull final AndroidForWorkCompliancePolicy newAndroidForWorkCompliancePolicy) throws ClientException {
        return send(HttpMethod.PUT, newAndroidForWorkCompliancePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidForWorkCompliancePolicyRequest select(@Nonnull final String value) {
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
     public AndroidForWorkCompliancePolicyRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

