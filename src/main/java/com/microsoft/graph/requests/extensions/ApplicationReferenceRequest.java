// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Application;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.requests.extensions.ExtensionPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ConnectorGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.SynchronizationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Reference Request.
 */
public class ApplicationReferenceRequest extends BaseReferenceRequest<Application> {

    /**
     * The request for the Application
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplicationReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Application.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public ApplicationReferenceRequest select(@Nonnull final String value) {
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
    public ApplicationReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }
    /**
     * Puts the Application
     *
     * @param srcApplication the Application reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final Application srcApplication, @Nonnull final ICallback<? super Application> callback) {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/applications/" + srcApplication.id));
        send(HttpMethod.PUT, callback, payload);
    }

    /**
     * Puts the Application
     *
     * @param srcApplication the Application reference to PUT
     * @return the Application
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public Application put(@Nonnull final Application srcApplication) throws ClientException {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/applications/" + srcApplication.id));
        return send(HttpMethod.PUT, payload);
    }
}
