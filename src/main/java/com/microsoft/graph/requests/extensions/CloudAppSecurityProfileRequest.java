// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CloudAppSecurityProfile;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud App Security Profile Request.
 */
public class CloudAppSecurityProfileRequest extends BaseRequest implements ICloudAppSecurityProfileRequest {
	
    /**
     * The request for the CloudAppSecurityProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CloudAppSecurityProfileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CloudAppSecurityProfile.class);
    }

    /**
     * Gets the CloudAppSecurityProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super CloudAppSecurityProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the CloudAppSecurityProfile from the service
     *
     * @return the CloudAppSecurityProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CloudAppSecurityProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super CloudAppSecurityProfile> callback) {
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
     * Patches this CloudAppSecurityProfile with a source
     *
     * @param sourceCloudAppSecurityProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final CloudAppSecurityProfile sourceCloudAppSecurityProfile, final ICallback<? super CloudAppSecurityProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceCloudAppSecurityProfile);
    }

    /**
     * Patches this CloudAppSecurityProfile with a source
     *
     * @param sourceCloudAppSecurityProfile the source object with updates
     * @return the updated CloudAppSecurityProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CloudAppSecurityProfile patch(final CloudAppSecurityProfile sourceCloudAppSecurityProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceCloudAppSecurityProfile);
    }

    /**
     * Creates a CloudAppSecurityProfile with a new object
     *
     * @param newCloudAppSecurityProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final CloudAppSecurityProfile newCloudAppSecurityProfile, final ICallback<? super CloudAppSecurityProfile> callback) {
        send(HttpMethod.POST, callback, newCloudAppSecurityProfile);
    }

    /**
     * Creates a CloudAppSecurityProfile with a new object
     *
     * @param newCloudAppSecurityProfile the new object to create
     * @return the created CloudAppSecurityProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CloudAppSecurityProfile post(final CloudAppSecurityProfile newCloudAppSecurityProfile) throws ClientException {
        return send(HttpMethod.POST, newCloudAppSecurityProfile);
    }

    /**
     * Creates a CloudAppSecurityProfile with a new object
     *
     * @param newCloudAppSecurityProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final CloudAppSecurityProfile newCloudAppSecurityProfile, final ICallback<? super CloudAppSecurityProfile> callback) {
        send(HttpMethod.PUT, callback, newCloudAppSecurityProfile);
    }

    /**
     * Creates a CloudAppSecurityProfile with a new object
     *
     * @param newCloudAppSecurityProfile the object to create/update
     * @return the created CloudAppSecurityProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CloudAppSecurityProfile put(final CloudAppSecurityProfile newCloudAppSecurityProfile) throws ClientException {
        return send(HttpMethod.PUT, newCloudAppSecurityProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ICloudAppSecurityProfileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (CloudAppSecurityProfileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ICloudAppSecurityProfileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (CloudAppSecurityProfileRequest)this;
     }

}

