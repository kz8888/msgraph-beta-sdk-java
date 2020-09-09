// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserTeamwork;
import com.microsoft.graph.models.extensions.UserScopeTeamsAppInstallation;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IUserScopeTeamsAppInstallationCollectionPage;
import com.microsoft.graph.requests.extensions.UserScopeTeamsAppInstallationCollectionResponse;
import com.microsoft.graph.requests.extensions.IUserScopeTeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserScopeTeamsAppInstallationCollectionRequest;
import com.microsoft.graph.requests.extensions.UserScopeTeamsAppInstallationCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Scope Teams App Installation Collection Request.
 */
public class UserScopeTeamsAppInstallationCollectionRequest extends BaseCollectionRequest<UserScopeTeamsAppInstallationCollectionResponse, IUserScopeTeamsAppInstallationCollectionPage> implements IUserScopeTeamsAppInstallationCollectionRequest {

    /**
     * The request builder for this collection of UserScopeTeamsAppInstallation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserScopeTeamsAppInstallationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserScopeTeamsAppInstallationCollectionResponse.class, IUserScopeTeamsAppInstallationCollectionPage.class);
    }

    public void get(final ICallback<IUserScopeTeamsAppInstallationCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IUserScopeTeamsAppInstallationCollectionPage get() throws ClientException {
        final UserScopeTeamsAppInstallationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final UserScopeTeamsAppInstallation newUserScopeTeamsAppInstallation, final ICallback<UserScopeTeamsAppInstallation> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new UserScopeTeamsAppInstallationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUserScopeTeamsAppInstallation, callback);
    }

    public UserScopeTeamsAppInstallation post(final UserScopeTeamsAppInstallation newUserScopeTeamsAppInstallation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UserScopeTeamsAppInstallationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUserScopeTeamsAppInstallation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUserScopeTeamsAppInstallationCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UserScopeTeamsAppInstallationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUserScopeTeamsAppInstallationCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (UserScopeTeamsAppInstallationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IUserScopeTeamsAppInstallationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (UserScopeTeamsAppInstallationCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IUserScopeTeamsAppInstallationCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (UserScopeTeamsAppInstallationCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IUserScopeTeamsAppInstallationCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IUserScopeTeamsAppInstallationCollectionRequest)this;
    }
    public IUserScopeTeamsAppInstallationCollectionPage buildFromResponse(final UserScopeTeamsAppInstallationCollectionResponse response) {
        final IUserScopeTeamsAppInstallationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new UserScopeTeamsAppInstallationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final UserScopeTeamsAppInstallationCollectionPage page = new UserScopeTeamsAppInstallationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
