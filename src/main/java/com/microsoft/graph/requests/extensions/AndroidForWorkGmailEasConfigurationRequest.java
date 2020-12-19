// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidForWorkGmailEasConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Gmail Eas Configuration Request.
 */
public class AndroidForWorkGmailEasConfigurationRequest extends BaseRequest implements IAndroidForWorkGmailEasConfigurationRequest {
	
    /**
     * The request for the AndroidForWorkGmailEasConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkGmailEasConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidForWorkGmailEasConfiguration.class);
    }

    /**
     * Gets the AndroidForWorkGmailEasConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AndroidForWorkGmailEasConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidForWorkGmailEasConfiguration from the service
     *
     * @return the AndroidForWorkGmailEasConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkGmailEasConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AndroidForWorkGmailEasConfiguration> callback) {
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
     * Patches this AndroidForWorkGmailEasConfiguration with a source
     *
     * @param sourceAndroidForWorkGmailEasConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidForWorkGmailEasConfiguration sourceAndroidForWorkGmailEasConfiguration, final ICallback<? super AndroidForWorkGmailEasConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidForWorkGmailEasConfiguration);
    }

    /**
     * Patches this AndroidForWorkGmailEasConfiguration with a source
     *
     * @param sourceAndroidForWorkGmailEasConfiguration the source object with updates
     * @return the updated AndroidForWorkGmailEasConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkGmailEasConfiguration patch(final AndroidForWorkGmailEasConfiguration sourceAndroidForWorkGmailEasConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidForWorkGmailEasConfiguration);
    }

    /**
     * Creates a AndroidForWorkGmailEasConfiguration with a new object
     *
     * @param newAndroidForWorkGmailEasConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidForWorkGmailEasConfiguration newAndroidForWorkGmailEasConfiguration, final ICallback<? super AndroidForWorkGmailEasConfiguration> callback) {
        send(HttpMethod.POST, callback, newAndroidForWorkGmailEasConfiguration);
    }

    /**
     * Creates a AndroidForWorkGmailEasConfiguration with a new object
     *
     * @param newAndroidForWorkGmailEasConfiguration the new object to create
     * @return the created AndroidForWorkGmailEasConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkGmailEasConfiguration post(final AndroidForWorkGmailEasConfiguration newAndroidForWorkGmailEasConfiguration) throws ClientException {
        return send(HttpMethod.POST, newAndroidForWorkGmailEasConfiguration);
    }

    /**
     * Creates a AndroidForWorkGmailEasConfiguration with a new object
     *
     * @param newAndroidForWorkGmailEasConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AndroidForWorkGmailEasConfiguration newAndroidForWorkGmailEasConfiguration, final ICallback<? super AndroidForWorkGmailEasConfiguration> callback) {
        send(HttpMethod.PUT, callback, newAndroidForWorkGmailEasConfiguration);
    }

    /**
     * Creates a AndroidForWorkGmailEasConfiguration with a new object
     *
     * @param newAndroidForWorkGmailEasConfiguration the object to create/update
     * @return the created AndroidForWorkGmailEasConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkGmailEasConfiguration put(final AndroidForWorkGmailEasConfiguration newAndroidForWorkGmailEasConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newAndroidForWorkGmailEasConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidForWorkGmailEasConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidForWorkGmailEasConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidForWorkGmailEasConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidForWorkGmailEasConfigurationRequest)this;
     }

}

