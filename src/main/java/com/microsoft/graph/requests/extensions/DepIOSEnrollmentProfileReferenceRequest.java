// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DepIOSEnrollmentProfile;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Dep IOSEnrollment Profile Reference Request.
 */
public class DepIOSEnrollmentProfileReferenceRequest extends BaseRequest implements IDepIOSEnrollmentProfileReferenceRequest {

    /**
     * The request for the DepIOSEnrollmentProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DepIOSEnrollmentProfileReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DepIOSEnrollmentProfile.class);
    }

    public void delete(final ICallback<? super DepIOSEnrollmentProfile> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public DepIOSEnrollmentProfile delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDepIOSEnrollmentProfileReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DepIOSEnrollmentProfileReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDepIOSEnrollmentProfileReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DepIOSEnrollmentProfileReferenceRequest)this;
    }
    /**
     * Puts the DepIOSEnrollmentProfile
     *
     * @param srcDepIOSEnrollmentProfile the DepIOSEnrollmentProfile reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(DepIOSEnrollmentProfile srcDepIOSEnrollmentProfile, final ICallback<? super DepIOSEnrollmentProfile> callback) {
        send(HttpMethod.PUT, callback, srcDepIOSEnrollmentProfile);
    }

    /**
     * Puts the DepIOSEnrollmentProfile
     *
     * @param srcDepIOSEnrollmentProfile the DepIOSEnrollmentProfile reference to PUT
     * @return the DepIOSEnrollmentProfile
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public DepIOSEnrollmentProfile put(DepIOSEnrollmentProfile srcDepIOSEnrollmentProfile) throws ClientException {
        return send(HttpMethod.PUT, srcDepIOSEnrollmentProfile);
    }
}
