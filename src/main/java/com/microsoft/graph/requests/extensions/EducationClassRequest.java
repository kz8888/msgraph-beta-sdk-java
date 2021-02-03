// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationClass;
import com.microsoft.graph.requests.extensions.IEducationCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationAssignmentSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationAssignmentSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Class Request.
 */
public class EducationClassRequest extends BaseRequest implements IEducationClassRequest {
	
    /**
     * The request for the EducationClass
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationClassRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationClass.class);
    }

    /**
     * Gets the EducationClass from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super EducationClass> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EducationClass from the service
     *
     * @return the EducationClass from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationClass get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super EducationClass> callback) {
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
     * Patches this EducationClass with a source
     *
     * @param sourceEducationClass the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EducationClass sourceEducationClass, final ICallback<? super EducationClass> callback) {
        send(HttpMethod.PATCH, callback, sourceEducationClass);
    }

    /**
     * Patches this EducationClass with a source
     *
     * @param sourceEducationClass the source object with updates
     * @return the updated EducationClass
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationClass patch(final EducationClass sourceEducationClass) throws ClientException {
        return send(HttpMethod.PATCH, sourceEducationClass);
    }

    /**
     * Creates a EducationClass with a new object
     *
     * @param newEducationClass the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EducationClass newEducationClass, final ICallback<? super EducationClass> callback) {
        send(HttpMethod.POST, callback, newEducationClass);
    }

    /**
     * Creates a EducationClass with a new object
     *
     * @param newEducationClass the new object to create
     * @return the created EducationClass
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationClass post(final EducationClass newEducationClass) throws ClientException {
        return send(HttpMethod.POST, newEducationClass);
    }

    /**
     * Creates a EducationClass with a new object
     *
     * @param newEducationClass the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final EducationClass newEducationClass, final ICallback<? super EducationClass> callback) {
        send(HttpMethod.PUT, callback, newEducationClass);
    }

    /**
     * Creates a EducationClass with a new object
     *
     * @param newEducationClass the object to create/update
     * @return the created EducationClass
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationClass put(final EducationClass newEducationClass) throws ClientException {
        return send(HttpMethod.PUT, newEducationClass);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEducationClassRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EducationClassRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEducationClassRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EducationClassRequest)this;
     }

}

