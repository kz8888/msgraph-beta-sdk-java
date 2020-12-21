// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SitePage;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Page Request.
 */
public class SitePageRequest extends BaseRequest implements ISitePageRequest {
	
    /**
     * The request for the SitePage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SitePageRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SitePage.class);
    }

    /**
     * Gets the SitePage from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super SitePage> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SitePage from the service
     *
     * @return the SitePage from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SitePage get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super SitePage> callback) {
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
     * Patches this SitePage with a source
     *
     * @param sourceSitePage the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SitePage sourceSitePage, final ICallback<? super SitePage> callback) {
        send(HttpMethod.PATCH, callback, sourceSitePage);
    }

    /**
     * Patches this SitePage with a source
     *
     * @param sourceSitePage the source object with updates
     * @return the updated SitePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SitePage patch(final SitePage sourceSitePage) throws ClientException {
        return send(HttpMethod.PATCH, sourceSitePage);
    }

    /**
     * Creates a SitePage with a new object
     *
     * @param newSitePage the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SitePage newSitePage, final ICallback<? super SitePage> callback) {
        send(HttpMethod.POST, callback, newSitePage);
    }

    /**
     * Creates a SitePage with a new object
     *
     * @param newSitePage the new object to create
     * @return the created SitePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SitePage post(final SitePage newSitePage) throws ClientException {
        return send(HttpMethod.POST, newSitePage);
    }

    /**
     * Creates a SitePage with a new object
     *
     * @param newSitePage the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SitePage newSitePage, final ICallback<? super SitePage> callback) {
        send(HttpMethod.PUT, callback, newSitePage);
    }

    /**
     * Creates a SitePage with a new object
     *
     * @param newSitePage the object to create/update
     * @return the created SitePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SitePage put(final SitePage newSitePage) throws ClientException {
        return send(HttpMethod.PUT, newSitePage);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISitePageRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SitePageRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISitePageRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SitePageRequest)this;
     }

}

