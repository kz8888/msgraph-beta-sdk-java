// Template Source: BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.requests.extensions.ServicePrincipalDeletePasswordSingleSignOnCredentialsRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.ServicePrincipalDeletePasswordSingleSignOnCredentialsParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Delete Password Single Sign On Credentials Request.
 */
public class ServicePrincipalDeletePasswordSingleSignOnCredentialsRequest extends BaseRequest<Void> {
    /**
     * The request for this ServicePrincipalDeletePasswordSingleSignOnCredentials
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ServicePrincipalDeletePasswordSingleSignOnCredentialsRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ServicePrincipalDeletePasswordSingleSignOnCredentialsParameterSet parameters) {
        super(requestUrl, client, requestOptions, Void.class);
        body = parameters;
    }

	/** The body for the method */
    @Nullable
    protected ServicePrincipalDeletePasswordSingleSignOnCredentialsParameterSet body;
    /**
     * Creates the ServicePrincipalDeletePasswordSingleSignOnCredentials
     *
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ICallback<Void> callback) {
        final IExecutors executors = getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    post();
                    executors.performOnForeground((Void)null, callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    /**
     * Creates the ServicePrincipalDeletePasswordSingleSignOnCredentials
     *
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public void post() throws ClientException {
        this.send(HttpMethod.POST, body);
    }
}
