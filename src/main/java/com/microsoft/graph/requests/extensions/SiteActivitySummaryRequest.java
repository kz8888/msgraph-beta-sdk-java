// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SiteActivitySummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Activity Summary Request.
 */
public class SiteActivitySummaryRequest extends BaseRequest<SiteActivitySummary> {
	
    /**
     * The request for the SiteActivitySummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SiteActivitySummaryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SiteActivitySummary.class);
    }

    /**
     * Gets the SiteActivitySummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super SiteActivitySummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SiteActivitySummary from the service
     *
     * @return the SiteActivitySummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SiteActivitySummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super SiteActivitySummary> callback) {
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
     * Patches this SiteActivitySummary with a source
     *
     * @param sourceSiteActivitySummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final SiteActivitySummary sourceSiteActivitySummary, @Nonnull final ICallback<? super SiteActivitySummary> callback) {
        send(HttpMethod.PATCH, callback, sourceSiteActivitySummary);
    }

    /**
     * Patches this SiteActivitySummary with a source
     *
     * @param sourceSiteActivitySummary the source object with updates
     * @return the updated SiteActivitySummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SiteActivitySummary patch(@Nonnull final SiteActivitySummary sourceSiteActivitySummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceSiteActivitySummary);
    }

    /**
     * Creates a SiteActivitySummary with a new object
     *
     * @param newSiteActivitySummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final SiteActivitySummary newSiteActivitySummary, @Nonnull final ICallback<? super SiteActivitySummary> callback) {
        send(HttpMethod.POST, callback, newSiteActivitySummary);
    }

    /**
     * Creates a SiteActivitySummary with a new object
     *
     * @param newSiteActivitySummary the new object to create
     * @return the created SiteActivitySummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SiteActivitySummary post(@Nonnull final SiteActivitySummary newSiteActivitySummary) throws ClientException {
        return send(HttpMethod.POST, newSiteActivitySummary);
    }

    /**
     * Creates a SiteActivitySummary with a new object
     *
     * @param newSiteActivitySummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final SiteActivitySummary newSiteActivitySummary, @Nonnull final ICallback<? super SiteActivitySummary> callback) {
        send(HttpMethod.PUT, callback, newSiteActivitySummary);
    }

    /**
     * Creates a SiteActivitySummary with a new object
     *
     * @param newSiteActivitySummary the object to create/update
     * @return the created SiteActivitySummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SiteActivitySummary put(@Nonnull final SiteActivitySummary newSiteActivitySummary) throws ClientException {
        return send(HttpMethod.PUT, newSiteActivitySummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SiteActivitySummaryRequest select(@Nonnull final String value) {
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
     public SiteActivitySummaryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

