// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SkillProficiency;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Skill Proficiency Request.
 */
public class SkillProficiencyRequest extends BaseRequest implements ISkillProficiencyRequest {
	
    /**
     * The request for the SkillProficiency
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SkillProficiencyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SkillProficiency.class);
    }

    /**
     * Gets the SkillProficiency from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<SkillProficiency> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SkillProficiency from the service
     *
     * @return the SkillProficiency from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkillProficiency get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<SkillProficiency> callback) {
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
     * Patches this SkillProficiency with a source
     *
     * @param sourceSkillProficiency the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SkillProficiency sourceSkillProficiency, final ICallback<SkillProficiency> callback) {
        send(HttpMethod.PATCH, callback, sourceSkillProficiency);
    }

    /**
     * Patches this SkillProficiency with a source
     *
     * @param sourceSkillProficiency the source object with updates
     * @return the updated SkillProficiency
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkillProficiency patch(final SkillProficiency sourceSkillProficiency) throws ClientException {
        return send(HttpMethod.PATCH, sourceSkillProficiency);
    }

    /**
     * Creates a SkillProficiency with a new object
     *
     * @param newSkillProficiency the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SkillProficiency newSkillProficiency, final ICallback<SkillProficiency> callback) {
        send(HttpMethod.POST, callback, newSkillProficiency);
    }

    /**
     * Creates a SkillProficiency with a new object
     *
     * @param newSkillProficiency the new object to create
     * @return the created SkillProficiency
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkillProficiency post(final SkillProficiency newSkillProficiency) throws ClientException {
        return send(HttpMethod.POST, newSkillProficiency);
    }

    /**
     * Creates a SkillProficiency with a new object
     *
     * @param newSkillProficiency the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SkillProficiency newSkillProficiency, final ICallback<SkillProficiency> callback) {
        send(HttpMethod.PUT, callback, newSkillProficiency);
    }

    /**
     * Creates a SkillProficiency with a new object
     *
     * @param newSkillProficiency the object to create/update
     * @return the created SkillProficiency
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkillProficiency put(final SkillProficiency newSkillProficiency) throws ClientException {
        return send(HttpMethod.PUT, newSkillProficiency);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISkillProficiencyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SkillProficiencyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISkillProficiencyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SkillProficiencyRequest)this;
     }

}

